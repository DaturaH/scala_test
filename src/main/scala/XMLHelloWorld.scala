import scala.collection.mutable.ArrayBuffer

object XMLHelloWorld{
  def main(args: Array[String]): Unit = {
//    val xml =  "hello world";
//    println(xml);
//    val range = 1.to(10);
//    println(range);
//    println(xml.charAt(3));
//    println(xml(3));
//    println(xml.apply(3));
//    
//    val x = 1
//    val s = if(x > 0) 1 else -1;
//    println(s);
//    println(fac(5))
//    
//    val a = new Array[String](10)
//    val aa = Array(1,3,2)
//    val b = Array("aaa" , "bbb")
//    println(b(0))
//    for(i <- 0 until b.length ){
//      println(b(i));
//    }
//    
//    val bb = ArrayBuffer[Int]()
//    bb += 1
//    bb += (1,5,3)
//    println(bb)
//    
//    for(elem <- bb){
//      println(elem)
//    }
//    
//    
//    val result = for(elem <- bb) yield elem *2
//    
//    
//    val bbb = ArrayBuffer(1,7,2,9).max
//    println(bbb)
//    val bbSort = bb.sorted
//    println(bbSort)
//    val bbSort1 = bb.sortWith(_ > _)
//    println(bbSort1)
//    
//    val score = Map("Alice" -> 10 , "Bob" -> 20)
//    System.out.println(score)
//    println(score("Alice"))
//    println(score.getOrElse("Bob", 0))
//    
//    
//    val symbols = Array("<" , ">" , "=" )
//    val counts = Array(2, 10 , 2)
//    val pairs = symbols.zip(counts)
//    println(pairs)
//    for(elem <- pairs){
//      print(elem + " ")
//    }
//    
//    
//    val myCount = new Count
//    val myCount1 = new Count()
//    
//    current()
    
    
    
    val numPattern = "[0-9]+".r
    val matches = numPattern.findAllIn("99 bottles , 98 bottles").toArray
    for(elem <- matches){
      print(elem + " ")
    }
  }
  
  def fac(n : Int):Int = if (n <= 0 ) 1 else n * fac(n-1)
  
  def fac1(n : Int) : Int = {
    if (n <= 0 ) 1 else n * fac(n-1)
  }
  
  def current() = 1
}

class Count{}

class Person{
  private var privateAge = 0
  def age = privateAge
  def age_=(newValue :Int){
    if(newValue > privateAge) { 
      privateAge = newValue;
    }
    
  }
}