package jana.abstractTypesVsParameterizedTypes

import java.io.File

/**
  * Challenge urself
  */
object At {
  def main(args:Array[String]) : Unit = {
    println(new StringBulkReader("Hello Scala").read)
    println(new FileBulkReader(new File("/home/jana/projects/scalaj/src/main/scala/jana/abstractTypesVsParameterizedTypes/StringBulkReader.scala")).read)
  }
}
