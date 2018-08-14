import math.{sqrt, Pi}

object Errors {
  def radius(area: Double): Option[Double] =
    if (area < 0)
      None
    else
      Some(sqrt(area / Pi))
  // no errors thrown!!
}