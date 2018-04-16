package com.dhq.kotlindemo.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.dhq.kotlindemo.R

abstract class BaseActivity : AppCompatActivity() {

    var content: FrameLayout? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base);
        content = findViewById(R.id.fl_base_content);
        LayoutInflater.from(this).inflate(getLayoutId(), content)

        initView();

    }


    abstract fun getLayoutId(): Int;

    abstract fun initView();

}
