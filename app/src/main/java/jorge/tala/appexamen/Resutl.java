package jorge.tala.appexamen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Resutl extends AppCompatActivity {
    TextView operation;
    TextView result;
    String res;
    Button btnace;
    Button btncancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resutl);
        operation = (TextView)  findViewById(R.id.txt_operation);
        result = (TextView)  findViewById(R.id.txt_result);
        Intent intent = getIntent();

        res = intent.getStringExtra("Result");
        result.setText(intent.getStringExtra("Result"));
        operation.setText(intent.getStringExtra("Operation"));
        btnace = (Button) findViewById(R.id.btn_acep);
        btncancel = (Button) findViewById(R.id.btn_cancel);
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cancel();
            }
        });
        btnace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Aceptar();
            }
        });

    }

    public  void Cancel(){
        Toast.makeText(Resutl.this,"Se cancelo la operación regresando a la actividad.",Toast.LENGTH_LONG).show();
        Back();
    }
    public  void Aceptar(){
        Toast.makeText(Resutl.this,"Resultado"+res,Toast.LENGTH_LONG).show();
        Back();
    }

    public void Back() {
        Intent i = new Intent();
        setResult(RESULT_OK, i);
        finish();
    }

}
