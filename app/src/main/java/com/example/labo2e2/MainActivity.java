package com.example.labo2e2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView a,b,c,d,e,f,g,h,i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.img1);
        b = findViewById(R.id.img2);
        c = findViewById(R.id.img3);
        d = findViewById(R.id.img4);
        e = findViewById(R.id.img5);
        f = findViewById(R.id.img6);
        g = findViewById(R.id.img7);
        h = findViewById(R.id.img8);
        i = findViewById(R.id.img9);

        final int drawables[] = {R.drawable.a,R.drawable.b,R.drawable.c};

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                a.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                b.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                c.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                d.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                e.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                f.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                g.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                h.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                i.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });
    }
}
