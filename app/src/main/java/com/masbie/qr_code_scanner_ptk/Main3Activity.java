package com.masbie.qr_code_scanner_ptk;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main3Activity extends AppCompatActivity {
    JsonPlaceHolder apiInterface;
    TextView textView;
    String hasilScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView = findViewById(R.id.textDetail);
        hasilScan = getIntent().getStringExtra("ptk_id");
        apiInterface = ApiClient.getClient().create(JsonPlaceHolder.class);


        Call<GetPost> call = apiInterface.getPosts(hasilScan);
        System.out.println("cek ");
//        Call<GetPost> call = apiInterface.getPosts();
        call.enqueue(new Callback<GetPost>() {
            @Override
            public void onResponse(Call<GetPost> call, Response<GetPost> response) {
                GetPost post = response.body();

                textView.setText("Tes "+ post.getBaseUrl()+" pos "+post.getStatikUrl());
            }

            @Override
            public void onFailure(Call<GetPost> call, Throwable t) {
            textView.setText(t.getMessage());
            }
        });

    }
}
