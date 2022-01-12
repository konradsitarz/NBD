val x = List(-3.0, -2.0, 0.0, 1.0, -17.0, 0.3, -11.0, 12.5)


  def absFilter(list: List[Double]) : List[Double] = {
    val filteredList = list filter (el => el >= -5 && el <= 12)

    filteredList map (el => el.abs)
}
println(absFilter(x))

