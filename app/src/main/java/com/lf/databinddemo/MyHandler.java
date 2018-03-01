package com.lf.databinddemo;

import android.view.View;
import android.widget.Toast;

/**
 * @author 诸葛不亮
 * @version 1.0
 * @description
 */

public class MyHandler {
    public void myOnClick(View view){
        Toast.makeText(view.getContext(),"hello",Toast.LENGTH_SHORT).show();
    }
}