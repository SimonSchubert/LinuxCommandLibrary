package com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.models.Quiz;

import java.util.ArrayList;

import io.realm.Realm;

/**
 * Created by Simon Schubert
 */
public class QuizPreviousResultDialogFragment extends DialogFragment implements View.OnClickListener {

    private final static String EXTRA_KEY_ANSWERS = "EXTRA_KEY_ANSWERS";
    private final static String EXTRA_KEY_CORRECT_ANSWER_ID = "EXTRA_KEY_CORRECT_ANSWER_ID";

    // list of commandGroupModel
    ArrayList<String> mAnswers;
    // correct answer id
    int mCorrectAnswerId;
    // database
    Realm mRealm;

    public static QuizPreviousResultDialogFragment getInstance(ArrayList<String> answers, int correctAnswer) {
        QuizPreviousResultDialogFragment fragment = new QuizPreviousResultDialogFragment();

        Bundle arguments = new Bundle();
        arguments.putStringArrayList(EXTRA_KEY_ANSWERS, answers);
        arguments.putInt(EXTRA_KEY_CORRECT_ANSWER_ID, correctAnswer);
        fragment.setArguments(arguments);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mRealm = Realm.getInstance(getActivity());
    }

    /**
     * The system calls this to get the DialogFragment's layout, regardless
     * of whether it's being displayed as a dialog or an embedded fragment.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout to use as dialog or embedded fragment
        View view = inflater.inflate(R.layout.fragment_quiz_result, container, false);

        mAnswers = getArguments().getStringArrayList(EXTRA_KEY_ANSWERS);
        mCorrectAnswerId = getArguments().getInt(EXTRA_KEY_CORRECT_ANSWER_ID);


        int[] CLICKABLES = new int[]{R.id.fragment_quiz_result_btn_answer1, R.id.fragment_quiz_result_btn_answer2,
                R.id.fragment_quiz_result_btn_answer3, R.id.fragment_quiz_result_btn_answer4};

        for (int i = 0; i < CLICKABLES.length; i++) {
            int id = CLICKABLES[i];

            Button btnAnswer = (Button) view.findViewById(id);
            btnAnswer.setOnClickListener(this);
            btnAnswer.setText(mAnswers.get(i));
            if (i == mCorrectAnswerId) {
                btnAnswer.getBackground().setColorFilter(0xFF8DCF67, PorterDuff.Mode.MULTIPLY);
            }
        }


        setCommandDescriptionForTextView(view, R.id.fragment_quiz_result_tv_answer1, mAnswers.get(0));
        setCommandDescriptionForTextView(view, R.id.fragment_quiz_result_tv_answer2, mAnswers.get(1));
        setCommandDescriptionForTextView(view, R.id.fragment_quiz_result_tv_answer3, mAnswers.get(2));
        setCommandDescriptionForTextView(view, R.id.fragment_quiz_result_tv_answer4, mAnswers.get(3));

        setQuestionTextView(view, R.id.fragment_quiz_result_tv_question, mAnswers.get(mCorrectAnswerId));

        return view;
    }

    /**
     * The system calls this only when creating the layout in a dialog.
     */
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // The only reason you might override this method when using onCreateView() is
        // to modify any dialog characteristics. For example, the dialog includes a
        // title by default, but your custom layout might not need it. So here you can
        // remove the dialog title, but you must call the superclass to get the Dialog.
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mRealm.close();
    }

    @Override
    public void onClick(View v) {
        String command = ((TextView) v).getText().toString();
        startCommandManActivity(command);
    }

    /**
     * @param command
     */
    private void startCommandManActivity(String command) {
        Intent intent = new Intent(getActivity(), CommandManActivity.class);
        Bundle b = new Bundle();
        b.putString(CommandManActivity.EXTRA_COMMAND_NAME, command);
        intent.putExtras(b);
        startActivity(intent);
    }

    /**
     * @param view
     * @param id
     * @param command
     */
    private void setCommandDescriptionForTextView(View view, int id, String command) {
        Quiz quiz = mRealm.where(Quiz.class).equalTo("name", command).findFirst();
        ((TextView) view.findViewById(id)).setText(quiz.getDescription());
    }

    /**
     * @param view
     * @param id
     * @param command
     */
    private void setQuestionTextView(View view, int id, String command) {
        Quiz quiz = mRealm.where(Quiz.class).equalTo("name", command).findFirst();
        ((TextView) view.findViewById(id)).setText(String.format(getString(R.string.fragment_quiz_question), quiz.getDescription()));
    }
}