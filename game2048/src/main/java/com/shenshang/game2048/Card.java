package com.shenshang.game2048;

import android.content.Context;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by ShenShang on 2016/12/17.
 */

public class Card extends FrameLayout {
    private TextView label;

    public Card(Context context) {
        super(context);

        label = new TextView(getContext());
        label.setTextSize(36);
        //label.setBackgroundColor(0x33ffffff);
        label.setGravity(Gravity.CENTER);
        LayoutParams lp = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);//
        lp.setMargins(20, 20, 0, 0);//为什么不生效呢?

        label.setLayoutParams(lp);
        addView(label);

    }
/*
    public Card(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Card(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }*/

    private int num = 0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;

        if (num <= 0) {
            label.setText("");
        } else {
            label.setText("" + num);
        }
        switch (num) {
            case 0:
                label.setBackgroundColor(0x33ffffff);
                break;
            case 2:
                label.setBackgroundColor(0xffcccccc);
                break;
            case 4:
                label.setBackgroundColor(0xffccc66c);
                break;
            case 8:
                label.setBackgroundColor(0xff0fcccc);
                break;
            case 16:
                label.setBackgroundColor(0xffc0ccaa);
                break;
            case 32:
                label.setBackgroundColor(0xffcc45cc);
                break;
            case 64:
                label.setBackgroundColor(0xffcc36cc);
                break;
            case 128:
                label.setBackgroundColor(0x6f2945cc);
            case 256:
                label.setBackgroundColor(0xff2945c9);
            case 512:
                label.setBackgroundColor(0xf429a5cc);
            case 1024:
                label.setBackgroundColor(0xf1294fcc);
            case 2048:
                label.setBackgroundColor(0x6f2925fc);
                break;
            default:
                break;
        }


    }

    public boolean equals(Card o) {
        return getNum() == o.getNum();
    }


}
