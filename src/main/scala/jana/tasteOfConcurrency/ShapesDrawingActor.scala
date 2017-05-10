package jana.tasteOfConcurrency

/**
  * Challenge urself
  */
import akka.actor.Actor
import akka.actor.Actor.Receive

class ShapesDrawingActor extends Actor{
  import Messages._

//  partial Function, takes an argument of Any and returns Unit

  override def receive = {
    case s:Shape =>
      s.draw(str => println(s"ShapesDrawingActor: $str"))
//      method takes a single argument
//      using a bit of syntactic sugar -
      sender ! Response(s"ShapesDrawingActor: $s drawn")
    case Exit =>
      println(s"ShapesDrawingActor: exiting...")
      sender ! FInished
    case unexpected =>
      val response = Response(s"Error: Unknown message: $unexpected")
      println(s"ShapesDrawingActor: $response")
      sender !response
  }

}
