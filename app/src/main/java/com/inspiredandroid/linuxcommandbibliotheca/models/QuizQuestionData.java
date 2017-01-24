package com.inspiredandroid.linuxcommandbibliotheca.models;

import java.io.Serializable;

public class QuizQuestionData implements Serializable {
    public String question;
    public String answer;
    public String command;
    public boolean failed = true;
}