package com.flange.aodhan.assessmentproject;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer fired = MediaPlayer.create(this, R.raw.fired);
        final MediaPlayer dontbeerude = MediaPlayer.create(this, R.raw.dontberude);
        final MediaPlayer dnkwhy = MediaPlayer.create(this, R.raw.dontknowwhy);
        final MediaPlayer dontremeber = MediaPlayer.create(this, R.raw.dontrememeber);
        final MediaPlayer wall = MediaPlayer.create(this, R.raw.wall10feet);
        final MediaPlayer anynews = MediaPlayer.create(this, R.raw.anythingnew);
        final MediaPlayer beauty = MediaPlayer.create(this, R.raw.beauty);
        final MediaPlayer goahead = MediaPlayer.create(this, R.raw.goahead);
        final MediaPlayer godbless = MediaPlayer.create(this, R.raw.godbless);
        final MediaPlayer greatwall = MediaPlayer.create(this, R.raw.greatwall);
        final MediaPlayer herestheproblem = MediaPlayer.create(this, R.raw.herestheproblem);
        final MediaPlayer hilary = MediaPlayer.create(this, R.raw.hilary);
        final MediaPlayer lotsa = MediaPlayer.create(this, R.raw.lotofabuse);
        final MediaPlayer niceperson = MediaPlayer.create(this, R.raw.niceperson);

        final MediaPlayer noiraq = MediaPlayer.create(this, R.raw.noiraq);
        final MediaPlayer norespect = MediaPlayer.create(this, R.raw.norespect);
        final MediaPlayer nohilary = MediaPlayer.create(this, R.raw.notwithhilary);
        final MediaPlayer quiet = MediaPlayer.create(this, R.raw.quiet);
        final MediaPlayer somebodyfromchina = MediaPlayer.create(this, R.raw.somebodyfromchina);

        final MediaPlayer thasok = MediaPlayer.create(this, R.raw.thasok);
        final MediaPlayer getmeintrouble = MediaPlayer.create(this, R.raw.thisonesgoingtogetmeintrouble);
        final MediaPlayer trouble = MediaPlayer.create(this, R.raw.trouble);
        final MediaPlayer wheresyerdaddy = MediaPlayer.create(this, R.raw.wheresyerdaddy);
        final MediaPlayer youdonteven = MediaPlayer.create(this, R.raw.youdontevenknow);


        final Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                fired.start();

                button1.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dontbeerude.start();

                button2.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dnkwhy.start();

                button3.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dontremeber.start();

                button4.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button5 = (Button) findViewById(R.id.button12);
        button5.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                wall.start();

                button5.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button6 = (Button) findViewById(R.id.button13);
        button6.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                anynews.start();

                button6.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button7 = (Button) findViewById(R.id.button14);
        button7.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                beauty.start();

                button7.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                goahead.start();

                button15.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                godbless.start();

                button16.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                greatwall.start();

                button17.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                herestheproblem.start();

                button18.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                hilary.start();

                button19.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                lotsa.start();

                button20.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                niceperson.start();

                button21.setBackgroundResource(R.drawable.fleg);
            }
        });

        final Button button22 = (Button) findViewById(R.id.button22);
        button22.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                noiraq.start();

                button22.setBackgroundResource(R.drawable.fleg);
            }
        });

        final Button button33 = (Button) findViewById(R.id.button33);
        button33.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                nohilary.start();

                button33.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button32 = (Button) findViewById(R.id.button32);
        button32.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                quiet.start();

                button32.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button31 = (Button) findViewById(R.id.button31);
        button31.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                somebodyfromchina.start();

                button31.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button34 = (Button) findViewById(R.id.button34);
        button34.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                thasok.start();

                button34.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button35 = (Button) findViewById(R.id.button35);
        button35.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getmeintrouble.start();

                button35.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button36 = (Button) findViewById(R.id.button36);
        button36.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                trouble.start();

                button36.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button37 = (Button) findViewById(R.id.button37);
        button37.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                norespect.start();

                button37.setBackgroundResource(R.drawable.fleg);
            }
        });
        final Button button38 = (Button) findViewById(R.id.button38);
        button38.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                youdonteven.start();

                button38.setBackgroundResource(R.drawable.fleg);
            }
        });

        final Button button39 = (Button) findViewById(R.id.button39);
        button39.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                wheresyerdaddy.start();

                button39.setBackgroundResource(R.drawable.fleg);
            }
        });

        final Button middlebut = (Button) findViewById(R.id.middlebut);
        middlebut.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7DRL6ocEK-M")));
                Log.i("Video", "Video Playing....");

                middlebut.setBackgroundColor(Color.RED);
            }
        });
        final Button prevent = (Button) findViewById(R.id.prevent);
        prevent.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SecondAct.class);
                MainActivity.this.startActivity(myIntent);

                prevent.setBackgroundColor(Color.RED);
            }
        });

    }
}
