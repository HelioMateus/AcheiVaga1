package br.com.acheivaga.acheivaga;

/**
 * Created by Helio on 29/05/2017.
 */

import android.content.Intent;
import android.support.annotation.NonNull;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login_Estacionamento extends AppCompatActivity {


    private static final String TAG = "login";
    private FirebaseAuth mAuth;
    private Button btnEntra;
    private Button btnCadastrar;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private EditText edtEmail;
    private EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_estacionamento);
        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        btnEntra = (Button) findViewById((R.id.btnEntrar));
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtSenha = (EditText) findViewById(R.id.edtSenha);

        mAuth = FirebaseAuth.getInstance();

        btnEntra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edtEmail.getText().toString().isEmpty()) || (edtSenha.getText().toString().isEmpty())) {
                    Toast.makeText(Login_Estacionamento.this, "Preencha os campos de email e senha", Toast.LENGTH_LONG).show();

                } else {
                    autenticar(edtEmail.getText().toString(), edtSenha.getText().toString());

                }

            }


        });

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_Estacionamento.this, Cadastrar_Estacionamento.class);
                startActivity(intent);
            }
        });
    }

    // metodo de login
    public void autenticar(String email, String senha) {
        mAuth.signInWithEmailAndPassword(email, senha).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {//caso email e senha validos chama boas vindas
                    Log.i("login", "sucesso ao fazer login");
                    Toast.makeText(Login_Estacionamento.this, "seja bem vinfo", Toast.LENGTH_LONG).show();

                } else {
                    Log.i("login", "falha ao fazer login" + task.getException());
                    Toast.makeText(Login_Estacionamento.this, "usario ou senha invalido", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

}
