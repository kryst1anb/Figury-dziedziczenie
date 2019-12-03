import java.lang.Math.PI

class Kolo(var r:Double, kolor:String):Figura(kolor) {
    override fun pole(): Double {
        return PI*r*r
    }

    override fun obwod(): Double {
        println("=====Koło=====")
        return 2*Math.PI*r
    }
}