trait Maybe[A] {}


class Yes[A](var value: A) extends Maybe[A]  {
  def applyFunction[R] (fun: A => R) = fun(value)
  def getOrElse(param: A) = value
  def flatMap[R](f: A => Maybe[R]) = f(value)
  def map[R](f: A => Maybe[R]) = new Yes(f(value))
}

class No extends Maybe[Nothing] {
  def applyFunction[A,R](f: A => R) : No = new No()
  def getOrElse[A](value: A) = value
  def map[A, R](f: A => R) = new No()
  def flatMap[A, R](f: A => R) = new No()
}

def toUpperCase(x: String):String = {
    x.toUpperCase()
}

val y = new Yes("a")
y.map(toUpperCase)
