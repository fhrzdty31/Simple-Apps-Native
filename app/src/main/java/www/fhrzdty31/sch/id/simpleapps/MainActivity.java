package www.fhrzdty31.sch.id.simpleapps;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    static {System.loadLibrary("simpleapps");}


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.text);
        Button cpp = findViewById(R.id.cpp);
        Button java = findViewById(R.id.java);

        java.setOnClickListener(view -> {
            tv.setText("Hello World from JAVA");
            java.setVisibility(View.GONE);
            cpp.setVisibility(View.VISIBLE);
        });

        cpp.setOnClickListener(view -> {
            tv.setText(stringFromJNI());
            cpp.setVisibility(View.GONE);
            java.setVisibility(View.VISIBLE);
        });
    }
    public native String stringFromJNI();
}