class Queue{
    private val queue = mutableListOf<Any>() 
    fun enqueue(element: Any){
        queue.add(0, element)
    }
    fun dequeue(){
       	when(queue.size){
             0 -> println("the queue is empty")
			else -> queue.removeAt(queue.size - 1)
        }
    }
    fun printQueue(){
        println(queue)
    }
}

fun main() {
    val testQueue =  Queue()
	testQueue.dequeue()
    testQueue.enqueue(10)
    testQueue.printQueue()
    testQueue.dequeue()
    testQueue.printQueue()    
}
