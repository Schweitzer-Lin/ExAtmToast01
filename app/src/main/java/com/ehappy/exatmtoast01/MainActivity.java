package com.ehappy.exatmtoast01;

import android.app.Activity;
//import android.app.AlertDialog;
//import android.location.GpsStatus;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
    //Set up private global variable
    private EditText edtATM;
    private Button btnN1, btnN2, btnN3;
    private Button btnN4, btnN5, btnN6;
    private Button btnN7, btnN8, btnN9, btnN0;
    private Button btnBack, btnOK;
//    private Button btnEnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get the layout components
        edtATM=(EditText)findViewById(R.id.edtATM);
        btnN1=(Button)findViewById(R.id.btnN1);
        btnN2=(Button)findViewById(R.id.btnN2);
        btnN3=(Button)findViewById(R.id.btnN3);
        btnN4=(Button)findViewById(R.id.btnN4);
        btnN5=(Button)findViewById(R.id.btnN5);
        btnN6=(Button)findViewById(R.id.btnN6);
        btnN7=(Button)findViewById(R.id.btnN7);
        btnN8=(Button)findViewById(R.id.btnN8);
        btnN9=(Button)findViewById(R.id.btnN9);
        btnN0=(Button)findViewById(R.id.btnN0);
        btnBack=(Button)findViewById(R.id.btnBack);
        btnOK=(Button)findViewById(R.id.btnOK);
//        btnEnd.findViewById(R.id.btnEnd);
        //Set up the common events
        btnN1.setOnClickListener(listener);
        btnN2.setOnClickListener(listener);
        btnN3.setOnClickListener(listener);
        btnN4.setOnClickListener(listener);
        btnN5.setOnClickListener(listener);
        btnN6.setOnClickListener(listener);
        btnN7.setOnClickListener(listener);
        btnN8.setOnClickListener(listener);
        btnN9.setOnClickListener(listener);
        btnN0.setOnClickListener(listener);
        btnBack.setOnClickListener(listener);
        btnOK.setOnClickListener(listener);
//        btnEnd.setOnClickListener(listener);
    }

    private Button.OnClickListener listener = new Button.OnClickListener () {
        @Override
        public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.btnN1:    // push 1 button
                        displayATM("1");
                        break;
                    case R.id.btnN2:    // push 2 button
                        displayATM("2");
                        break;
                    case R.id.btnN3:    // push 3 button
                        displayATM("3");
                        break;
                    case R.id.btnN4:    // push 4 button
                        displayATM("4");
                        break;
                    case R.id.btnN5:    // push 5 button
                        displayATM("5");
                        break;
                    case R.id.btnN6:    // push 6 button
                        displayATM("6");
                        break;
                    case R.id.btnN7:    // push 7 button
                        displayATM("7");
                        break;
                    case R.id.btnN8:    // push 8 button
                        displayATM("8");
                        break;
                    case R.id.btnN9:    // push 59button
                        displayATM("9");
                        break;
                    case R.id.btnN0:    // push 0 button
                        displayATM("0");
                        break;
                    case R.id.btnBack:
                        String str=edtATM.getText().toString();
                        if(str.length() > 0) {
                            str = str.substring(0, str.length()-1);
                            edtATM.setText(str);
                        }
                        break;
                    case R.id.btnOK:    // push OK button
                        str=edtATM.getText().toString();
                        if(str.equals("123456")) {
                            Toast toast = Toast.makeText(MainActivity.this, "Password Correct!!! Welcome using ATM", Toast.LENGTH_LONG);
                            toast.show();
                        } else {
                            Toast toast=Toast.makeText(MainActivity.this, "Wrong Password!!!, please re-enter again", Toast.LENGTH_LONG);
                            toast.show();
                            edtATM.setText("");
                        }
                        break;
//                    case R.id.btnEnd:  //按 結束  鈕
//                        new AlertDialog.Builder(MainActivity.this)
//                                .setTitle("確認視窗")
//                                .setIcon(R.drawable.ic_launcher)
//                                .setMessage("確定要結束應用程式嗎？")
//                                .show();
//                        break;
                }
        }
    };

    private void displayATM (String s) {
        String str=edtATM.getText().toString();
        edtATM.setText(str + s);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
