object FirstClassHOFunctions {
  def decorate(dec: String) = {
    // return a function
    s: String => dec + s + dec.reverse
  }

  val prettify = decorate("~*")

  // pass function to HOF
  List("A", "B").map(prettify)
  // List("~*A*~", "~*B*~")
}
