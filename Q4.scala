object Q4 extends App{
  def number(n:Int):Int = {
    if(n!=0 && n!=1)
      number(n-2)+n
    else if(n==0) 0
    else 1
  }
  var x=6
  var num=number(x)

  if(num==0)
    println("even number")
  else if(num==1)
    println("odd number")


}
