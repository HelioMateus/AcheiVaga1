package br.com.acheivaga.acheivaga;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruben on 19/05/2017.
 */

public class Lista_Estacionamento extends AppCompatActivity {

    private DatabaseReference databaseReference = FirebaseDatabase.
            getInstance().getReference();
    private DatabaseReference clientesReference = databaseReference.
            child("clientes");

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estacionamentos);

        final ListView listView=(ListView) findViewById(R.id.lista);


        clientesReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Iterable<DataSnapshot>dsCliente=
                        dataSnapshot.getChildren();
                List<Usuario> clientes=new ArrayList<Usuario>();
                while(dsCliente.iterator().hasNext()){
                    DataSnapshot dsObjetoCliente=
                            dsCliente.iterator().next();
                    Usuario cliente=
                            dsObjetoCliente.getValue(Usuario.class);
                    clientes.add(cliente);

                }

                ArrayAdapter<Usuario> adapter =
                        new ArrayAdapter<Usuario>(Lista_Estacionamento.this,
                                android.R.layout.simple_list_item_1,
                                clientes);
                listView.setAdapter(adapter);

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



    }
}