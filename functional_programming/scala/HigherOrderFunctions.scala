import Recursion.factorial

object HigherOrderFunctions {
  // from scala-exercises.org
  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)
  }

  def sumCubes(a, b) = sum(_**3, a, b)
  def sumQuartic(a, b) = sum(_**4, a, b)
}

