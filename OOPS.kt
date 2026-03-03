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




//<------------------------------------------------------------------------------->
//code including primary and seconding constructors
//fun main(){
//    val user = User(name = "Dipti")
//    val friend =User(name = "Neel", lastName = "Dey")
//    println("name:${user.name}")
//    println("lastname:${user.lastName}")
//    println("age:${user.age}")
//
//    println("name:${friend.name}")
//    println("lastname:${friend.lastName}")
//    println("age:${friend.age}")
//}
//class User(var name:String,var lastName:String,var age:Int){
//    constructor(name:String):this(name,"lastName",0){
//    println("2nd")
//
//}
//    constructor(name:String,lastName:String):this(name,lastName,0){
//    println("3rd")
//    }
//}





//<----------------------------------------------------------------------->
//making code concise
//fun main(){
//    val user = User("Dipti")
//    val friend =User( "Neel", "Dey")
//    println("First name:${user.firstName}")
//    println("lastname:${user.lastName}")
//    println("age:${user.age}")
//
//    println("First name:${friend.firstName}")
//    println("lastname:${friend.lastName}")
//    println("age:${friend.age}")
//}
//class User(var firstName:String,var lastName:String="LastName",var age:Int=0)





//<--------------------------------------------------------------------->
//making same code concise with 3 users
//fun main(){
//    val user = User("Dipti")
//    val friend =User("Neel", "Dey")
//    val user2=User("Diptanil","dey",20)
//
//    println("First name:${user.firstName}")
//    println("lastname:${user.lastName}")
//    println("age:${user.age}")
//
//    println("First name:${user2.firstName}")
//    println("lastname:${user2.lastName}")
//    println("age:${user2.age}")
//
//    println("First name:${friend.firstName}")
//    println("lastname:${friend.lastName}")
//    println("age:${friend.age}")
//}
//class User(var firstName:String,var lastName:String="LastName",var age:Int=0)





//<------------------------------------------------------------------------------->
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





//<-------------------------------------------------------------------------------->
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




<------------------------------------------------------------------------------------------>
//prevents multiple instance from being created and allowing access to only one object of database class
//fun main(){
//        val instance = Database.getInstance()//database is the instance
//        val instance2 = Database.getInstance()
//        println(instance)//output same of both bcoz both variables poiny to same object
//        println(instance2)
//    }
//
//
//class Database private constructor(){
//    companion object{
//        private var instance:Database?=null
//
//        fun getInstance():Database?{
//            if(instance==null){
//                instance=Database()
//            }
//            return instance
//        }
//    }
//}




//<----------------------------------------------------------------------->
//creating object
//fun main(){
//    println(Database)
//}
//object Database{
//    init{
//        println("Database is created")
//    }
//}



//<----------------------------------------------------------------------->
//enum  classes
//fun main(){
//println(Direction.NORTH)
//}
//enum class Direction{
//    NORTH,
//    SOUTH,
//    EAST,
//    WEST
//}



//<-------------------------------------------------------------------------->
// MANY DIRECTIONS PRINT
//fun main(){
//     println(Direction.NORTH)
//    println(Direction.WEST)
//    println(Direction.SOUTH)
//    println(Direction.EAST)
//}
//enum class Direction{
//    NORTH,
//    SOUTH,
//    WEST,
//    EAST
//}




//<------------------------------------------------------------------>
//CONSTRUCTOR AND PARAMETERS
//fun main() {
//    for (direction in Direction.values()) {
//        println(direction)
//    }
//
//    println(Direction.NORTH.direction)
//    println(Direction.NORTH.distance)
//    println(Direction.SOUTH.direction)
//    println(Direction.SOUTH.distance)
//    println(Direction.EAST.direction)
//    println(Direction.EAST.distance)
//    println(Direction.WEST.direction)
//    println(Direction.WEST.distance)
//}
//
//enum class Direction(var direction: String, var distance: Int) {
//    NORTH("north", 20),
//    SOUTH("south", 20),
//    WEST("west", 12),
//    EAST("east", 54)
//}



