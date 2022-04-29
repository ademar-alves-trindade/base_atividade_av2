package br.com.lsdm.entradadados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText precoAlcool;
    private EditText precoGasolina;

    private Button btnCalcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.editAlcool);
        precoGasolina = (EditText) findViewById(R.id.editGasolina);
        btnCalcular = findViewById(R.id.btnCalcular);
        resultado = findViewById(R.id.tvResultado);



}

    public void ResultadoBomba(View view) {
       //String txtvalorAlcool = precoAlcool.getText().toString();
      //Double valAlcool = Double.parseDouble(txtvalorAlcool);

        Double valorGasolina = Double.parseDouble(precoAlcool.getText().toString());
        Double valorAlcool = Double.parseDouble(precoGasolina.getText().toString());

        Double resultadoCalc = valorGasolina / valorAlcool;

        if (resultadoCalc <= 0.7){
            resultado.setText("É melhor utilizar Alcool!");
        }else {
            resultado.setText("É melhor utilizar Gasolina!");
        }
    }
    }