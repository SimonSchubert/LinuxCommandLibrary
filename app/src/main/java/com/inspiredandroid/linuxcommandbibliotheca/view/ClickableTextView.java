package com.inspiredandroid.linuxcommandbibliotheca.view;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;

import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnLinkClickListener;

/**
 * Created by Simon Schubert
 * <p/>
 * This View makes it very easy to highlightQueryInsideText defined commands in an normal textview. Define the
 * words which should be highlighted in an string array and link it in the layout resource.
 */
public class ClickableTextView extends AppCompatTextView {

    private OnLinkClickListener mOnLinkClickListener;

    public ClickableTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (isInEditMode()) {
            return;
        }

        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(Color.TRANSPARENT);
    }

    /**
     * Loop through text and ad a clickable at each point the phrase occurs
     *
     * @param ss
     * @param text
     * @param phrase
     * @param onLinkClickListener
     */
    public static void addClickableSpanToPhrases(SpannableString ss, String text, String phrase, final OnLinkClickListener onLinkClickListener) {
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
                    onLinkClickListener.onLinkClick();
                }

                @Override
                public void updateDrawState(TextPaint ds) {
                    super.updateDrawState(ds);
                    ds.setUnderlineText(false);
                }
            };

            if (indexStart == -1 || indexEnd == -1) {
                break;
            }

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
     * Set OnLinkClickListener
     *
     * @param onLinkClickListener
     */
    public void setClickInterface(OnLinkClickListener onLinkClickListener) {
        mOnLinkClickListener = onLinkClickListener;
    }

    /**
     * Highlights commands of the text and make them clickable
     *
     * @param text spannable content
     * @param word the word which should get highlighted
     * @return
     */
    private SpannableString createSpannable(String text, final String word) {
        SpannableString spannableString = new SpannableString(text);

        ClickableTextView.addClickableSpanToPhrases(spannableString, text, word, mOnLinkClickListener);

        return spannableString;
    }

}