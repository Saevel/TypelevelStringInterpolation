implicit class JsonFactory(context: StringContext){
  def json(): String = ???
}

trait JsonValue;

case class JsonString(value: String)

case class JsonNumber[T : Numeric](value: T)

case class JsonAray(content: Traversable[JsonValue])
  extends JsonValue

class JsonObject(content: Map[String, JsonValue])
  extends JsonValue

implicit class JsonArrayFactory(context: StringContext){

  def jarray(content: JsonValue*) = ???
}