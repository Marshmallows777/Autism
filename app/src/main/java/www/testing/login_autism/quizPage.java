package www.testing.login_autism;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class quizPage extends AppCompatActivity implements View.OnClickListener {

    TextView question;
    Button ans1, ans2, ans3, ans4, submit_btn;

    int curr_que_index = 0;
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

        newQuestion();
    }

    public void onClick(View view) {
        ans1.setTextColor(Color.WHITE);
        ans2.setTextColor(Color.WHITE);
        ans3.setTextColor(Color.WHITE);
        ans4.setTextColor(Color.WHITE);
        Button clicked = (Button) view;
        if (clicked.getId() == R.id.submit_btn) {
            curr_que_index++;
            newQuestion();
        } else {
            selected = clicked.getText().toString();
            clicked.setTextColor(Color.BLACK);
        }
    }

    void newQuestion() {
        if (curr_que_index > 3) {
            return;
        }
        question.setText(QnA.questions[curr_que_index]);
        ans1.setText(QnA.answers[curr_que_index][0]);
        ans2.setText(QnA.answers[curr_que_index][1]);
        ans3.setText(QnA.answers[curr_que_index][2]);
        ans4.setText(QnA.answers[curr_que_index][3]);
        ans1.setTextColor(Color.WHITE);
        ans2.setTextColor(Color.WHITE);
        ans3.setTextColor(Color.WHITE);
        ans4.setTextColor(Color.WHITE);
    }
}