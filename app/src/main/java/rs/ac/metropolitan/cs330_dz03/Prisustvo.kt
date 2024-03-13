package rs.ac.metropolitan.cs330_dz03

class Prisustvo{
    val s1=Student(1234,"Nikola","Nikolic");
    val s2=Student(2345,"Marko","Markovic");
    val s3=Student(3456,"Stefan","Stefanovic");
    val s4=Student(4567,"Jovana","Jovanovic");
    val s5=Student(5678,"Marija","Maric");

    var prisutan:MutableMap<Student,Int?> = mutableMapOf(
        s1 to null,
        s2 to null,
        s3 to null,
        s4 to null,
        s5 to null,
    )
}