// Importing data from json file to MongoDB atlas
mongoimport --db population --collection zipcodes --file zips.json


//*********Atlanta Population ************

//use db.zipcodes.find() to filter results to only the results where city is ATLANTA and state is GA.
db.zipcodes.find({$and:[{city:"ATLANTA"},{state:"GA"}]})

//use db.zipcodes.aggregate with $match to do the same as above
db.zipcodes.aggregate([{$match:{city:"ATLANTA", state:"GA"}}])

//use $group to count the number of zip codes in Atlanta.
db.zipcodes.aggregate([ { $match: { city: "ATLANTA" } }, { $group: { _id: "$city", totalZip: { $sum: 1 } } }])

//use $group to find the total population in Atlanta
db.zipcodes.aggregate([ { $match: { city: "ATLANTA" } }, { $group: { _id: "$city", totalPopulation: { $sum: "$pop" } } }])


//*********Population by State ************

//use aggregate to calculate the total population for each state
db.zipcodes.aggregate([{$group: {_id: "$state", population:{$sum: "$pop"}}},])

//sort the results by population, highest first
db.zipcodes.aggregate([{$group: {_id: "$state", population:{$sum: "$pop"}}},{$sort: {population: -1}},])

//limit the results to just the first 3 results. What are the top 3 states in population?
db.zipcodes.aggregate([{$group: {_id: "$state", population: {$sum: "$pop"}}},{$sort:{population: -1}},{$limit: 3}])

/*{ _id: 'CA', population: 29754890 },
  { _id: 'NY', population: 17990402 },
  { _id: 'TX', population: 16984601 }
*/

//*********Population by City ************

//use aggregate to calculate the total population for each city (you have to use city/state combination). You can use a combination for the _id of the $group: { city: '$city', state: '$state' }
db.zipcodes.aggregate([{$group: {_id: {city: "$city", state: "$state", zip: "$_id"}, population:{$sum: "$pop"}}}])

//sort the results by population, highest first
db.zipcodes.aggregate([{$group: {_id: {city: "$city", state: "$state", zip: "$_id"}, population: {$sum: "$pop"}}},{$sort: {"population": -1}}])

//What are the top 3 cities in population in Texas
db.zipcodes.aggregate([{$match: {state: "TX"}},{$group: {_id: {city: "$city", state: "$state", zip: "$_id"}, population: {$sum: "$pop"}}},{$sort: {"population": -1}},{$limit: 3}])

