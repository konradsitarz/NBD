val x = List(1, 1, 0, 1, 1, 9, 9, 0, 9, 0, 1)

println(iter(0, x))

def iter(index: Int, currentList: List[Int]): List[Int] = {
      if (index >= currentList.length) return currentList;

      val (part1, part2) = currentList.splitAt(index)

      if (currentList(index) == 0)

        iter(index + 1, part1 ++ part2.tail)
      else
        iter(index + 1, currentList)

}