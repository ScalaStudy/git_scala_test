package chapter04

object ExpressionDemo {
  def main(args: Array[String]): Unit = {

    // 1、常见表达式(Java/Scala)中都支持
    // 使用运算符于 变量和常量 组合在一起形成 式子就是表达式
    var sum = 1+2; // 1+2就是表达式
    /*
    Scala中存在一个不同操作，在Scala中一切都是表达式
    可能是一个或多个语句形成在一起，出现表达式
    Scala中将if分支语句看做 if分支表达式 可以通过这种
    分支语句直接得到，判断之后数据结果
     */
    var res:Boolean = if (true) true else false;

    var i = 0;
    //此时使用{}形式括起来语句就是 --> 块表达式
    var sum1 = {
      i = i + 1;
      // 块表达式中最后一条赋值语句返回"()"值，它是一个Unit类型
      // PS: 只提供一个计算表达式并没有提供具体的值
    }

    println(sum1.isInstanceOf[Unit]);
    val sum2 = {
      i = i + 1;
      /*
      在块表达式中 i是最后一行，默认就会将i的值进行返回操作
      间接的等于 return i; sum2中将存储i变量的数据
       */
      i;
    }
    println(sum2)
    println(sum2.isInstanceOf[Int])


  }

}
