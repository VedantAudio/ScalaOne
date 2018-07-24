import scala.collection._
import scala.Array._

object Recombine extends App {
  println("mylist1 and 0")
  val myList1 = List.range(1, 8)

  def interseq1[T](apool1: Traversable[T], aalg0: T): Traversable[T] =
    apool1.flatMap(x => List(x, aalg0))

  println(interseq1(myList1, 0))
  println()
  println("mylist1 and mylist2 (0)")
  val myList2 = List.range(9, 24, 2)

  def interseq2[T](apool2: Traversable[T], aalg1: Traversable[T]): Traversable[T] = {
    apool2.flatMap(x => List(x, aalg1.toIndexedSeq(0)))
  }

  println(interseq2(myList1, myList2))
  println()
  println("mylist3 and 0")
  val myList3: scala.collection.immutable.IndexedSeq[Int] = for (i <- 1 to 8 if i % 1 == 0) yield i

  def interseq3[T](apool3: Traversable[T], balg: T): Traversable[T] =
    apool3.flatMap(x => List(x, balg))

  println(interseq3(myList3, 0))
  println()
  println()
  println("mylist4 and mylist5 (not complite)")
  val myList4: scala.collection.immutable.IndexedSeq[Int] = for (i <- 1 to 8 if i % 1 == 0) yield i
  val myList5: scala.collection.immutable.IndexedSeq[Int] = for (i <- 8 to 16 if i % 1 == 0) yield i

  def interseq4[T](apool4: Traversable[T], calg: T): Traversable[T] =
    apool4.flatMap(x => List(x, calg))

  println(interseq4(myList4, myList5))
  println()
}
