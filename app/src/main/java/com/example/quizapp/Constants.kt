package com.example.quizapp

object Constants{

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions():ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Which country does this flag belongs to ?", R.drawable.america,
            "Australia",
            "Sweeden",
            "USA",
            "Turkey",
            3
        )
        questionList.add(que1)
        val que2 = Question(
            2,
            "Which country does this flag belongs to ?", R.drawable.brazil,
            "Australia",
            "Sweeden",
            "Brazil",
            "Turkey",
            3
        )
        questionList.add(que2)
        val que3 = Question(
            3,
            "Which country does this flag belongs to ?", R.drawable.british,
            "Australia",
            "Sweeden",
            "British",
            "Turkey",
            3
        )
        questionList.add(que3)
        val que4 = Question(
            4,
            "Which country does this flag belongs to ?", R.drawable.france,
            "Australia",
            "Sweeden",
            "France",
            "Turkey",
            3
        )
        questionList.add(que4)
        val que5 = Question(
            5,
            "Which country does this flag belongs to ?", R.drawable.germany,
            "Australia",
            "Sweeden",
            "Germany",
            "Turkey",
            3
        )
        questionList.add(que5)
        val que6 = Question(
            6,
            "Which country does this flag belongs to ?", R.drawable.hungary,
            "Australia",
            "Sweeden",
            "Hungary",
            "Turkey",
            3
        )
        questionList.add(que6)
        val que7 = Question(
            7,
            "Which country does this flag belongs to ?", R.drawable.italy,
            "Australia",
            "Sweeden",
            "USA",
            "Turkey",
            3
        )
        questionList.add(que7)
        val que8 = Question(
            8,
            "Which country does this flag belongs to ?", R.drawable.poland,
            "Australia",
            "Sweeden",
            "USA",
            "Turkey",
            3
        )
        questionList.add(que8)
        val que9 = Question(
            9,
            "Which country does this flag belongs to ?", R.drawable.spain,
            "Australia",
            "Sweeden",
            "USA",
            "Turkey",
            3
        )
        questionList.add(que9)
        val que10 = Question(
            10,
            "Which country does this flag belongs to ?", R.drawable.sweeden,
            "Australia",
            "Sweeden",
            "USA",
            "Turkey",
            3
        )
        questionList.add(que10)
        return questionList
    }
}