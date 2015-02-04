package projetgrails

class Question {

	String label;
	String titre;
	
	static belongsTo =[questionnaire:Questionnaire];
	
    static constraints = {
		label(blank:false)
		titre(blank:false)
    }
}
