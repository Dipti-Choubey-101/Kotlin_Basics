import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

//fun main(args: Array<String>) {
//var car1=Car()
//    car1.name="Tesla"
//    car1.model="S Plaid"
//    car1.color="Red"
//    car1.doors=4
//
//    println("Name:${car1.name}")
//    println("color:${car1.color}")
//    println("model:${car1.model}")
//    println("doors:${car1.doors}")
//    car1.move()
//    car1.stop()
//}
//class Car(){
//    var name=""
//    var color=""
//    var model=""
//    var doors=0
//
//    fun move(){
//        println("the car is moving")
//    }
//    fun stop(){
//        println("the car is stopped")
//    }
//}




//<----------------------------------------------------------------->
//its concise and easier to read with same output
//fun main(){
//var car1=Car("Tesla","RED","S Plaid",4)
//    println("Name:${car1.name}")
//    println("color:${car1.color}")
//   println("model:${car1.model}")
//    println("doors:${car1.doors}")
//    car1.move()
//    car1.stop()
//
//    var car2=Car("Fond","Mustang","Blue",2)
//
//    println("Name:${car2.name}")
//    println("color:${car2.color}")
//    println("model:${car2.model}")
//    println("doors:${car2.doors}")
//    car2.move()
//    car2.stop()
//}
//class Car(name:String,color:String,model:String,doors:Int){
//    var name=name
//    var color=color
//    var model=model
//    var doors=doors
//
//    fun move(){
//        println("the car is moving")
//    }
//    fun stop(){
//        println("the car is stopped")
//    }
//}





//<------------------------------------------------------>
//its concise and easier to read with same output
//fun main(){
//    var car1=Car("Tesla","RED","S Plaid",4)
//    println("Name:${car1.name}")
//    println("color:${car1.color}")
//    println("model:${car1.model}")
//    println("doors:${car1.doors}")
//    car1.move()
//    car1.stop()
//
//    var car2=Car("Fond","Mustang","Blue",2)
//
//    println("Name:${car2.name}")
//    println("color:${car2.color}")
//    println("model:${car2.model}")
//    println("doors:${car2.doors}")
//    car2.move()
//    car2.stop()
//}
//class Car(var name: String, var color: String, var model: String, var doors: Int){
//
//    fun move(){
//        println("the car is moving")
//    }
//    fun stop(){
//        println("the car is stopped")
//    }
//}





//GETTER AND SETTER
//fun main(){
//    val user = User("Dipti")
//    val friend =User("Neel", "Dey")
//
//    println("First name:${user.firstName}")
//    println("lastname:${user.lastName}")
//    println("age:${user.age}")
//
//    println("First name:${friend.firstName}")
//    println("lastname:${friend.lastName}")
//    println("age:${friend.age}")
//}
//class User(firstName:String,var lastName:String="LastName",var age:Int=0) {
//    var firstName=firstName
//        get(){
//            return "FirstName:$field"
//        }
//        set(value){
//            println("$value was assigned to firstName property")
//            field=value
//        }
//}



//<---------------------------------------------------------------->
//USING SETTER CODE BY REASSIGNING USER
//fun main(){
//    val user = User("Dipti")
//    val friend =User("Neel", "Dey")
//    user.firstName="Biva"
//
//    println(user.firstName)
//    println(user.lastName)
//    println(user.age)
//
//    println(friend.firstName)
//    println(friend.lastName)
//    println(friend.age)
//}
//class User(firstName:String,var lastName:String="LastName",var age:Int=0) {
//    var firstName=firstName
//        get(){
//            return "FirstName:$field"
//        }
//        set(value){
//            println("$value was assigned to firstName property")
//            field=value
//        }
//}




////using getter setter and concising code by writing getter code in one line
//fun main(){
//    val user = User("Dipti")
//    val friend =User("Neel","Dey")
//    user.firstName="Biva"
//
//    println(user.firstName)
//    println(user.lastName)
//    println(user.age)
//
//    println(friend.firstName)
//    println(friend.lastName)
//    println(friend.age)
//}
//class User(firstName:String,var lastName:String="LastName",var age:Int=0) {
//    var firstName=firstName
//        get()=field
//
//        set(value){
//            println("$value was assigned to firstName property")
//            field=value
//        }
//
//}


