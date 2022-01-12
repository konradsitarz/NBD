val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")


def foldl(x: List[String]) : String = {
    x.tail.foldLeft(x.head)(_ + ", " + _)
}

def foldr(x: List[String]) : String = {
    x.dropRight(1).foldRight(x.last)(_ + ", " + _)
}

def foldlP(x: List[String]) : String = {
    x.filter(_.toUpperCase().startsWith("P")).tail.foldLeft(x.head)(_ + ", " + _)
}


println(foldl(daysOfWeek))
println(foldr(daysOfWeek))
println(foldlP(daysOfWeek))