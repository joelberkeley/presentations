package scala

trait Monad[F[_]] {
  def unit[A](a: => A): F[A]
  def flatMap[A, B](f: A => F[B]): F[B]
}
