object Recursion {
  def factorial(x: Int) = {
    var acc = 1

    // state updated in place
    for (y ← 1 to x) acc *= y

    acc
  }

  def factorialRec(x: Int) = {
    def go(y: Int, acc: Int): Int = {
      if (y == 1) acc

      // state passed recursively
      else go(y - 1, y * acc)
    }

    go(x, 1)
  }
}
