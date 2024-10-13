package chapter03

object AssigningOperatorDemo {
  def main(args: Array[String]): Unit = {
    // 赋值运算符
    val username = "asu"

    var a = 10
    a += 10   // a = a + 10
    println(a)

    var b = 5
    b *= 3 + 5 // b = b * (3 + 5)
    println(b)


  }

}
