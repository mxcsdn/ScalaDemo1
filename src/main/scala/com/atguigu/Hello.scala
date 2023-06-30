package com.atguigu

import java.time.LocalDate

object Hello {
    var a: Int = 3
    println("测试12")
    def apply(age: Int,name: String,sex: String): Hello = new Hello(age)//暂时一般是固定写法
}
class Hello(age:Int){

}

object Demo{
  implicit def int2RichDate(day : Int) : RichDate= new RichDate(day : Int)
  def main(args: Array[String]): Unit = {
    val value = Hello(12, "mx", "man");//可以传多个参数
    val ago : String = "ago"
    val later : String = "later"
    2 days ago// 将Int转换成RichDate类型。2实参，days方法，ago变量
    val str: String = 2 days later //
    println(2 days ago)
    println(2 days later)
  }
}

class RichDate(val day : Int){
  def days(when : String) :String ={
      val nowDate = LocalDate.now()
      if (when == "ago"){
          nowDate.minusDays(day).toString
      }else{
          nowDate.plusDays(day).toString
      }
  }
}
