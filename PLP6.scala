object PLP6{

  def main(args: Array[String]){
    val x: String = "fish"
    for (x <- 0 to 3) {
      println("Whee!")
    }
    println(x)
    println("My favorite Ice Cream is " + iceCreamFlavor("Fudge", "Ripple"))

  }

  def iceCreamFlavor(x:String, y:String): String ={
    val flavor: String = x + " " + y
    flavor
  }

}
