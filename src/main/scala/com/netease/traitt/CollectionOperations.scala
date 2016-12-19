package com.netease.traitt

/*
 * 
 * http://blog.csdn.net/stark_summer/article/details/42677471
 * 
 */

class CollectionOperations{}

object CollectionOperations {
  def main(args : Array[String]) : Unit = {
      val list1 = List(1,2,3,4,5)
      val set1 = Set(6,7,8,9,10,6)
//      println(set1)
      
      val t1 = ("t1" , "t2" , "t3")
      println(t1._1)
      println("a" -> "b")
      
      val map1 = Map("a" -> "b")
      println(map1)
      println(list1.filter { x => x % 2 == 0 })
      
      val a = List(1,2,3)
      val b = List(4,5,6)
      println(a zip b)
  }  
}