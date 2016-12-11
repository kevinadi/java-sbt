// http://www.scalatest.org/at_a_glance/FlatSpec#matchers_scala_java_col

package kevinadi

import org.scalatest._
import java.util.Arrays
import java.math.BigInteger

class FibsTest extends FlatSpec with Matchers {
    "JavaFibs.num" should "return the 5th number -- 5" in {
        JavaFibs.num(5).intValue() should be (5)
    }

    it should "return the 20th number -- 6765" in {
        JavaFibs.num(20).intValue() should be (6765)
    }

    it should "return the 100th number -- 354224848179261915075 (>2^31)" in {
        JavaFibs.num(100).toString() should be ("354224848179261915075")
    }

    it should "return the 200th number -- 280571172992510140037611932413038677189525" in {
        JavaFibs.num(200).toString() should be ("280571172992510140037611932413038677189525")
    }

    "JavaFibs.list" should "return the first 5 numbers" in {
        val fibs = JavaFibs.list(5)
        val answer = Arrays.asList(
            new BigInteger("1"),
            new BigInteger("1"),
            new BigInteger("2"),
            new BigInteger("3"),
            new BigInteger("5")
        )
        fibs should have length (5)
        fibs should be (answer)
    }

    it should "return the first 10 numbers" in {
        val fibs = JavaFibs.list(10)
        val answer = Arrays.asList(
            new BigInteger("1"),
            new BigInteger("1"),
            new BigInteger("2"),
            new BigInteger("3"),
            new BigInteger("5"),
            new BigInteger("8"),
            new BigInteger("13"),
            new BigInteger("21"),
            new BigInteger("34"),
            new BigInteger("55")
        )
        fibs should have length (10)
        fibs should be (answer)
    }

    "ScalaFibs.num" should "return the 5th number -- 5" in {
        ScalaFibs.num(5).intValue() should be (5)
    }

    it should "return the 20th number -- 6765" in {
        ScalaFibs.num(20).intValue() should be (6765)
    }

    it should "return the 100th number -- 354224848179261915075 (>2^31)" in {
        ScalaFibs.num(100).toString() should be ("354224848179261915075")
    }

    it should "return the 200th number -- 280571172992510140037611932413038677189525" in {
        ScalaFibs.num(200).toString() should be ("280571172992510140037611932413038677189525")
    }

    "ScalaFibs.list" should "return the first 5 numbers" in {
        val fibs = ScalaFibs.list(5)
        fibs should have length (5)
        fibs should be (List(1,1,2,3,5))
    }

    it should "return the first 10 numbers" in {
        val fibs = ScalaFibs.list(10)
        fibs should have length (10)
        fibs should be (List(1,1,2,3,5,8,13,21,34,55))
    }
}
