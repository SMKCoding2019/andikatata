package net.edugoritma.quiz.model;

public class Question {

    private String Question,AnswerA,AnswerB,CorrectAnswer,CategoryId,IsImageQuestion;

    public Question() {
    }

    public Question(String question, String Benar, String Salah, String correctAnswer, String categoryId, String isImageQuestion) {
        Question = question;
        AnswerA = Benar;
        AnswerB = Salah;

        CorrectAnswer = correctAnswer;
        CategoryId = categoryId;
        IsImageQuestion = isImageQuestion;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswerA() {
        return AnswerA;
    }

    public void setAnswerA(String Benar) {
        AnswerA = Benar;
    }

    public String getAnswerB() {
        return AnswerB;
    }

    public void setAnswerB(String Salah) {
        AnswerB = Salah;
    }


    public String getCorrectAnswer() {
        return CorrectAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        CorrectAnswer = correctAnswer;
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(String categoryId) {
        CategoryId = categoryId;
    }

    public String getIsImageQuestion() {
        return IsImageQuestion;
    }

    public void setIsImageQuestion(String isImageQuestion) {
        IsImageQuestion = isImageQuestion;
    }
}
