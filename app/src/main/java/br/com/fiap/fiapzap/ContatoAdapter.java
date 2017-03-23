package br.com.fiap.fiapzap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by logonrm on 23/03/2017.
 */

public class ContatoAdapter extends BaseAdapter{

    private Context context;
    private List<Contato> contatos;

    public ContatoAdapter(Context context, List<Contato> contatos) {
        this.context = context;
        this.contatos = contatos;
    }

    @Override
    public int getCount() {
        return this.contatos.size();
    }

    @Override
    public Object getItem(int i) {
        return this.contatos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(this.context);

        Contato contato = this.contatos.get(i);
        View v = inflater.inflate(R.layout.listview_contatos, null);
        ImageView imgContato = (ImageView) v.findViewById(R.id.imgContato);
        TextView txtNome = (TextView) v.findViewById(R.id.txtNome);
        TextView txtSobre = (TextView) v.findViewById(R.id.txtSobre);

        imgContato.setImageResource(contato.getImagem());
        txtNome.setText(contato.getNome());
        txtSobre.setText(contato.getSobre());

        return v;
    }
}
