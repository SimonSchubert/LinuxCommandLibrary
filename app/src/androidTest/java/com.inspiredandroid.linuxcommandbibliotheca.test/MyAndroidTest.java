package com.inspiredandroid.linuxcommandbibliotheca.test;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Environment;
import android.test.AndroidTestCase;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandChildModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;


/**
 * Class to com.inspiredandroid.linuxcommandbibliotheca.test Android com.inspiredandroid.linuxcommandbibliotheca.test case.
 * <p/>
 * 1. Set up build version -> Android com.inspiredandroid.linuxcommandbibliotheca.test
 * 2. Execute com.inspiredandroid.linuxcommandbibliotheca.test: ./gradlew connectedCheck
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


    public void testRemoveUnnecessaryHtmlTags()
    {
        CommandsDbHelper helper = new CommandsDbHelper(mContext);

        Cursor c = helper.getAllCommandPages();

        while (c.moveToNext()) {

            String title = c.getString(c.getColumnIndex("title"));
            String page = c.getString(c.getColumnIndex("page"));
            String id = c.getString(c.getColumnIndex("id"));

            page = page.replaceAll("(?i)<font[^>]*>", "");
            page = page.replaceAll("(?i)</font[^>]*>", "");
            page = page.replaceAll("(?i)<table[^>]*>", "");
            page = page.replaceAll("(?i)</table[^>]*>", "");
            page = page.replaceAll("(?i)<tr[^>]*>", "");
            page = page.replaceAll("(?i)</tr[^>]*>", "");
            page = page.replaceAll("(?i)<td[^>]*>", "");
            page = page.replaceAll("(?i)</td[^>]*>", "");
            page = page.replaceAll("(?i)<body[^>]*>", "");
            page = page.replaceAll("(?i)</body[^>]*>", "");
            page = page.replaceAll("(?i)<html[^>]*>", "");
            page = page.replaceAll("(?i)</html[^>]*>", "");
            page = page.replaceAll("(?i)<hr[^>]*>", "");

            // remove style='..'
            page = page.replaceAll("(?i) style='[^>]*'", "");

            // remove 2 or more spaces
            page = page.replaceAll(" +", " ");


            page = page.trim();
            title = title.trim();


            ContentValues newValues = new ContentValues();
            newValues.put("page", page);
            newValues.put("title", title);

            helper.getWritableDatabase().update("commandpages", newValues, "id=" + id, null);
        }


        exportDB();
    }

    /**
     * Loop thought all man pages and split by "<h2>" html tag. The tag is standard used as an
     * optical divider in man pages
     */
    public void deactivatedtestSplitManPagesIntoSubpages() {
        CommandsDbHelper helper = new CommandsDbHelper(mContext);

        Cursor c = helper.getAllCommands();

        String missingOnes = "";

        while(c.moveToNext()) {
            String manpage = c.getString(c.getColumnIndex(CommandsDBTableModel.COL_MANPAGE));
            String name = c.getString(c.getColumnIndex(CommandsDBTableModel.COL_NAME));
            String id = c.getString(c.getColumnIndex(CommandsDBTableModel.COL_ID));

            String d = "<h2>";
            String[] subpages = manpage.split(d);

            if(subpages.length > 1) {
                // first method seam to work
                for (int i = 1; i < subpages.length; i++) {
                    String subsubpage = subpages[i];

                    String d2 = "</h2>";
                    String[] phrases = subsubpage.split(d2);
                    if (phrases.length > 0) {
                        String title = phrases[0].split("<a")[0];
                        String man = phrases[1];

                        String sql = "INSERT INTO commandpages (commandid, title, page) VALUES (\""+id+"\",\""+title+"\",\""+man+"\")";
                        helper.getWritableDatabase().execSQL(sql);

                        ContentValues newValues = new ContentValues();
                        newValues.put("manpage", "");

                        helper.getWritableDatabase().update("commands", newValues, "_id=" + id, null);
                    }
                }
            }
        }

        assertTrue("not enought sub pages for " + missingOnes, missingOnes.isEmpty());
    }

    private void exportDB(){
        String SAMPLE_DB_NAME = "commands.db";
        File sd = Environment.getExternalStorageDirectory();
        File data = Environment.getDataDirectory();
        FileChannel source;
        FileChannel destination;
        String currentDBPath = "/data/"+ "com.inspiredandroid.linuxcommandbibliotheca" +"/databases/"+SAMPLE_DB_NAME;

        File currentDB = new File(data, currentDBPath);
        File backupDB = new File(sd, SAMPLE_DB_NAME);

        try {
            source = new FileInputStream(currentDB).getChannel();
            destination = new FileOutputStream(backupDB).getChannel();
            destination.transferFrom(source, 0, source.size());
            source.close();
            destination.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Go thought all the man pages links of the scripts fragment
     * @throws Exception
     */
    public void t2estScriptManPageLinks() throws Exception
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
    public void t2estTipsManPageLinks() throws Exception
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