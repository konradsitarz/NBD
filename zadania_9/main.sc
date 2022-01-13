class Container[A](private val value: A) {
  def getContent() : A = {
     value
  }

  def applyFunction[R](fun: A => R): R = {
    fun(getContent())
  }
}

trait Maybe[A] {}

class No extends Maybe[Nothing] {
  def applyFunction[A,R](f: A => R) : No = {
    new No()
  }

  def getOrElse[A](param: A) = {
    param
  }
}

class Yes[A](var value: A) extends Maybe[A]  {
  def applyFunction[R] (fun: A => R) = {
      new Yes(fun(value))
  }
  def getOrElse(param: A) = {
      value
  }
}


object Main {
  def convertToUpperCase(str: String): String = {
    str.toUpperCase()
  }

  def main(args: Array[String]) = {
    val con = new Container[String]("container")
    println(con.getContent())
    println(con.applyFunction[String](convertToUpperCase))

    val yes = new Yes[String]("yes")
    val no = new No

    println("Is Yes instance of maybe? ", yes.isInstanceOf[Maybe[_]])
    println("Is No instance of maybe? ", no.isInstanceOf[Maybe[_]])

    println(yes.getOrElse("sss"))
    println(no.getOrElse("ddd"))
  }
}