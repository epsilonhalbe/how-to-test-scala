import org.scalacheck.Gen
import org.scalacheck.Prop
import org.scalacheck.Properties
import org.specs2.ScalaCheck
import org.specs2.mutable.Specification

class HowToPropTest extends Specification with ScalaCheck {

  "HowToProp" >> {

    "sum of odd numbers up to n is equal to the square of that number" >> {
      prop (
        (n : Int) => (n > 0 && n < 46341) ==> (
          (1 to n).sum == n*(n+1) / 2
        )).setGen(Gen.choose(1,46341))
    }

    "demonstrate shrinking" >> {
      prop ((x : List[Int]) => HowTo.contrivedExample(x).isRight
      )
    }
  }
}
