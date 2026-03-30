import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlin.concurrent.thread
import kotlin.io.encoding.Base64
import kotlin.random.Random
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.Main



using thread did this

fun main(){//executed on main thread
   println("Main program starts: ${Thread.currentThread().name}")
   thread{
       println("Fake work starts:${Thread.currentThread().name}")
       Thread.sleep(2000)//pretending to do some work
       println("Fake work finished:${Thread.currentThread().name}")
   }
   println("Main program ends: ${Thread.currentThread().name}")

}




//<-------------------------------------------------------------->
using coroutine did this

fun main(){
   println("Main program starts: ${Thread.currentThread().name}")
   CoroutineScope(Dispatchers.Default
   ).launch {
       println("Fake work starts:${Thread.currentThread().name}")
       Thread.sleep(2000)//pretending to do some work
       println("Fake work finished:${Thread.currentThread().name}")
   }
   println("Main program ends: ${Thread.currentThread().name}")

}//here the fake work start and fake work finish is not given the output because the main program doesn't wait for this coroutines to be executed






//<-------------------------------------------------------------------->
fun main(){
   println("Main program starts: ${Thread.currentThread().name}")
   CoroutineScope(Dispatchers.Default
   ).launch {
       println("Fake work starts:${Thread.currentThread().name}")
       Thread.sleep(2000)//pretending to do some work
       println("Fake work finished:${Thread.currentThread().name}")
   }
   Thread.sleep(2000)//it stops program for 2000milliseconds
   println("Main program ends: ${Thread.currentThread().name}")

}




//<----------------------------------------------------------------->
suspend function

fun main(){
   println("Main program starts: ${Thread.currentThread().name}")
   val parentJob=CoroutineScope(Dispatchers.Default).launch {
       println("Fake work starts:${Thread.currentThread().name}")
       delay(2000)//just pause this specific coroutine
       println("Fake work finished:${Thread.currentThread().name}")
   }
   runBlocking {
       parentJob.join()
   }
   println("Main program ends: ${Thread.currentThread().name}")

}//delay is a suspend function but it will not delayed in the same way so we are using her Run blocking Run blocking actually tells the function to wait for few seconds to complete the task and then finish the function here the main function will be start fake work will start and after few time of that 2000 seconds the fake function will end and main fuync will end




//<----------------------------------------------------------------->
coroutines builders

fun main(){
   println("Main program starts: ${Thread.currentThread().name}")
   val parentJob=CoroutineScope(Dispatchers.Default).launch {
       val job1=launch {
           val result1=getData1(Thread.currentThread().name)
           println(result1)
       }
       val job2=launch {
           val result2=getData2(Thread.currentThread().name)
           println(result2)
       }
   }
   runBlocking {
       parentJob.join()
   }
   println("Main program ends: ${Thread.currentThread().name}")

}
private suspend fun getData1(threadName:String):String{
   println("Fake work1 starts:$threadName")
   delay(2000)
   println("Fake work1 finished:$threadName")
   return "Result 1"
}

private suspend fun getData2(threadName:String):String{
   println("Fake work2 starts:$threadName")
   delay(2000)
   println("Fake work2 finished:$threadName")
   return "Result 2"
}



//<------------------------------------------------------------------>
//async

fun main(){
   println("Main program starts: ${Thread.currentThread().name}")
   val start=System.currentTimeMillis()
   val parentJob=CoroutineScope(Dispatchers.Default).launch {
       val jobDeferred: Deferred<String> =async{
          getData1(Thread.currentThread().name)
       }
       val jobDeferred2: Deferred<String> =async {
           getData2(Thread.currentThread().name)
       }
       println(jobDeferred.await() + "\n${jobDeferred2.await()}")
   }
   runBlocking {
       parentJob.join()
   }
   println("Total time:${System.currentTimeMillis()-start}")

   println("Main program ends: ${Thread.currentThread().name}")

}
private suspend fun getData1(threadName:String):String{
   println("Fake work1 starts:$threadName")
   delay(2000)
   println("Fake work1 finished:$threadName")
   return "Result 1"
}

private suspend fun getData2(threadName:String):String{
   println("Fake work2 starts:$threadName")
   delay(2000)
   println("Fake work2 finished:$threadName")
   return "Result 2"
}




fun main(){
   println("Main program starts: ${Thread.currentThread().name}")
   val start=System.currentTimeMillis()
   val parentJob=CoroutineScope(Dispatchers.Default).launch {
       val jobDeferred: Deferred<String> =async{
           getData1(Thread.currentThread().name)
       }
       val jobDeferred2: Deferred<String> =async {
           getData2(Thread.currentThread().name)
       }
       println(jobDeferred.await() + "\n${jobDeferred2.await()}")
   }
   runBlocking {
       parentJob.join()
   }
   parentJob.invokeOnCompletion {
       it?.let{
           println("Parent job failed:${it.message}")
       }?:println("Parent job success!")
   }
   println("Total time:${System.currentTimeMillis()-start}")

   println("Main program ends: ${Thread.currentThread().name}")

}
private suspend fun getData1(threadName:String):String{
   println("Fake work1 starts:$threadName")
   delay(2000)
   println("Fake work1 finished:$threadName")
   return "Result 1"
}

private suspend fun getData2(threadName:String):String{
   println("Fake work2 starts:$threadName")
   delay(2000)
   println("Fake work2 finished:$threadName")
   return "Result 2"
}
