val x = List(1, 1, 0, 1, 1, 9, 9, 0, 9, 0, 1)

println(increment(x, 1))
  
def increment(list: List[Int], incrementValue: Int) : List[Int] = {
list.map(_ + incrementValue)
}