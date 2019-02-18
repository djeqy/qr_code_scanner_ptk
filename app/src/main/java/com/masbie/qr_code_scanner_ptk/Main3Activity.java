package com.masbie.qr_code_scanner_ptk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main3Activity extends AppCompatActivity {
    JsonPlaceHolder apiInterface;
    TextView textView, nama, akunid, nik;
    ImageView foto;
    String hasilScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView = findViewById(R.id.textDetail);
        nama = findViewById(R.id.nama);
        akunid = findViewById(R.id.akunid);
        nik = findViewById(R.id.nik);
        foto = (ImageView) findViewById(R.id.foto);
        hasilScan = getIntent().getStringExtra("ptk_id");
        apiInterface = ApiClient.getClient().create(JsonPlaceHolder.class);

//       final Bitmap bitmap = ((BitmapDrawable)foto.getDrawable()).getBitmap();


        Call<GetPost> call = apiInterface.getPosts(hasilScan);

        System.out.println("cek ");
//        Call<GetPost> call = apiInterface.getPosts();
        call.enqueue(new Callback<GetPost>() {
            @Override
            public void onResponse(Call<GetPost> call, Response<GetPost> response) {
                GetPost post = response.body();
//                GetPost image = apiInterface.getImage(""+post.getPtk().getFoto());
                String ff = post.getPtk().getFoto();
                Picasso.get().load(ff).into(foto);
                nama.setText(post.getPtk().getNama());
                akunid.setText(post.getPtk().getAkunId());
                nik.setText(post.getPtk().getNik());


//                foto.setImageResource();

                textView.setText(post.getPtk().getNik());
            }

            @Override
            public void onFailure(Call<GetPost> call, Throwable t) {
            textView.setText(t.getMessage());
            }
        });
//        Call<GetPost> call1 = apiInterface.getPosts(hasilScan);
//
//        call1.enqueue(new Callback<GetPost>() {
//            @Override
//            public void onResponse(Call<GetPost> call, Response<GetPost> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<GetPost> call, Throwable t) {
//
//            }
//        });
    }
}
