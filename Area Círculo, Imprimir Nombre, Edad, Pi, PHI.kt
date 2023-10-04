//Area de un círculo, imprimir nombre, imprimir edad, imprimir pi, imprimir el número aureo
//import kotlin.math.pow

const val PI = 3.1416f
const val PHI = 1.6180f

fun main()
{
    val r = 5f
    val area = AreaCirculo(r)
    println("El área del círculo es: $area")
    ImprimirNombre("Daniel Jalife")
    ImprimirEdad(21)
    ImprimirPi(PI)
    ImprimirPHI(PHI)
}

fun AreaCirculo(r:Float):Float
{
    return PI*(r*r)
}

fun ImprimirNombre(nombre:String)
{
    println("Mi nombre es $nombre")
}

fun ImprimirEdad(Edad:Int):Int
{
    println("Tengo $Edad años de edad")
    return 0
}

fun ImprimirPi(PI:Float):Float
{
    println("El valor del pi es: $PI")
    return PI
}

fun ImprimirPHI(PHI:Float):Float 
{
    println("El valor del número aureo es: $PHI")
    return PHI
}