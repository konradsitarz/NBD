def increment(a: Int): Int = a + 1

def incrementThreeTimes (b: Int, func: Int => Int) = {
    val i = 0

    def inner(v: Int, i: Int): Int = {
        if(i<3)
            inner(func(v), i+1)
        else
            v
    }

    inner(b, i)

}


println(incrementThreeTimes(1, increment))