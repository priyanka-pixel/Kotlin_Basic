package com.example.kotlinbasics.basic

class ClassDemo {
     private var lamp: Boolean = false

    fun on(){
        lamp = true
    }
    fun of(){
        lamp = false
    }
    fun Displaylight(lamp: String){
        if (this.lamp)
            println("")
    }

    fun main(args: Array<String>) {

        val l1 = ClassDemo() // create l1 object of Lamp class
        val l2 = ClassDemo() // create l2 object of Lamp class
    }
    //property
    // member function
//    var name: String = "";
//    var age: Int = 0;
//
//    fun insertName(n: String) {
//        this.name = n
//    }
//
//    fun insertValues(n: String, a: Int) {
//        this.name=n
//        this.age=a
//        println("Name is $name")
//        println("Age is $age")
//    }
//}
//fun main(args: Array<String>){
// Java
//    ClassDemo class demo= new ClassDemo();
//     DO NOT HAVE A NEW() IN KOTLIN
//     creating objects of a class
//    var obj= ClassDemo()
//    obj.insertName("Tom")
//    println("The name set is: ${obj.name}")
//
//    var obj2= ClassDemo()
//    obj2.insertValues("John",45)

}