 def zad01(str: String): String = {
  val s = str.toLowerCase()
  str match {
    case a if (List("poniedziałek", "wtorek", "środa", "czwartek", "piątek") contains(a)) => "Praca"
    case b if (List("sobota", "niedziela") contains(b)) => "Weekend"
    case _ => "Nie ma takiego dnia"
  }
}

println(zad01("assda"))
println(zad01("poniedziałek"))
println(zad01("sobota"))