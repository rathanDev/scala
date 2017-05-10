package jana.mongo

import org.mongodb.scala.MongoClient

/**
  * Challenge urself
  */
object MongoTest {

  def main(args: Array[String]): Unit = {
    val mongoClient = MongoClient("mongodb://localhost:27017")
//    val mongoClient = MongoClient("mongodb://localhost:27017/shops")
    val database = mongoClient.getDatabase("shops")
    val collection = database.getCollection("restaurants")
    val first = collection.find().first()
    println(first)

    collection.find()

//    for { x <- collection } yield println("value " + x)

    mongoClient.close()
  }
}
