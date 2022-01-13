val generator = for(
    a <- Iterator.from(1);
    b <- 1 until a+1 if a%b == 0)
    yield (a, b)

val buf = generator.buffered

for (i <- 0 until 20) {
    println(buf.next())
}
