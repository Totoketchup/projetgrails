package projetgrails

class Commentaire {
	
	String texte
	
	static belongsTo = [questionnaire:Questionnaire]

    static constraints = {
    }
}
