package first.calc.easy.easycalc;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView output;

    Button one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, mul, divide, clear, point, equal;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.output);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "digital.ttf");
        output.setTypeface(custom_font);

        InitView();

        onSevenClick();
        onOneClick();
        onTwoClick();
        onThreeClick();
        onFourClick();
        onFiveClick();
        onSixClick();
        onEight();
        onNine();
        onZeroClick();
        onClear();
        onPlusClick();
        onMinusClick();
        onMulClick();
        onDivideClick();
        onOutputClick();



       Student sojib = new Student("Sojib","Rohim","A+",12, 1);




    }




    private void onClear(){
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this, ListExample.class);
             startActivity(intent);
            }
        });
    }

    private void onSevenClick() {
        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "7");
            }
        });
    }

    private void onOneClick(){
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "1");
            }
        });

    }

    private void onTwoClick(){
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() +"2");
            }
        });
    }

    private void onThreeClick(){
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() +"3");
            }
        });
    }

    private void onFourClick(){
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() +"4");
            }
        });
    }


    private void onFiveClick(){
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() +"5");
            }
        });
    }

    private void onSixClick(){
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() +"6");
            }
        });
    }

    private void onEight(){
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() +"8");
            }
        });
    }

    private void onNine(){
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() +"9");
            }
        });
    }

    private void onZeroClick(){
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() +"0");
            }
        });
    }

    private void onPlusClick(){
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "+");
            }
        });
    }

    private void onMinusClick(){
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "-");
            }
        });
    }

    private void onMulClick(){
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() +  "×");
            }
        });
    }

    private void onDivideClick(){
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(output.getText().toString() + "/");
            }
        });
    }


    private void onOutputClick(){
        equal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                output.setText(String.format("%.2f",MathParser.ParseExp(MathParser.placeHolder(output.getText().toString()))));;
            }
        });
    }

    private void InitView(){
        one = findViewById(R.id.btn_one);
        two = findViewById(R.id.btn_two);
        three = findViewById(R.id.btn_three);
        four = findViewById(R.id.btn_four);
        five = findViewById(R.id.btn_five);
        six = findViewById(R.id.btn_six);
        seven = findViewById(R.id.btn_seven);
        eight = findViewById(R.id.btn_eight);
        nine = findViewById(R.id.btn_nine);
        zero = findViewById(R.id.btn_zero);
        point = findViewById(R.id.btn_point);
        plus = findViewById(R.id.btn_plus);
        minus =findViewById(R.id.btn_minus);
        mul = findViewById(R.id.btn_mul);
        divide = findViewById(R.id.btn_divide);
        clear = findViewById(R.id.btn_clear);
        equal = findViewById(R.id.btn_ans);

    }




}
