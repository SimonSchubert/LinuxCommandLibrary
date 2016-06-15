package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.Editable;
import android.text.TextWatcher;
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
import com.inspiredandroid.linuxcommandbibliotheca.models.DataHolder;
import com.inspiredandroid.linuxcommandbibliotheca.models.LessonData;
import com.inspiredandroid.linuxcommandbibliotheca.models.Quiz;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by Simon Schubert
 */
public class QuizFragment extends Fragment implements View.OnClickListener {

    @BindView(R.id.fragment_quiz_tv_question) TextView mTvQuestion;
    @BindView(R.id.fragment_quiz_tv_percentage) TextView mTvPercentage;
    @BindView(R.id.fragment_quiz_btn_help) Button mBtnHelp;
    @BindView(R.id.fragment_quiz_btn_giveup) Button mBtnGiveUp;
    @BindView(R.id.fragment_quiz_iv_correct) ImageView mIvCorrect;
    @BindView(R.id.fragment_quiz_iv_wrong) ImageView mIvWrong;
    @BindView(R.id.fragment_quiz_btn_info) ImageButton mBtnInfo;
    @BindView(R.id.fragment_quiz_et_alesson) EditText mEtLesson;
    @BindView(R.id.fragment_quiz_rl_buttons) RelativeLayout mRlButtons;
    @BindView(R.id.fragment_quiz_ll_congratulation) LinearLayout mLlCongratulation;
    
    private ArrayList<Button> mBtnAnswers = new ArrayList<>();

    private DataHolder mData;

    private Realm mRealm;

