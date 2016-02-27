package com.inspiredandroid.linuxcommandbibliotheca.view;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.interfaces.ClickInterface;

/**
 * Created by Simon Schubert
 * <p>
 * This View makes it very easy to highlightQueryInsideText defined commands in an normal textview. Define the
 * words which should be highlighted in an string array and link it in the layout resource.
 */
public class ClickableTextView extends TextView {

    private ClickInterface mClickInterface;

    public ClickableTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (isInEditMode()) {
            return;
        }

        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(Color.TRANSPARENT);
    }

    /**
     * Loop through text and add a clickable at each point the phrase occurs
     *
     * @param ss
     * @param text
     * @param phrase
     * @param clickInterface
     */
    public static void addClickableSpanToPhrases(SpannableString ss, String text, String phrase, final ClickInterface clickInterface) {
        // would end in endless loop
        if (phrase.isEmpty()) {
            return;
        }

        int indexStart = 0;

        while (text.indexOf(phrase, indexStart) != -1) {

            indexStart = text.indexOf(phrase, indexStart);
            int indexEnd = indexStart + phrase.length();

            ClickableSpan clickableSpan = new ClickableSpan() {
                @Override
                public void onClick(View textView) {
                    clickInterface.onClick();
                }

                @Override
                public void updateDrawState(TextPaint ds) {
                    super.updateDrawState(ds);
                    ds.setUnderlineText(false);
                }
            };

            ss.setSpan(clickableSpan, indexStart, indexEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            indexStart++;
        }
    }

    /**
     * Set clickable word
     *
     * @param word
     */
    public void setClickableWord(String word) {
        setText(createSpannable(getText().toString(), word));
    }

    /**
     * Set ClickInterface
     *
     * @param clickInterface
     */
    public void setClickInterface(ClickInterface clickInterface) {
        this.mClickInterface = clickInterface;
    }

    /**
     * Highlights commands of the text and make them clickable
     *
     * @param text spannable content
     * @param word the word which should get highlighted
     * @return
     */
    private SpannableString createSpannable(String text, final String word) {
        SpannableString ss = new SpannableString(text);

        ClickableTextView.addClickableSpanToPhrases(ss, text, word, mClickInterface);

        return ss;
    }

}