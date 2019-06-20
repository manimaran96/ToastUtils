package coopon.manimaran.toastutilsex;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import coopon.manimaran.toastutils.ToastUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnNormal, btnShort, btnLong, btnInfo, btnSuccess, btnWarning, btnError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNormal = findViewById(R.id.btn_normal);
        btnShort = findViewById(R.id.btn_short);
        btnLong = findViewById(R.id.btn_long);
        btnInfo = findViewById(R.id.btn_info);
        btnSuccess = findViewById(R.id.btn_success);
        btnWarning = findViewById(R.id.btn_warning);
        btnError = findViewById(R.id.btn_error);

        btnNormal.setOnClickListener(this);
        btnShort.setOnClickListener(this);
        btnLong.setOnClickListener(this);
        btnInfo.setOnClickListener(this);
        btnSuccess.setOnClickListener(this);
        btnWarning.setOnClickListener(this);
        btnError.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btn_normal : ToastUtils.showNormal(getApplicationContext(), "Normal"); break;
            case R.id.btn_short : ToastUtils.showShort(getApplicationContext(), "Short"); break;
            case R.id.btn_long : ToastUtils.showLong(getApplicationContext(), "Long"); break;
            case R.id.btn_info : ToastUtils.showInfo(getApplicationContext(), "Info"); break;
            case R.id.btn_success : ToastUtils.showSuccess(getApplicationContext(), "Success"); break;
            case R.id.btn_warning : ToastUtils.showWarning(getApplicationContext(), "Warning"); break;
            case R.id.btn_error : ToastUtils.showError(getApplicationContext(), "Error"); break;
        }

    }
}
