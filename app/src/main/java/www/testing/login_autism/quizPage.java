package www.testing.login_autism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class quizPage extends AppCompatActivity implements View.OnClickListener {

    TextView question, valueOfAge, ageText, ageNumber;
    Button ans1, ans2, ans3, ans4, submit_btn, decrement, increment;
    EditText name;
    LinearLayout options_layout;

    int curr_que_index = 0, value = 0;
    String selected = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        question = findViewById(R.id.question);
        ans1 = findViewById(R.id.ans1);
        ans2 = findViewById(R.id.ans2);
        ans3 = findViewById(R.id.ans3);
        ans4 = findViewById(R.id.ans4);
        submit_btn = findViewById(R.id.submit_btn);

        ans1.setOnClickListener((View.OnClickListener) this);
        ans2.setOnClickListener((View.OnClickListener) this);
        ans3.setOnClickListener((View.OnClickListener) this);
        ans4.setOnClickListener((View.OnClickListener) this);
        submit_btn.setOnClickListener((View.OnClickListener) this);

        name = findViewById(R.id.name_text);
        decrement = findViewById(R.id.decrement);
        valueOfAge = findViewById(R.id.valueofAge);
        increment = findViewById(R.id.increment);
        ageText = findViewById(R.id.ageText);
        ageNumber = findViewById(R.id.ageNumber);

        newQuestion();
    }

    public void onClick(View view) {
        ans1.setTextColor(Color.parseColor("#ED8C72"));
        ans2.setTextColor(Color.parseColor("#ED8C72"));
        ans3.setTextColor(Color.parseColor("#ED8C72"));
        ans4.setTextColor(Color.parseColor("#ED8C72"));
        Button clicked = (Button) view;
        if (clicked.getId() == R.id.submit_btn) {
            curr_que_index++;
            newQuestion();
        } else {
            selected = clicked.getText().toString();
            clicked.setTextColor(Color.BLACK);
        }
    }

    public void dec(View view) {
        if (value == 0) {
            display(0);
        } else {
            display(--value);
        }
    }

    public void inc(View view) {
        display(++value);
    }

    public void display(int num) {
        valueOfAge.setText("" + num);
        ageNumber.setText("" + num);
    }

    void newQuestion() {
        if (curr_que_index == 1) {
            name.setVisibility(View.INVISIBLE);
            decrement.setVisibility(View.VISIBLE);
            valueOfAge.setVisibility(View.VISIBLE);
            increment.setVisibility(View.VISIBLE);
            ageText.setVisibility(View.VISIBLE);
            ageNumber.setVisibility(View.VISIBLE);
        }

        if (curr_que_index == 2) {
            decrement.setVisibility(View.INVISIBLE);
            valueOfAge.setVisibility(View.INVISIBLE);
            increment.setVisibility(View.INVISIBLE);
            ageText.setVisibility(View.INVISIBLE);
            ageNumber.setVisibility(View.INVISIBLE);
            ans1.setVisibility(View.VISIBLE);
            ans2.setVisibility(View.VISIBLE);
        }

        if (curr_que_index == 3) {
            ans3.setVisibility(View.VISIBLE);
            ans4.setVisibility(View.VISIBLE);
            submit_btn.setVisibility(View.INVISIBLE);
            ans1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), Peach_colour1.class);
                    startActivity(intent);
                }
            });
            ans2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), Rose_colour2.class);
                    startActivity(intent);
                }
            });
            ans3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), Green_colour3.class);
                    startActivity(intent);
                }
            });
            ans4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), Blue_colour4.class);
                    startActivity(intent);
                }
            });
        }

        if (curr_que_index > 4) {
            return;
        }
        question.setText(QnA.questions[curr_que_index]);
        ans1.setText(QnA.answers[curr_que_index][0]);
        ans2.setText(QnA.answers[curr_que_index][1]);
        ans3.setText(QnA.answers[curr_que_index][2]);
        ans4.setText(QnA.answers[curr_que_index][3]);
        ans1.setTextColor(Color.parseColor("#ED8C72"));
        ans2.setTextColor(Color.parseColor("#ED8C72"));
        ans3.setTextColor(Color.parseColor("#ED8C72"));
        ans4.setTextColor(Color.parseColor("#ED8C72"));
    }
}