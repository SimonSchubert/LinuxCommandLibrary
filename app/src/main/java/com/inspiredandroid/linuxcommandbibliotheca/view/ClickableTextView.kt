package com.inspiredandroid.linuxcommandbibliotheca.view

import android.content.Context
import android.graphics.Color
import android.support.v7.widget.AppCompatTextView
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.util.AttributeSet
import android.view.View

import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnLinkClickListener

/**
 * Created by Simon Schubert
 *
 *
 * This View makes it very easy to highlightQueryInsideText defined commands in an normal textview. Define the
 * words which should be highlighted in an string array and link it in the layout resource.
 */
class ClickableTextView(context: Context, attrs: AttributeSet) : AppCompatTextView(context, attrs) {

    private var mOnLinkClickListener: OnLinkClickListener? = null

    init {
        if (!isInEditMode) {
            movementMethod = LinkMovementMethod.getInstance()
            highlightColor = Color.TRANSPARENT
        }
    }

    /**
     * Set clickable word
     *
     * @param word
     */
    fun setClickableWord(word: String) {
        text = createSpannable(text.toString(), word)
    }

    /**
     * Set OnLinkClickListener
     *
     * @param onLinkClickListener
     */
    fun setClickInterface(onLinkClickListener: OnLinkClickListener) {
        mOnLinkClickListener = onLinkClickListener
    }

    /**
     * Highlights commands of the text and make them clickable
     *
     * @param text spannable content
     * @param word the word which should get highlighted
     * @return
     */
    private fun createSpannable(text: String, word: String): SpannableString {
        val spannableString = SpannableString(text)

        ClickableTextView.addClickableSpanToPhrases(spannableString, text, word, mOnLinkClickListener)

        return spannableString
    }

    companion object {

        /**
         * Loop through text and ad a clickable at each point the phrase occurs
         *
         * @param ss
         * @param text
         * @param phrase
         */
        fun addClickableSpanToPhrases(ss: SpannableString, text: String, phrase: String, listener: OnLinkClickListener?) {
            // would end in endless loop
            if (phrase.isEmpty()) {
                return
            }

            var indexStart = 0
            while (text.indexOf(phrase, indexStart) != -1) {
                indexStart = text.indexOf(phrase, indexStart)
                val indexEnd = indexStart + phrase.length

                val clickableSpan = object : ClickableSpan() {
                    override fun onClick(textView: View) {
                        listener?.onLinkClick()
                    }

                    override fun updateDrawState(ds: TextPaint) {
                        super.updateDrawState(ds)
                        ds.isUnderlineText = false
                    }
                }

                if (indexStart == -1 || indexEnd == -1) {
                    break
                }

                ss.setSpan(clickableSpan, indexStart, indexEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                indexStart++
            }
        }
    }

}