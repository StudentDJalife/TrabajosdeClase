val A1=5
val A2=5
val A3=5

fun main() 
{
    if(A1==A2&&A2==A3){
        print("El triángulo es equilátero")
    } else if (A1==A2||A1==A3||A2==A3){
        print("El triángulo es Isósceles")
    } else if (A1!=A2||A1!=A3||A2!=A2){
        print("El triángulo es escaleno")
    }
}