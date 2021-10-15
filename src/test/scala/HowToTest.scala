// import org.specs2.Specification
import org.specs2.mutable.Specification

class HowToTest extends Specification {

  "HowTo" >> {

    "CubeCalculator.cube"  >> {
      HowTo.cube(3) == 27
    }

    "test something easy" >> {
        true
    }

    "test the impossible" >> {
      skipped {
        1 == 2
      }
    }

    "test the possible - but not now" >> {
      pending {
        1 != 2
      }
    }

    "crash test" >> {
      throw new Exception("boom")
      1 == 1
    }.must(throwA[Exception](message = "boom"))
  }
}
