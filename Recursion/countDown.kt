fun main() {
    countDown(10)
    println("")
    println(fact(5))
    println(sum(5))
    println(even(9))
}
fun countDown(element: Int): Int=  if (element <= 0) 0
    else{
        print("${element} ")
        countDown(element - 1)
    }
