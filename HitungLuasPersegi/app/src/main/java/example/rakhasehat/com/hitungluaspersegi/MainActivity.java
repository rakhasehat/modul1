package example.rakhasehat.com.hitungluaspersegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtInput, txtLuas, txtKeliling;
    private Button btnOk;
    private TextView viInput, viKeliling, viLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initEvent();
    }

    private void initUI() {
        txtInput = (EditText) findViewById(R.id.txtInput);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        txtKeliling = (EditText) findViewById(R.id.txtKeliling);
        btnOk = (Button) findViewById(R.id.btnOk);
        viInput = (TextView) findViewById(R.id.viInput);
        viKeliling = (TextView) findViewById(R.id.viKeliling);
    }

    private void initEvent() {
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
                hitungKeliling();
            }
        });
    }

    private void hitungKeliling() {
        int sisi = Integer.parseInt(txtInput.getText().toString());
        int keliling = 4 * sisi;
        txtKeliling.setText(keliling+"");
    }

    private void hitungLuas() {
        int sisi = Integer.parseInt(txtInput.getText().toString());
        int luas = sisi * sisi;
        txtLuas.setText(luas+"");
    }
}
