package com.inspiredandroid.linuxcommandbibliotheca.test;

import android.content.Context;
import android.test.AndroidTestCase;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;
import com.inspiredandroid.linuxcommandbibliotheca.models.Command;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandChildModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;

import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import io.realm.Realm;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Class to com.inspiredandroid.linuxcommandbibliotheca.test Android com.inspiredandroid.linuxcommandbibliotheca.test case.
 * <p/>
 * 1. Set up build version -> Android com.inspiredandroid.linuxcommandbibliotheca.test
 * 2. Execute com.inspiredandroid.linuxcommandbibliotheca.test: ./gradlew connectedCheck
 * <p/>
 * Html report: [project]/[module]/build/reports/androidTests/connected/[classpath].html
 * Example path: file:///home/simon/Dev/projects/LinuxCommandBibliotheca/app/build/reports/androidTests/connected/index.html
 */
public class MyAndroidTest {

    public MyAndroidTest() {
        Locale.setDefault(Locale.US);
    }

    private Context getContext() {
        return getInstrumentation().getTargetContext().getApplicationContext();
    }


    /**
     * Go thought all the man pages links of the tips fragment
     *
     * @throws Exception
     */
    @Test
    public void testTipsManPageLinks() throws Exception {
        final int[] IDS = new int[]{
                R.array.fragment_tips_background_code_array,
                R.array.fragment_tips_clear_code_array,
                R.array.fragment_tips_history_code_array,
                R.array.fragment_tips_pipe_code_array,
                R.array.fragment_tips_redirection_code_double_greater_array,
                R.array.fragment_tips_redirection_code_error_output_array,
                R.array.fragment_tips_redirection_code_greater_array,
                R.array.fragment_tips_redirection_code_smaller_array,
                R.array.fragment_tips_background_code_array,
                R.array.fragment_tips_special_characters_code_backquote_array,
                R.array.fragment_tips_special_characters_code_brackets_array,
                R.array.fragment_tips_special_characters_code_comment_array,
                R.array.fragment_tips_special_characters_code_double_amp_array,
                R.array.fragment_tips_special_characters_code_double_pipe_array,
                R.array.fragment_tips_special_characters_code_double_quote_array,
                R.array.fragment_tips_special_characters_code_excelationmark_array,
                R.array.fragment_tips_special_characters_code_questionmark_array,
                R.array.fragment_tips_special_characters_code_semicolon_array,
                R.array.fragment_tips_special_characters_code_single_quote_array,
                R.array.fragment_tips_special_characters_code_square_brackets_array,
                R.array.fragment_tips_special_characters_code_star_array,
                R.array.fragment_tips_special_characters_code_substitution_array
        };

        ArrayList<String> missingCommands = new ArrayList<>();
        for (int id : IDS) {
            String[] array = getContext().getResources().getStringArray(id);
            addMissingMansToList(missingCommands, array);
        }

        String missing = getReadableMissingCommands(missingCommands);

        //assertTrue("man pages not found: " + missing, missing.isEmpty());
        assertThat(missing.isEmpty(), is(true));
    }

    /**
     * Loop thought man pages and add to list if not found in database and not already in list
     *
     * @param missingCommands
     * @param mans
     */
    private void addMissingMansToList(List<String> missingCommands, String[] mans) {
        Realm realm = Realm.getDefaultInstance();
        for (String man : mans) {
            Command command = realm.where(Command.class).equalTo("name", man).findFirst();
            if (command == null) {
                if (!missingCommands.contains(man)) {
                    missingCommands.add(man);
                }
            }
        }
        realm.close();
    }

    /**
     * convert arraylist to human readable output
     *
     * @param missingCommands
     * @return
     */
    private String getReadableMissingCommands(ArrayList<String> missingCommands) {
        String missing = "";
        for (String m : missingCommands) {
            missing += m + " ";
        }
        return missing;
    }

}