import java.awt.Button
import javax.swing.Action

fun main(args:Array<String>) {
   val myLambda={a:Int,b:Int->println("a+b=${a+b}")}

   myLambda(8,9)
}
fun add(a:Int,b:Int){
   println("a+b=${a+b}")
}




//<------------------------------------------------------------->
fun main(args:Array<String>) {
   val myLambda={a:Int->println(a)}
   add(5,3,myLambda)
}
fun add(a:Int,b:Int,action: (Int)->Unit){
   action(a+b)
}




//<------------------------------------------------------------->
fun main(args:Array<String>) {
   add(5, 6, { a: Int -> println(a) })
}
fun add(a:Int,b:Int,action:(Int)->Unit){
   action(a+b)
}




//<------------------------------------------------------------->
fun main(args:Array<String>) {
   val loginButton = Button("Login", 34261){
       //login user
       println("logged in")
   }

   val signUpButton = Button("SignUp", 7362){
       //signup user
       println("signed up")
   }

}
class Button(val text:String,val id:Int,val onClickListener:()->Unit)




//<-------------------------------------------------------->
fun main(args:Array<String>) {
   upperCase("Hello",{s:String,->s.uppercase()})
}
fun upperCase(str: String,myFunction:(String)->String){
   val upperCaseWord=myFunction(str)
   println(upperCaseWord)
}




//<-------------------------------------------------------->
//it using lambda func

fun main(args:Array<String>) {
   upperCase("Hello"){it.uppercase()}
}
fun upperCase(str: String,myFunction:(String)->String){
   val upperCaseWord=myFunction(str)
   println(upperCaseWord)
}




//<---------------------------------------------------------->
//scope func using with keyword

fun main(args: Array<String>) {
   val user = User()
   val result = with(user) {
       firstName = "Neel"
       lastName = "Sen"
       age = 20
       "text"
   }
   println(result)           // prints "text"
   println(user.firstName)   // Neel
   println(user.lastName)    // Sen
   println(user.age)         // 20
}
class User {
   var firstName = ""
   var lastName = ""
   var age = -1
}




//<------------------------------------------------------------>
//scope  func using

//fun main(args: Array<String>) {
//    val user=User().apply {
//        this.firstName="Dipti"
//        this.lastName="Choubey"
//        this.age=20
//        //23//here if we hower over user we get User not int bcoz it returns the value of object it is created
//    }
//    with(user){
//        println(firstName)
//        println(lastName)
//        println(age)
//    }
//}
//class User(){
//    var firstName=""
//    var lastName=""
//    var age=-1
//}





//<----------------------------------------------------------->
//fun main(args: Array<String>) {
//    val user =User("Neel","Sen",20)
//    println(user)
//}
//data class User(val firstName:String,val lastName:String,val age:Int)



//<------------------------------------------------------------->
//instead of normal form lets do something changes ,let's use also scope func

//fun main(args: Array<String>) {
//    val result=User("Neel","Sen",20).also{
//        println(it)//if we hower the result we will get the User in return
//    }
//}
//data class User(val firstName:String,val lastName:String,val age:Int)




//<--------------------------------------------------------------->
//let scope func

//fun main(args: Array<String>) {
//    val text: String?=null
//    text.let{//it returns null
//        println(it)
//    }
//}
//data class User(val firstName:String,val lastName:String,val age:Int)




//<--------------------------------------------------------------->
//fun main(args: Array<String>) {
//    var text: String? = "Neel"
//
//    text?.let {
//        println(it)
//    }
//}
//data class User(val firstName: String, val lastName: String, val age: Int)




//<----------------------------------------------------------------->
//run scope func
//fun main(args: Array<String>) {
//    val user: User? = User("Neel", "Sen", 20)
//
//    user?.run {
//        println(firstName)
//        println(lastName)
//        println(age)
//    }
//}
//data class User(val firstName: String, val lastName: String, val age: Int)

