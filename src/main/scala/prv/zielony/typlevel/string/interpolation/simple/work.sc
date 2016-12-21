val port = 9090

val letters = List("a", "b", "c", "d")

val numbers = List(1.3453 ,2.3542, 3.3435, 4.0842568)

//Simple interpolation
s"http://random.com:$port"

//Call to method inside an interpolation
s"Numbers: ${numbers.mkString("[", ", ", "]")}"

//f interpolator
s"Numbers: ${numbers.map(n => f"$n%2.2f")}"

//Raw interpolator
//s"day\night"

raw"day\night"
