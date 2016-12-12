package kevinadi

import org.scalacheck.Gen.posNum
import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, BooleanOperators}
import java.math.BigInteger


object FibsSpec extends Properties("ScalaFibs") {

    property("monotonically increasing") = forAll(posNum[Int]) { n =>
        ScalaFibs.num(n + 1) >= ScalaFibs.num(n)
    }

    property("sum identity 1") = forAll(posNum[Int]) { n =>
        ScalaFibs.list(n).sum == ScalaFibs.num(n+2) - 1
    }

    property("sum identity 2") = forAll(posNum[Int]) { n =>
        ScalaFibs.list(n).zip(1 to n).map(x => x._1 * x._2).sum == n * ScalaFibs.num(n+2) - ScalaFibs.num(n+3) + 2
    }

    property("Cassini's formula") = forAll(posNum[Int]) { n =>
        ScalaFibs.num(n+1) * ScalaFibs.num(n-1) - ScalaFibs.num(n) * ScalaFibs.num(n) == math.pow(-1, n)
    }

}

object JavaFibsSpec extends Properties("JavaFibs") {

    property("monotonically increasing") = forAll(posNum[Int]) { n =>
        val num1 = JavaFibs.num(n+1)
        val num2 = JavaFibs.num(n+2)
        num1.compareTo(num2) == -1
    }

}