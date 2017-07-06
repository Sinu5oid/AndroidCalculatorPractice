package ru.omgtu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0,
            buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonSqrt, buttonOP, buttonCP,
            buttonClear, buttonDot, buttonEqual, buttonBS,  buttonSin, buttonCos, buttonSqr;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findComponentViewsById();
        setComponentListeners();
    }

    void findComponentViewsById(){
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonSqrt = (Button) findViewById(R.id.buttonSqrt);
        buttonOP = (Button) findViewById(R.id.buttonOP);
        buttonCP = (Button) findViewById(R.id.buttonCP);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonBS = (Button) findViewById(R.id.buttonBS);
        buttonSqr = (Button) findViewById(R.id.buttonSqr);
        buttonCos = (Button) findViewById(R.id.buttonCos);
        buttonSin = (Button) findViewById(R.id.buttonSin);
        tvResult = (AutoCompleteTextView) findViewById(R.id.result);
    }
    void setComponentListeners(){
        View.OnClickListener oclButton0 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "0");
            }
        };
        View.OnClickListener oclButton1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "1");
            }
        };
        View.OnClickListener oclButton2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "2");
            }
        };
        View.OnClickListener oclButton3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "3");
            }
        };
        View.OnClickListener oclButton4 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "4");
            }
        };
        View.OnClickListener oclButton5 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "5");
            }
        };
        View.OnClickListener oclButton6 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "6");
            }
        };
        View.OnClickListener oclButton7 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "7");
            }
        };
        View.OnClickListener oclButton8 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "8");
            }
        };
        View.OnClickListener oclButton9 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "9");
            }
        };
        View.OnClickListener oclButtonPlus = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "+");
            }
        };
        View.OnClickListener oclButtonMinus = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "-");
            }
        };
        View.OnClickListener oclButtonMultiply = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "*");
            }
        };
        View.OnClickListener oclButtonDivide = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "/");
            }
        };
        View.OnClickListener oclButtonClear = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText("");
                tvResult.setHint("0");
            }
        };
        View.OnClickListener oclButtonDot = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + ".");
            }
        };
        View.OnClickListener oclButtonCP = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + ")");
            }
        };
        View.OnClickListener oclButtonOP = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "(");
            }
        };
        View.OnClickListener oclButtonSqrt = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "sqrt(");
            }
        };
        View.OnClickListener oclButtonSqr = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "^2");
            }
        };
        View.OnClickListener oclButtonSin = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "sin(");
            }
        };
        View.OnClickListener oclButtonCos = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "cos(");
            }
        };
        View.OnClickListener oclButtonBS = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    StringBuffer stringBuffer = new StringBuffer(tvResult.getText().toString());
                    stringBuffer.delete(stringBuffer.length()-1, stringBuffer.length());
                    tvResult.setText(stringBuffer);
                } catch (Exception e) {

                }
            }
        };
        View.OnClickListener oclButtonEqual = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MathParser mathParser = new MathParser();
                try {
                    tvResult.setText(mathParser.Parse(tvResult.getText().toString()) + "");
                } catch (Exception e){
                    tvResult.setText("");
                    tvResult.setHint(R.string.error_parsing);
                }
            }
        };

        button0.setOnClickListener(oclButton0);
        button1.setOnClickListener(oclButton1);
        button2.setOnClickListener(oclButton2);
        button3.setOnClickListener(oclButton3);
        button4.setOnClickListener(oclButton4);
        button5.setOnClickListener(oclButton5);
        button6.setOnClickListener(oclButton6);
        button7.setOnClickListener(oclButton7);
        button8.setOnClickListener(oclButton8);
        button9.setOnClickListener(oclButton9);
        buttonPlus.setOnClickListener(oclButtonPlus);
        buttonMinus.setOnClickListener(oclButtonMinus);
        buttonDivide.setOnClickListener(oclButtonDivide);
        buttonMultiply.setOnClickListener(oclButtonMultiply);
        buttonDot.setOnClickListener(oclButtonDot);
        buttonSqrt.setOnClickListener(oclButtonSqrt);
        buttonOP.setOnClickListener(oclButtonOP);
        buttonCP.setOnClickListener(oclButtonCP);
        buttonClear.setOnClickListener(oclButtonClear);
        buttonEqual.setOnClickListener(oclButtonEqual);
        buttonBS. setOnClickListener(oclButtonBS);
        buttonSin. setOnClickListener(oclButtonSin);
        buttonCos. setOnClickListener(oclButtonCos);
        buttonSqr. setOnClickListener(oclButtonSqr);
    }

}
