package jana.tasteOfConcurrency

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

/**
  * Challenge urself
  */
private object Start

object ShapesDrawingDriver {
  def main(args:Array[String]) :Unit = {
    val system = ActorSystem("DrawingActorSystem", ConfigFactory.load())
    val drawer = system.actorOf(Props(new ShapesDrawingActor), "drawingActor")
    val driver = system.actorOf(Props(new ShapesDrawingDriver(drawer)), "drawingService")
    driver ! Start
  }
}

class ShapesDrawingDriver(drawerActor : ActorRef) extends Actor {
  import Messages._

  def receive = {
    case Start =>

  }

}
