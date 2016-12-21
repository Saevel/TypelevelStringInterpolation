package prv.zielony.typlevel.string.interpolation.typelevel

import scala.collection.immutable
import scala.collection.immutable.Seq

/**
  * Created by Zielony on 2016-12-21.
  */
abstract class NonEmptyList[T](element: T) extends Seq[T];

case class IpAddress(first: Byte, second: Byte, third: Byte, fourth: Byte)

object Protocol extends Enumeration {
  val http, tcp = Value
}

case class Address(protocol: Protocol.Value, ip: IpAddress, port: Int)
