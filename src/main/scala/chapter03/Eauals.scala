package chapter03

object Eauals {
  def main(args: Array[String]): Unit = {
    val s1 = "abc"
    val s2 = new String("abc")
    println(s1 == s2)  // ==更加类似于 Java 中的 equals
    println(s1.eq(s2))

  }

}
