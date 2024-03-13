package rs.ac.metropolitan.cs330_dz03

import kotlin.random.Random

fun main()
{
    val prisustvo=Prisustvo()

    for (i in 1 .. 15)
    {
        println("\nOdsutni studenti u nastavnoj nedelji $i:\n")
        for((key,value) in prisustvo.prisutan)
        {
            val r= Random.nextInt(0,2)
            if (r==0)
            {
                println("${key.ime} ${key.prezime} ${key.indeks}")
            }
            else
            {
                prisustvo.prisutan[key]=(value?:0)+1
            }
        }
    }
}