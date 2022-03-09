// Importing data from json file to MongoDB atlas
mongoimport --db population --collection zipcodes --file restaraunt.json

// Write a MongoDB query to display all the documents in the collection restaurants
db.addresses.find()

//Write a MongoDB query to display the fields restaurant_id, name, borough and cuisine for all the documents in the collection restaurant.
db.addresses.aggregate([{$project:{restaurant_id: 1, name: 1, borough: 1, cuisine:1}}])

//Write a MongoDB query to display the fields restaurant_id, name, boroughand cuisine, but exclude the field _id for all the documents in the collection restaurant
db.addresses.aggregate([{$project:{_id: 0, restaurant_id: 1, name: 1, borough: 1, cuisine:1}}])

//Write a MongoDB query to display the first 5 restaurant which is in theborough Bronx
db.addresses.aggregate([{$match:{borough: "Bronx"}},{$limit: 5}])

//Write a MongoDB query to display all the restaurant which is in the borough Bronx.
db.addresses.aggregate([{$match: {borough: "Bronx"}}])

//Write a MongoDB query to display the next 5 restaurants after skipping first 5which are in the borough Bronx.
db.addresses.aggregate([{$match: {borough: "Bronx"}},{$skip: 5},{$limit: 5}])

//Write a MongoDB query to find the restaurants who achieved a score morethan 90.
db.addresses.find({"grades.score": {$gt: 90}})

//Write a MongoDB query to find the restaurants that achieved a score, morethan 80 but less than 100
db.addresses.find({"grades.score": {$gt: 80, $lt: 100}})

//Write a MongoDB query to find the restaurants which locate in latitude value less than -95.754168.
db.addresses.find({"address.coord.0": {$lt: -95.754168}})

//Write a MongoDB query to find the restaurant Id, name, borough and cuisine for those restaurants which contain 'Wil' as first three letters for its name.
db.addresses.find({name: /^Wil/},{"restaurant_id" : 1,"name":1,"borough":1,"cuisine" :1})

//Write a MongoDB query to find the restaurant Id, name, borough and cuisine for those restaurants which contain 'ces' as last three letters for its name.
db.addresses.find({name: /ces$/},{"restaurant_id" : 1,"name":1,"borough":1,"cuisine" :1})

//Write a MongoDB query to find the restaurant Id, name, borough and cuisinefor those restaurants which contain 'Reg' as three letters somewhere in its name.
db.addresses.find({name: /.*Reg,*/},{"restaurant_id" : 1,"name":1,"borough":1,"cuisine" :1})

//Write a MongoDB query to arrange the name of the restaurants in descending along with all the columns.
db.addresses.aggregate([{$sort: {name: -1}}])

//. Write a MongoDB query to arranged the name of the cuisine in ascending order and for that same cuisine borough should be in descending order.
db.addresses.aggregate([{$sort: {cuisine: 1, borough: -1}}])

//Write a MongoDB query to know whether all the addresses contains the street or not.
db.addresses.find({"address.street": {$exists: true}})

//. Write a MongoDB query which will select all documents in the restaurants collection where the coord field value is Double.
db.addresses.find({"address.coord" : {$type : "double"}});
