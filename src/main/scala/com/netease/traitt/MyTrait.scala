package com.netease.traitt

/*
 * 
 * http://blog.csdn.net/stark_summer/article/details/42645623
 * 
 */

trait Logger{
  def log(msg : String) : Unit = {
    println("msg = " + msg)  
  }
}

class MyLogger extends Logger {
  def log : Unit = {
    log("myLogger ...")
  }
}

trait TraitLogger{
  def log(msg :String)
}

trait ConsoleLogger extends TraitLogger {
  def log(msg : String) : Unit = {
    println("ConsoleLogger -->> " + msg)
  }
}

class TestConsoleLogger extends ConsoleLogger {
  def test() : Unit = {
    log("test ...")
  }
}

abstract class Account {
  def save
}

class MyAccount extends Account with ConsoleLogger {
  def save : Unit = {
    log("100000")
  }
}


class MyTrait{}

object MyTrait extends App{
  val myLogger = new TestConsoleLogger
  myLogger.log("ha")
  myLogger.test()
  val myAccount = new MyAccount
  myAccount.save
}