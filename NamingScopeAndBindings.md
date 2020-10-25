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
Scala variables are capable of three diferent scopes. Fields, Method Parameters, and Local Variables. Local Variables are created within a method and are only accessible within that method. Method Parameters are accessible inside or outside a method, and are used to pass value. Scala is incapable of passing by reference.

A Field variable is encapsulated within a class or object, and is accessible from any method in that class or object. It is also accessible from outside of the object if you use the proper access modifiers.

There are three levels of access; private, protected, and public. Public is the default, and does not need to be declared. It is globally accessible. If the variable is private, it is only accessible while defining the class or through one of its objects. If the variable is protected, then it is only accessible from subclasses.

# Bindings

To demonstrate how assignments work in Scala, I ran the following code:

  var a = Array[Char] ('c','a','t')
  
  var b = Array[Char] ('d','o','g')
  
  a=b
  
  b(1) = 'u'
  
  println(a.mkString(" "))
  
  println(b.mkString(" "))
  
  The result was this;
  
  d u g
  
  d u g
  
  As you can see, assigning b to a did not copy the contents of Array b to Array a. Instead, a became a second reference to the exact same array as b. So, when Char 1 in Array b was changed from 'o' to 'u', the output of Array a was also affected.
  
  # Resources
  https://www.geeksforgeeks.org/scope-of-variables-in-scala/
  https://www.geeksforgeeks.org/access-modifiers-in-scala/?ref=lbp
  
