package chapter02

object TestVar {
  def main(args: Array[String]): Unit = {

    // 变量和常量

    /*
    变量：var
    var修饰的变量可以改变
     */
    var a = 10 // 编译器自动推导，即类型推导
    var b: Int = 10
    b = 20
    println(b)

    /*
    常量：val
    val修饰的的常量
     */
    val c = 10
    var d: Int = 20
    //    c = 25

    val x = new Person()
    x.name = "anshun"

  }

  class Person {
    var name: String = "asu"
  }


}
