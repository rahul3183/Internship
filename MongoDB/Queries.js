db.createCollection("movies") // creating Collection named movies

// Insert data commands
db.movies.insert({"title":"fight club","writer":"Chuck Palahniuko","year":1999,"actor":"[Brad Pitt,Edward Norton]"})
db.movies.insert({"title":"Inglorious Basterds","writer":"Quentin tarantino","year":2009,"actor":"[Brad Pitt,Diane Kruger,Eli Roth]"})
db.movies.insert({"title":"Pulp Fiction","writer":"Quentin Taratino","year":1994,"actor":"[John Travolta,Uma Thurman]"})
db.movies.insert({"title":"The Hobbit: An Unexpected Journey","writer":"J.R.R Tolkein","year":2012,"franchise":"The Hobbit"})
db.movies.insert({"title":"The Hobbit: The Desolation of Smaug","writer":"J.R.R Tolkein","year":2013,"franchise":"The Hobbit"})
db.movies.insert({"title":"The Hobbit: The Battle of the five Armies","writer":"J.R.R Tolkein","year":2012,"franchise":"The Hobbit","synopsis":"Bilbo and Company are forced to engage in a war agianst an array of combatants and keep the Lonely Mountain from falling into the hands of a rising darkness"})


// Find Document Queries
db.movies.find({writer: "Quentin Taratino" })
db.movies.find({franchise: "The Hobbit" })
db.movies.find({actor: "Brad Pitt" })
db.movies.find({"year":{$lt:2000}})
b.movies.find({$or:[{"year":{$lt:2000}},{"year":{$gt:2010}}]})

// Upadte Document Queries
db.movies.updateOne({"title":"The Hobbit: An Unexpected Journey"},{$set:{"synopsis":"A reluctant hobbit, Bilbo Baggins, sets out to the Lonely Mountain with a spirited group of dwarves to reclaim their mountain home - and the gold within it - from the dragon Smaug."}})
db.movies.updateOne({"title":"The Hobbit: The Desolation of Smaug"},{$set:{"synopsis":"The dwarves, along with Bilbo Baggins and Gandalf the Grey, continue their quest to reclaim Erebor, their homeland, from Smaug. Bilbo Baggins is in possession of a mysterious and magical ring."}})
db.movies.updateOne({"title":"Pulp Fiction"},{$set:{"actor":"Samuel L. Jackson"}})


// Text Search Queries

db.nmovies.createIndex({synopsis:"text"}) // first creating an index

db.movies.find({$text: {$search: "Bilbo"}})
db.movies.find({$text: {$search: "Gandalf"}})
db.movies.find({$text: {$search: "Bilbo - Gandalf"}})
db.movies.find({$text: {$search: "dwarves hobbit"}})
db.movies.find({$text: {$search: "gold dragon"}})

// Delete Document Queries

db.movies.remove({"title":"Pee Wee Herman's Big Adventure"})
db.movies.remove({"title":"Avatar"})



// ***********relationship*************

//Inserting Documents into users Collection
db.users.insert({username:"GoodGuyGreg",first_name : "Good Guy",last_name : "Greg",username : "ScumbagSteve",full_name :{first : "Scumbag",last : "Steve"}})

//Inserting Documents into post Collection
db.post.insert({username:"GoodGuyGreg",title : "Passes out at party",body :"Wakes up early and cleans house"})
db.post.insert({username:"GoodGuyGreg",title : "Steals your identity",body :"Raises your credit score"})

//Inserting Documents into comment Collection
db.post.insert({username:"GoodGuyGreg",comment : ": Hope you got a good deal",post :[Objectid("61eec029561ca54545e5e6ee")]})

//Querying related collection

//find all users
db.user.find().pretty()

//find all post
db.post.find().pretty()

//find all posts that was authored by "GoodGuyGreg"
db.post.find({username:"GoodGuyGreg"}).pretty()

//find all posts that was authored by "ScumbagSteve"
db.post.find({username:"ScumbagSteve"}).pretty()

//find all comments
db.comment.find().pretty()

//find all comments that was authored by "GoodGuyGreg"
db.comment.find({username:"GoodGuyGreg"}).pretty()

//find all comments that was authored by "ScumbagSteve"
db.comment.find({username:"ScumbagSteve"}).pretty()

//find all comments belonging to the post "Reports a bug in your code"
db.comment.find(db.post.findOne({title:"Reports a bug in your code"}))
