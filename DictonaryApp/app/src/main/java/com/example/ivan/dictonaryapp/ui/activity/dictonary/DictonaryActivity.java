package com.example.ivan.dictonaryapp.ui.activity.dictonary;

import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.ivan.dictonaryapp.R;
import com.example.ivan.dictonaryapp.presentation.presenter.dictonary.DictonaryPresenter;
import com.example.ivan.dictonaryapp.presentation.view.dictonary.DictonaryView;

public class DictonaryActivity extends MvpAppCompatActivity implements DictonaryView {

    @InjectPresenter
    DictonaryPresenter dictonaryPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictonary);
    }
}
