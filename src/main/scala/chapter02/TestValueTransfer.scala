package chapter02

object TestValueTransfer {
  def main(args: Array[String]): Unit = {


    /**
     * 数值类型的自动转换
     */

    /**
     * （1）自动提升原则：有多种类型的数据混合运算时，系统首先自动将所有数据转换成精度大的那种数据类型，然后再进行计算。
     */
    var n1 = 1 + 2.0
    println(n1)  // n1 转换为Double类型

    /**
     * （2）把精度大的数值类型赋值给精度小的数值类型时，就会报错，反之就会进行自动类型转换。
     */
    var n2: Double = 3.415962
    //    var n3: Int = n2     // 错误，不能把高精度的数据直接赋值和低精度


    /**
     *  （3）（byte，short）和 char 之间不会相互自动转换。
     */
    var n4: Byte = 1
    //    var c1: Char = n4  // 错误
    var c2: Int = n4


    /**
     * （4）byte，short，char 他们三者可以计算，在计算时首先转换为 int 类型。
     */
    var n5: Byte = 1
    var n6: Short = 1
    var n7: Char = 1
    var c3: Int = n5 + n6 + n7



  }

}
