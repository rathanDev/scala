package jana.tasteOfConcurrency

/**
  * Challenge urself
  */

case class Point(x: Double = 0.0, y:Double = 0.0)

/**

  companion object

object Point() {
  def apply(x:Double = 0.0, y:Double = 0.0) = new Point(x, y)
}

  */