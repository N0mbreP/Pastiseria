package Classes

class Pasta {
    private var nom:String=""
    private var preu:Float=0f
    private var pes:Float=0f
    private var calories:Int=0

    constructor(nom:String, preu:Float, pes:Float, calories:Int){
        this.nom=nom
        this.preu=preu
        this.pes=pes
        this.calories=calories
    }

    fun canviarNom(nom: String){
        this.nom=nom
    }

    fun canviarPreu(preu:Float){
        this.preu=preu
    }

    fun canviarPes(pes: Float){
        this.pes=pes
    }

    fun canviarCalories(calories: Int){
        this.calories=calories
    }

    fun getNom():String{
        return this.nom
    }

    fun getPreu():Float{
        return this.preu
    }

    fun getPes():Float{
        return this.pes
    }

    fun getCalories():Int{
        return this.calories
    }

    override fun toString(): String {
        return "El producte $nom, te un preu de $preu€ , pesa $pes kg i te un total de $calories calories"
    }

}

