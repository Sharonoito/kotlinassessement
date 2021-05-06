fun main(){
 introduction("Sharon",21)
    dispenser()
    names()
    operation(5,20)


}
fun introduction(name:String,age:Int){
    println("My name is ${name} and I am ${age} years old")
}
var age=6
fun dispenser(){
    if(age<=6) {
        println("Serves milk")
    }
    else if(age<=15){
        println("Serves fanta")
    }else{
        println("Serves Cocacola")
    }

}
fun names(){
    var names= arrayListOf("Sharon","jane","peter","ken")
    var longerNames=""
    for(nameLength in names){
        if(nameLength.length>=4){
            longerNames+=
            println(longerNames)

        }
    }
}
fun operation(num1: Int,num2:Int){
    var multiply=num1*num2
    var divide=num1%num2
    println(multiply)
    println(divide)
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating${foodWeight} kgs of food ")

    }

}