    public QuizFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mRealm = Realm.getDefaultInstance();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);

        ButterKnife.bind(this, view);

        int[] ANSWERS = new int[]{R.id.fragment_quiz_btn_answer1,
                R.id.fragment_quiz_btn_answer2,
                R.id.fragment_quiz_btn_answer3,
                R.id.fragment_quiz_btn_answer4};

        for (int id : ANSWERS) {
            view.findViewById(id).setOnClickListener(this);
            mBtnAnswers.add((Button) view.findViewById(id));
        }

        view.findViewById(R.id.fragment_quiz_btn_info).setOnClickListener(this);
        view.findViewById(R.id.fragment_quiz_btn_again).setOnClickListener(this);
        view.findViewById(R.id.fragment_quiz_btn_help).setOnClickListener(this);
        view.findViewById(R.id.fragment_quiz_btn_giveup).setOnClickListener(this);

        mIvCorrect.setVisibility(View.GONE);
        mIvWrong.setVisibility(View.GONE);

        mEtLesson.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().equals(mData.lesson.answer)) {
                    mEtLesson.setEnabled(false);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            startCurtainAnimations();

                            if (mData.lesson.failed) {
                                startWrongAnimation();
                            } else {
                                startCorrectAnimation();
                            }

                            nextRound();
                        }
                    }, 2000);
                }
            }
        });

        mData = new DataHolder();

        if (savedInstanceState == null) {
            initQuiz();
            firstRound();
        } else {
            mData = (DataHolder) savedInstanceState.getSerializable("data");

            if (mData.answerCounter == mData.maxAnswerCount) {
                mTvQuestion.setVisibility(View.INVISIBLE);
                mRlButtons.setVisibility(View.INVISIBLE);
                mLlCongratulation.setVisibility(View.VISIBLE);
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
    public void onSaveInstanceState(Bundle outState) {
        outState.putSerializable("data", mData);

        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fragment_quiz_btn_help) {
            startCommandManActivity(mData.lesson.command);
        } else if (v.getId() == R.id.fragment_quiz_btn_giveup) {
            mData.lesson.failed = true;
            mEtLesson.setText(mData.lesson.answer);
        } else if (v.getId() == R.id.fragment_quiz_btn_info) {
            showLastQuestionInfoDialog();
        } else if (v.getId() == R.id.fragment_quiz_btn_again) {
            mLlCongratulation.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.scale_down));
            initQuiz();
            firstRound();
        } else {
            for (int i = 0; i < mBtnAnswers.size(); i++) {
                TextView tvAnswer = mBtnAnswers.get(i);
                if (tvAnswer.getId() == v.getId()) {
                    startCurtainAnimations();
                    if (i == mData.currentCorrectAnswerId) {
                        mData.correctAnswerCounter++;
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
    public void onDestroy() {
        super.onDestroy();

        mRealm.close();
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
     * Initialize/reset variables
     */
    private void initQuiz() {
        mData.usedCommandIds = new ArrayList<>();
        mData.currentCorrectAnswerId = -1;
        mData.answerCounter = -1;
        mData.correctAnswerCounter = 0;
    }

    /**
     * The first round has a different animation cycle
     */
    private void firstRound() {
        nextRound();

        fillQuestionTextView();
        fillAnswerViews();
        updateCounter();

        mRlButtons.setVisibility(View.VISIBLE);
        mTvQuestion.setVisibility(View.VISIBLE);
        mRlButtons.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.from_left_to_center));
        mTvQuestion.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.from_right_to_center));
    }

    /**
     * Show dialog fragment with last question info
     */
    private void showLastQuestionInfoDialog() {
        FragmentManager fragmentManager = getChildFragmentManager();
        QuizPreviousResultDialogFragment newFragment = QuizPreviousResultDialogFragment.getInstance(mData.lastAnswers, mData.lastCorrectAnswerId);
        newFragment.show(fragmentManager, QuizPreviousResultDialogFragment.class.getName());
    }

    /**
     * Animate a red cross
     */
    private void startWrongAnimation() {
        mIvWrong.setVisibility(View.VISIBLE);

        Animation scaleAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scale_up);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        updateNextRoundDataAndAnimate();
                        mIvWrong.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.scale_down));
                    }
                }, 200);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        mIvWrong.startAnimation(scaleAnimation);
    }

    /**
     * animate well done tux
     */
    private void startCorrectAnimation() {
        mIvCorrect.setVisibility(View.VISIBLE);

        Animation scaleAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scale_up);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        updateNextRoundDataAndAnimate();
                        mIvCorrect.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.scale_down));
                    }
                }, 700);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        mIvCorrect.startAnimation(scaleAnimation);
    }

    /**
     * Animate results
     */
    private void startFinishAnimation() {
        mLlCongratulation.setVisibility(View.VISIBLE);

        Animation scaleAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scale_up);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        mLlCongratulation.startAnimation(scaleAnimation);
    }

    /**
     * Update views
     */
    private void updateNextRoundDataAndAnimate() {
        if (mData.answerCounter == mData.maxAnswerCount) {

            fillResultView();
            startFinishAnimation();
        } else {
            fillQuestionTextView();
            fillAnswerViews();
            updateCounter();

            mTvQuestion.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.from_right_to_center));
            mRlButtons.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.from_left_to_center));
        }
    }

    private void fillResultView() {
        float percentage = (float) mData.correctAnswerCounter / (float) mData.maxAnswerCount * 100f;
        mTvPercentage.setText(String.format(getString(R.string.fragment_quiz_result), (int) percentage));
    }

    private void updateCounter() {
        ((QuizActivity) getActivity()).setCounterText(String.format(getString(R.string.fragment_quiz_counter), (mData.answerCounter + 1), mData.maxAnswerCount));
    }

    /**
     * Save last answers and generate new answers
     */
    private void nextRound() {
        setInfoButtonVisibility();

        mData.answerCounter++;

        mData.lastAnswers = Utils.cloneList(mData.currentAnswers);
        mData.lastCorrectAnswerId = mData.currentCorrectAnswerId;

        int questionType = Math.random() < 0.5f ? 0 : 1;

        getQuizData(questionType);
    }

    private void getQuizData(int questionType) {
        mData.questionType = questionType;
        if (questionType == 0) {
            // define a random correct answer
            mData.currentAnswers = getAnswers(mBtnAnswers.size());
            mData.currentCorrectAnswerId = (int) (Math.random() * mData.currentAnswers.size());
            mData.usedCommandIds.add(mData.currentAnswers.get(mData.currentCorrectAnswerId));
        } else {
            mData.lesson = getLesson();
            if (mData.lesson != null) {
                mData.usedCommandIds.add(mData.lesson.command);
            }
        }
    }

    /**
     * show/hide info button
     */
    private void setInfoButtonVisibility() {
        if (mData.questionType == 0 && mData.answerCounter != mData.maxAnswerCount) {
            mBtnInfo.setVisibility(View.VISIBLE);
        } else {
            mBtnInfo.setVisibility(View.GONE);
        }
    }

    /**
     * @return
     */
    private LessonData getLesson() {
        RealmResults<Quiz> lesson = mRealm.where(Quiz.class).equalTo("type", 1).findAll();
        for (String id : mData.usedCommandIds) {
            lesson.where().notEqualTo("name", id);
        }

        LessonData data = new LessonData();

        int randomId = (int) (Math.random() * lesson.size());

        Quiz quiz = lesson.get(randomId);
        if (quiz != null) {
            data.command = quiz.getName();
            data.question = quiz.getDescription();
            data.answer = quiz.getExtra();
            data.failed = false;
        } else {
            getQuizData(0);
            return null;
        }

        return data;
    }

    /**
     * Get answers from database
     *
     * @param count size of string array mList size
     * @return
     */
    private ArrayList<String> getAnswers(int count) {
        RealmResults<Quiz> lesson = mRealm.where(Quiz.class).equalTo("type", 0).findAll();
        for (String id : mData.usedCommandIds) {
            lesson.where().notEqualTo("name", id);
        }

        ArrayList<String> possibilities = new ArrayList<>();
        while (possibilities.size() < count) {
            String randomPossibility = lesson.get((int) (Math.random() * lesson.size())).getName();
            if (!possibilities.contains(randomPossibility)) {
                possibilities.add(randomPossibility);
            }
        }

        return possibilities;
    }

    /**
     * Set answers button text
     */
    private void fillAnswerViews() {
        if (mData.questionType == 0) {
            for (int i = 0; i < mData.currentAnswers.size(); i++) {
                String command = mData.currentAnswers.get(i);
                mBtnAnswers.get(i).setText(command);
            }
            mEtLesson.setVisibility(View.GONE);
            for (Button btn : mBtnAnswers) {
                btn.setVisibility(View.VISIBLE);
            }
            mBtnHelp.setVisibility(View.GONE);
            mBtnGiveUp.setVisibility(View.GONE);
        } else {
            mEtLesson.setVisibility(View.VISIBLE);
            for (Button btn : mBtnAnswers) {
                btn.setVisibility(View.GONE);
            }
            mBtnHelp.setVisibility(View.VISIBLE);
            mBtnGiveUp.setVisibility(View.VISIBLE);

            mEtLesson.setText(mData.lesson.command + " ");
            int position = mEtLesson.length();
            mEtLesson.setSelection(position);
            mEtLesson.setEnabled(true);
        }
    }

    /**
     *
     */
    private void fillQuestionTextView() {
        String question;
        if (mData.questionType == 0) {
            question = getQuestionText(mData.currentAnswers.get(mData.currentCorrectAnswerId));
        } else {
            question = mData.lesson.question;
        }
        mTvQuestion.setText(String.format(getString(R.string.fragment_quiz_question), question));
    }

    /**
     * Fetch question description by cmd mName from database
     *
     * @param command
     * @return
     */
    private String getQuestionText(String command) {
        Quiz quiz = mRealm.where(Quiz.class).equalTo("name", command).findFirst();

        return quiz.getDescription();
    }

    /**
     * send buttons and questions out of the screen
     */
    private void startCurtainAnimations() {
        mRlButtons.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.from_center_to_bottom));
        mTvQuestion.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.from_center_to_top));
    }
}
