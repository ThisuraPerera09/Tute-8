package Q2

case class point(var x:Int, var y:Int) {
  def invert():Unit = {
    var tmp = this.x
    this.x = this.y
    this.y = tmp
  }
}

object q2 {
  def main(args: Array[String]): Unit = {

    val p1 = point(3,7);
    println(p1);
    p1.invert()
    println(p1);
  }
}

