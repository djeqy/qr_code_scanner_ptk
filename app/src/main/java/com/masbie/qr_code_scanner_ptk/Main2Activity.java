package com.masbie.qr_code_scanner_ptk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.vision.barcode.Barcode;

public class Main2Activity extends AppCompatActivity {
    private static final int RC_BARCODE_CAPTURE = 9001;
    private static final String TAG = "BarcodeMain";

    private TextView statusMessage;
    private TextView barcodeValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void pindah(View view) {
        Intent intent= new Intent(Main2Activity.this, MainActivity.class);
        startActivity(intent);
    }

    public void scan(View view) {
        Intent intent= new Intent(Main2Activity.this, BarcodeCaptureActivity.class);
        startActivity(intent);
    }
    public void coba(View view) {
        Intent intent= new Intent(Main2Activity.this, Main3Activity.class);
        intent.putExtra("ptk_id", "20253484185001");
        startActivity(intent);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RC_BARCODE_CAPTURE) {
            if (resultCode == CommonStatusCodes.SUCCESS) {
                if (data != null) {
                    Barcode barcode = data.getParcelableExtra(BarcodeCaptureActivity.BarcodeObject);
                    statusMessage.setText(R.string.barcode_success);
                    barcodeValue.setText(barcode.displayValue);
                    Intent intent= new Intent(Main2Activity.this, Main3Activity.class);
                    intent.putExtra("ptk_id", barcode.displayValue);
                    startActivity(intent);
                    Log.d(TAG, "Barcode read: " + barcode.displayValue);
                } else {
//                    statusMessage.setText(R.string.barcode_failure);
                    Log.d(TAG, "No barcode captured, intent data is null");
                }
            } else {
                statusMessage.setText(String.format(getString(R.string.barcode_error),
                        CommonStatusCodes.getStatusCodeString(resultCode)));
            }
        }
        else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }


}
