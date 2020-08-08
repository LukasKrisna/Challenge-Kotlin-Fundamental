fun main(){
    val wordone = "Modern"
    val wordtwo = "Concise"
    val wordthree = "Pragmatic"
    val wordfour = "Safe"

    val good ="""
        |Kotlin is $wordone
        |Kotlin is $wordtwo
        |kotlin is $wordthree
        |Kotlin is $wordfour
    """.trimMargin()
    print(good)
}