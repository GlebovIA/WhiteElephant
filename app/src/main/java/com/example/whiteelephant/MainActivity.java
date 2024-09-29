package com.example.whiteelephant;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Binder;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void OnArrange(View view){
        EditText etFIO = findViewById(R.id.etFIO);
        EditText etPhone = findViewById(R.id.etPhone);
        EditText etAddress = findViewById(R.id.etAddress);
        if(etFIO.getText().length() == 0) AlertDialog("Уведомление", "Пожалуйста укажите ФИО");
        else if(etPhone.getText().length() == 0) AlertDialog("Уведомление", "Пожалуйста укажите номер телефона");
        else if(etAddress.getText().length() == 0) AlertDialog("Уведомление", "Пожалуйста укажите адрес доставки");
        else AlertDialog("Уведомление", "Заказ успешно оформлен");
    }

    public void AlertDialog(String title, String message){
        AlertDialog.Builder Builder = new AlertDialog.Builder(MainActivity.this);
        Builder.setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        AlertDialog Alert = Builder.create();
        Alert.show();
    }
}