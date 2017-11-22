import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClientOptions;

import java.util.Arrays;
import com.mongodb.client.MongoDatabase
import com.mongodb.client.MongoCollection





var mongoClient = MongoClient("localhost", 27017)
var database = mongoClient.getDatabase("taskdb")
var coll = database.getCollection("tasks")
var collection = database.getCollection("tasks");

fun main(args: Array<String>) {
    val collection = database.getCollection("tasks")

    collection.insertOne()

}

private fun <TDocument> MongoCollection<TDocument>.insertOne() {
    var arr = arrayOf("name", "Store")
    collection.insertOne()

}

