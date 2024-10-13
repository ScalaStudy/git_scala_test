package chapter02

object TestDataType {
  def main(args: Array[String]): Unit = {
    var n1 : Byte = 127
    var n2: Byte = -128

    //    var n3 : Byte = 128  超过范围

    // Int 类型
    var n5 = 10

    var n6 = 999999999999999L

    // 声明Float类型的值时，需要加f或者F
    var n7 = 3.1415237983892F

    // 不加F或者f，则默认double
    var n8 = 3.9927848392298

    println("n7 = " + n7)
    println("n8 = " + n8)


  }

}
