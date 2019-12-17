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
        super(context, attrs);
        inflate(context, R.layout.poker, this);
        image = findViewById(R.id.type);
        left = findViewById(R.id.left_num);
        right = findViewById(R.id.right_num);
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
        int flowertype = value/13;
        int point = (value%13)+1;
        switch (flowertype){
            case 0:
                image.setImageResource(R.drawable.clubs);
                break;
            case 1:
                image.setImageResource(R.drawable.diamonds);
                break;
            case 2:
                image.setImageResource(R.drawable.hearts);
                break;
            case 3:
                image.setImageResource(R.drawable.spades);
                break;
        }
        left.setText(point+"");
        right.setText(point+"");
    }
}
