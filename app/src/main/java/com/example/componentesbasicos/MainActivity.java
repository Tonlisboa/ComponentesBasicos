package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;
    private CheckBox checkVerde,checkBranco, checkVermelho;
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoNome = findViewById(R.id.nome);
        campoEmail = findViewById(R.id.email);
        textoResultado = findViewById(R.id.resultado);
        //Checkbox
        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);
        sexoMasculino = findViewById(R.id.radioButtonMasculino);
        sexoFeminino = findViewById(R.id.radioButtonFeminino);
        opcaoSexo = findViewById(R.id.radioGroupSexo);
        radioButton();
    }

    public void radioButton(){

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButtonMasculino){
                    textoResultado.setText("Masculino");
                }else if (checkedId == R.id.radioButtonFeminino){
                    textoResultado.setText("Feminino");
                }
            }
        });

    }

    public void enviar(View view){
        checkbox();;
    }
    public void limpar(View view){
        campoNome.setText("");
        campoEmail.setText("");
        textoResultado.setText("");
    }
    private void checkbox(){
        String texto = "";
        if (checkVerde.isChecked()){
            texto = "Verde seclecionado - ";
        }
        if(checkBranco.isChecked()){
            texto = texto + "Branco seclecionado - ";
        }
        if (checkVermelho.isChecked()){
            texto = texto + "Vermelho seclecionado - ";
        }
        textoResultado.setText(texto);
    }
}