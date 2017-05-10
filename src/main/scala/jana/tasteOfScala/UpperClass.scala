package jana

/**
  * Challenge urself
  */
class UpperClass {

  def convertToUpperCase(strings:String*):Seq[String] = {
    strings.map(s=> s.toUpperCase())
  }
}
