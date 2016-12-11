package kevinadi

object ScalaFibs {
    val fibs: Stream[BigInt] = 1 #:: 1 #:: fibs.zip(fibs.tail).map(x => x._1 + x._2)

    def list(n: Int): List[BigInt] = {
        fibs.take(n).toList
    }

    def num(n: Int): BigInt = {
        fibs(n - 1)
    }
}