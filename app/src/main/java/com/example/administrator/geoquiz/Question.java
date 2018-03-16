package com.example.administrator.geoquiz;

/**
 * Created by Administrator on 2018/3/14 0014.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mSolve;

    public Question(int textResId, boolean answerTrue, boolean solve) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mSolve = solve;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public boolean isSolve() {
        return mSolve;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public void setSolve(boolean solve) {
        mSolve = solve;
    }
}
