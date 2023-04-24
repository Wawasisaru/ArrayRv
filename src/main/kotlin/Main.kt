fun main() {
    capital()
    println(contain("saru","akinyi","Hardin"))
    fruits("mango","apple","passion","avaccado")
}


//Create a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.
 fun capital(){
     var capital = arrayOf("harare","dodoma","mumbai","jakrta")
    for (city in capital){
        println(city.capitalize())
    }
 }
//Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun contain(name1: String,name2: String,name3: String): String{
    var names = arrayOf(name1,name2,name3)
    return names.contentToString()

}
//Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun fruits(name1: String,name2: String,name3: String,name4: String){
    var add = arrayOf(name1,name2,name3,name4)
    println(add.contentToString())
}