class Osoba(val name: String, val lastname: String) {
}

def sayHi(osoba:Osoba) = {
    val greeting = osoba match {
    case osoba if osoba.name == "Konrad" => "Cześć, Konrad!"
    case osoba if osoba.lastname == "Kowalski" => "Hej, " + osoba.name + " Kowalski!"
    case _ => "Dzień dobry."
    }
    println(greeting)
}

val osoba1 = new Osoba("Konrad", "Sitarz")
val osoba2 = new Osoba("Adam", "Kowalski")
val osoba3 = new Osoba("A", "B")

sayHi(osoba1)
sayHi(osoba2)
sayHi(osoba3)
