package coopon.manimaran.toastutilsex;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import coopon.manimaran.toastutils.ToastUtils;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnShort, btnLong, btnCustom;
    Button btnInfoShort, btnSuccessShort, btnWarningShort, btnErrorShort;
    Button btnInfoLong, btnSuccessLong, btnWarningLong, btnErrorLong;
    Button btnInfoCustom, btnSuccessCustom, btnWarningCustom, btnErrorCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShort = findViewById(R.id.btn_short);
        btnLong = findViewById(R.id.btn_long);
        btnCustom = findViewById(R.id.btn_custom);

        btnInfoShort = findViewById(R.id.btn_info_short);
        btnSuccessShort = findViewById(R.id.btn_success_short);
        btnWarningShort = findViewById(R.id.btn_warning_short);
        btnErrorShort = findViewById(R.id.btn_error_short);

        btnInfoLong = findViewById(R.id.btn_info_long);
        btnSuccessLong = findViewById(R.id.btn_success_long);
        btnWarningLong = findViewById(R.id.btn_warning_long);
        btnErrorLong = findViewById(R.id.btn_error_long);

        btnInfoCustom = findViewById(R.id.btn_info_custom);
        btnSuccessCustom = findViewById(R.id.btn_success_custom);
        btnWarningCustom = findViewById(R.id.btn_warning_custom);
        btnErrorCustom = findViewById(R.id.btn_error_custom);

        btnShort.setOnClickListener(this);
        btnLong.setOnClickListener(this);
        btnCustom.setOnClickListener(this);

        btnInfoShort.setOnClickListener(this);
        btnSuccessShort.setOnClickListener(this);
        btnWarningShort.setOnClickListener(this);
        btnErrorShort.setOnClickListener(this);

        btnInfoLong.setOnClickListener(this);
        btnSuccessLong.setOnClickListener(this);
        btnWarningLong.setOnClickListener(this);
        btnErrorLong.setOnClickListener(this);

        btnInfoCustom.setOnClickListener(this);
        btnSuccessCustom.setOnClickListener(this);
        btnWarningCustom.setOnClickListener(this);
        btnErrorCustom.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btn_short : ToastUtils.showShort(getApplicationContext(), "Short Toast"); break;
            case R.id.btn_long : ToastUtils.showLong(getApplicationContext(), "Long Toast"); break;
            case R.id.btn_custom : ToastUtils.showCustom(getApplicationContext(), "Custom Toast for 3sec", 3000); break;

            case R.id.btn_info_short : ToastUtils.showInfoShort(getApplicationContext(), "Info Toast - Short"); break;
            case R.id.btn_success_short : ToastUtils.showSuccessShort(getApplicationContext(), "Success Toast - Short"); break;
            case R.id.btn_warning_short : ToastUtils.showWarningShort(getApplicationContext(), "Warning Toast - Short"); break;
            case R.id.btn_error_short : ToastUtils.showErrorShort(getApplicationContext(), "Error Toast - Short"); break;

            case R.id.btn_info_long : ToastUtils.showInfoLong(getApplicationContext(), "Info Toast - Long"); break;
            case R.id.btn_success_long : ToastUtils.showSuccessLong(getApplicationContext(), "Success Toast - Long"); break;
            case R.id.btn_warning_long : ToastUtils.showWarningLong(getApplicationContext(), "Warning Toast - Long"); break;
            case R.id.btn_error_long : ToastUtils.showErrorLong(getApplicationContext(), "Error Toast - Long"); break;

            case R.id.btn_info_custom : ToastUtils.showInfoCustom(getApplicationContext(), "Info Toast - Custom for 3sec", 3000); break;
            case R.id.btn_success_custom : ToastUtils.showSuccessCustom(getApplicationContext(), "Success Toast - Custom for 3sec", 3000); break;
            case R.id.btn_warning_custom : ToastUtils.showWarningCustom(getApplicationContext(), "Warning Toast - Custom for 3sec", 3000); break;
            case R.id.btn_error_custom : ToastUtils.showErrorCustom(getApplicationContext(), "Error Toast - Custom for 3sec", 3000); break;
        }

    }
}
