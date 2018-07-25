/**This programm on Scala Lang. Creating list numbers, and sum him sequance value*/

import java.util.Date
import java.sql._
import scala.collection.mutable.ListBuffer

object Route extends App {

  val deper: String = "Alex"
  val indexedSequence: scala.collection.immutable.IndexedSeq[Int] = for (i <- 1 to 100 if i % 5 == 0) yield i
  println(indexedSequence,calculateSum(indexedSequence))

  /** val threes2: scala.collection.immutable.IndexedSeq[Int] = for (i <- 0 to threes1.toIndexedSeq.size) yield i */
  /**
    * Recursive function
    * @param sequence
    * @return the sum
    */
  def calculateSum(sequence: IndexedSeq[Int]): Int = {
    if (sequence.isEmpty) 0
    else sequence.head + calculateSum(sequence.tail)
  }


}
