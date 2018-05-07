package jorge.tala.appexamen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    EditText N1;
    EditText N2;
    RadioButton Sum;
    RadioButton Rest;
    String Operationtype;
    Button btnoperation;
    int Result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        N1 = (EditText) findViewById(R.id.edit_N1);
        N2 = (EditText) findViewById(R.id.edit_N2);
        Sum = (RadioButton) findViewById(R.id.radio_Sum);
        Rest = (RadioButton) findViewById(R.id.radio_Rest);
        btnoperation = (Button) findViewById(R.id.btn_Operation);
        btnoperation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operations();
            }
        });
    }
    public void Operations(){
        Intent intent = new Intent(this, Resutl.class);
        intent.putExtra("Operation",Operationtype);
        if (Sum.isChecked()){
            Operationtype = "Suma";
            intent.putExtra("Result", Integer.parseInt(N1.getText().toString()) +  Integer.parseInt(N2.getText().toString());

        }

        else if (Rest.isChecked()){
            Operationtype = "Resta";
            intent.putExtra("Result", Integer.parseInt(N1.getText().toString()) +  Integer.parseInt(N2.getText().toString());
        }


        System.out.println("Resultado"+ Integer.parseInt(N1.getText().toString()) +  Integer.parseInt(N2.getText().toString());
        startActivityForResult(intent,0);
    }

}