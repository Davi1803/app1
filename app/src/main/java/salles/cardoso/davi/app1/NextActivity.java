package salles.cardoso.davi.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        //pegando o intent criador da tela NextActivity
        Intent i = getIntent();
        //pegando o conteúdo do dicionário criado no MainActivity e salvando em uma String
        String textoDigitado = i.getStringExtra( "Texto");
        //pegando o TextView na tela utilizando o id
        TextView tvTexto = findViewById(R.id.tvTexto);
        //adicionando o texto digitado na String (textoDigitado) no textView (tvTexto)
        tvTexto.setText(textoDigitado);
    }
}