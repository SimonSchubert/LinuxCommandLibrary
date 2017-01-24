package com.inspiredandroid.linuxcommandbibliotheca.models;

import java.io.Serializable;
import java.util.ArrayList;

public class QuizDataHolder implements Serializable {
    public int maxAnswerCount = 20;
    // id of currentAnswers array list
    public int currentCorrectAnswerId;
    // id of lastAnswers array list
    public int lastCorrectAnswerId;
    // already answers
    public int answerCounter;
    // correct answered
    public int correctAnswerCounter;
    // list of current commands
    public ArrayList<String> currentAnswers;
    // list of last commands
    public ArrayList<String> lastAnswers;
    // list of used question cmmands
    public ArrayList<String> usedCommandIds;
    // type
    public int questionType = -1;

    public QuizQuestionData lesson;
}