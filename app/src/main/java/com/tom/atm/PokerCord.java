package com.tom.atm;

import android.content.Context;
import android.media.Image;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class PokerCord extends ConstraintLayout {
    int value;
    private ImageView image;
    private TextView left;
    private TextView right;

    public PokerCord(Context context){
        super(context);
    }

    public PokerCord(Context context, AttributeSet attrs){
        super(context);
        inflate(context, R.layout.poker, this);
        image = findViewById(R.id.type);
        left = findViewById(R.id.left_num);
        right = findViewById(R.id.right_num);
    }
}
