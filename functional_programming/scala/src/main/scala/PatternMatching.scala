object PatternMatching {

  case class Animal(legs: Int, colour: String)

  def describe(x: Any) = expr match {
    case 1 => "one"
    case 2 => "two"
    case Map[Int, String] => "map int->string"
    case Animal(8, "black") => "spider!"
    case _ -> "no idea"
  }
}

