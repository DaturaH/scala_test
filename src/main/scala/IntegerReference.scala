//http://developer.51cto.com/art/200909/150724.htm

//class Reference[T] {
//  private var contents : T = _
//  def set (value : T) { contents = value }
//  def get : T = contents
//}
//
//object IntegerReference {
//  def main(args : Array[String]) : Unit = {
//    val cell = new Reference[String] 
//    cell.set("13")
//    println("Reference contains the half of : " + (cell.get * 2))
//  } 
//}


class Reference[T] { 
  private var contents : T = _
  def set(value : T) {contents = value}
  def get : T = contents
}

object IntegerReference {
  def main(args : Array[String]) : Unit = {
    val cell = new Reference[Int]
    cell.set(13)
    println(cell.get * 2)
  }
}
