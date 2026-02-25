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
