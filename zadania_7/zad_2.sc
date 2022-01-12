
val daysOfTheWeek = List(
  "poniedziałek",
  "wtorek",
  "sroda",
  "czwartek",
  "piatek",
  "sobota",
  "niedziela"
)

println("a)" + addAnotherDay(0));
println("b)" + addAnotherDayReverse(daysOfTheWeek.length - 1));

 def addAnotherDay(i: Int): String = {
      if (i == daysOfTheWeek.length) return ""

      val currentDay = if (i == daysOfTheWeek.length - 1) daysOfTheWeek(i) else daysOfTheWeek(i) + ", "

     currentDay + addAnotherDay(i + 1)
}

def addAnotherDayReverse(i: Int): String = {
    if (i == -1) return ""

    val currentDay = if (i == 0) daysOfTheWeek(i) else daysOfTheWeek(i) + ", "

    currentDay + addAnotherDayReverse(i - 1)
}

