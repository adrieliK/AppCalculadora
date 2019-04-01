package com.example.aluno.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private Button somar;
    private Button multiplicar;
    private Button dividir;
    private Button limpar;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        somar = (Button) findViewById(R.id.bS);
        multiplicar = (Button) findViewById(R.id.bM);
        dividir = (Button) findViewById(R.id.bD);
        limpar = (Button) findViewById(R.id.bL);
        resultado = (TextView) findViewById(R.id.resultado);

        somar.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {


                                         try {
                                             Double total = Double.parseDouble(n1.getText().toString()) + Double.parseDouble(n2.getText().toString());


                                             // Exibe uma mensagem no componente da tela
                                             resultado.setText("Resultado:  " + total);

                                             // Exibe uma mensagem do tipo TOAST
                                             Toast.makeText(MainActivity.this, "Resultado" + resultado, Toast.LENGTH_LONG).show();

                                         } catch (Exception E) {
                                             // Caso ocorra algum erro...
                                             Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente!", Toast.LENGTH_SHORT).show();

                                         }
                                     }
                                 });

            multiplicar.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {


                                             try {
                                                 Double total = Double.parseDouble(n1.getText().toString()) * Double.parseDouble(n2.getText().toString());


                                                 // Exibe uma mensagem no componente da tela
                                                 resultado.setText("Resultado:  " + total);

                                                 // Exibe uma mensagem do tipo TOAST
                                                 Toast.makeText(MainActivity.this, "Resultado" + resultado, Toast.LENGTH_LONG).show();

                                             } catch (Exception E) {
                                                 // Caso ocorra algum erro...
                                                 Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente!", Toast.LENGTH_SHORT).show();

                                             }
                                         }
                                     });

                dividir.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        try {
                            Double total = Double.parseDouble(n1.getText().toString()) / Double.parseDouble(n2.getText().toString());


                            // Exibe uma mensagem no componente da tela
                            resultado.setText("Resultado:  " + total);

                            // Exibe uma mensagem do tipo TOAST
                            Toast.makeText(MainActivity.this, "Resultado" + resultado, Toast.LENGTH_LONG).show();

                        } catch (Exception E) {
                            // Caso ocorra algum erro...
                            Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente!", Toast.LENGTH_SHORT).show();

                        }
                    }
                });
    }
}
