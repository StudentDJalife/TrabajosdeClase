//Promedios
val P1 = 10f
val P2 = 8f
val P3 = 9.5f

fun main() 
{
    var Promedio = ObtenerPromedio(P1,P2,P3)
    print("El promedio es: $Promedio")
}

fun ObtenerPromedio(P1:Float, P2:Float, P3:Float):Float
{
    return (P1+P2+P3)/3
}