package br.com.fabricadeprogramador.cursoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btn_som = (Button) findViewById(R.id.btnSom);
        btn_som.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Acessando as referencias aos numeros
                EditText edNum1 = (EditText) findViewById(R.id.edNumero1);
                EditText edNum2 = (EditText) findViewById(R.id.edNumero2);
                String strN1 = edNum1.getText().toString();
                String strN2 = edNum2.getText().toString();

                if (strN1.isEmpty() || strN2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Insira dados", Toast.LENGTH_SHORT).show();
                } else {
                    //Numeros no formato double
                    Double n1 = new Double(strN1);
                    Double n2 = new Double(strN2);

                    Double resultado = n1 + n2;

                    Toast.makeText(MainActivity.this, "O resultado é: " + resultado, Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button btn_sub = (Button) findViewById(R.id.btnSub);
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Acessando as referencias aos numeros
                EditText edNum1 = (EditText) findViewById(R.id.edNumero1);
                EditText edNum2 = (EditText) findViewById(R.id.edNumero2);
                String strN1 = edNum1.getText().toString();
                String strN2 = edNum2.getText().toString();

                if (strN1.isEmpty() || strN2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Insira dados", Toast.LENGTH_SHORT).show();
                } else {
                    //Numeros no formato double
                    Double n1 = new Double(strN1);
                    Double n2 = new Double(strN2);

                    Double resultado = n1 - n2;

                    Toast.makeText(MainActivity.this, "O resultado é: " + resultado, Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button btn_mul = (Button) findViewById(R.id.btnMul);
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Acessando as referencias aos numeros
                EditText edNum1 = (EditText) findViewById(R.id.edNumero1);
                EditText edNum2 = (EditText) findViewById(R.id.edNumero2);
                String strN1 = edNum1.getText().toString();
                String strN2 = edNum2.getText().toString();

                if (strN1.isEmpty() || strN2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Insira dados", Toast.LENGTH_SHORT).show();
                } else {
                    //Numeros no formato double
                    Double n1 = new Double(strN1);
                    Double n2 = new Double(strN2);

                    Double resultado = n1 * n2;

                    Toast.makeText(MainActivity.this, "O resultado é: " + resultado, Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button btn_div = (Button) findViewById(R.id.btnDiv);
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Acessando as referencias aos numeros
                EditText edNum1 = (EditText) findViewById(R.id.edNumero1);
                EditText edNum2 = (EditText) findViewById(R.id.edNumero2);
                String strN1 = edNum1.getText().toString();
                String strN2 = edNum2.getText().toString();

                if (strN1.isEmpty() || strN2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Insira dados", Toast.LENGTH_SHORT).show();
                } else {
                    //Numeros no formato double
                    Double n1 = new Double(strN1);
                    Double n2 = new Double(strN2);

                    Double resultado = n1 / n2;

                    Toast.makeText(MainActivity.this, "O resultado é: " + resultado, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}