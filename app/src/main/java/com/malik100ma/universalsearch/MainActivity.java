package com.malik100ma.universalsearch;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RadioButton rdGoogle, rdYahoo, rdBing, rdDarkDarkGo;

    Button btnSearch;

    EditText etSearch;

    RadioGroup rgSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        etSearch = findViewById(R.id.etSearch);
        btnSearch = findViewById(R.id.btnSearch);
        rdBing = findViewById(R.id.rbBing);
        rdGoogle = findViewById(R.id.rbGoogle);
        rdYahoo = findViewById(R.id.rdYahoo);
        rdDarkDarkGo = findViewById(R.id.rdDarkDarkGo);
        rgSearch = findViewById(R.id.rgSearch);

        btnSearch.setOnClickListener(v -> search());
    }

    private void search() {
        String text = etSearch.getText().toString().trim();
        String url;
        int selectedID = rgSearch.getCheckedRadioButtonId();
        if (selectedID == rdYahoo){

        }else if (selectedID == rdGoogle){

        }
    }
}