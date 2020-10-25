/** @author Lila Crum
 *  @date 25 Oct 2020
 **/
object Assignment extends App {
  var a = Array[Char]('c', 'a', 't')
  var b = Array[Char]('d', 'o', 'g')
  a = b
  b(1) = 'u'
  println(a.mkString(" "))
  println(b.mkString(" "))
}
