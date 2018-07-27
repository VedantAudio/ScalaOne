object PascallTriangle extends App {

  def pascal(c: Int, r: Int): Int = {
    if ((r==0) || (0==c) || (r==c)) return 1
    pascal(c-1,r-1)+pascal(c,r-1)
  }
  
  for (row <- 0 to 10) {
    for (col <- 0 to row)
      print(pascal(col, row) + " ")
    println()
  }
}
