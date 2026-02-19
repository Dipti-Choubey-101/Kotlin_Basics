//indexed
//fun main(args:Array<String>) {
//    val names=arrayOf("Dipti","Neel")
//    println("First element ${names[0]}")
//}




//<------------------------------------------------------>
//fun main(args:Array<String>) {
//    val names=arrayOf("Dipti","Neel")
//    names[0]="Dipu"
//    println("First element ${names[0]}")
//}




//<-------------------------------------------------------->
//fun main(args:Array<String>) {
//    val names=arrayOf("Dipti","Neel")
//     val numbers=arrayOf(4,5,6,7,8,"Name 1",'a')
//    names[0]="Dipu"
//   println("First element ${names[0]}")
//    println("The size of array is:${names.size}")
//    for(i in numbers){
//        println(i)
//    }
//}




//<-------------------------------------------------------->
//fun main(args:Array<String>) {
//    val array = intArrayOf(2, 4, 5, 23, 78, 9)
//    val max = findmax(array)
//    val min = findmin(intArrayOf(12, 34, 23, 45, 56, 67))
//    println("The Maximum number in array is:$max")
//    println("The Minimum number in array is:$min")
//}
//
//fun findmax(numbers:IntArray): Int {
//    var max = numbers[0]
//    for (number in numbers)
//         if (number > max){
//             max=number
//         }
//    return max
//}
//fun findmin(numbers:IntArray): Int{
//    var min=numbers[0]
//        for(number in numbers){
//            if(number<min){
//                min=number
//            }
//        }
//    return min
//}







//<------------------------------------------------------------>
//findMax and findMin
//fun main(args:Array<String>){
//    var max=findMaxAndMin(arrayOf(23,45,123,54,324,78),searchMax=true)
//        var min=findMaxAndMin(arrayOf(13,43,64,86,52,74),searchMax=false)
//        println("the max no:$max")
//        println("the min no. is:$min")
//}
//fun findMaxAndMin(numbers:Array<Int>,searchMax:Boolean):Int {
//    var max = numbers[0]
//    var min = numbers[0]
//    if (searchMax) {
//        for (number in numbers) {
//            if (number > max)
//                max = number
//        }
//        return max
//    } else {
//        for (number in numbers) {
//            if (number < min) {
//                min = number
//            }
//        }
//        return min
//    }
//}