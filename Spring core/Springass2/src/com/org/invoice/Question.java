package com.org.invoice;

import java.util.Iterator;
import java.util.List;



public class Question {
private int questionId;
private String question;
private List<String> answers;



public void setQuestionId(int questionId) {
this.questionId = questionId;
}



public void setQuestion(String question) {
this.question = question;
}



public void setAnswers(List<String> answers) {
this.answers = answers;
}



public void displayInfo() {
System.out.println(questionId + " " + question);
System.out.println("Answers are: ");
Iterator<String> itr = answers.iterator();
while (itr.hasNext()) {
System.out.println(itr.next());
}
}
}