package com.example.animationtest;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

import com.example.animationtest.databinding.ActivityMainBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CountDownTimer timer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.img1.setImageResource(R.drawable.blue_dot);

        timer = new CountDownTimer(5250, 250) {
            @Override
            public void onTick(long value) {
                long count = value / 250;
                changeColor(count);
            }

            @Override
            public void onFinish() {
                binding.img1.setImageResource(R.drawable.blue_dot);
                timer.start();
            }
        };
        timer.start();
    }

    public void changeColor(long position) {
        if (position == 21) {
            binding.img19.setImageResource(R.drawable.transparent_dot);
            binding.img20.setImageResource(R.drawable.red_dot);
            binding.img21.setImageResource(R.drawable.green_dot);
            binding.img1.setImageResource(R.drawable.blue_dot);
        } else if (position == 20) {
            binding.img20.setImageResource(R.drawable.transparent_dot);
            binding.img21.setImageResource(R.drawable.red_dot);
            binding.img1.setImageResource(R.drawable.green_dot);
            binding.img2.setImageResource(R.drawable.blue_dot);
        } else if (position == 19) {
            binding.img21.setImageResource(R.drawable.transparent_dot);
            binding.img1.setImageResource(R.drawable.red_dot);
            binding.img2.setImageResource(R.drawable.green_dot);
            binding.img3.setImageResource(R.drawable.blue_dot);
        } else if (position == 18) {
            binding.img1.setImageResource(R.drawable.transparent_dot);
            binding.img2.setImageResource(R.drawable.red_dot);
            binding.img3.setImageResource(R.drawable.green_dot);
            binding.img4.setImageResource(R.drawable.blue_dot);
        } else if (position == 17) {
            binding.img2.setImageResource(R.drawable.transparent_dot);
            binding.img3.setImageResource(R.drawable.red_dot);
            binding.img4.setImageResource(R.drawable.green_dot);
            binding.img5.setImageResource(R.drawable.blue_dot);
        } else if (position == 16) {
            binding.img3.setImageResource(R.drawable.transparent_dot);
            binding.img4.setImageResource(R.drawable.red_dot);
            binding.img5.setImageResource(R.drawable.green_dot);
            binding.img6.setImageResource(R.drawable.blue_dot);
        } else if (position == 15) {
            binding.img4.setImageResource(R.drawable.transparent_dot);
            binding.img5.setImageResource(R.drawable.red_dot);
            binding.img6.setImageResource(R.drawable.green_dot);
            binding.img7.setImageResource(R.drawable.blue_dot);
        } else if (position == 14) {
            binding.img5.setImageResource(R.drawable.transparent_dot);
            binding.img6.setImageResource(R.drawable.red_dot);
            binding.img7.setImageResource(R.drawable.green_dot);
            binding.img8.setImageResource(R.drawable.blue_dot);
        } else if (position == 13) {
            binding.img6.setImageResource(R.drawable.transparent_dot);
            binding.img7.setImageResource(R.drawable.red_dot);
            binding.img8.setImageResource(R.drawable.green_dot);
            binding.img9.setImageResource(R.drawable.blue_dot);
        } else if (position == 12) {
            binding.img7.setImageResource(R.drawable.transparent_dot);
            binding.img8.setImageResource(R.drawable.red_dot);
            binding.img9.setImageResource(R.drawable.green_dot);
            binding.img10.setImageResource(R.drawable.blue_dot);
        } else if (position == 11) {
            binding.img8.setImageResource(R.drawable.transparent_dot);
            binding.img9.setImageResource(R.drawable.red_dot);
            binding.img10.setImageResource(R.drawable.green_dot);
            binding.img11.setImageResource(R.drawable.blue_dot);
        } else if (position == 10) {
            binding.img9.setImageResource(R.drawable.transparent_dot);
            binding.img10.setImageResource(R.drawable.red_dot);
            binding.img11.setImageResource(R.drawable.green_dot);
            binding.img12.setImageResource(R.drawable.blue_dot);
        } else if (position == 9) {
            binding.img10.setImageResource(R.drawable.transparent_dot);
            binding.img11.setImageResource(R.drawable.red_dot);
            binding.img12.setImageResource(R.drawable.green_dot);
            binding.img13.setImageResource(R.drawable.blue_dot);
        } else if (position == 8) {
            binding.img11.setImageResource(R.drawable.transparent_dot);
            binding.img12.setImageResource(R.drawable.red_dot);
            binding.img13.setImageResource(R.drawable.green_dot);
            binding.img14.setImageResource(R.drawable.blue_dot);
        } else if (position == 7) {
            binding.img12.setImageResource(R.drawable.transparent_dot);
            binding.img13.setImageResource(R.drawable.red_dot);
            binding.img14.setImageResource(R.drawable.green_dot);
            binding.img15.setImageResource(R.drawable.blue_dot);
        } else if (position == 6) {
            binding.img13.setImageResource(R.drawable.transparent_dot);
            binding.img14.setImageResource(R.drawable.red_dot);
            binding.img15.setImageResource(R.drawable.green_dot);
            binding.img16.setImageResource(R.drawable.blue_dot);
        } else if (position == 5) {
            binding.img14.setImageResource(R.drawable.transparent_dot);
            binding.img15.setImageResource(R.drawable.red_dot);
            binding.img16.setImageResource(R.drawable.green_dot);
            binding.img17.setImageResource(R.drawable.blue_dot);
        } else if (position == 4) {
            binding.img15.setImageResource(R.drawable.transparent_dot);
            binding.img16.setImageResource(R.drawable.red_dot);
            binding.img17.setImageResource(R.drawable.green_dot);
            binding.img18.setImageResource(R.drawable.blue_dot);
        } else if (position == 3) {
            binding.img16.setImageResource(R.drawable.transparent_dot);
            binding.img17.setImageResource(R.drawable.red_dot);
            binding.img18.setImageResource(R.drawable.green_dot);
            binding.img19.setImageResource(R.drawable.blue_dot);
        } else if (position == 2) {
            binding.img17.setImageResource(R.drawable.transparent_dot);
            binding.img18.setImageResource(R.drawable.red_dot);
            binding.img19.setImageResource(R.drawable.green_dot);
            binding.img20.setImageResource(R.drawable.blue_dot);
        } else if (position == 1) {
            binding.img18.setImageResource(R.drawable.transparent_dot);
            binding.img19.setImageResource(R.drawable.red_dot);
            binding.img20.setImageResource(R.drawable.green_dot);
            binding.img21.setImageResource(R.drawable.blue_dot);
        } else if (position == 0){
            binding.img19.setImageResource(R.drawable.transparent_dot);
            binding.img20.setImageResource(R.drawable.red_dot);
            binding.img21.setImageResource(R.drawable.green_dot);
            binding.img1.setImageResource(R.drawable.blue_dot);
        }
    }
}
