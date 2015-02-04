package projetgrails

class Reponse {

	String label;
	int note;
	
	static belongsTo = [questionnaire:Questionnaire]
	
	static constraints = {
		label(blank:false)
		note(range:0..4)
	}
}
