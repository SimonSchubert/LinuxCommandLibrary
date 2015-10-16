package com.inspiredandroid.linuxcommandbibliotheca.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;

public class CodeTextView extends TextView {

    public CodeTextView(Context context, AttributeSet attrs)
    {
        super(context, attrs);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.CodeTextView);
        int resID = ta.getResourceId(R.styleable.CodeTextView_commands, R.array.default_codetextview_cmmands);
        String[] commands = context.getResources().getStringArray(resID);
        ta.recycle();

        if(isInEditMode())
            return;

        setText(createSpannable(getText().toString(), commands));
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(Color.TRANSPARENT);
    }

    private SpannableString createSpannable(String text, String[] commands)
    {
        SpannableString ss = new SpannableString(text);

        for (final String command : commands) {

            int indexStart = 0;
            while(text.indexOf(command, indexStart) != -1) {

                indexStart = text.indexOf(command, indexStart);
                int indexEnd = indexStart + command.length();

                ClickableSpan clickableSpan = new ClickableSpan() {
                    @Override
                    public void onClick(View textView)
                    {
                        startCommandManActivity(command);
                    }

                    @Override
                    public void updateDrawState(TextPaint ds)
                    {
                        super.updateDrawState(ds);
                        ds.setUnderlineText(false);
                    }
                };
                ss.setSpan(clickableSpan, indexStart, indexEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                indexStart++;
            }
        }

        return ss;
    }

    private void startCommandManActivity(String command)
    {
        Intent intent = new Intent(getContext(), CommandManActivity.class);
        Bundle b = new Bundle();
        b.putString(CommandManActivity.EXTRA_COMMAND_NAME, command);
        intent.putExtras(b);

        getContext().startActivity(intent);
    }
}