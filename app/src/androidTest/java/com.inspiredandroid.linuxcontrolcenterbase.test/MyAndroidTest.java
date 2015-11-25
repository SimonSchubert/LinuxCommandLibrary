package com.inspiredandroid.linuxcontrolcenterbase.test;

import android.database.Cursor;
import android.test.AndroidTestCase;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandChildModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * Class to test Android test case.
 * <p/>
 * 1. Set up build version -> Android test
 * 2. Execute test: ./gradlew connectedCheck
 * <p/>
 * Html report: [project]/[module]/build/reports/androidTests/connected/[classpath].html
 * Example path: file:///home/simon/Dev/projects/LinuxCommandBibliotheca/app/build/reports/androidTests/connected/index.html
 */
public class MyAndroidTest extends AndroidTestCase {

    @Override
    protected void setUp() throws Exception
    {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception
    {
        super.tearDown();
    }

    /**
     * Test if database crafting works
     * @throws Exception
     */
    public void testCraftManDatabase() throws Exception
    {
        CommandsDbHelper helper = new CommandsDbHelper(mContext);
        helper.getReadableDatabase();
        helper.close();
    }

    /**
     * Go thought all the man pages links of the scripts fragment
     * @throws Exception
     */
    public void testScriptManPageLinks() throws Exception
    {
        InputStream inputStream = getContext().getResources().openRawResource(R.raw.commands);

        ArrayList<CommandGroupModel> commandsAll = new Gson().fromJson(Utils.readTextFile(inputStream), new TypeToken<List<CommandGroupModel>>() {
        }.getType());

        ArrayList<String> missingCommands = new ArrayList<>();
        for(CommandGroupModel group : commandsAll) {
            for(CommandChildModel commands : group.getCommands()) {
                addMissingMansToList(missingCommands, commands.getMans());
            }
        }

        String missing = getReadableMissingCommands(missingCommands);

        assertTrue("man pages not found: " + missing, missing.isEmpty());
    }

    /**
     * Go thought all the man pages links of the tips fragment
     * @throws Exception
     */
    public void testTipsManPageLinks() throws Exception
    {
        final int[] IDS = new int[] {
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
        for(int id : IDS) {
            String[] array = getContext().getResources().getStringArray(id);
            addMissingMansToList(missingCommands, array);
        }

        String missing = getReadableMissingCommands(missingCommands);

        assertTrue("man pages not found: " + missing, missing.isEmpty());
    }

    /**
     * Loop thought man pages and add to list if not found in database and not already in list
     * @param missingCommands
     * @param mans
     */
    private void addMissingMansToList(ArrayList<String> missingCommands, String[] mans)
    {
        CommandsDbHelper helper = new CommandsDbHelper(mContext);
        for(String man : mans) {
            Cursor c = helper.getCommandFromName(man);
            if(c.getCount() == 0) {
                if(!missingCommands.contains(man)) {
                    missingCommands.add(man);
                }
            }
        }
        helper.close();
    }

    /**
     * convert arraylist to human readable output
     * @param missingCommands
     * @return
     */
    private String getReadableMissingCommands(ArrayList<String> missingCommands)
    {
        String missing = "";
        for(String m : missingCommands) {
            missing += m + " ";
        }
        return missing;
    }

}