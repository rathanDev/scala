package jana.abstractTypesVsParameterizedTypes

/**
  * Challenge urself
  */

//abstract class BulkReader {
//  type In
//  val source: In
//  def read: String
//}

abstract class BulkReader[In] {
  val source: In
  def read: In
}