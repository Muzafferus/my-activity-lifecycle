package com.muzafferus.myactivitylifescycle;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonDialog, buttonOpenActivity, buttonOpenForResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ActivityLifecycle", "onCreate");
        buttonDialog = findViewById(R.id.button_dialog);
        buttonOpenActivity = findViewById(R.id.button_one);
        buttonOpenForResult = findViewById(R.id.button_two);

        buttonDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(R.string.dialog_header);
                builder.setMessage(R.string.dialog_body);
                builder.setNegativeButton(R.string.dialog_no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

                builder.setPositiveButton(R.string.dialog_yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

                builder.show();
            }
        });

        buttonOpenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        buttonOpenForResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, 666);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ActivityLifecycle", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ActivityLifecycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ActivityLifecycle", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ActivityLifecycle", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ActivityLifecycle", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ActivityLifecycle", "onRestart");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e("ActivityLifecycle", "onActivityResult");
    }
}
