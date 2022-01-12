import scala.annotation.tailrec


val daysOfTheWeek = List(
  "poniedziałek",
  "wtorek",
  "sroda",
  "czwartek",
  "piatek",
  "sobota",
  "niedziela"
)

def tailrecres(x: List[String]) : String = {
  @tailrec def tailer(x: List[String], string: String) : String = {
    if(x.length>0)
      tailer(x.tail, string + ", " + x.head)
    else 
      string
  }

  tailer(x.tail, x.head)
}

println(tailrecres(daysOfTheWeek))