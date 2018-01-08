object FunctionalClassVSObject {
  def expensiveFunctionalOperation() = 1

  class A {
    private var buf: Int = 0

    def getVal: Int = {
      // non-functional implementation
      if (buf == 0)
        buf == expensiveFunctionalOperation()
      buf
    }
  }

  val a = new A()  // functional object
}
