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

    { // exercise 3.4
      val l1 = List(1, 2, 3, 4)
      val l2 = List(1)
      val l3 = List()
      println(
        s"""
           |exercise 3.4
           |  Drop first 2 elements from $l1 => ${List.drop(l1, 2)}
           |  Drop first 2 elements from $l2 => ${List.drop(l2, 2)}
           |  Drop first 2 elements from $l3 => ${List.drop(l3, 2)}
         """.stripMargin)
    }

    { // exercise 3.5
      val l1 = List(1, 2, 3, 4)
      val l2 = List(1)
      val l3 = List()
      println(
        s"""
           |exercise 3.5
           |  Drop elements whose value is less than 3 from $l1 => ${List.dropWhile(l1, (x: Int) => x < 3)}
           |  Drop elements whose value is less than 3 from $l2 => ${List.dropWhile(l2, (x: Int) => x < 3)}
           |  Drop elements whose value is less than 3 from $l3 => ${List.dropWhile(l3, (x: Int) => x < 3)}
         """.stripMargin)
    }

    { // exercise 3.6
      val l1 = List(1, 2, 3, 4)
      val l2 = List(1)
      val l3 = List()
      println(
        s"""
           |exercise 3.6
           |  Drop last element from $l1 => ${List.init(l1)}
           |  Drop last element from $l2 => ${List.init(l2)}
           |  Drop last element from $l3 => ${List.init(l3)}
         """.stripMargin)
    }

    { // exercise 3.8
      println(
        s"""
           |exercise 3.8
           |  foldRight with z=Nil, f=Cons should result in as.
           |    ${List.foldRight(List(1, 2, 3), Nil: List[Int])(Cons(_, _))}
           |  foldRight with z=List(42), f=Cons should append 42 to as.
           |    ${List.foldRight(List(1, 2, 3), List(42))(Cons(_, _))}
         """.stripMargin)
    }

    { // exercise 3.9
      val l1 = List(1, 2, 3, 4)
      val l2 = List(1)
      val l3 = List()
      println(
        s"""
           |exercise 3.9
           |  Length of $l1 => ${List.length(l1)}
           |  Length of $l2 => ${List.length(l2)}
           |  Length of $l3 => ${List.length(l3)}
         """.stripMargin)
    }

    { // exercise 3.10
      val l1 = List(1, 2, 3, 4)
      val l2 = List(1)
      val l3 = List()
      println(
        s"""
           |exercise 3.10
           |  ${List.foldLeft(List("a", "b", "c"), "PREFIX")((b, a) => b + a)}
         """.stripMargin)
    }

    { // exercise 3.11
      val l = List(1, 2, 3, 4)
      println(
        s"""
           |exercise 3.11
           |  Sum of $l => ${List.foldLeft(l, 0)((b, a) => b + a)}
           |  Product of $l => ${List.foldLeft(l, 1)((b, a) => b * a)}
           |  Length of $l => ${List.foldLeft(l, 0)((b, _) => b + 1)}
         """.stripMargin)
    }

    { // exercise 3.12
      val l = List(1, 2, 3, 4)
      println(
        s"""
           |exercise 3.12
           |  Reverse of $l => ${List.reverse(l)}
         """.stripMargin)
    }

    { // exercise 3.14
      val l1 = List(1, 2, 3)
      val l2 = List(33, 4)
      println(
        s"""
           |exercise 3.14
           |  Append $l2 to $l1 => ${List.appendViaFoldRight(l1, l2)}
           |  Append $l2 to $l1 => ${List.appendViaFoldLeft(l1, l2)}
         """.stripMargin)
    }

    { // exercise 3.15
      val l = List(List(1, 2, 3), List(10, 20, 30), List(100, 200, 300))
      println(
        s"""
           |exercise 3.15
           |  Flatten $l => ${List.flatten(l)}
         """.stripMargin)
    }

    { // exercise 3.16
      def plus1(xs: List[Int]): List[Int] = List.map(xs)(_ + 1)

      val l = List(1, 2, 3)
      println(
        s"""
           |exercise 3.16
           |  +1 to each element of $l => ${plus1(l)}
         """.stripMargin)
    }
  }
}
