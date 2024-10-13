package chapter03

object TestArithmetic {
  def main(args: Array[String]): Unit = {

    /**
     * (1) 对于除号 “/”
     */
    var r1: Int = 10 / 3
    println("r1 = " + r1)

    var r2: Double  = 10 / 3
    println("r2 = " + r2)

    var r3: Double = 10.0 / 3
    println("r3 = " + r3)

    /*
    (2) 数取模

     */
    var r4 = 10 % 3
    println("r4 = " + r4)

    /*
    (3) 保留小数点后两位，使用四舍五入法
     */
    println("r3 = " + r3.formatted("%.2f"))

    // 官方推荐
    println("r3 = %.2f".format(r3))


  }

}
