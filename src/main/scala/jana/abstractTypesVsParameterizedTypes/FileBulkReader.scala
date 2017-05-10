package jana.abstractTypesVsParameterizedTypes

import java.io.{BufferedInputStream, File, FileInputStream}

/**
  * Challenge urself
  */

//class FileBulkReader(val source : File) extends BulkReader {
//  override type In = File
//  override def read:String = {
//    val in = new BufferedInputStream(new FileInputStream(source))
//    val numBytes = in.available()
//    val bytes = new Array[Byte](numBytes)
//    in.read(bytes, 0, numBytes)
//    new String(bytes)
//  }
//}

class StringBuilder(val source:String) extends BulkReader[File] {
  override def read = {
    val stream = new BufferedInputStream(new FileInputStream(source))
    val numBytes = stream.available()
    val bytes = new Array[Byte](numBytes)
    stream.read(bytes, 0, numBytes)
    new String(bytes)
  }
}