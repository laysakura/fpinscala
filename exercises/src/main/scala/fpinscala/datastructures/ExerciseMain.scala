package fpinscala.datastructures

object ExerciseMain {
  def main(args: Array[String]): Unit = {
    println(
      s"""
         |exercise 3.1
         |  That complex pattern match should yeild ... `3`, which is from `case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y`
         |  Answer: ${List.x}
       """.stripMargin)

    { // exercise 3.2
      val l1 = List(1, 2, 3, 4)
      val l2 = List(1)
      val l3 = List()
      println(
        s"""
           |exercise 3.2
           |  Remove head from $l1 => ${List.tail(l1)}
           |  Remove head from $l2 => ${List.tail(l2)}
           |  Remove head from $l3 => ${List.tail(l3)}
         """.stripMargin)
    }

    { // exercise 3.3
      val l1 = List(1, 2, 3, 4)
      val l2 = List(1)
      val l3 = List()
      println(
        s"""
           |exercise 3.3
           |  Set head of $l1 into 42 => ${List.setHead(l1, 42)}
           |  Set head of $l2 into 42 => ${List.setHead(l2, 42)}
           |  Set head of $l3 into 42 => ${List.setHead(l3, 42)}
         """.stripMargin)
    }
  }
}
