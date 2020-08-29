fun main(){
    val value = 7
    val stringOfValue = when (value){
        6 ->{
            println("Six")
            "Value is 6"
        }
        7 ->{
            println("Seven")
            "Value is 7"
        }
        8 ->{
            println("Eight")
            "Value is 8"
        }
        else ->{
            println("Underfined")
            "Value cannot be reached"
        }
    }
    println(stringOfValue)

}