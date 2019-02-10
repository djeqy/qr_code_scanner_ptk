package com.masbie.qr_code_scanner_ptk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main3Activity extends AppCompatActivity {

    TextView itemView;
    String hasilScan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        itemView = findViewById(R.id.textDetail);
        hasilScan = getIntent().getStringExtra("ptk_id");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://cari.padamu.siap.web.id/cari/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JsonPlaceHolder jsonPlaceHolder = retrofit.create(JsonPlaceHolder.class);

        Call<List<GetPost>> call = jsonPlaceHolder.getPosts();
        call.enqueue(new Callback<List<GetPost>>() {
            @Override
            public void onResponse(Call<List<GetPost>> call, Response<List<GetPost>> response) {
//                if(!response.isSuccessful()){
//                    itemView.setText("Code "+response.code());
//                    return;
//                }
                List<GetPost> posts = response.body();


                System.out.println("sdsds");
//                String cek="";
//                cek+="Cek "+
               for (GetPost post : posts){
                   String content="";
                    content +="ptk_id "+ post.getPtkArrayList();
////                    content +="nama "+post.getNama();
//                    itemView.append(content);
                   System.out.println("Coaba "+content);
                }
            }

            @Override
            public void onFailure(Call<List<GetPost>> call, Throwable t) {
                itemView.setText(t.getMessage());
            }
        });
    }
}
