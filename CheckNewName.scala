object MyDataBase extends App {

  var myMap = Map(0 -> "Alex", 1 -> "Alex1", 2 -> "Maria", 3 -> "Maria1", 4 -> "Petia")


  def checkNewName(newName: String): Boolean = {
    var i: Int = 0
    while (i <= myMap.size) {
      if (myMap.get(i) == Option(newName)) return false
      i += 1
    }
    true
  }

  def putNewName(newName: String): Map[Int, String] = {

    var newNameCheck:String = ""
    var i: Int = 0
    while (i <= myMap.size) {
      if (myMap.get(i) == Option(newName)) {
        newNameCheck=newName+"-new"
        myMap=myMap + ((myMap.size + 1) -> newNameCheck)

        return myMap
      }




      i += 1
    }
    myMap = myMap + ((myMap.size + 1) -> newName)

    myMap


  }

  println(putNewName("Petia"))
  println(putNewName("Alex"))
  println(putNewName("Maria1"))
  println(putNewName("Alex"))
  println(putNewName("Petia"))
}
