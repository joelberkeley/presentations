object FunctionalInterface {
  // From Programming in Scala
  def expensiveFunctionalOperation() = 1

  class A {
    private var buf: Int = 0  // mutable internal state

    def getVal: Int = {
      if (buf == 0) buf == expensiveFunctionalOperation()
      buf
    }
  }

  val a = new A()  // functional object
}
