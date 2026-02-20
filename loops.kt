fun main(args:Array<String>) {
    for (i in 1..10) {
        println("i=$i")
    }
}

//-------------------------------------------

for(i in 1 until 10){
    println("i=$i")
}}


//-------------------------------------------
    for(i in 10 downTo 1){
    println("i=$i")}
}



//------------------------------------------
    for (i in 1 until 10 step 2){
        println("i=$i")
    }
}


//-------------------------------------------
    var i=1
    while(i <=10){
    println("i=$i")
    i++}
}


//-------------------------------------------
    var i =10//here initialized no is greater than loop cintaining items so it wont give any output that's why we will use do..while loop for such cases where we want loop to run atleast one time
    while(i<10){
    println("i=$i")
    i++}
}

//--------------------------------------------
    var i=10
    do{
    println("i=$i")}
while(i <10)
}

//------------------------------------------
    var i = 1//concept of continue and break
    while (i < 10) {
        if(i==7){
            continue
        }
        println("i=$i")
        i++
    }
}


//-------------------------------------------
    var i = 1//concept of continue and break
    while (i < 10) {
        i++

        if (i == 7) {
            continue
        }
        println("i=$i")
    }
}


//--------------------------------------------
    var i = 1//concept of continue and break
    while (i < 10) {
        i++

        if (i > 2 && i<8) {
            continue
        }
        println("i=$i")
    }
}


//---------------------------------------------
    var i = 1//concept of continue and break
    while (i < 10) {
        i++

        if (i in 3..7) {
            continue
        }
        println("i=$i")
    }
}


//-----------------------------------------------
    var i = 1//concept of continue and break
    while (i < 10) {
        i++

        if (i ==7) {
            break
        }
        println("i=$i")
    }
}

//--------------------------------------------
    var i = 1//concept of continue and break
    for (i in 1.. 10) {

        if (i in 3..7) {
            break
        }
        println("i=$i")
    }
}


//--------------------------------------------
