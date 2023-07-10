object Q6 extends App{
  def fibo(n:Int):Int={
    n match {
      case 0 => 1
      case 1 => 0
      case _ => fibo(n-1)+fibo(n-2)
    }
  }

  def printFibo(n:Int):Unit={
    if(n>0){
      printFibo(n-1)
      printf("%d ",fibo(n))
    }
  }

  printFibo(2)
}