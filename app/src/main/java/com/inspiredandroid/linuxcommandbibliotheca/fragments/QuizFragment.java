package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.QuizActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs.QuizPreviousResultDialogFragment;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

import java.util.ArrayList;

/**
 * Created by Simon Schubert
 */
public class QuizFragment extends Fragment implements View.OnClickListener {

    // views
    TextView tvQuestion;
    TextView tvPercentage;
    ImageView ivCorrect;
    ImageView ivWrong;
    ImageButton btnInfo;
    RelativeLayout rlButtons;
    LinearLayout llCongratulation;
    ArrayList<TextView> btnAnswers = new ArrayList<>();

    int maxAnswerCount = 20;
    // id of currentAnswers array list
    int currentCorrectAnswerId;
    // id of lastAnswers array list
    int lastCorrectAnswerId;
    // already answers
    int answerCounter;
    // correct answered
    int correctAnswerCounter;
    // list of current commands
    ArrayList<String> currentAnswers;
    // list of last commands
    ArrayList<String> lastAnswers;
    // list of used question cmmands
    ArrayList<String> usedCommands;

    CommandsDbHelper databaseHelper;

    public QuizFragment()
    {
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        databaseHelper = new CommandsDbHelper(getContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);

        tvQuestion = (TextView) view.findViewById(R.id.fragment_quiz_tv_question);
        rlButtons = (RelativeLayout) view.findViewById(R.id.fragment_quiz_rl_buttons);
        llCongratulation = (LinearLayout) view.findViewById(R.id.fragment_quiz_ll_congratulation);
        tvPercentage = (TextView) view.findViewById(R.id.fragment_quiz_tv_percentage);

        int[] ANSWERS = new int[]{R.id.fragment_quiz_btn_answer1,
                R.id.fragment_quiz_btn_answer2,
                R.id.fragment_quiz_btn_answer3,
                R.id.fragment_quiz_btn_answer4};

        for (int id : ANSWERS) {
            view.findViewById(id).setOnClickListener(this);
            btnAnswers.add((TextView) view.findViewById(id));
        }

        view.findViewById(R.id.fragment_quiz_btn_info).setOnClickListener(this);
        view.findViewById(R.id.fragment_quiz_btn_again).setOnClickListener(this);
        ivCorrect = (ImageView) view.findViewById(R.id.fragment_quiz_iv_correct);
        ivCorrect.setVisibility(View.GONE);
        ivWrong = (ImageView) view.findViewById(R.id.fragment_quiz_iv_wrong);
        ivWrong.setVisibility(View.GONE);
        btnInfo = (ImageButton) view.findViewById(R.id.fragment_quiz_btn_info);

        if (savedInstanceState == null) {
            initQuiz();
            firstRound();
        } else {
            answerCounter = savedInstanceState.getInt("answerCounter");
            correctAnswerCounter = savedInstanceState.getInt("correctAnswerCounter");
            currentCorrectAnswerId = savedInstanceState.getInt("currentCorrectAnswerId");
            lastCorrectAnswerId = savedInstanceState.getInt("lastCorrectAnswerId");
            currentAnswers = savedInstanceState.getStringArrayList("currentAnswers");
            lastAnswers = savedInstanceState.getStringArrayList("lastAnswers");
            usedCommands = savedInstanceState.getStringArrayList("usedCommands");

            if (answerCounter == maxAnswerCount) {
                tvQuestion.setVisibility(View.INVISIBLE);
                rlButtons.setVisibility(View.INVISIBLE);
                llCongratulation.setVisibility(View.VISIBLE);
                fillResultView();
            } else {
                fillQuestionTextView();
                fillAnswerButtonViews();
                updateCounter();
            }

            setInfoButtonVisibility();
        }

        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        outState.putInt("answerCounter", answerCounter);
        outState.putInt("lastCorrectAnswerId", lastCorrectAnswerId);
        outState.putInt("currentCorrectAnswerId", currentCorrectAnswerId);
        outState.putInt("correctAnswerCounter", correctAnswerCounter);
        outState.putStringArrayList("currentAnswers", currentAnswers);
        outState.putStringArrayList("lastAnswers", lastAnswers);
        outState.putStringArrayList("usedCommands", usedCommands);

        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.fragment_quiz_btn_info) {
            showLastQuestionInfoDialog();
        } else if (v.getId() == R.id.fragment_quiz_btn_again) {
            llCongratulation.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.scale_down));
            initQuiz();
            firstRound();
        } else {
            for (int i = 0; i < btnAnswers.size(); i++) {
                TextView tvAnswer = btnAnswers.get(i);
                if (tvAnswer.getId() == v.getId()) {
                    startCurtainAnimations();
                    if (i == currentCorrectAnswerId) {
                        correctAnswerCounter++;
                        startCorrectAnimation();
                    } else {
                        startWrongAnimation();
                    }
                    nextRound();
                }
            }
        }
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();

        databaseHelper.close();
    }

    /**
     * Initialize/reset variables
     */
    private void initQuiz()
    {
        usedCommands = new ArrayList<>();
        currentCorrectAnswerId = -1;
        answerCounter = -1;
        correctAnswerCounter = 0;
    }

    /**
     * The first round has a different animation cycle
     */
    private void firstRound()
    {
        nextRound();

        fillQuestionTextView();
        fillAnswerButtonViews();
        updateCounter();

        rlButtons.setVisibility(View.VISIBLE);
        tvQuestion.setVisibility(View.VISIBLE);
        rlButtons.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.from_left_to_center));
        tvQuestion.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.from_right_to_center));
    }

    /**
     * Show dialog fragment with last question info
     */
    private void showLastQuestionInfoDialog()
    {
        FragmentManager fragmentManager = getChildFragmentManager();
        QuizPreviousResultDialogFragment newFragment = QuizPreviousResultDialogFragment.getInstance(lastAnswers, lastCorrectAnswerId);
        newFragment.show(fragmentManager, QuizPreviousResultDialogFragment.class.getName());
    }

    /**
     * Animate a red cross
     */
    private void startWrongAnimation()
    {
        ivWrong.setVisibility(View.VISIBLE);

        Animation scaleAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scale_up);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation)
            {

            }

            @Override
            public void onAnimationEnd(Animation animation)
            {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run()
                    {
                        updateNextRoundDataAndAnimate();
                        ivWrong.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.scale_down));
                    }
                }, 200);
            }

            @Override
            public void onAnimationRepeat(Animation animation)
            {

            }
        });
        ivWrong.startAnimation(scaleAnimation);
    }

    /**
     * animate well done tux
     */
    private void startCorrectAnimation()
    {
        ivCorrect.setVisibility(View.VISIBLE);

        Animation scaleAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scale_up);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation)
            {

            }

            @Override
            public void onAnimationEnd(Animation animation)
            {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run()
                    {
                        updateNextRoundDataAndAnimate();
                        ivCorrect.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.scale_down));
                    }
                }, 700);
            }

            @Override
            public void onAnimationRepeat(Animation animation)
            {

            }
        });
        ivCorrect.startAnimation(scaleAnimation);
    }

    /**
     * Animate results
     */
    private void startFinishAnimation()
    {
        llCongratulation.setVisibility(View.VISIBLE);

        Animation scaleAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scale_up);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation)
            {
            }

            @Override
            public void onAnimationEnd(Animation animation)
            {
            }

            @Override
            public void onAnimationRepeat(Animation animation)
            {
            }
        });
        llCongratulation.startAnimation(scaleAnimation);
    }

    /**
     * Update views
     */
    private void updateNextRoundDataAndAnimate()
    {
        if (answerCounter == maxAnswerCount) {

            fillResultView();
            startFinishAnimation();
        } else {
            fillQuestionTextView();
            fillAnswerButtonViews();
            updateCounter();

            tvQuestion.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.from_right_to_center));
            rlButtons.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.from_left_to_center));
        }
    }

    private void fillResultView()
    {
        float percentage = (float) correctAnswerCounter / (float) maxAnswerCount * 100f;
        tvPercentage.setText(String.format(getString(R.string.fragment_quiz_result), (int) percentage));
    }

    private void updateCounter()
    {
        ((QuizActivity) getActivity()).tvCounter.setText(String.format(getString(R.string.fragment_quiz_counter), (answerCounter + 1), maxAnswerCount));
    }

    /**
     * Save last answers and generate new answers
     */
    private void nextRound()
    {
        answerCounter++;

        lastAnswers = Utils.cloneList(currentAnswers);
        lastCorrectAnswerId = currentCorrectAnswerId;

        // define a random correct answer
        currentAnswers = getAnswers(btnAnswers.size());
        currentCorrectAnswerId = (int) (Math.random() * currentAnswers.size());

        usedCommands.add(currentAnswers.get(currentCorrectAnswerId));

        setInfoButtonVisibility();
    }

    /**
     * show/hide info button
     */
    private void setInfoButtonVisibility()
    {
        btnInfo.setVisibility(lastCorrectAnswerId == -1 || answerCounter == maxAnswerCount ? View.GONE : View.VISIBLE);
    }

    /**
     * Get answers from database
     *
     * @param count size of string array list size
     * @return
     */
    private ArrayList<String> getAnswers(int count)
    {
        Cursor c = databaseHelper.getQuiz(20, usedCommands);

        ArrayList<String> commands = new ArrayList<>();
        while (c.moveToNext()) {
            commands.add(c.getString(c.getColumnIndex(CommandsDBTableModel.COL_NAME)));
        }

        c.close();

        ArrayList<String> possibilities = new ArrayList<>();
        while (possibilities.size() < count) {
            String randomPossibility = commands.get((int) (Math.random() * commands.size()));
            if (!possibilities.contains(randomPossibility)) {
                possibilities.add(randomPossibility);
            }
        }

        return possibilities;
    }

    /**
     * Set answers button text
     */
    private void fillAnswerButtonViews()
    {
        for (int i = 0; i < currentAnswers.size(); i++) {
            String command = currentAnswers.get(i);
            btnAnswers.get(i).setText(command);
        }
    }

    /**
     *
     */
    private void fillQuestionTextView()
    {
        String randomQuestionCommand = currentAnswers.get(currentCorrectAnswerId);
        tvQuestion.setText(String.format(getString(R.string.fragment_quiz_question), getQuestionText(randomQuestionCommand)));
    }

    /**
     * Fetch question description by cmd name from database
     *
     * @param command
     * @return
     */
    private String getQuestionText(String command)
    {
        Cursor c2 = databaseHelper.getQuizCommandFromName(command);
        c2.moveToFirst();

        String question = c2.getString(c2.getColumnIndex(CommandsDBTableModel.COL_DESCRIPTION));

        c2.close();

        return question;
    }

    /**
     * send buttons and questions out of the screen
     */
    private void startCurtainAnimations()
    {
        rlButtons.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.from_center_to_bottom));
        tvQuestion.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.from_center_to_top));
    }
}
