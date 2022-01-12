class Osoba(val imie: String, val nazwisko: String, private var _podatek: Double) {
    def podatek: Double = _podatek
}

trait Student extends Osoba {
    override def podatek: Double = 0
}


trait Pracownik extends Osoba {
    var pensja: Double = 5000
    override def podatek: Double = 0.2 * pensja
}

trait Nauczyciel extends Pracownik {
    override def podatek: Double = 0.1 * pensja
}

val pracownik = new Osoba("Jan", "Kowalski", 19) with Pracownik
pracownik.pensja = 20000
println("Pensja pracownika: " + pracownik.pensja)
println("Podatek od powyższej pensji pracownika: " + pracownik.podatek)


val student = new Osoba("Jan", "Kowalski", 19) with Student
println("Podatek studenta: " + student.podatek)


val nauczyciel = new Osoba("Jan", "Kowalski", 19) with Nauczyciel
nauczyciel.pensja = 5000
println("Pensja nauczyciela: " + nauczyciel.pensja)
println("Podatek od powyższej pensji nauczyciela: " + nauczyciel.podatek)


val studentPracownik = new Osoba("Jan", "Kowalski", 19) with Student with Pracownik
studentPracownik.pensja = 10000
println("Pensja studenta pracownika: " + studentPracownik.pensja)
println("Podatek od powyższej pensji studenta pracownika: " + studentPracownik.podatek)


val pracownikStudent = new Osoba("Jan", "Kowalski", 19) with Pracownik with Student
pracownikStudent.pensja = 2000
println("Pensja pracownika studenta: " + pracownikStudent.pensja)
println("Podatek od powyższej pensji pracownika studenta: " + pracownikStudent.podatek)