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

import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnClickLinkListener

/* Copyright 2019 Simon Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
class ClickableTextView(context: Context, attrs: AttributeSet) : AppCompatTextView(context, attrs) {

    private var mOnLinkClickListener: OnClickLinkListener? = null

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
     * Set OnClickLinkListener
     *
     * @param onLinkClickListener
     */
    fun setClickInterface(onLinkClickListener: OnClickLinkListener) {
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

        addClickableSpanToPhrases(spannableString, text, word, mOnLinkClickListener)

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
        fun addClickableSpanToPhrases(ss: SpannableString, text: String, phrase: String, listener: OnClickLinkListener?) {
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
                        listener?.onClickLink()
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