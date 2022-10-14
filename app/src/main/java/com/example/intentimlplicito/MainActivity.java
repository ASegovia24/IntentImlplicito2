package com.example.intentimlplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtDireccionWeb;
    private EditText edtDireccionMapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtDireccionWeb = (EditText) findViewById(R.id.edtDireccionWeb);
        edtDireccionMapa = (EditText) findViewById(R.id.edtDireccionMapa);
    }

    public void mostrarPaginaWeb(View view) {
        String textoDireccionWeb = String.valueOf(edtDireccionWeb.getText());
        Uri paginaWeb = Uri.parse(textoDireccionWeb);
        Intent intent = new Intent(Intent.ACTION_VIEW, paginaWeb);
        //if (intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        //}else{
        //    Toast.makeText(this,"no tengo ninguna aplicacion para abrir la pagina web",Toast.LENGTH_LONG).show();
        //}
    }

    public void mostrarMapa(View view) {

        String textoDireccionMapa = String.valueOf(edtDireccionMapa.getText());
        Uri calleMapa = Uri.parse("geo:0,0?q=" + textoDireccionMapa);
        Intent intent = new Intent(Intent.ACTION_VIEW, calleMapa);
        //if (intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        //}else{
        //    Toast.makeText(this,"no tengo ninguna aplicacion para abrir mapas",Toast.LENGTH_LONG).show();
        //}
    }
}