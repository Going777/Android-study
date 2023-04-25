package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ListViewMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_main)

        val list_item = mutableListOf<ListViewModel>()

        list_item.add(ListViewModel("a","A"))
        list_item.add(ListViewModel("b","B"))
        list_item.add(ListViewModel("c","C"))

        val listview = findViewById<ListView>(R.id.mainListview)

        val listAdapter = ListViewAdapter(list_item)
        listview.adapter = listAdapter
    }
}