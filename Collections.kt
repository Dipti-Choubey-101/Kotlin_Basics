//collections are of 3 types:list,set and map
//fun main(args:Array<String>) {
//    val user1=User("Neel")
//    val user2=User("Raj")
//    val user3=User("Biva")
//    val user4=User("Biva")
//    val names=mutableSetOf<User>(user1,user2,user3,user4)
//    names.forEach{println(it.name)}
//}
//data class User(val name: String)



//<------------------------------------------------------------------->
//maps
//fun main(args:Array<String>) {
//    val users=mapOf<Int,String>(1 to "Neel",2 to "Biva",3 to "Riya")
//    println(users[1])
//}




//<-------------------------------------------------------------------->
//fun main(args:Array<String>) {
//    val users=mutableMapOf<Int,String>(1 to "Neel",2 to "Deep",3 to "Rao")
//    users[5]="Sapna"
//    users.remove(2)
//    users.forEach{t, u ->
//        println("$t and $u")
//    }
//}




//<---------------------------------------------------------------------->
    //collections Operations
    //flatten functions
//fun main(args:Array<String>) {
//    val numberSets=arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9))
//    println(numberSets[2][2])
//}





//<------------------------------------------------------------------------->
//fun main(args:Array<String>) {
//    val numberSets=listOf(setOf(1,2,3),setOf(4,5,6),setOf(7,8,9))
//    for(numbers in numberSets){
//        for(number in numbers){
//            println(number)
//        }
//        println("\n")
//    }
//}




//<-------------------------------------------------------------->
    //dimensional array
//fun main(args:Array<String>) {
//   val numberSets=listOf(setOf(1,2,3),setOf(4,5,6),setOf(7,8,9))
//    val numbersFlatten=numberSets.flatten()
//    println(numbersFlatten[8])
//}




//<-------------------------------------------------------------->
//loop through one dimensional array
//fun main(args:Array<String>) {
//    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
//    val numbersFlatten = numberSets.flatten()
//    for(number in numbersFlatten){
//        println(number)
//    }
//}




//<--------------------------------------------------------------->
    //string representation
//fun main(args:Array<String>) {
//    val numberStrings=listOf("ONE","TWO","THREE","FOUR")
//    println(numberStrings)
//    println(numberStrings.joinToString())
//}




//<----------------------------------------------------------------->
//joining string using prefix.postfix
//fun main(args:Array<String>) {
//    val numbersStrings=listOf("ONE","TWO","THREE","FOUR")
//    val listString = StringBuffer("The list of numbers:")
//    println(numbersStrings.joinTo(listString))
//    println(numbersStrings.joinToString(separator = " | ",prefix= "start:", postfix = ":end"))
//}
//




//<---------------------------------------------------------->
//fun main(args:Array<String>) {
//    val numbers=(1..100).toList()
//    println(numbers)
//    println(numbers.joinToString(limit=15,truncated="<...>"))
//}




//<------------------------------------------------------------>
    //filtering
// fun main(args:Array<String>) {
//    val numbers = listOf("one", "two", "three", "four")
//    val longerThan3 = numbers.filter { it.length > 3 }
//    println(longerThan3)





//<----------------------------------------------------------->
//fun main(args:Array<String>) {
//    val numbersMap=mapOf("key 1" to 1,"key 2" to 2,"key 101" to 101)
//    val filteredMap=numbersMap.filter{it.key.endsWith("1") && it.value>100}
//    println(filteredMap)
//}





//<--------------------------------------------------------------->
    //filter index
//fun main(args:Array<String>) {
//    val numbers=listOf("one","two","three","four")
//    val filteredIdx=numbers.filterIndexed { index, value  -> (index !=0)&& (value.length<5)}
//    println(filteredIdx)
//}





//<----------------------------------------------------------------->
    //filter not
//fun main(args:Array<String>) {
//    val numbers=listOf("one","two","three","four")
//    val filteredNot=numbers.filterNot { it.length<=3 }
//    println(filteredNot)
//}





//<-------------------------------------------------------------------->
//filterisinstance
//fun main(args:Array<String>) {
//    val mixedList=listOf(1,2,3,'A','B',"DIPU","ZERO",false)
//    mixedList.filterIsInstance<String>().forEach {
//        println(it)
//    }
//}




//<------------------------------------------------------------------->
    //partition filtering
//fun main(args:Array<String>) {
//    val numbers = listOf("one", "two", "three", "four")
//    val (match, rest) = numbers.partition { it.length > 3 }
//    println(match)
//    println(rest)
//}





//<----------------------------------------------------------------->
//filtering on the basis of random criteria(predicates)
//fun main(args:Array<String>) {
//    val numbers = listOf("one", "two", "three", "four")
//    println(numbers.any { it.endsWith("e") })
//    println(numbers.none{it.endsWith("w")})
//    println(numbers.all{it.length>7})
//}





//<------------------------------------------------------------------>
    //+ and - operators
//fun main(args:Array<String>) {
//    val numbers = mutableListOf("one", "two", "three", "four")
//    val plusList = numbers + "five"
//    println(plusList)
//    val minusList = numbers - mutableListOf("three","four")
//    println(minusList)
//}





//<------------------------------------------------------------>
    //grouping
//fun main(args:Array<String>) {
//    val numbers = listOf("one", "two", "three", "four")
//    println(numbers.groupBy { it.first().uppercase() })
//    println(numbers.groupBy(keySelector = { it.first() }, { it.uppercase() }))
//}




