//lateinit code:initializing value later but it won't be null
//fun main(){
//    val user = User("Dipti","Dey",19)
//    user.favouriteMovie="3 idiots"
//    println(user.favouriteMovie)
//}
//class User(var firstName:String,var lastName:String,var age:Int) {
//    lateinit var favouriteMovie:String
//}





//<----------------------------------------------------------------->
//calculator class code
//fun main(){
//    val calculator=Calculator()
//    val result=calculator.sum(5,3)
//    println("result:$result")
//}
//class Calculator() {
//    fun sum(a: Int, b: Int): Int {
//        return a + b
//    }
//}




//<-------------------------------------------------------------------->
//HOW TO USE COMPANION OBJECT IN KOTLIN TO CALL A FUNCTION WITHOUT CREATING OBJECT OF CLASS
//fun main(){
//    val result = Calculator.sum(5, 6)
//    println(result)
//}
//class Calculator(){
//    companion object{
//        fun sum(a:Int,b:Int):Int{
//            return a+b
//        }
//    }
//}





//<------------------------------------------------------------------------->
//most imp code covering companion object,function calling and built-in constants like Int.MAX_VALUE
//fun main(){
// Int.MAX_VALUE
//    val result =Calculator.sum(a=5,b=7)
//    val max=Int.MAX_VALUE
//    println(result)
//}
//class Calculator(){
//    companion object{
//        fun sum(a:Int,b:Int):Int{
//            return a+b
//        }
//    }
//}
