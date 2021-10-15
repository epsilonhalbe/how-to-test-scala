import org.scalacheck.Gen
import org.scalacheck.Prop
import org.scalacheck.Properties
import org.specs2.ScalaCheck
import org.specs2.mutable.Specification

class HowToPropTest extends Specification with ScalaCheck {

  "HowToProp" >> {

    "sum of odd numbers up to n is equal to the square of that number" >> {
      prop (
        (n : Int) => (
          (1 to n).sum == n*(n+1) / 2
        ))
    }
  }
}
