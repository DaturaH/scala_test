package com.netease.traitt
/*
 * 
 * http://blog.csdn.net/stark_summer/article/details/42676555
 * 
 */
class ApplyTest{
  def apply() :Unit = {
    println("This apply() is in class")
  }
  def test : Unit = {
    println("ApplyTest -->> test ...")
  }
}

object ApplyTest {
  
  var count = 0
  def apply() = new ApplyTest
  def static : Unit = {
    println("ApplyTest -->> static ...")
  }
  def increment = {
    count = count + 1
  }
  
  
//  def static : Unit = {
//    println("ApplyTest -->> static ...")
//  }
//  
//  def test : Unit = {
//    println("ApplyTest -->> static ...")
//  }
//  def apply() : Unit = {
//    println("ah")
//  }
  
  
}



class UsageOfApply {}

object UsageOfApply extends App{
  
  for(i <- 1 to 100){
    ApplyTest.increment
  }
  
  println(ApplyTest.count)
//  val applyTest = new ApplyTest()
//  applyTest.test
//  applyTest()
  
//  ApplyTest.static
//  val applyTest = new ApplyTest
//  applyTest.test
//  ApplyTest.test
//  ApplyTest()
//  val applyTest = new ApplyTest
//  applyTest.test
}