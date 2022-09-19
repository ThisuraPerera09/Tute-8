import scala.math.{pow, sqrt}
object Q1 {
  def main(args: Array[String]): Unit = {

    val p1 = Point(3,2);
    val p2 = Point(5,1);
    println(p1.add(p2));
    println(p1.move());
    println(p1.distance(p2));
  }
}
// case class -> defined single statement with parameters
// normal class -> defined by defining method ans fields.

case class Point( a:Int, b:Int) {

  def x: Int = a
  def y: Int = b



  def add(p:Point) =  Point(a+p.a, b+p.b);
  def move() = Point(x+1,y+1)
  def distance (other:Point):Double = sqrt(pow(x-other.x,2)+ pow(y-other.y,2))


}
