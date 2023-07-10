object Q5 extends App{
  def number(n: Int): Int = {
    if (n != 0 && n != 1)
      number(n - 2)
    else if (n == 0) 0
    else 1
  }
  def sub(n:Int):Int={
    if(n==0) 0
    else sub(n-2)+n
  }
  var x=9
  var num = number(x)

  if (num == 0)
    println(sub(x))
  else if (num == 1)
    println(sub(x-1))

}
