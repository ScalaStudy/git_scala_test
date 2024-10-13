package chapter04

import scala.io.StdIn

object TestIfElse {
  def main(args: Array[String]): Unit = {

   /* println("-----单分支-----")
    println("input age:")
    var age1 = StdIn.readShort()
    if (age1 < 18){
      println("小孩！！")
    }*/

  /*  println()
    println("-----双分支-----")
    println("input age:")
    var age2 = StdIn.readShort()
    if(age2 < 18){
      println("小孩！")
    }else{
      println("中孩！")
    }*/

    /*println("-----多分支-----")
    println("input age:")
    var age3 = StdIn.readShort()
    if (age3 < 18){
      println("小孩！")
    }
    else if (age3 > 18 && age3 <= 30){
      println("中孩！")
    }
    else{
      println("大孩！")
    }*/

    println("-----if-else 返回值-----")
    println("input age:")
    var age4 = StdIn.readInt()
    val res: String = if(age4 < 18 ){
      "小孩！"
    }
    else if (age4 >= 18 && age4<= 30){
      "中孩！"
    }
    else{
      "大孩！"
    }
    println(res)

    println("-----Scala 中返回值类型不一致，取它们共同的祖先类型-----")
    println("input age5")
    var age5 = StdIn.readInt()
    val res2: Any = if(age5 < 18){
      
    }

  }
}