//<------------------------------------------------------------------------->
//enum class Direction(var direction:String,var distance:Int){
//    NORTH("north",20),
//    SOUTH("south",20),
//    WEST("west",12),
//    EAST("east",54);
//
//    fun printData(){
//        println("Direction:$direction and Distance:$distance")
//   }
//}
//fun main(){
//   val direction=Direction.WEST
//
//    when(direction){
//        Direction.EAST->println("THE DIRECTION IS EAST")
//        Direction.WEST->println("THE DIRECTION IS WEST")
//        Direction.NORTH->println("THE DIRECTION IS NORTH")
//        Direction.SOUTH->println("THE DIRECTION IS SOUTH")
//    }
//    direction.printData()
//}






//<--------------------------------------------------------------------->
//enum class Direction(var direction: String, var distance: Int) {
//    NORTH("north", 20),
//    SOUTH("south", 20),
//    WEST("west", 12),
//    EAST("east", 54);
//
//    fun printData() {
//        println("Direction: $direction and Distance: $distance")
//    }
//}
//
//fun main() {
//    val dir = Direction.NORTH
//    dir.printData()
//}



  //<---------------------------------------------------------------------->
//INNER CLASSES
//fun main(){
//val listView=ListView(arrayOf("Name 1","Name 2","Name 3"))
//    listView.ListViewItems().displayItem(2)
//}
//
//class ListView(var items:Array<String>) {
//    inner class ListViewItems() {
//        fun displayItem(position: Int) {
//            println(items[position])
//        }
//    }
//}



//<--------------------------------------------------------------------->
//fun main(){
//    val alexAccount = Account("Alex")
//    alexAccount.deposit(1000)
//    alexAccount.withdraw(500)
//    alexAccount.deposit(-20)
//    alexAccount.withdraw(-100)
//    val balance =alexAccount.calculateBalance()
//    println("Balance is $balance")
//
//}
//class Account(val AccountName:String){
//        var balance=0
//        var transactions=mutableListOf<Int>()
//        fun deposit(amount:Int){
//            if(amount>0) {
//                transactions.add(amount)
//                balance += amount
//                println("$amount deposited.Balance is now ${this.balance}")
//            }
//            else{
//                println("Cannot deposit negative sums")
//            }
//        }
//    fun withdraw(withdrawal: Int){
//        if(-withdrawal<0) {
//            transactions.add(-withdrawal)
//            this.balance += -withdrawal
//            println("$withdrawal taken.Balance is now ${this.balance}")
//        }else{
//            println("cannot withdraw negative sums")
//        }
//    }
//    fun calculateBalance():Int{
//        this.balance=0
//        for(transaction in transactions){
//                   this.balance+=transaction
//        }
//        return this.balance
//    }
//}




//<----------------------------------------------------------------------------->
//using access modifiers on same code
//fun main(){
//    val alexAccount = Account("Alex")
//    alexAccount.deposit(1000)
//    alexAccount.withdraw(500)
//    alexAccount.deposit(-20)
//    alexAccount.withdraw(-100)
//    val balance =alexAccount.calculateBalance()
//    println("Balance is $balance")
////    alexAccount.balance=1000
//
//}
//class Account(val AccountName:String){
//    private var balance=0//making account accessable only within this class not outsuide it if we try to acees it outside the class it willl show cannt accessable as it a private class
//    private var transactions=mutableListOf<Int>()
//    fun deposit(amount:Int){
//        if(amount>0) {
//            transactions.add(amount)
//            balance += amount
//            println("$amount deposited.Balance is now ${this.balance}")
//        }
//        else{
//            println("Cannot deposit negative sums")
//        }
//    }
//    fun withdraw(withdrawal: Int){
//        if(-withdrawal<0) {
//            transactions.add(-withdrawal)
//            this.balance += -withdrawal
//            println("$withdrawal taken.Balance is now ${this.balance}")
//        }else{
//            println("cannot withdraw negative sums")
//        }
//    }
//    fun calculateBalance():Int{
//        this.balance=0
//        for(transaction in transactions){
//            this.balance+=transaction
//        }
//        return this.balance
//    }
//}

