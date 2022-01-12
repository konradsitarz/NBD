val items = Map("piwo" -> 2.50, "pociag" -> 9999000.0, "banan" -> 2.00)
    

def calcDiscount(list: Map[String, Double], discount: Double) : Map[String, Double] = {
    list.map(x => (x._1, (1 - discount) * x._2))
}

println(calcDiscount(items, 0.1))
