//Obtener el area de un rectángulo y obtener el volumen de un prisma rectangular (con funciones)
val base= 13f
val altura= 8f
val ancho= 6f

fun main()
{
    val area = areaRectangulo(base,altura)
    val volumen = volumen(ancho)
    println("El area del rectangulo es: $area")
    print("El volumen del prisma es: $volumen")
}

fun areaRectangulo(base:Float, altura:Float):Float
{
    return base*altura
}

fun volumen(ancho:Float):Float
{
    return areaRectangulo(base,altura)*ancho
}

