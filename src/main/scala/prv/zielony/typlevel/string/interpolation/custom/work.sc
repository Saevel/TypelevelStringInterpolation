//Custom Interpolator
class Id(val value: String) {
  override def toString(): String = s"id: $value"
}

implicit class IdFactory(context: StringContext) {
  def id() = new Id(context.parts.mkString)
}

id"flkedocwcwmw"


//Simple template
case class User(name: String, surname: String, age: Int)

implicit class UserFormFactory(context: StringContext){

  def user(name: String, surname: String, age:Int): User = {
    User(name, surname, age)
  }

  private def fillTemplate(name: String,
                           surname: String,
                           age: Int) =
                             s"""{
                              "name": $name,
                              "surname": $surname,
                              "age": $age
                             }""".stripMargin
}

val name = "Kamil"
val surname = "Owczarek"
val age = 26
val interests = Array("cooking", "Scala", "travel")

val user = user"""{
              "name": $name,
              "surname": $surname,
              "age": $age,
            }"""