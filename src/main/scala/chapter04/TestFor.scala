package chapter04

import scala.util.control.Breaks
import scala.util.control.Breaks.{break, breakable}

object TestFor {
  def main(args: Array[String]): Unit = {
    // 范围数据循环(To)

    // 前后闭合，包含1也包含5
    for (i <- 1 to 5){
      // 循环体
      println("安顺学院" + i)
    }

    println("-------分隔符-------")

    // 范围数据循环(until)
    // 前闭后开，i的值包含1到5-1
    for (i <- 1 until  5){
      // 循环体
      println("安顺学院" + i)
    }

    println("-------分隔符-------")

    // 循环守卫
    // 类似于Java中的continue，跳出当前循环进入下一次循环
    for (i <- 1 to 3 if i != 2){
      println(i)
    }
    println("-----或者-----")

    for (i <- 1 to 3){
      if (i != 2){
        println(i)
      }
    }

    println("-------分隔符-------")

    // 循环步长
    // 关键字by
    // 需求，输出1到10以内的所有奇数
    for (i <- 1 to 10 by 2){
      println(i)
    }

    println("-------分隔符-------")

    // 嵌套循环
    // 嵌套循环最多不要超过三层
    for (i <- 1 to 3){
      for(j <- 1 to 3){
        println("i = " + i + "; j = " + j)
      }
    }

    println("-----或者-----")
    for (i <- 1 to 3; j <- 1 to 3){
      println("i = " + i + "; j = " + j)
    }

    println("-------分隔符-------")

    // 引入变量
    for(i <- 1 to 5; j = 4 - i){
//      var j = 4 - 1
      println("i = " + i + "; j = " + j)
    }

    println("-----或者-----")

    // 不同的写法
    // 当for循环的推导式包含单一表达式时，使用圆括号
    // for 推导式有一个不成文的约定：当 for 推导式仅包含单一表达式时使用圆括号，当包含多个表达式时，一般每行一个表达式，并用花括号代替圆括号
    for{
      i <- 1 to 5
      j = 4 - i
    }
      {
        println("i = " + i + "; j = " + j)
      }

    println("-------分隔符-------")

    //循环返回值
    // 需要将遍历出来的元素放入一个集合中进行返回
    //yidle关键字就是将处理的结果返回到一个新的集合中去
    // y = f(x)
    val result1 = for (i <- 1 to 10) yield i
    println(result1)

    // 需求：将原数据中所有值乘以 2，并把数据返回到一个新的集合中
    var result2 = for(i <-1 to 10) yield {
      i * 2
    }
    println(result2)

    println("-------分隔符-------")

    // 倒序打印
    // 关键字reverse
    for (i <- 1 to 10 reverse){
      println(i)
    }

    println("-------while循环-------")

    // while循环
    // 输出10句安顺学院
    var i = 1
    while(i <= 10){
      println("安顺学院" + i)
      i += 1
    }

    println("-------do-while循环-------")
    // 先执行再去判断执行条件
    do{
      println("安顺学院" + i)
      i += 1
    }
    while (i <= 10 )


    println()
    println("-------循环中断-------")

    // 循环中断
    // 1、采用抛出异常的方式终止循环
    println("以抛出异常的形式结束循环")
    try{
      for (i <- 1 to 10){
        println(i)
        if(i == 5){
          throw new RuntimeException()
        }
      }
    }catch {
      case e =>
    }

    println()
    println("break函数结束循环")
    // 使用Scala中提供的Breaks函数，终止循环
    Breaks.breakable(
      for(i <- 1 to 10){
        println(i)
        if(i == 5) Breaks.break()

    }
    )

    println()
    println("对break进行省略")
    breakable{
      for (i <- 1 to 10){
        println(i)
        if (i == 5)
          break
      }
    }

    // 循环遍历 10 以内的所有数据，奇数打印，偶数跳过（continue）
    println()
    println("循环遍历 10 以内的所有数据，奇数打印，偶数跳过（continue）")
    for(i <- 1 to 10){
      if(i % 2 == 1){
        println(i)
      }
      else{
        println("continue")
      }
    }








  }
}
