package br.com.acheivaga.acheivaga;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Wanderson on 29/05/2017.
 */

public class Cadastrar_Estacionamento extends AppCompatActivity {
    private Button btnSalvar;
    private EditText tvNomeProprietario;
    private EditText tvNomeEstacionamento;
    private EditText tvTelefone;
    private EditText tvQtdVagas;
    private EditText tvServicos;
    private EditText tvEndereco;
    private EditText tvCNPJ;
    private EditText tvBairro;
    private EditText tvNumero;
    private EditText tvCidade;
    private EditText tvUsuario;
    private EditText tvSenha;
    private DatabaseReference databaseReference = FirebaseDatabase.
            getInstance().getReference();
    private DatabaseReference clientesReference = databaseReference.
            child("clientes");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_estacionamento);


        final EditText tvNomeProprietario = (EditText) findViewById(R.id.edtProprie);
        final EditText tvNomeEstacionamento = (EditText) findViewById(R.id.edtEstacio);
        final EditText tvTelefone = (EditText) findViewById(R.id.edtTelefone);
        final EditText tvEndereco = (EditText) findViewById(R.id.edtEndereco);
        final EditText tvNumero = (EditText) findViewById(R.id.edtNumero);
        final EditText tvCNPJ = (EditText) findViewById(R.id.edtCNPJ);
        final EditText tvQdtVagas = (EditText) findViewById(R.id.edtQtdVagas);
        final EditText tvBairro = (EditText) findViewById(R.id.edtBairro);
        final EditText tvCidade = (EditText) findViewById(R.id.edtCidade);
        final EditText tvUsuario = (EditText) findViewById(R.id.edtEmail);
        final EditText tvSenha = (EditText) findViewById(R.id.edtSenha);
        final EditText tvServicos = (EditText) findViewById(R.id.edtservicos);


        final Button btnSalvar = (Button) findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Usuario cliente = new Usuario();
                cliente.setNomeProprietario(tvNomeProprietario.getText().toString());
                cliente.setNomeEstacionamento(tvNomeEstacionamento.getText().toString());
                cliente.setTelefone(tvTelefone.getText().toString());
                cliente.setBairro(tvCNPJ.getText().toString());
                cliente.setBairro(tvQdtVagas.getText().toString());
                cliente.setEndereco(tvEndereco.getText().toString());
                cliente.setNúmero(tvNumero.getText().toString());
                cliente.setBairro(tvBairro.getText().toString());
                cliente.setCidade(tvCidade.getText().toString());
                cliente.setEmail(tvUsuario.getText().toString());
                cliente.setSenha(tvSenha.getText().toString());
                clientesReference.child("Nome Estacionamento: " + tvNomeEstacionamento.getText().toString()).setValue(cliente);

                tvNomeProprietario.setText("");
                tvNomeEstacionamento.setText("");
                tvTelefone.setText("");
                tvCNPJ.setText("");
                tvQdtVagas.setText("");
                tvEndereco.setText("");
                tvNumero.setText("");
                tvBairro.setText("");
                tvCidade.setText("");
                tvUsuario.setText("");
                tvSenha.setText("");

                Toast.makeText(Cadastrar_Estacionamento.this, "Cliente Salvo!", Toast.LENGTH_SHORT).show();


            }


        });
    }


}
