package com.inspiredandroid.linuxcommandbibliotheca.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.misc.FragmentCoordinator;
import com.inspiredandroid.linuxcommandbibliotheca.misc.TypefaceUtils;

/**
 * Created by Simon Schubert
 * <p/>
 * This View makes it very easy to highlightQueryInsideText defined mCommands in an normal textview. Define the
 * mCommands which should be highlighted in an string array and link it in the layout resource as
 * "command".
 */
public class TerminalTextView extends AppCompatTextView {

    private String[] mCommands;
    private int[] mOutputRows;

    public TerminalTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.TerminalTextView);
        int resID = ta.getResourceId(R.styleable.TerminalTextView_commands, R.array.default_codetextview_commands);
        int outputRowsResID = ta.getResourceId(R.styleable.TerminalTextView_outputRows, R.array.default_codetextview_commands);
        mCommands = context.getResources().getStringArray(resID);
        mOutputRows = context.getResources().getIntArray(outputRowsResID);
        boolean mIgnoreTerminalStyle = ta.getBoolean(R.styleable.TerminalTextView_ignoreTerminalStyle, false);
        ta.recycle();

        if (isInEditMode()) {
            return;
        }

        updateLinks();
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(Color.TRANSPARENT);

        if (!mIgnoreTerminalStyle) {
            Typeface typeface = TypefaceUtils.getTypeFace(getContext());
            setTypeface(typeface);
        }
    }

    /**
     * Set clickable man pages(mCommands)
     *
     * @param commands
     */
    public void setCommands(String[] commands) {
        mCommands = commands;
        updateLinks();
    }

    /**
     * Mark man pages(mCommands) clickable
     */
    private void updateLinks() {
        setText(createSpannable(getText().toString(), mCommands));
    }

    /**
     * Highlights Commands of the text and make them clickable
     *
     * @param text     spannable content
     * @param commands list of mCommands to highlightQueryInsideText
     * @return
     */
    private SpannableString createSpannable(String text, String[] commands) {
        SpannableString ss = new SpannableString(text);

        for (final String command : commands) {
            ClickableTextView.addClickableSpanToPhrases(ss, text, command, () ->
                    FragmentCoordinator.startCommandManActivity(getActivity(), command));
        }


        addItalicSpans(ss, text);
        addOutputSpans(ss, text);

        return ss;
    }

    private FragmentActivity getActivity() {
        Context context = getContext();
        while (context instanceof ContextWrapper) {
            if (context instanceof FragmentActivity) {
                return (FragmentActivity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /**
     * @param ss
     * @param text
     */
    private void addOutputSpans(SpannableString ss, String text) {
        if (mOutputRows.length == 0) {
            return;
        }

        String lines[] = text.split("\\r?\\n");
        int start = 0;
        int end = 0;

        for (int i = 0; i < lines.length; i++) {
            end += lines[i].length();
            if (doesArrayContainsInt(mOutputRows, i)) {
                if (start < 0 || end < 0 || start >= end) {
                    break;
                }
                ss.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.grey)), start, end, 0);
            }
            end += 1;
            start = end;
        }
    }

    /**
     * @param array
     * @param value
     * @return
     */
    private boolean doesArrayContainsInt(int[] array, int value) {
        for (int anArray : array) {
            if (anArray == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Make placeholder text italic
     *
     * @param ss
     * @param text
     */
    private void addItalicSpans(SpannableString ss, String text) {
        int indexStart = 0;
        while (text.indexOf("[", indexStart) != -1) {
            int start = text.indexOf("[", indexStart);
            int end = text.indexOf("]", indexStart);
            if (start < 0 || end < 0 || start >= end) {
                break;
            }
            ss.setSpan(new StyleSpan(Typeface.ITALIC), start, end + 1, 0);
            indexStart = end + 1;
        }
    }
}