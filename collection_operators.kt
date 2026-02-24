//searching//linear search

//fun main() {
//    println(searchElements(22,mutableListOf(1,12,22,422,642,246,64,23)))
//}
//private fun searchElements(searchedElement: Int,numbers: MutableList<Int>):Int {
//    var i=0
//    for (number in numbers) {
//        i++
//        println("searched number:$i")
//        if (number == searchedElement) {
//            return number
//        }
//    }
//    return -1
//}



//<------------------------------------------------------------------------->
//Instead of checking every element, it divides the list in half each time
//This is called Binary Search.

//fun main() {
//    println(searchElement(22,mutableListOf(1,12,22,422,642,246,64,23)))
//}
//private fun searchElement(searchedElement: Int,numbers: MutableList<Int>):Int {
//    var low=0
//    var high=numbers.size-1
//    var i=0
//    while(low<=high){
//        i++
//        println("searched number: $i")
//        val mid=(low+high)/2
//        val comparision=numbers[mid].compareTo(searchedElement)
//        if(comparision<0){
//            low=mid+1
//        }else if(comparision>0){
//            high=mid-1
//        }else{
//            return numbers[mid]
//        }
//    }
//    return -1
//}




//<------------------------------------------------------------------------>
//fun main() {
//    println(searchElement(22,mutableListOf(1,12,22,422,642,246,64,23)))
//}
//private fun searchElement(searchedElement: Int,numbers: MutableList<Int>)= numbers[numbers.binarySearch(22)]