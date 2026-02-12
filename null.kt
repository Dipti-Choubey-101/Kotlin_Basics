fun main(args:Array<String>){
    var text:String?=null
    if(text!=null) {
        println(text.length)
    }
    else{
        println("variable is null")
    }
    text="Some text"
            println(text!!.length)

}