val daysOfTheWeek = List(
  "poniedziałek",
  "wtorek",
  "sroda",
  "czwartek",
  "piatek",
  "sobota",
  "niedziela"
)


println("a)" + a(daysOfTheWeek))
println("b)" + b(daysOfTheWeek))
println("c)" + c(daysOfTheWeek))


def a (days : List[String]): String = {
  var result = ""
  
    for(x <- days) {
      if(result == "") 
        result = x
      else
        result = result + ", " + x
    }
  
  return result
}


def b (days : List[String]): String = {
  var result = ""
  
  for (day <- days) { 
    if (result == "" && day.startsWith("p")) result = day
    else if (day.startsWith("p")) result = result + ", " + day
  }
  
  return result
}


def c (days : List[String]): String = {
  var result = ""
  var i = 0 
  
  while (i < days.length) { 
    if (result == "") result = days(i)
    else result = result + ", " + days(i)
    i = i + 1
  }
  
  return result
}