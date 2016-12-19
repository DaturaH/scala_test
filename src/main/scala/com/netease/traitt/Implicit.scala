package com.netease.traitt

/*
 * 隐式转换
 * 
 * http://blog.csdn.net/stark_summer/article/details/42679783
 */


class Implicit{
  
}

class Test{
  
}

class RunTest(test : Test){
  def run : Unit = {
    println("RunTest --> test = " + test)
  }
}

object Implicit extends App {
  implicit def test2RunTest(test : Test) = new RunTest(test)
  val test = new Test
  test.run
  
  val testt = new RunTest(new Test)
  testt.run
  
  def testParam(implicit name : String) : Unit = {
    println("name : " + name )
  }
  implicit val name = "haha ..."
  testParam
  testParam("test ... ")
  
  implicit class Calc(x : Int) {
    def add(a: Int) : Int = a + x 
  }
  println("1.add(2) = " + 1.add(2))
  println("1.add(2) = " + Calc(1).add(2))
}


//object Implicit extends App{
//  implicit def test2RunTest(test : Test) = new RunTest(testt)
//  val testt = new Test
//  testt.run
////  val testt = new RunTest(new Test)
////  testt.run
//  def testParam(implicit name : String) : Unit = {
//    println("name : " + name)
//  } 
//  implicit val name = "Implicited..."
//  testParam
//}