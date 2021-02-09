package mcm.edu.ph.solis_enhancedbasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSub = findViewById(R.id.btnSub);
        Button btnMult = findViewById(R.id.btnMult);
        Button btnDiv = findViewById(R.id.btnDiv);
        Button btnMod = findViewById(R.id.btnMod);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMod.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
       double operand1=0;
       double operand2=0;

       EditText op1 = findViewById(R.id.txtOperand1);
       EditText op2 = findViewById(R.id.txtOperand2);
       TextView ans = findViewById(R.id.txtAnswer);

       operand1 = Double.parseDouble(op1.getText().toString());
       operand2 = Double.parseDouble(op2.getText().toString());

       switch(view.getId()) {
           case R.id.btnAdd:
               ans.setText(Double.toString(doAddition(operand1,operand2)));
               break;
           case R.id.btnSub:
               ans.setText(Double.toString(doSubtraction(operand1,operand2)));
               break;
           case R.id.btnMult:
               ans.setText(Double.toString(doMultiplication(operand1,operand2)));
               break;
           case R.id.btnDiv:
               ans.setText(Double.toString(doDivision(operand1,operand2)));
               break;
           case R.id.btnMod:
               ans.setText(Double.toString(doModulo(operand1,operand2)));
               break;
       }

    }

    public static double doAddition(double x, double y){
       return x + y;
    }

    public static double doDivision(double operand1, double operand2){
      return operand1 / operand2;
    }

    public static double doSubtraction(double operand1, double operand2){
        return operand1 - operand2;
    }

    public static double doMultiplication(double operand1, double operand2){
        return operand1 * operand2;
    }

    public static double doModulo(double operand1, double operand2){
        return operand1 % operand2;
    }
}