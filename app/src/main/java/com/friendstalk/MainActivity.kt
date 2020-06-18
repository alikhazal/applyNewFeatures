package com.friendstalk


import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    val colleagueList = arrayListOf("Hussein", "Mitch", "Chulaka", "Ali", "Ivan" )
    val phoneList = arrayListOf("11112222", "33334444", "55556666","77778888","99990000")
   // val imageList = arrayListOf("wael.jpg", "mitch.png", "chulaka.jpg", "ali.png", "ivan.jpg")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        chooseBtn.setOnClickListener{
            val random = Random()
            val randomColleague = random.nextInt(colleagueList.count())
            selectedColleague.text = colleagueList[randomColleague]
            selectedPhone.text = phoneList[randomColleague]

        }
        addBtn.setOnClickListener {
            val newColleague = addName.text.toString()
            colleagueList.add(newColleague)
            val newPhone = addPhone.text.toString()
            phoneList.add(newPhone)
            addName.text.clear()
            addPhone.text.clear()

        }


    }
}