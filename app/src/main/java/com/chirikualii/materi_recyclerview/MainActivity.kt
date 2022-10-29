package com.chirikualii.materi_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.widget.BaseExpandableListAdapter
import com.chirikualii.materi_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    lateinit var listAdapter: ListProfileAdabter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listAdapter = ListProfileAdabter()
        listAdapter.addList(DataDummy.listProfile)

        binding.ryProfile.adapter = listAdapter

    }
}