package com.inspiredandroid.linuxcommandbibliotheca.view

import android.content.Context
import android.content.ContextWrapper
import android.graphics.Color
import android.graphics.Typeface
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity

import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnClickLinkListener
import com.inspiredandroid.linuxcommandbibliotheca.misc.FragmentCoordinator

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
class TerminalTextView(context: Context, attrs: AttributeSet) : AppCompatTextView(context, attrs) {

    private var commands: Array<String> = arrayOf()
    private val outputRows: IntArray

    private val activity: FragmentActivity?
        get() {
            var context = context
            while (context is ContextWrapper) {
                if (context is FragmentActivity) {
                    return context
                }
                context = context.baseContext
            }
            return null
        }

    init {
        val ta = context.obtainStyledAttributes(attrs, R.styleable.TerminalTextView)
        val resID = ta.getResourceId(R.styleable.TerminalTextView_commands, R.array.default_codetextview_commands)
        val outputRowsResID = ta.getResourceId(R.styleable.TerminalTextView_outputRows, R.array.default_codetextview_commands)
        commands = context.resources.getStringArray(resID)
        outputRows = context.resources.getIntArray(outputRowsResID)
        ta.recycle()

        if (!isInEditMode) {
            updateLinks()
            movementMethod = LinkMovementMethod.getInstance()
            highlightColor = Color.TRANSPARENT
        }
    }

    /**
     * Set clickable man pages(commands)
     *
     * @param commands
     */
    fun setCommands(commands: Array<String>) {
        this.commands = commands
        updateLinks()
    }

    /**
     * Mark man pages(commands) clickable
     */
    private fun updateLinks() {
        text = createSpannable(text.toString(), commands)
    }

    /**
     * Highlights Commands of the text and make them clickable
     *
     * @param text     spannable content
     * @param commands list of commands to highlightQueryInsideText
     * @return
     */
    private fun createSpannable(text: String, commands: Array<String>): SpannableString {
        val ss = SpannableString(text)

        for (command in commands) {
            val listener = object : OnClickLinkListener {
                override fun onClickLink() {
                    FragmentCoordinator.startCommandManActivity(activity, command)
                }
            }
            ClickableTextView.addClickableSpanToPhrases(ss, text, command, listener)
        }

        addItalicSpans(ss, text)
        addOutputSpans(ss, text)

        return ss
    }

    /**
     * @param ss
     * @param text
     */
    private fun addOutputSpans(ss: SpannableString, text: String) {
        if (outputRows.isEmpty()) {
            return
        }

        val lines = text.split("\\r?\\n".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var start = 0
        var end = 0

        for (i in lines.indices) {
            end += lines[i].length
            if (outputRows.any { it == i }) {
                ss.setSpan(ForegroundColorSpan(ContextCompat.getColor(context, R.color.grey)), start, end, 0)
            }
            end += 1
            start = end
        }
    }

    /**
     * Make placeholder text italic
     *
     * @param ss
     * @param text
     */
    private fun addItalicSpans(ss: SpannableString, text: String) {
        var indexStart = 0
        while (text.indexOf("[", indexStart) != -1) {
            val start = text.indexOf("[", indexStart)
            val end = text.indexOf("]", indexStart)
            if (start == -1 || end == -1 || start >= end) {
                break
            }
            ss.setSpan(StyleSpan(Typeface.ITALIC), start, end + 1, 0)
            indexStart = end + 1
        }
    }
}