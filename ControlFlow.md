# Conditional Statements in Scala
Scala features many of the more common conditional statements found in programming languages. It is capable of both single conditional and multi-conditional statements. This includes if, if/else, and an intersting if 'same as' if/else. It is also capable of for loops, while loops, and  do/while loops. With an import, Scala can use breaks. It is  capable of using match/case statements too, though the case clause can be utilized with other conditionals. Unlike in Ruby or Perl, however, Scala does not feature any kind of 'unless' statement.

# Short-Cicuit Evaluation
Scala does use short-circuit evaluation.

# Dangling Else
In a dangling else scenario, the else statement will default to the innermost if statement not already paired with an else. It is recommended to use curly brackets when writing nested statements in Scala.

# Loops in Scala
As stated previously, Scala is capable of using for loops, while loops, and do/while loops.

For loops loop a specified number of times. A for loop can be used to iterate over the elements in a collection. In its simplest form, a Scala for loop looks like this:
  for( var x <- Range ){
     statement(s);
  }
It can be used to print every element in a list, for example. You can also use the foreach method if that is your goal, though foreach requires a collection class like a list or sequence. An undefined range can't be used with the foreach method.

While and do/while loops will loop through a block of code for as long as a specified condition is true. Scala while and do/while loops look and operate the same as they would in Java.

# Exiting loops
Scala can use breaks. You just import the package and then write the loop inside of breakable. Then, you are able to terminate the loop with a break. It looks something like this:
  import scala.util.control.Breaks._
  breakable 
  {
   for(..)
  {
   code..
   break
  }}
A continue statement can be used once break the breakable code. It also works the same as Java code here.

# Terminating Switch and Case Statements
Scala does not use Switch statements. Instead it uses Match statements, which are similar if more powerful. You don't need to use a break to exit a Match statement, and likewise you don't need one to terminate a case.

# Sources
https://docs.scala-lang.org/style/control-structures.html#trivial-conditionals
https://docs.scala-lang.org/cheatsheets/
https://docs.scala-lang.org/overviews/scala-book/for-loops.html
https://docs.scala-lang.org/tour/pattern-matching.html
