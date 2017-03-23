package br.com.fiap.fiapzap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 23/03/2017.
 */

public class GeraContato {

    public static List<Contato> listaContatos(){
        List<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("João", R.drawable.img, "Hello", "(11) 1111-1111"));
        contatos.add(new Contato("Tom", R.drawable.img2, "Hello2", "(11) 2222-2222"));
        contatos.add(new Contato("Ricardo", R.drawable.img3, "Hello2", "(11) 3333-3333"));


        return contatos;
    }
}
