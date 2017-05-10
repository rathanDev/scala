package jana.tasteOfConcurrency

/**
  * Challenge urself
  */

abstract class Shape {
  def draw(f:String => Unit) = f(s"draw: ${this.toString}")
}
