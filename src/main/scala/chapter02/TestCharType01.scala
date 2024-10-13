package chapter02

object TestCharType01 {
  def main(args: Array[String]): Unit = {

    // 字符串的连接
    var name:String = "安兮若"
    var age : Int = 18

    // println 字符串，通过+号连接
    println(name + ":" + age)

    // printf 用法：字符串，通过%传值
    printf("name = %s age=%d", name,age)

    // 字符串，通过$引用
    // 多行字符串，在Scala中，利用三个双引号包围多行字符串就可以实现
    //输入的内容，带有空格、\t 之类，导致每一行的开始位置不能整洁对齐。
    //应用 scala 的 stripMargin 方法，在 scala 中 stripMargin 默认 是“|”作为连接符，在多行换行的行头前面加一个“|”符号即可。
    val s =
      """
        |select
        |name,
        |age
        |from user
        |where name = "asu" and age = 20
        |""".stripMargin
    println(s)

    // 如果需要对变量进行运算，那么可以加${}
    val s1=
      s"""
         |select
         |name,
         |age
         |from user
         |where name = "$name" and age=${age + 2}
         """.stripMargin
    println(s1)

    val s2 = s"name = $name"
    println(s2)


  }

}
