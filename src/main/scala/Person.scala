
//Defined a class person which extends a trait ordered
class Person(val name: String, val age: Int) extends Ordered[Person] {
  //Checking for the name parameter if it is equal
  def compare(that: Person): Int = {
    val res = this.name compare that.name
    if (res == 0) {
      //Checking for the age if greater
      if (this.age > that.age) {
        1
      }
      else {
        -1
      }
    }
    else if (this.name.length < that.name.length) {
      -1
    }
    else {
      1
    }

  }
}

//This is the main
object main {
  def main(args: Array[String]): Unit = {
    val firstperson = new Person("test", 24)
    val secondperson = new Person("testagain", 25)
    println(firstperson < secondperson)

  }
}