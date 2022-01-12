class KontoBankowe(private var _stanKonta: Double) {
    def this()= {
      this(0)
    }
    
    def stanKonta : Double = _stanKonta
    
    def wplata(kwota: Double) : Double = {
      _stanKonta = _stanKonta + kwota
      return _stanKonta
    }

    def wyplata(kwota: Double) : Double = {
      _stanKonta = _stanKonta - kwota
      return _stanKonta
    }
}  

var kb : KontoBankowe = new KontoBankowe()
println("Konto Bankowe 2 ze stanem poczatkowym 0")

println(kb.stanKonta)
kb.wplata(500)
println(kb.stanKonta)
kb.wyplata(200)
println(kb.stanKonta)


var kb2 : KontoBankowe = new KontoBankowe(1000)
println("Konto Bankowe 2 ze stanem poczatkowym 1000")
println(kb2.stanKonta)
kb2.wplata(500)
println(kb2.stanKonta)