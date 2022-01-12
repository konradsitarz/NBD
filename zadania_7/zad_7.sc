val products = Map("A" -> 1)

val a: Option[Int] = products.get("A")
val b: Option[Int] = products.get("B")
 
println(a)
println(b)