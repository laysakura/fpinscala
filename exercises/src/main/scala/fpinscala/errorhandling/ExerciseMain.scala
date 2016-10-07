package fpinscala.errorhandling

object ExerciseMain {
  def main(args: Array[String]): Unit = {
    { // exercise 4.1
      val a: Option[Int] = Some(10)
      val b: Option[Int] = None
      println(
        s"""
           |exercise 4.1
           |  $a.map(_ * 2) = ${a.map(_ * 2)} ; $b.map(_ * 2) = ${b.map(_ * 2)}
           |  $a.getOrElse(404) = ${a.getOrElse(404)} ; $b.getOrElse(404) = ${b.getOrElse(404)}
           |  $a.flatMap(v => Some(v * 2)) = ${a.flatMap(v => Some(v * 2))} ; $b.flatMap(v => Some(v * 2)) = ${b.flatMap(v => Some(v * 2))}
           |  $a.orElse(Some(777)) = ${a.orElse(Some(777))} ; $b.orElse(Some(777)) = ${b.orElse(Some(777))}
           |  $a.filter(_ % 2 == 0) = ${a.filter(_ % 2 == 0)} ; $a.filter(_ % 2 == 1) = ${a.filter(_ % 2 == 1)} ; $b.filter(_ % 2 == 0) = ${b.filter(_ % 2 == 0)}
         """.stripMargin)
    }
  }
}
