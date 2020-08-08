fun main(){
    val user = setUser("Lukas", "scrolling timeline without any context", 17)
    println(user)
}
fun setUser(name: String, hobby: String, age: Int) = "My name is $name, I like $hobby and im $age years old"