object Q3 extends App{
  def addition(n:Int):Int={
    if(n==0) 0
    else addition(n-1) +n
  }
  println(addition(5))
}
