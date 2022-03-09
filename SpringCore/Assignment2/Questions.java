package com.spring2;

import java.util.*;

public class Questions {

	
    private List<String> answers;
    private Set<String>  answersSet;
    private Map<Integer,String> answersMap;
    
    private String question;


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public Set<String> getAnswersSet() {
        return answersSet;
    }

    public void setAnswersSet(Set<String> answersSet) {
        this.answersSet = answersSet;
    }

    public Map<Integer, String> getAnswersMap() {
        return answersMap;
    }

    public void setAnswersMap(Map<Integer, String> answersMap) {
        this.answersMap = answersMap;
    }

    public void displayAnswerList(){
        System.out.println(question);
        for(String ans:answers){
            System.out.println(ans);
      }
    }

    public void displayAnswerSet(){
        System.out.println(question);
        for(String ans:answersSet){
            System.out.println(ans);
        }
    }
    public void displayAnswerMap(){
        System.out.println(question);
        Set set = answersMap.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry m1 =(Map.Entry)itr.next();
            System.out.println(m1.getKey()+". "+m1.getValue());
        }
    }
	
}
