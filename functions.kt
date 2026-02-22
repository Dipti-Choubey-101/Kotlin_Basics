
fun main(args:Array<String>){
    sayHello("Dipti", age = 19, std = 12)
    val hasInternetConnection=true
        if(hasInternetConnection){
            getData(data="some data")
        }else{
            showMessage()
        }
    }

fun sayHello(name:String,age:Int,std:Int){
    var age=20
    println("Hello,$name Your age is $age you read in std $std")
}

fun getData(data:String){
    println("Your data is:$data")
}
fun showMessage(){
    println("There is no internet connection")
}
