package com.example.adrianantonescu.qa.util;

public class QuestionFactory {
    private static final QuestionFactory ourInstance = new QuestionFactory();
    private static int lastId;

    public static QuestionFactory getInstance() {
        return ourInstance;
    }

    private QuestionFactory() {
        lastId = 0;
    }

    public Question createQuestion() {
        Question q = null;
        lastId++;
        return q;
    }
}
