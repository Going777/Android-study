package com.example.searchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.RadioGroup
import androidx.core.widget.addTextChangedListener
import com.example.searchapp.utils.onMyTextChanged
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    enum class SEARCH_TYPE {
        PHOTO,
        USER
    }

    val TAG: String = "로그"

    private var currentSearchType: SEARCH_TYPE = SEARCH_TYPE.PHOTO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity")


//        라디오 그룹 가져오기
        val searchTermLayout = findViewById<TextInputLayout>(R.id.search_term_layout)
        val editText = findViewById<EditText>(R.id.search_term_edit_text)
        val radioGroup = findViewById<RadioGroup>(R.id.search_term_radio_group)
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when(checkedId) {
                R.id.photo_search_radio_btn -> {
                    Log.d(TAG, "사진검색버튼 클릭~!")
                    searchTermLayout.hint = "사진검색"
                    searchTermLayout.startIconDrawable = resources.getDrawable(R.drawable.baseline_photo_library_24, resources.newTheme())
                    this.currentSearchType = SEARCH_TYPE.PHOTO
                }
                R.id.user_search_radio_btn -> {
                    Log.d(TAG, "사용자검색버튼 클릭~!")
                    searchTermLayout.hint = "사용자검색"
                    searchTermLayout.startIconDrawable = resources.getDrawable(R.drawable.baseline_person_24, resources.newTheme())
                    this.currentSearchType = SEARCH_TYPE.USER

                }
            }
        }

        val frameSearchBtn = findViewById<include>(R.id.frame_search_btn)
        editText.onMyTextChanged {
            if(it.toString().count() > 0) {

            }
        }
    }
}