package chapter02

object TestCharType02 {
  def main(args: Array[String]): Unit = {

  }//（1）字符常量是用单引号 ' ' 括起来的单个字符。
  var c1: Char = 'a'
  println("c1 = " + c1)

  var c2 : Char = 'a' + 1
  println(c2)

  // \t: 一个制表位，实现对齐的功能
  println("name\tage")

  // \n 换行
  println("school \nclass")

  // 表示\
  println("若没有你，即使登临顶峰，也没有任何意义。")
  println("老陈说：\"今生只为你而活！\"")

}
