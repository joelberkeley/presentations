object Recursion {
  def factorial(x: Int): Int = {
    if (x == 1) 1
    else x * factorial(x – 1)
  }
}
