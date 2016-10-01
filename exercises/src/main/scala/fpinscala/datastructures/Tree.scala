package fpinscala.datastructures

sealed trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]


object Tree {
  def size[A](root: Tree[A]): Int = root match {
    case Leaf(_) => 1
    case Branch(l, r) => size(l) + size(r) + 1
  }

  def maximum(root: Tree[Int]): Int = root match {
    case Leaf(v) => v
    case Branch(l, r) => maximum(l) max maximum(r)
  }

  def depth[A](root: Tree[A]): Int = root match {
    case Leaf(v) => 1
    case Branch(l, r) => (depth(l) max depth(r)) + 1
  }
}
