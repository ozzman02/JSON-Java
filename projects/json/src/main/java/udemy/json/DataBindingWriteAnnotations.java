package udemy.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.UdemyLecture;
import udemy.json.domain.UdemyLecture.FREE_PREVIEW;
import udemy.json.domain.UdemyLecture.QuizQuestion;


public class DataBindingWriteAnnotations {

	public static void main(String[] args) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		UdemyLecture udemyLecture = new UdemyLecture();
		udemyLecture.setId(1);
		udemyLecture.setName("JSON Udemy Course");
		//udemyLecture.setNameLine2("JSON Udemy Course Line2");
		udemyLecture.setDescription("JSON Udemy Course Description");
		udemyLecture.setEnabled(true);
		udemyLecture.setIgnore("");
		udemyLecture.setIgnore2("");
		
		QuizQuestion quizQuestion = udemyLecture. new QuizQuestion();
		quizQuestion.setId(1);
		quizQuestion.setQuestion("What is JSON?");
		quizQuestion.setAnswer("JSON is a data interchange format");
		
		udemyLecture.getListQuestions().add(quizQuestion);
		udemyLecture.setFreePreview(FREE_PREVIEW.FREE_PREVIEW_NOT_ENABLED);
		
		try {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(udemyLecture));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		

	}

}
