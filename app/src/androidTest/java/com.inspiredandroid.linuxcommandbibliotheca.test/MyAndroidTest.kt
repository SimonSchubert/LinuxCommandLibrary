package com.inspiredandroid.linuxcommandbibliotheca.test

import android.content.Context
import android.content.Intent
import android.support.test.InstrumentationRegistry.getInstrumentation
import android.support.test.rule.ActivityTestRule
import com.inspiredandroid.linuxcommandbibliotheca.AboutActivity
import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.models.Command
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandManModel
import io.realm.Realm
import io.realm.kotlin.where
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Rule
import org.junit.Test
import java.util.*

/**
 * Class to com.inspiredandroid.linuxcommandbibliotheca.test Android com.inspiredandroid.linuxcommandbibliotheca.test case.
 *
 *
 * 1. Set up build version -> Android com.inspiredandroid.linuxcommandbibliotheca.test
 * 2. Execute com.inspiredandroid.linuxcommandbibliotheca.test: ./gradlew connectedCheck
 *
 *
 * Html report: [project]/[module]/build/reports/androidTests/connected/[classpath].html
 * Example path: file:///home/simon/Dev/projects/LinuxCommandBibliotheca/app/build/reports/androidTests/connected/index.html
 */
class MyAndroidTest {

    private val realm: Realm

    private val context: Context
        get() = getInstrumentation().targetContext.applicationContext

    @Rule
    @JvmField
    var aboutActivityRule = ActivityTestRule(AboutActivity::class.java, true, false)

    @Rule
    @JvmField
    var commandManActivityRule = ActivityTestRule(CommandManActivity::class.java, true, false)

    init {
        Locale.setDefault(Locale.US)
        realm = Realm.getDefaultInstance()
    }

    @Test
    fun activitiesTest() {
        aboutActivityRule.launchActivity(Intent())
        commandManActivityRule.launchActivity(Intent())
    }

    /**
     * Go thought all the man pages links of the tips fragment
     *
     * @throws Exception
     */
    @Test
    @Throws(Exception::class)
    fun testTipsManPageLinks() {
        val IDS = intArrayOf(R.array.fragment_tips_background_code_array, R.array.fragment_tips_clear_code_array, R.array.fragment_tips_history_code_array, R.array.fragment_tips_pipe_code_array, R.array.fragment_tips_redirection_code_double_greater_array, R.array.fragment_tips_redirection_code_error_output_array, R.array.fragment_tips_redirection_code_greater_array, R.array.fragment_tips_redirection_code_smaller_array, R.array.fragment_tips_background_code_array, R.array.fragment_tips_special_characters_code_backquote_array, R.array.fragment_tips_special_characters_code_brackets_array, R.array.fragment_tips_special_characters_code_comment_array, R.array.fragment_tips_special_characters_code_double_amp_array, R.array.fragment_tips_special_characters_code_double_pipe_array, R.array.fragment_tips_special_characters_code_double_quote_array, R.array.fragment_tips_special_characters_code_excelationmark_array, R.array.fragment_tips_special_characters_code_questionmark_array, R.array.fragment_tips_special_characters_code_semicolon_array, R.array.fragment_tips_special_characters_code_single_quote_array, R.array.fragment_tips_special_characters_code_square_brackets_array, R.array.fragment_tips_special_characters_code_star_array, R.array.fragment_tips_special_characters_code_substitution_array)

        val missingCommands = ArrayList<String>()
        for (id in IDS) {
            val array = context.resources.getStringArray(id)
            addMissingMansToList(missingCommands, *array)
        }

        for (man in realm.where<CommandManModel>().findAll()) {
            addMissingMansToList(missingCommands, man.man)
        }

        val missing = getReadableMissingCommands(missingCommands)

        //assertTrue("man pages not found: " + missing, missing.isEmpty());
        assertThat("man pages not found: $missing", missing.isEmpty())
    }

    /**
     * Loop thought man pages and ad to list if not found in database and not already in list
     *
     * @param missingCommands
     * @param mans
     */
    private fun addMissingMansToList(missingCommands: MutableList<String>, vararg mans: String) {
        for (man in mans) {
            val command = realm.where<Command>().equalTo(Command.NAME, man).findFirst()
            if (command == null) {
                if (!missingCommands.contains(man)) {
                    missingCommands.add(man)
                }
            }
        }
    }

    /**
     * convert arraylist to human readable output
     *
     * @param missingCommands
     * @return
     */
    private fun getReadableMissingCommands(missingCommands: ArrayList<String>): String {
        val missing = StringBuilder()
        for (m in missingCommands) {
            missing.append(m).append(" ")
        }
        return missing.toString()
    }

    @Test
    fun CommandsTest() {
        val commands = realm.where<Command>().findAll()

        for (command in commands.subList(0, 10)) {
            val intent = Intent(context, CommandManActivity::class.java)
            intent.putExtra(CommandManActivity.EXTRA_COMMAND_ID, command.id)
            val activity = commandManActivityRule.launchActivity(intent)

            try {
                Thread.sleep(1000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

            activity.finish()
        }
    }
}