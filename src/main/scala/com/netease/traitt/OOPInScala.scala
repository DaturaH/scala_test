package com.netease.traitt
/*
 * 
 * http://blog.csdn.net/stark_summer/article/details/42642667
 * 
 */
class OOPInScala {
  
}

class User(val name : String , val age :Int){
//  var name: String = _
//  var age = 18
  println("this is User class primary constructor! ")
  var gender : String = _
  def this(name : String , age : Int ,gender :String){
    this(name ,age)
    this.gender = gender 
    println("this is User class secondary constructor! ")
  }
}




object OOPInScala {
  def main(args : Array[String]) {
    val user = new User("htq" , 18 , "male")
//    user.name = "summer"
    println("user.name = " + user.name)
    println("user.age = " + user.age)
  } 
}