object HowTo extends App {
  def cube(x: Int) = {
    x * x * x
  }
  def contrivedExample(x: List[Int]) : Either[String,List[Int]] = {
    if (x.exists(elem => elem % 3 == 0 && elem > 1)) {
      Left("Oh what a contrived example")
    } else Right(x)
  }
}