//<----------------------------------------------------------->
    //slice filtering
//fun main(args:Array<String>) {
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.slice(1..3))
//    println(numbers.slice(0..4 step 2))
//    println(numbers.slice(setOf(3,5,0)))
//
//    println("\n")
//    println(numbers.take(3))
//    println(numbers.takeLast(3))
//    println(numbers.drop(1))
//    println(numbers.dropLast(5))
//
//    println("\n")
//    println(numbers.takeWhile { !it.startsWith("f") })
//    println(numbers.takeLastWhile { it != "three" })
//    println(numbers.dropWhile { it.length==3})
//    println(numbers.dropLastWhile { it.contains("i") })
//}






//<------------------------------------------------------------>
//chunks
//fun main(args:Array<String>) {
//    val numbers = (0..13).toList()
//    println(numbers.chunked(3))
//    println(numbers.chunked(3){it.sum()})
//}




//<-------------------------------------------------------------->
//fun main(args:Array<String>) {
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    val windows = numbers.windowed(3)
//    println(windows)
//}






//<------------------------------------------------------------------->
//with index
//fun main(args:Array<String>) {
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.elementAt(2))
//    println(numbers.first())
//    println(numbers.last())
//
//    println("\n")
//    println(numbers.first { it.length>3 })
//    println(numbers.last{it.startsWith("f")})
//    println(numbers.random())
//    println(numbers.isEmpty())
//}





//<------------------------------------------------------->
//aggregate functions
//fun main(args:Array<String>) {
//    val numbers = listOf(6, 7, 10, 87, 100)
//    println("the sum is ${numbers.sum()}")
//    println("the count is ${numbers.count()}")
//    println("the average is ${numbers.average()}")
//    println("the max is ${numbers.maxOrNull()}")
//    println("the min is: ${numbers.minOrNull()}")
//    println("the sum is:${numbers.sumOf { it * 2 }}")
//}





//<------------------------------------------------------>
//sorting
//fun main(args:Array<String>) {
//    val numbers = mutableListOf(2, 55, 75, 28, 22, 382)
//    numbers.sorted().forEach { println(it) }
//    val laptops=mutableListOf(
//        Laptop("dell",1999,40,40000),
//        Laptop("samsung",2000,60,60000),
//        Laptop("Apple",2013,10,70000)
//    )
//    println("\n")
//    laptops.sorted().forEach { println(it)}
//    println("\n")
//    laptops.sortedWith(ComparatorRam()).forEach { println(it) }
//}
//
//data class Laptop(val brand:String,val year:Int,val ram:Int,val price:Int): Comparable<Laptop>{
//    override fun compareTo(other: Laptop): Int {
//        return if(this.price>other.price){
//            println("In if statement:Swapping ${this.brand} with ${other.brand}")
//            1
//        }else if(this.price<other.price){
//            println("In if statement:Swapping ${this.brand} with ${other.brand}")
//            -1
//        }else{
//            0
//        }
//    }
//}
//
//class ComparatorRam: Comparator <Laptop>{
//    override fun compare(L1: Laptop, L2: Laptop): Int {
//        return if(L1.ram>L2.ram){
//            1
//        }else if(L1.ram<L2.ram){
//            -1
//        }else{
//            0
//        }
//    }
//
//}





//<-------------------------------------------------------->
//precise way
//fun main(args:Array<String>) {
//    val numbers = mutableListOf(2, 55, 75, 28, 22, 382)
//    numbers.sorted().forEach { println(it) }
//    val laptops=mutableListOf(
//        Laptop("dell",1999,40,40000),
//        Laptop("samsung",2000,60,60000),
//        Laptop("Apple",2013,10,70000)
//    )
//    laptops.sortedWith(compareBy { it.price }).forEach { println(it)}
//    println("\n")
//    laptops.sortedWith(compareBy { it.ram }).forEach { println(it)}
//}
//
//data class Laptop(val brand:String,val year:Int,val ram:Int,val price:Int)





//<---------------------------------------------------------->
// more precise way
//fun main(args:Array<String>) {
//    val numbers = mutableListOf(2, 55, 75, 28, 22, 382)
//    numbers.sorted().forEach { println(it) }
//    val laptops=mutableListOf(
//        Laptop("dell",1999,40,40000),
//        Laptop("samsung",2000,60,60000),
//        Laptop("Apple",2013,10,70000)
//    )
//    laptops.sortedBy{ it.price }.forEach { println(it)}
//    println("\n")
//    laptops.sortedBy { it.ram }.forEach { println(it)}
//}
//
//data class Laptop(val brand:String,val year:Int,val ram:Int,val price:Int)





//<----------------------------------------------------------->
//most precise way
//fun main(args:Array<String>) {
//    val numbers = mutableListOf(2, 55, 75, 28, 22, 382)
//    numbers.sorted().forEach { println(it) }
//    val laptops=mutableListOf(
//        Laptop("dell",1999,40,40000),
//        Laptop("samsung",2000,60,60000),
//        Laptop("Apple",2013,10,70000)
//    )
//    laptops.sortedWith(compareBy<Laptop> { it.price }.thenBy{it.ram}).forEach { println(it)}
//}
//
//data class Laptop(val brand:String,val year:Int,val ram:Int,val price:Int)