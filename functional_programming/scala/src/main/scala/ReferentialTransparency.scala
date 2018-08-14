object ReferentialTransparency {
  val x = 1
  def f = _

  val y = f(x)
  println(y)     // this line ...
  println(f(x))  // is equivalent to this line
}

