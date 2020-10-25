# Naming a Variable
Observe the following code:

object PLP6 extends App{

  var x: String = "fish"
  for (x <- 0 to 3) {
    println("Whee!")
  }
  println(x)
}

As you can see, I've created a String variable called x. Then, I made a for loop controlled by an Int variable called x. In many programming languages, running this code would result in conflict. When you run this code in Scala, however, you get the following:

Whee!
Whee!
Whee!
Whee!
fish

As you can see, the original x variable was not overwritten. Instead, it seems we have two variables that share the same name. But, what if we also had a function that used a variable called x?

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

The result is:

Whee!
Whee!
Whee!
Whee!
fish
My favorite Ice Cream is Fudge Ripple

As you can see, there are still no conflicts.

# Scope of a Variable
