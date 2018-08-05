import scala.collection._
object MyFizzBuzz extends  App{

  def fizzBuzz(n: Int): List[String] = {
    var i:Int=1
    var newList = List[String]()
    while (i<=n) {
      if (i%3==0 && i%5==0) newList = "FizzBuzz" :: newList
      else if (i%3==0) newList = "Fizz" :: newList
      else if (i%5==0) newList = "Buzz" :: newList
      else newList = i.toString :: newList

      i+=1
    }
    newList.reverse
  }
  println(fizzBuzz(30))
}
