package com.example.galleryapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MotionEvent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    ArrayList<ImageModel> imageData = new ArrayList<>();

    RecyclerView recyclerView;

    public String imageUrls[] = {
            "https://i.pinimg.com/originals/ec/3f/6e/ec3f6e897cc1fb624628ab1a1c0d6ab8.jpg",
            "https://i.pinimg.com/736x/b9/e2/59/b9e2595e01e6dafd9b7182699e292fba--gal-gadot-wonder-woman.jpg",
            "https://i.pinimg.com/originals/5a/8a/5d/5a8a5d7533bf7b82f51680d76e677240.jpg",
            "https://s-media-cache-ak0.pinimg.com/736x/25/b8/4d/25b84d299a81e8c1e1f8b2d75a27153b.jpg",
            "https://worldblazeblog.files.wordpress.com/2017/03/rachel-weisz.jpg",
            "https://worldblazeblog.files.wordpress.com/2017/03/salma-hayek.jpg",
            "https://www.worldblaze.in/wp-content/uploads/2015/02/Charlize-Theron.jpg",
            "https://worldblazeblog.files.wordpress.com/2017/03/eva-green.jpg",
            "https://www.worldblaze.in/wp-content/uploads/2015/02/Emma-Stone.jpg",
            "https://www.worldblaze.in/wp-content/uploads/2015/02/Scarlett-Johansson.jpeg",
            "https://pickytop.com/wp-content/uploads/2019/06/gal-gadot-2017-4k-3o-1-1024x747.jpg",
            "https://pickytop.com/wp-content/uploads/2019/06/free-emma-watson-wallpapers-2018-1920x1080-1-1024x576.jpg",
            "https://pickytop.com/wp-content/uploads/2019/06/1257548-1920x1200-quality-scarlett-johansson-wallpaper-1-1024x640.jpg",
            "https://pickytop.com/wp-content/uploads/2019/06/Natalie_Portman-1024x768.jpg",
            "https://www.theyouth.in/wp-content/uploads/2019/12/Scarlett-Johansson-1024x640.jpg",
            "https://www.theyouth.in/wp-content/uploads/2019/12/Emma-Roberts-728x546.jpg",
            "https://www.theyouth.in/wp-content/uploads/2019/12/Alexandra-Daddario-1024x661.jpg",
            "https://img.starbiz.com/resize/750x-/2020/02/11/francia-raisa-5f35.jpg",
            "https://img.starbiz.com/resize/750x-/2020/02/11/amber-heard-2a66.jpg",
            "https://img.starbiz.com/resize/750x-/2020/02/11/imogen-poots-1188.jpg",
            "https://img.starbiz.com/resize/750x-/2020/02/11/scarlett-johansson-78a5.jpg",
            "https://img.starbiz.com/resize/750x-/2020/02/11/17-margot-robbie-0f7f.jpg",
            "https://img.starbiz.com/resize/750x-/2020/02/11/emma-roberts-8de3.jpg",
            "https://img.starbiz.com/resize/750x-/2020/02/11/chloe-grace-moretz-ce26.jpg",
            "https://img.starbiz.com/resize/750x-/2020/02/11/ariel-winter-5bd8.jpg"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int i=1;

        for(String url: imageUrls){
            ImageModel imageModel = new ImageModel();
            imageModel.setImageName("Image "+ i++);
            imageModel.setImageUrl(url);
            imageData.add(imageModel);
        }

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setHasFixedSize(true);
        ListAdapter listAdapter = new ListAdapter(imageData,MainActivity.this);
        recyclerView.setAdapter(listAdapter);

    }
}
