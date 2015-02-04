package projetgrails

class Questionnaire {

	String matiere;
	static hasMany = [question:Question];
	
    static constraints = {
		matiere(blank:false)
    }
}
