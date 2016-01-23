package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity;
import com.inspiredandroid.linuxcommandbibliotheca.QuizActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs.QuizPreviousResultDialogFragment;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.DataHolder;
import com.inspiredandroid.linuxcommandbibliotheca.models.LessonData;
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
    ArrayList<Button> btnAnswers = new ArrayList<>();
    EditText etLesson;
    Button btnHelp;
    Button btnGiveUp;

    DataHolder data;

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
            btnAnswers.add((Button) view.findViewById(id));
        }


        view.findViewById(R.id.fragment_quiz_btn_info).setOnClickListener(this);
        view.findViewById(R.id.fragment_quiz_btn_again).setOnClickListener(this);
        view.findViewById(R.id.fragment_quiz_btn_help).setOnClickListener(this);
        view.findViewById(R.id.fragment_quiz_btn_giveup).setOnClickListener(this);


        ivCorrect = (ImageView) view.findViewById(R.id.fragment_quiz_iv_correct);
        ivCorrect.setVisibility(View.GONE);
        ivWrong = (ImageView) view.findViewById(R.id.fragment_quiz_iv_wrong);
        ivWrong.setVisibility(View.GONE);
        btnInfo = (ImageButton) view.findViewById(R.id.fragment_quiz_btn_info);
        etLesson = (EditText) view.findViewById(R.id.fragment_quiz_et_alesson);
        btnHelp = (Button) view.findViewById(R.id.fragment_quiz_btn_help);
        btnGiveUp = (Button) view.findViewById(R.id.fragment_quiz_btn_giveup);
        etLesson.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

            }

            @Override
            public void afterTextChanged(Editable s)
            {
                if (s.toString().equals(data.lesson.answer)) {
                    etLesson.setEnabled(false);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run()
                        {
                            startCurtainAnimations();

                            if (data.lesson.failed) {
                                startCorrectAnimation();
                            } else {
                                startWrongAnimation();
                            }

                            nextRound();
                        }
                    }, 2000);
                }
            }
        });

        data = new DataHolder();

        if (savedInstanceState == null) {
            initQuiz();
            firstRound();
        } else {
            data = (DataHolder) savedInstanceState.getSerializable("data");

            if (data.answerCounter == data.maxAnswerCount) {
                tvQuestion.setVisibility(View.INVISIBLE);
                rlButtons.setVisibility(View.INVISIBLE);
                llCongratulation.setVisibility(View.VISIBLE);
                fillResultView();
            } else {
                fillQuestionTextView();
                fillAnswerViews();
                updateCounter();
            }

            setInfoButtonVisibility();
        }

        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        outState.putSerializable("data", data);

        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.fragment_quiz_btn_help) {
            startCommandManActivity(data.lesson.command);
        } else if (v.getId() == R.id.fragment_quiz_btn_giveup) {
            etLesson.setText(data.lesson.answer);
        } else if (v.getId() == R.id.fragment_quiz_btn_info) {
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
                    if (i == data.currentCorrectAnswerId) {
                        data.correctAnswerCounter++;
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
     * @param command
     */
    private void startCommandManActivity(String command)
    {
        Log.e("TAG", "start: " + command);

        Intent intent = new Intent(getActivity(), CommandManActivity.class);
        Bundle b = new Bundle();
        b.putString(CommandManActivity.EXTRA_COMMAND_NAME, command);
        intent.putExtras(b);
        startActivity(intent);
    }

    /**
     * Initialize/reset variables
     */
    private void initQuiz()
    {
        data.usedCommandIds = new ArrayList<>();
        data.currentCorrectAnswerId = -1;
        data.answerCounter = -1;
        data.correctAnswerCounter = 0;
    }

    /**
     * The first round has a different animation cycle
     */
    private void firstRound()
    {
        nextRound();

        fillQuestionTextView();
        fillAnswerViews();
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
        QuizPreviousResultDialogFragment newFragment = QuizPreviousResultDialogFragment.getInstance(data.lastAnswers, data.lastCorrectAnswerId);
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
        if (data.answerCounter == data.maxAnswerCount) {

            fillResultView();
            startFinishAnimation();
        } else {
            fillQuestionTextView();
            fillAnswerViews();
            updateCounter();

            tvQuestion.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.from_right_to_center));
            rlButtons.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.from_left_to_center));
        }
    }

    private void fillResultView()
    {
        float percentage = (float) data.correctAnswerCounter / (float) data.maxAnswerCount * 100f;
        tvPercentage.setText(String.format(getString(R.string.fragment_quiz_result), (int) percentage));
    }

    private void updateCounter()
    {
        ((QuizActivity) getActivity()).setCounterText(String.format(getString(R.string.fragment_quiz_counter), (data.answerCounter + 1), data.maxAnswerCount));
    }

    /**
     * Save last answers and generate new answers
     */
    private void nextRound()
    {
        setInfoButtonVisibility();

        data.answerCounter++;

        data.lastAnswers = Utils.cloneList(data.currentAnswers);
        data.lastCorrectAnswerId = data.currentCorrectAnswerId;

        int questionType = Math.random() < 0.5f ? 0 : 1;

        getQuizData(questionType);
    }

    private void getQuizData(int questionType)
    {
        data.questionType = questionType;
        if (questionType == 0) {
            // define a random correct answer
            data.currentAnswers = getAnswers(btnAnswers.size());
            data.currentCorrectAnswerId = (int) (Math.random() * data.currentAnswers.size());
            data.usedCommandIds.add(data.currentAnswers.get(data.currentCorrectAnswerId));
        } else {
            data.lesson = getLesson();
            if (data.lesson != null) {
                data.usedCommandIds.add(data.lesson.command);
            }
        }
    }

    /**
     * show/hide info button
     */
    private void setInfoButtonVisibility()
    {
        if (data.questionType == 0 && data.answerCounter != data.maxAnswerCount) {
            btnInfo.setVisibility(View.VISIBLE);
        } else {
            btnInfo.setVisibility(View.GONE);
        }
    }

    /**
     * @return
     */
    private LessonData getLesson()
    {

        Cursor c = databaseHelper.getQuiz(20, data.usedCommandIds, 1);

        LessonData data = new LessonData();

        int randomId = (int) (Math.random() * c.getCount());

        if (c.moveToPosition(randomId)) {
            data.command = c.getString(c.getColumnIndex(CommandsDBTableModel.COL_NAME));
            data.question = c.getString(c.getColumnIndex(CommandsDBTableModel.COL_DESCRIPTION));
            data.answer = c.getString(c.getColumnIndex("extra"));
        } else {
            getQuizData(0);
            c.close();
            return null;
        }

        c.close();

        return data;
    }

    /**
     * Get answers from database
     *
     * @param count size of string array mList size
     * @return
     */
    private ArrayList<String> getAnswers(int count)
    {
        Cursor c = databaseHelper.getQuiz(20, data.usedCommandIds, 0);

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
    private void fillAnswerViews()
    {
        if (data.questionType == 0) {
            for (int i = 0; i < data.currentAnswers.size(); i++) {
                String command = data.currentAnswers.get(i);
                btnAnswers.get(i).setText(command);
            }
            etLesson.setVisibility(View.GONE);
            for (Button btn : btnAnswers) {
                btn.setVisibility(View.VISIBLE);
            }
            btnHelp.setVisibility(View.GONE);
            btnGiveUp.setVisibility(View.GONE);
        } else {
            etLesson.setVisibility(View.VISIBLE);
            for (Button btn : btnAnswers) {
                btn.setVisibility(View.GONE);
            }
            btnHelp.setVisibility(View.VISIBLE);
            btnGiveUp.setVisibility(View.VISIBLE);

            etLesson.setText(data.lesson.command + " ");
            int position = etLesson.length();
            etLesson.setSelection(position);
            etLesson.setEnabled(true);
        }
    }

    /**
     *
     */
    private void fillQuestionTextView()
    {
        String question;
        if (data.questionType == 0) {
            question = getQuestionText(data.currentAnswers.get(data.currentCorrectAnswerId));
        } else {
            question = data.lesson.question;
        }
        tvQuestion.setText(String.format(getString(R.string.fragment_quiz_question), question));
    }

    /**
     * Fetch question description by cmd mName from database
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
