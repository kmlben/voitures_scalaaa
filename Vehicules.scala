Vehicules.scala

sealed abstract class Vehicule[A]{}
case class Car() extends Vehicule[T]{}
case class Motorbike() extends Vehicule[T]{}
case class Boat() extends Vehicule[T]{}