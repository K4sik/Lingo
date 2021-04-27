package com.example.lingo.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.lingo.MainActivity;
import com.example.lingo.R;
import com.example.lingo.models.Question;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_option_one;
    TextView tv_option_two;
    TextView tv_option_three;
    TextView tv_option_four;
    Button btn_submit;
    ProgressBar progressBar;
    TextView tv_progress;
    TextView tv_question;

    private int mCurrentPosition = 1;
    private ArrayList<Question> mQuestionList;
    private int mSelectedOptionPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tv_option_one = findViewById(R.id.tv_option_one);
        tv_option_two = findViewById(R.id.tv_option_two);
        tv_option_three = findViewById(R.id.tv_option_three);
        tv_option_four = findViewById(R.id.tv_option_four);

        tv_progress = findViewById(R.id.tv_progress);
        tv_question = findViewById(R.id.tv_question);

        btn_submit = findViewById(R.id.btn_submit);

        progressBar = findViewById(R.id.progressBar);

        mQuestionList = new ArrayList<Question>();

        mQuestionList.add(new Question(1,"We ________ to Spain every summer.","fly","flies","flys","fils",1 ));

        mQuestionList.add(new Question(2, "She ________ in Florida.", "live", "livees", "lives", "", 3));

        mQuestionList.add(new Question(3, "My mother ________ eggs for breakfast every morning.", "fries", "fry", "frys", "frieys", 1));

        mQuestionList.add(new Question(4, "John ________ very hard in class, but I don't think he'll pass the course.", "trys", "try", "tries", "tryes", 3));

        mQuestionList.add(new Question(5, "The bank ________ at four o'clock.", "closes", "closies", "close", "closed", 1));

        mQuestionList.add(new Question(6, "My best friend ________ to me every week.", "writies", "writes", "write", "wrote", 2));

        mQuestionList.add(new Question(7, "My life is so boring -- I just ________ TV every night.", "watchies", "watches", "watch", "watchees", 3));

        mQuestionList.add(new Question(8, "I ________ in a bank.", "workes", "works", "work", "working", 3));

        mQuestionList.add(new Question(9, "It ________ almost every day in Manchester.", "rain", "raines", "rains", "rainers", 3));

        mQuestionList.add(new Question(10,"Jo is so smart that she ________ every exam without even trying.","passed","pass","passies","passes",4));

        setQuestion();

        tv_option_one.setOnClickListener(this);
        tv_option_two.setOnClickListener(this);
        tv_option_three.setOnClickListener(this);
        tv_option_four.setOnClickListener(this);
        btn_submit.setOnClickListener(this);


    }

    @SuppressLint("SetTextI18n")
    private void setQuestion() {
        Question question = mQuestionList.get(mCurrentPosition-1);

        defaultOptionView();

        if (mCurrentPosition == mQuestionList.size()){
            btn_submit.setText("Finish");
        } else {
            btn_submit.setText("Submit");
        }

        progressBar.setProgress(mCurrentPosition);
        tv_progress.setText(mCurrentPosition + "/" + progressBar.getMax());
        tv_question.setText(question.getQuestion());
        tv_option_one.setText(question.getOptionOne());
        tv_option_two.setText(question.getOptionTwo());
        tv_option_three.setText(question.getOptionThree());
        tv_option_four.setText(question.getOptionFour());

    }

    public void onClick(@Nullable View v) {
        if (v != null) {
            switch (v.getId()) {
                case R.id.tv_option_one :
                    selectedOptionView(tv_option_one, 1);
                    break;
                case R.id.tv_option_two :
                    selectedOptionView(tv_option_two, 2);
                    break;
                case R.id.tv_option_three :
                    selectedOptionView(tv_option_three, 3);
                    break;
                case R.id.tv_option_four :
                    selectedOptionView(tv_option_four, 4);
                    break;
                case R.id.btn_submit :
                    if (mSelectedOptionPosition == 0){

                        mCurrentPosition++;

                            if(mCurrentPosition <= mQuestionList.size()) {
                                setQuestion();
                            } else {
                                Toast.makeText(this, "You've successfully completed the quiz!", Toast.LENGTH_SHORT).show();

                                Intent intent = new Intent(this, MainActivity.class);
                                startActivity(intent);
                            }

                        } else {
                            Question question = mQuestionList.get(mCurrentPosition - 1);
                            if (question.getCorrectOption() != mSelectedOptionPosition){
                                answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg);
                            }
                            answerView(question.getCorrectOption(), R.drawable.correct_option_border_bg);
                            if (mCurrentPosition == mQuestionList.size()){
                                btn_submit.setText("Finish");
                            } else {
                                btn_submit.setText("Next Question");
                            }
                            mSelectedOptionPosition = 0;
                        }
                    break;

            }
        }
    }


    private void defaultOptionView() {
        ArrayList<TextView> options = new ArrayList<>();
        options.add(0, tv_option_one);
        options.add(1, tv_option_two);
        options.add(2, tv_option_three);
        options.add(3, tv_option_four);

        for (TextView option : options){
            option.setTextColor(Color.parseColor("#7A8089"));
            option.setTypeface(Typeface.DEFAULT);
            option.setBackground(ContextCompat.getDrawable(this, R.drawable.default_option_border_bg));
        }
    }

    private void selectedOptionView(TextView tv, int selectedOptionNum) {
        defaultOptionView();
        mSelectedOptionPosition = selectedOptionNum;
        tv.setTextColor(Color.parseColor("#363A43"));
        tv.setTypeface(tv.getTypeface(), Typeface.BOLD);
        tv.setBackground(ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg));
    }

    private void answerView (int answer, int drawableView) {
        switch(answer) {
            case 1:
                this.tv_option_one.setBackground(ContextCompat.getDrawable((Context)this, drawableView));
                break;
            case 2:
                this.tv_option_two.setBackground(ContextCompat.getDrawable((Context)this, drawableView));
                break;
            case 3:
                this.tv_option_three.setBackground(ContextCompat.getDrawable((Context)this, drawableView));
                break;
            case 4:
                this.tv_option_four.setBackground(ContextCompat.getDrawable((Context)this, drawableView));
        }
    }


}