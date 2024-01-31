package Classes

class Begudes {
    private var nom:String=""
    private var preu:Float=0f
    private var conteSucre:Boolean=false

    constructor(nom:String, preu:Float, conteSucre:Boolean){
        this.nom=nom
        this.preu=preu
        this.conteSucre=conteSucre
    }

    fun canviarNom(nom: String){
        this.nom=nom
    }

    fun canviarPreu(preu:Float){
        this.preu=preu
    }

    fun getNom(beguda:Begudes):String{
        return this.nom
    }

    fun getPreu(beguda: Begudes):Float{
        return this.preu
    }

    fun getSucre(beguda: Begudes):String{
        if(this.conteSucre) return "conte sucre"
        return "no conte sucre"
    }

    override fun toString(): String {
        var puede:String=" no "
        if (this.conteSucre) puede=" si "
        return "El producte $nom, te un preu de $preu€ i${puede}conte sucre"
    }
}