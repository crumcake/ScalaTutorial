# Declaring a Function in Scala
Functions in Scala are declared with the following pattern:

   def function_name ([parameter_list]) : [return_type] = {
  // function body
}

First, you use 'def' to declare it a function. Then, you give it a name in lower camel case. You define a parameter list preceded by data-type within closed parentheses, you label the return type, and then you can create the actual body of the function within a closed pair of curly brackets.
Scala does make a distinction between methods and functions; functions are objects that can be stored in variables, and methods always belong to a class.

# Placement of a Function
In Scala, functions need to be placed inside of an object like a Class.

# Recursive Functions in Scala
Scala does in fact support recursive functions, much like Java.

# Parameters of Functions
It is possible for a function in Scala to have multiple parameters. Furthermore, these parameters can be different datatypes.

# Returning Multiple Datatypes
Just like most OOP languages, Scala can be pursuaded to return multiple datatypes. The easiest way to do this is to use a tuple. If you store the values you want to return in the tuple and then return that, you can return multiple datatypes.

# Pass-By-Reference or Pass-By-Value
Scala is similar to Java in many ways, and this is no exception. Scala always passes parameter variables by value.

# References
https://docs.scala-lang.org/tour/multiple-parameter-lists.html

https://docs.scala-lang.org/tour/tuples.html

https://docs.scala-lang.org/tour/basics.html
