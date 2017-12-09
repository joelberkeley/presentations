object NonRecursive {
  def factorial(x: Int): Int = {
    var answer = 1
    for (y ← 0 to x) answer *= y
    answer
  }
}
