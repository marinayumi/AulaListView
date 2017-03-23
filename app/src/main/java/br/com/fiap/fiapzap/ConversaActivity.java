package br.com.fiap.fiapzap;

import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ConversaActivity extends AppCompatActivity {

    ImageView imgContato;
    TextView nomeContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversa);

        Contato contato = (Contato) getIntent().getExtras().get("contatos");


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(contato.getNome());

        imgContato = (ImageView)findViewById(R.id.imgContato);
        nomeContato = (TextView)findViewById(R.id.txtNome);

        imgContato.setImageResource(contato.getImagem());
        nomeContato.setText(contato.getNome());
    }
}
