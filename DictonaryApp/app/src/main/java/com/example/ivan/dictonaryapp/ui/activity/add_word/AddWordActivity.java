package com.example.ivan.dictonaryapp.ui.activity.add_word;

import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.ivan.dictonaryapp.R;
import com.example.ivan.dictonaryapp.presentation.presenter.add_word.AddWordPresenter;

import com.example.ivan.dictonaryapp.presentation.view.add_word.AddWordView;

public class AddWordActivity extends MvpAppCompatActivity implements AddWordView {

    @InjectPresenter
    AddWordPresenter addWordPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);
    }
}
