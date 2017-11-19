package udemy.json.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name", "id", "nameLine2"})
@JsonIgnoreProperties({"ignore", "ignore2"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UdemyLecture {
	
	private long id;
	
	private String name;
	
	private String nameLine2;
	
	@JsonProperty("desc")
	private String description;
	
	private FREE_PREVIEW freePreview;
	
	private boolean enabled;
	
	//@JsonIgnore
	private String ignore;
	
	//@JsonIgnore
	private String ignore2;
	
	public class QuizQuestion {
		
		private long id;
		
		private String question;
		
		private String answer;
		
		public long getId() {
			return id;
		}
		
		public void setId(long id) {
			this.id = id;
		}
		
		public String getQuestion() {
			return question;
		}
		
		public void setQuestion(String question) {
			this.question = question;
		}
		
		public String getAnswer() {
			return answer;
		}
		
		public void setAnswer(String answer) {
			this.answer = answer;
		}
		
	}
	
	@JsonIgnoreType
	public enum FREE_PREVIEW {
		FREE_PREVIEW_ENABLED,
		FREE_PREVIEW_NOT_ENABLED
	}
	
	public List<QuizQuestion> listQuestions = new ArrayList<QuizQuestion>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameLine2() {
		return nameLine2;
	}

	public void setNameLine2(String nameLine2) {
		this.nameLine2 = nameLine2;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<QuizQuestion> getListQuestions() {
		return listQuestions;
	}

	public void setListQuestions(List<QuizQuestion> listQuestions) {
		this.listQuestions = listQuestions;
	}

	public FREE_PREVIEW getFreePreview() {
		return freePreview;
	}

	public void setFreePreview(FREE_PREVIEW freePreview) {
		this.freePreview = freePreview;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getIgnore() {
		return ignore;
	}

	public void setIgnore(String ignore) {
		this.ignore = ignore;
	}

	public String getIgnore2() {
		return ignore2;
	}

	public void setIgnore2(String ignore2) {
		this.ignore2 = ignore2;
	}
	
}
