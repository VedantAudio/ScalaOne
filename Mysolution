import scala.Array._
import scala.collection.mutable

object Mysolution extends App {
  /**
    * val r = scala.util.Random
    * val myarray = Array(for (i<-0 to 10) yield  r.nextInt(10))  /**Generate random numbers on array*/
    * println(myarray.flatten.mkString(" "))                      /**Input*/
    */
  val r = scala.util.Random

  val myarray: Array[Int] = (for (i <- 0 to 30) yield r.nextInt(6)).toArray

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {

    val monoo = mutable.Map[Int, Int]()
    val array = Array[Int](0, 0)
    var i = 0
    var m = 0

    while (i < nums.length) {

      if (monoo.contains(target - nums(i))) {
        array(m) = monoo(target - nums(i))
        array(m + 1) = i

        return array
      }
      else {
        monoo += (nums(i) -> i)
      }
      i += 1
    }


    array
  }


  println("Generated random numbers on array")
  println(myarray.mkString(" "))
  println()
  println("Number of index of myarray who satisfy sum = 9")
  println(twoSum(myarray, 9).mkString(" "))

}

