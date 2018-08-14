object ADT {
  // From Programming in Scala (Chiusano, Bjarnason)

  // singly-linked list
  trait List[+A]
  case object Nil extends List[Nothing]
  case class Cons[+A](head: A, tail: List[A])
    extends List[A]

  def sum(l: List[Int]): Int = l match {
    case Nil => 0
    case Cons(i, lst) => i + sum(lst)
  }
}
