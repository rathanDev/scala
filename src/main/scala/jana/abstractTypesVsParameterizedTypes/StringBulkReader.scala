package jana.abstractTypesVsParameterizedTypes

/**
  * Challenge urself
  */

//class StringBulkReader(val source: String) extends BulkReader {
//  override type In = String
//  override def read: String = source
//}

class StringBulkReader extends BulkReader[String]