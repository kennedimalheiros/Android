package br.com.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class CalculadoraActivity extends Activity {
    /** Called when the activity is first created. */

	EditText etNum1, etNum2, etResultado;
	Button btsomar;
	double num1, num2, resultado;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        etNum1 = (EditText) findViewById(R.id.num1);
        etNum2 = (EditText) findViewById(R.id.num2);
        etResultado = (EditText) findViewById(R.id.resultado);
        btsomar = (Button) findViewById(R.id.somar);
        
        btsomar.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				num1 = Double.parseDouble(etNum1.getText().toString());
				num2 = Double.parseDouble(etNum2.getText().toString());
				resultado = num1 + num2;
				
				etResultado.setText(String.valueOf(resultado));
			}
		});

        
    }
}