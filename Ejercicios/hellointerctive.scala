import scala.io.StdIn.readLine

object HelloInteractive extends App {

    print("Ingrese nombres: ")
    val nombres = readLine()

    print("Ingrese apellidos: ")
    val apellidos = readLine()

    print("Ingrese su edad: ")
    val edad = readLine()

    //val now = Calendar.getInstance()
    //val currentHour = now.get(Calendar.HOUR_OF_DAY)

    println{s"Hola!!!!! $nombres $apellidos y tienes $edad años"}

}