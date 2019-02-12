package com.masbie.qr_code_scanner_ptk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main3Activity extends AppCompatActivity {

    TextView itemView;
    String hasilScan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        itemView = findViewById(R.id.textDetail);
        hasilScan = getIntent().getStringExtra("ptk_id");
//        Gson gson = new Gson();
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://cari.padamu.siap.web.id/cari/")
//                .addConverterFactory(GsonConverterFactory.create())
//
//                .build();

        JsonPlaceHolder jsonPlaceHolder = ApiClient.getClient().create(JsonPlaceHolder.class);
//        JsonPlaceHolder jsonPlaceHolder = retrofit.create(JsonPlaceHolder.class);

//        Call<GetPost> call = jsonPlaceHolder.getPosts();
        Call<GetPost> call = jsonPlaceHolder.getPosts(hasilScan);
//        Type collectionType = new TypeToken<Collection<GetPost>>(){}.getType();
//        Collection<GetPost> enums = gson.fromJson(yourJson, collectionType);
        call.enqueue(new Callback<GetPost>() {
            @Override
            public void onResponse(Call<GetPost> call, Response<GetPost> response) {
//                GetPost posts = (GetPost) response.body().getPtk();
//                List<GetPost.Ptk> ptk = posts.ptk;

//               List<GetPost.Ptk> ptk1 = response.body().getPtk();

               GetPost ptk = response.body();

//                displayResponse += text + " Page\n" + total + " Total\n" + totalPages + " Total Pages\n";
                System.out.println("Coaba1 "+ptk.getPtk_id());
//                System.out.println("Coaba2 "+posts);
                System.out.println("Coaba3 "+hasilScan);
                Toast.makeText(Main3Activity.this," response version "+response.body(),Toast.LENGTH_SHORT).show();
//                String co="";
//                co += "sdsd "+posts.getBaseUrl();
//                System.out.println("dsd "+co);
//                String content="";
//                content +="ptk_id "+ ptk.nama;
                System.out.println("dsd"+ptk.getStatikUrl());
                itemView.append(""+ptk.getStatikUrl()+"Selain");

//                for(GetPost pp :ptk){
//                    String content = "";
//                    content += "ptk_id " + pp.nama;
//                    itemView.append(content);
//
//                }
//                for (GetPost.Ptk ptk1 : ptk) {
//                    String content="";
//                    content +="ptk_id "+ ptk1.nama;
//                    itemView.append(content);
//                    System.out.println("Coaba "+content);
//                }

            }

            @Override
            public void onFailure(Call<GetPost> call, Throwable t) {
                System.out.println("sd2sds");
                itemView.setText(t.getMessage());
            }
        });
//        Call<List<GetPost>> call = jsonPlaceHolder.getPosts();
//        call.enqueue(new Callback<List<GetPost>>() {
//            @Override
//            public void onResponse(Call<List<GetPost>> call, Response<List<GetPost>> response) {
////                if(!response.isSuccessful()){
////                    itemView.setText("Code "+response.code());
////                    return;
////                }
//                String displayResponse;
//                GetPost posts = (GetPost) response.body();
//                List<GetPost.Ptk1> ptk = posts.ptk1;
//
////                displayResponse += text + " Page\n" + total + " Total\n" + totalPages + " Total Pages\n";
//
//                for (GetPost.Ptk1 ptk1 : ptk) {
//                    String content="";
//                    content +="ptk_id "+ ptk1.nama;
//                    itemView.append(content);
//                    System.out.println("Coaba "+content);
//                }
//
//
////                String cek="";
////                cek+="Cek "+
////               for (GetPost post : posts){
////                   String content="";
////                    content +="ptk_id "+ post.ptk1;
//////                    content +="nama "+post.getNama();
////                    itemView.append(content);
////                   System.out.println("Coaba "+content);
////                }
//            }
//
//            @Override
//            public void onFailure(Call<List<GetPost>> call, Throwable t) {
//                System.out.println("sdsds");
//                itemView.setText(t.getMessage());
//            }
//        });
    }
}
