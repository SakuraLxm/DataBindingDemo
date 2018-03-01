package com.lf.databinddemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lf.databinddemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        Test test = new Test();
        test.setAge(12+"");
        test.setName("nihao");
        binding.setTest(test);

    }



    public interface OnClickListener {
        void onClick(View v);
    }


}
