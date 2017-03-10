package mx.com.cetis108.hola001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import org.w3c.dom.Text;

public class hola extends AppCompatActivity {

    TextView TvTocame;
    Button Tocame;
    EditText Nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola);
        Tocame = (Button) findViewById(R.id.btnTocame);
        TvTocame = (TextView) findViewById(R.id.TvTocame);
        Nombre= (EditText) findViewById(R.id.EtNombre);

    }

    public void Aceptar(View view)
    {

        TvTocame.setText("Hola "+Nombre.getText());
        Nombre.setText(" ");
    }

}
