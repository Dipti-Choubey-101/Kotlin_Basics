//public
package com.example.interfaces
import com.example.classes.Car
fun main() {
   val car = Car()
   println(car.brand)  // ✅ allowed
   println(car.color)  // ✅ allowed
}

//<-------------------------------------------------------------->
//private
fun main() {
   val acc = BankAccount()

   // acc.balance -> Not allowed (private)

   acc.deposit(1000)
   println("Current Balance: ${acc.getBalance()}")
}

class BankAccount {

   private var balance = 0

   fun deposit(amount: Int) {
       if (amount > 0) {
           balance += amount
       }
   }

   fun getBalance(): Int {
       return balance
   }
}

//<----------------------------------------------------------->
//protected
fun main() {
   val car = Car()

   // car.speed ❌ Not allowed (protected)
   car.showSpeed()   // ✅ allowed
}

open class Vehicle {
   protected val speed = 60
}

class Car : Vehicle() {
   fun showSpeed() {
       println("Speed is: $speed")
   }
}
