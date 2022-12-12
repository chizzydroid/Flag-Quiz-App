package com.example.countryquizapp

import com.example.countryquizapp.R.drawable.tanzania

object Constants {

    const val  USER_NAME : String  = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {

        val questionList = ArrayList<Question>()

        //1
        val que1 = Question(
            1, "What Country does this flag belong to?",
            R.drawable.china,
            "China", "Canada",
            "Brazil", "Hungary",
            1
        )

        questionList.add(que1)
        //2
        val que2 = Question(
            2, "What Country does this flag belong to?",
            R.drawable.philipines,
            "China", "Philippines",
            "Brazil", "Hungary",
            2
        )
        questionList.add(que2)
        //3
        val que3 = Question(
            3, "What Country does this flag belong to?",
            R.drawable.switzerland,
            "China", "Canada",
            "Brazil", "Switzerland",
            4
        )
        questionList.add(que3)

        //4
        val que4 = Question(
            4, "What Country does this flag belong to?",
            R.drawable.finland,
            "China", "Finland",
            "Brazil", "Hungary",
            2
        )
        questionList.add(que4)
        //5
        val que5 = Question(
            5, "What Country does this flag belong to?",
            R.drawable.brazil,
            "China", "Canada",
            "Brazil", "Hungary",
            3
        )
        questionList.add(que5)
        //6

        val que6 = Question(
            6, "What Country does this flag belong to?",
            R.drawable.thinland,
            "China", "Canada",
            "Brazil", "Thailand",
            4
        )
        questionList.add(que6)
        //7
        val que7 = Question(
            7, "What Country does this flag belong to?",
            R.drawable.pakistan,
            "China", "Canada",
            "Pakistan", "Hungary",
            3
        )
        questionList.add(que7)
        //8
        val que8 = Question(
            8, "What Country does this flag belong to?",
            R.drawable.german,
            "China", "Congo",
            "Germany", "Hungary",
            3
        )
        questionList.add(que8)
        //9
        val que9 = Question(
            9, "What Country does this flag belong to?",
            R.drawable.jamaica,
            "Jamaica", "Canada",
            "Brazil", "Hungary",
            1
        )
        questionList.add(que9)
        //10
        val que10 = Question(
            10, "What Country does this flag belong to?",
            R.drawable.algeria,
            "China", "Algeria",
            "Brazil", "Hungary",
            2
        )
        questionList.add(que10)
        //11
        val que11 = Question(
            11, "What Country does this flag belong to?",
            R.drawable.israel,
            "Israel", "Jamaica",
            "Brazil", "Hungary",
            1
        )
        questionList.add(que11)
        //12
        val que12 = Question(
            12, "What Country does this flag belong to?",
            R.drawable.biafra,
            "Congo", "Biafra",
            "Brazil", "Hungary",
            2
        )
        questionList.add(que12)
        //13
        val que13 = Question(
            13, "What Country does this flag belong to?",
            R.drawable.greece,
            "China", "Canada",
            "Greece", "Hungary",
            3
        )
        questionList.add(que13)
        //4
        val que14 = Question(
            14, "What Country does this flag belong to?",
            R.drawable.mexico,
            "China", "Mexico",
            "Brazil", "Hungary",
            2
        )
        questionList.add(que14)
        //15
        val que15 = Question(
            15, "What Country does this flag belong to?",
            R.drawable.america,
            "China", "Canada",
            "Brazil", "America",
            4
        )
        questionList.add(que15)
        //16
        val que16 = Question(
            16, "What Country does this flag belong to?",
            R.drawable.india,
            "Egypt", "Congo",
            "India", "Hungary",
            3
        )
        questionList.add(que16)
        //17
        val que17 = Question(
            17, "What Country does this flag belong to?",
            R.drawable.zambia,
            "Australia", "Zambia",
            "Congo", "Columbia",
            2
        )
        questionList.add(que17)
        //18
        val que18 = Question(
            18, "What Country does this flag belong to?",
            R.drawable.australia,
            "China", "Australia",
            "Singapore", "Hungary",
            2
        )
        questionList.add(que18)
        //9
        val que19 = Question(
            19, "What Country does this flag belong to?",
            R.drawable.singapore,
            "China", "Portugal",
            "Singapore", "Hungary",
            3
        )
        questionList.add(que19)
        //20
        val que20 = Question(
            20, "What Country does this flag belong to?",
            R.drawable.portugal,
            "China", "Canada",
            "Italy", "portugal",
            4
        )
        questionList.add(que20)
        //21
        val que21 = Question(
            21, "What Country does this flag belong to?",
            R.drawable.italy,
            "Italy", "Canada",
            "Brazil", "Japan",
            1
        )
        questionList.add(que21)
        //22
        val que22 = Question(
            22, "What Country does this flag belong to?",
            R.drawable.japan,
            "China", "Morocco",
            "Korea", "Japan",
            4
        )
        questionList.add(que22)
        //23
        val que23 = Question(
            23, "What Country does this flag belong to?",
            R.drawable.korea,
            "China", "Morocco",
            "Korea", "Hungary",
            3
        )
        questionList.add(que23)
        //24
        val que24 = Question(
            24, "What Country does this flag belong to?",
            R.drawable.morocco,
            "China", "Morocco",
            "Nigeria", "Hungary",
            2
        )
        questionList.add(que24)

        //25
        val que25 = Question(
            25, "What Country does this flag belong to?",
            R.drawable.nigeria,
            "Egypt", "Algeria",
            "Nigeria", "Hungary",
            3
        )
        questionList.add(que25)
        //26
        val que26 = Question(
            26, "What Country does this flag belong to?",
            R.drawable.hungary,
            "Hungary", "Canada",
            "Brazil", "Columbia",
            1
        )
        questionList.add(que26)
        //27

        val que27 = Question(
            27, "What Country does this flag belong to?",
            R.drawable.canada,
            "China", "Canada",
            "Brazil", "Hungary",
            2
        )
        questionList.add(que27)
        //28
        val que28 = Question(
            28, "What Country does this flag belong to?",
            R.drawable.unitedkingdom,
            "China", "Canada",
            "Brazil", "United Kingdom",
            4
        )
        questionList.add(que28)
        //29
        val que29 = Question(
            29, "What Country does this flag belong to?",
            R.drawable.finland,
            "Finland", "Canada",
            "Spain", "Hungary",
            1
        )
        questionList.add(que29)
        //30
        val que30 = Question(
            30, "What Country does this flag belong to?",
            R.drawable.spain,
            "China", "Spain",
            "Sweden", "Hungary",
            2
        )
        questionList.add(que30)
        //31
        val que31 = Question(
            31, "What Country does this flag belong to?",
            R.drawable.sweden,
            "China", "Sweden",
            "Switzerland", "Hungary",
            2
        )
        questionList.add(que31)
        //32
        val que32 = Question(
            32, "What Country does this flag belong to?",
            R.drawable.tanzania,
            "Paris", "Spain",
            "Tanzania", "Hungary",
            3
        )
        questionList.add(que32)
        //33
        val que33 = Question(
            33, "What Country does this flag belong to?",
            R.drawable.paris,
            "Congo", "Sweden",
            "Paris", "Hungary",
            3
        )
        questionList.add(que33)
        //34
        val que34 = Question(
            34, "What Country does this flag belong to?",
            R.drawable.ireland,
            "India", "Ireland",
            "Spain", "Hungary",
            2
        )
        questionList.add(que34)

        //35
        val que35 = Question(
            35, "What Country does this flag belong to?",
            R.drawable.southafrica,
            "Congo", "Ireland",
            "South africa", "Hungary",
            3
        )
        questionList.add(que35)
        //36
        val que36 = Question(
            36, "What Country does this flag belong to?",
            R.drawable.kuwait,
            "Congo", "Ireland",
            "Kuwait ", "Hungary",
            3
        )
        questionList.add(que36)

          //37
        val que37 = Question(
            35, "What Country does this flag belong to?",
            R.drawable.syria,
            "Congo", "Syria",
            "Mexico", "Hungary",
            2
        )
        questionList.add(que37)
            //38
        val que38 = Question(
            35, "What Country does this flag belong to?",
            R.drawable.congo,
            "Congo", "Syria",
            "Mexico", "Hungary",
            1
        )
        questionList.add(que38)
        return questionList

    }
}