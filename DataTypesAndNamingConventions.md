# Naming Requirements in Scala
Like many programming languages, Scala follows "camel case" naming. Variables are typically written in "lower camel case", where every word but the first is capitalised. Classes are written in "upper camel case", where all of the words are always capitalised. Ex: myVar, MyClass
Underscores are strongly discouraged, but not forbidden, because they have a special meaning in Scala syntax.

# Static or Dynamic
Scala is a statically-typed language. Once a variable is declared with a type, you can't assign it to a variable of a different type.

# Strong or Weak
Scala is strongly-typed, like Python or Java. If a variable is of one type, and it does not match up to what is expected in the expression, it will raise a type-error.

# Scala Typing Example
Say you tried to run the following code written in Scala: x = "5" + 6
It won't work, because x is undefined. Say we make x an int variable. var x: Int = "5" + 6
That won't work either, because you can't add a string and an int. Finally, let's make 5 an int too. var x: Int = 5 + 6
That compiles.

# Limitations of Scala
Scala has a pretty robust type system, actually. It's able to work between datatypes, so you are able to do things like add a float and an int together without issues.
As a consequence of running on JVM, however, it does have several limitations surrounding value classes. These are listed here: https://docs.scala-lang.org/overviews/core/value-classes.html#limitations

# Conversions in Scala
Conversions in Scala are implicit. It's automatic. So, for example, if you try to add in 5 to float 6.0, you end up with an answer of 11.0 without having to do anything.

# Sources
https://docs.scala-lang.org/style/naming-conventions.html
https://docs.scala-lang.org/overviews/core/value-classes.html#limitations
https://docs.scala-lang.org/tour/implicit-conversions.html
https://en.wikipedia.org/wiki/Scala_(programming_language)
