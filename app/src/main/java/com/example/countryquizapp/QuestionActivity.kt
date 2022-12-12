package com.example.countryquizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class QuestionActivity : AppCompatActivity(), View.OnClickListener{

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mUserName: String? = null
    private  var mKonfettiView: Int? = null
    private var mCorrectAnswers: Int = 0

    private var progressBar: ProgressBar? = null
    private var tvProgressBar: TextView? = null
    private var btnSubmit: Button? = null
    private var tvOptionOne: TextView? = null
    private var tvOptionTwo: TextView? = null
    private var tvOptionThree: TextView? = null
    private var tvOptionFour: TextView? = null
    private var ivImage: ImageView? = null
    private var tvQuestion: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        mUserName = intent.getStringExtra(Constants.USER_NAME)
        progressBar = findViewById(R.id.progressBar)
        tvProgressBar = findViewById(R.id.tv_progressBar)
        ivImage = findViewById(R.id.iv_image)
        tvOptionOne = findViewById(R.id.tv_optionOne)
        tvOptionTwo = findViewById(R.id.tv_optionTwo)
        tvOptionThree = findViewById(R.id.tv_optionThree)
        tvOptionFour = findViewById(R.id.tv_optionFour)
        btnSubmit = findViewById(R.id.btn_submit)
        tvQuestion = findViewById(R.id.tv_question)

        tvOptionOne?.setOnClickListener (this)
        tvOptionTwo?.setOnClickListener (this)
        tvOptionThree?.setOnClickListener (this)
        tvOptionFour?.setOnClickListener (this)
        btnSubmit?.setOnClickListener (this)
        mQuestionList = Constants.getQuestions()
        defaultOptionView()
        setQuestion()




    }


    private fun setQuestion() {
        defaultOptionView()
        val question: Question = mQuestionList!![mCurrentPosition - 1]
        ivImage?.setImageResource(question.image)
        progressBar?.progress = mCurrentPosition
        tvProgressBar?.text = "$mCurrentPosition/ ${progressBar?.max}"
        tvQuestion?.text = question.question
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour

        if (mCurrentPosition == mQuestionList!!.size) {
            btnSubmit?.text = "NEXT"
        } else {
            btnSubmit?.text = "SUBMIT"
        }

    }

    private fun defaultOptionView() {
        val options = ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0, it)
        }
        tvOptionTwo?.let {
            options.add(1, it)
        }

        tvOptionThree?.let {
            options.add(2, it)
        }
        tvOptionFour?.let {
            options.add(3, it)
        }
        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )

        }

    }

    @SuppressLint("SetTextI18n")
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_border_option_bg
        )

        if (mCurrentPosition == mQuestionList!!.size) {
            btnSubmit?.text = "Next "
        } else {
            btnSubmit?.text = "SUBMIT "
        }
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tv_optionOne -> {
                tvOptionOne?.let {
                    selectedOptionView(it, 1)
                }
            }

            R.id.tv_optionTwo -> {
                tvOptionTwo?.let {
                    selectedOptionView(it, 2)
                }
            }
            R.id.tv_optionThree -> {
                tvOptionThree?.let {
                    selectedOptionView(it, 3)
                }
            }
            R.id.tv_optionFour -> {
                tvOptionFour?.let {
                    selectedOptionView(it, 4)
                }
            }
            R.id.btn_submit -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++

                    when {
                        mCurrentPosition <= mQuestionList!!.size -> {
                            setQuestion()
                        }

                        else -> {

                       val intent = Intent(this,resultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME,mUserName)
                            intent.putExtra(Constants.CORRECT_ANSWERS,mCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }

                } else {
                    val question = mQuestionList?.get(mCurrentPosition -1)
                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                      answerView(mSelectedOptionPosition,R.drawable.wrong_answer_color)
                    }else{
                       mCorrectAnswers++
                    }
                    answerView(question.correctAnswer,R.drawable.currect_answer_colo_bg)
                }
                if (mCurrentPosition == mQuestionList!!.size){

                    btnSubmit?.text = "SUBMIT"
                }else {
                    btnSubmit?.text = "Next"
                }

                mSelectedOptionPosition = 0

            }
        }

    }
    private fun answerView(answer: Int, drawableView : Int){
        when(answer){
            1 ->{
              tvOptionOne?.background = ContextCompat.getDrawable(
                this,
                  drawableView
              )

            }

            2 ->{
            tvOptionTwo?.background = ContextCompat.getDrawable(
                this@QuestionActivity,
                drawableView
            )

        }
            3->{
            tvOptionThree?.background = ContextCompat.getDrawable(
                this@QuestionActivity,
                drawableView
            )
        }  4->{
            tvOptionFour?.background = ContextCompat.getDrawable(
                this@QuestionActivity,
                drawableView
            )

        }
        }
    }
}
