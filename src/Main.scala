import scala.collection.mutable.ListBuffer

object Main extends App {
  val foundPrimes: ListBuffer[BigInt] = new ListBuffer[BigInt]()
  foundPrimes += BigInt(2)
  var current: BigInt = 3
  var counter = 1
  println("Primes are as follows: ")
  print(foundPrimes(0))
  while(true) {
    if(foundPrimes.forall(b => current%b != 0)) {
      foundPrimes += current
      print(",")
      if(counter > 19) {
        println()
        print(current)
        counter = 0
      } else {
        print(" " + current)
        counter += 1
      }
    }
    current += BigInt(2)
  }
  
}