package salles.cardoso.davi.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.inputmethodservice.ExtractEditText;
import android.os.Bundle;
import android.text.style.EasyEditSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    //Criando o método oncreate
    protected void onCreate(Bundle savedInstanceState) {
        //Chamando a superclasse do método
        super.onCreate(savedInstanceState);
        //cria a tela
        setContentView(R.layout.activity_main);
        //criando botão enviar utilizando o id do botão na tela
        Button btnEnviar = findViewById(R.id.btnEnviar);
        //chamando função ao clicar no botão
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // pegando o editText da tela utilizando o id
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                //salvando conteúdo do editText em uma variável
                String textoDigitado = etDigiteAqui.getText().toString();
                //Pegando os elementos de uma tela (MainActivity) e adicionando na outra (NextActivity)
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                //criando um dicionário em que a chave é a palavra Texto e o conteúdo é o que foi digitado anteriormente
                i.putExtra("Texto", textoDigitado);
                //iniciando segunda tela
                startActivity(i);

            }
        });
    }
}