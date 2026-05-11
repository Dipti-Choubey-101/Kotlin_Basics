fun main(args:Array<String>) {
   val a = 5
   val b = 0
   println(a / b)//it gives error bcoz it is not possible

   val number = arrayOf(2)
   println(number[1])//it also gives error
}


//<------------------------------------------------------------>
//so trying try and catch method
fun main(){
   val a=5
   val b=5
   val result=try{
       println(a/b)
       a/b
   }catch(e: ArithmeticException){
       println("you cant divide by 0:${e.message}")
       0
   }finally{
       println("divide by zero")
   }
   println(result)
}
