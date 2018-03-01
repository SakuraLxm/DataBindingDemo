package com.lf.databinddemo;

import android.util.Log;
import android.view.View;

/**
 * @author 诸葛不亮
 * @version 1.0
 * @description
 */

public class Test {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String age;


    public void testOnclick(View view){
        Log.e("1","111");
    }
}
