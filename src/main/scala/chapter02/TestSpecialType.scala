package chapter02

object TestSpecialType {
  def main(args: Array[String]): Unit = {


    // Unit类型： 表示无值，和void相等
    def sayOk : Unit = {// unit 表示无返回值，即void
    }
    println(sayOk)


    // Null类型：可以赋值给任意引用类型（AnyRef），但是不能赋值给值类型 （AnyVal ）
    //    var cat = new Cat()
    //    cat = null
    //   var n1 : Int = null  // 错误
    //    println("n1" + n1)

    // Nothing：可以作为没有正常返回值的方法的返回类型，非常直观的告诉你这个方法不会正常返
    //回，而且由于 Nothing 是其他任意类型的子类，他还能跟要求返回值的方法兼容。
    //    def test() : Nothing = {
    //      throw new Exception()
    //    }
    //    test()

    // Any: 可以接受任意的基本类型和引用类型
    var any : Any = null
    //    any = anyR   // anyR: AnyRef
    //    any = anyV   // anyR: AnyVal


    // AnyRef：可以使用AnyRef接受任意类型的引用类型
    var anyR : AnyRef = null

    // AnyVal: 可以使用AnyVal接收任意的基本类型
    //    var anyV: AnyVal = u  // Unit

  }

  //  class Cat{}

}
