class FirstClassFunctions {
  val oddsGreaterThan2 = (x: Int) => {
    x > 2 && x % 2 == 1
  }
  List(1, 2, 3, 4, 5).filter(oddsGreaterThan2)
  // returns List(3, 5)
}

