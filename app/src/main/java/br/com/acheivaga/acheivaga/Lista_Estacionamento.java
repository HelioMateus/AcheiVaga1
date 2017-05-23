package br.com.acheivaga.acheivaga;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;

/**
 * Created by ruben on 19/05/2017.
 */

public class Lista_Estacionamento extends Activity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_estacionamentos);
    }


	//teste de commit
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
