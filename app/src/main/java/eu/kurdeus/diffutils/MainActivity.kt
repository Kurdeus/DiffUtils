package eu.kurdeus.diffutils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import eu.kurdeus.diffutils.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //adapter
    private val dfAdapter by lazy { DiffAdapter() }

    //binding
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //set adapter
        dfAdapter.differ.submitList(addData())
        binding.dfRv.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = dfAdapter}


    }


    fun addData():MutableList<DataClass>{
        val data: MutableList<DataClass> = mutableListOf()
        data.add(DataClass("Simple Title 1"))
        data.add(DataClass("Simple Title 2"))
        data.add(DataClass("Simple Title 3"))
        data.add(DataClass("Simple Title 4"))
        data.add(DataClass("Simple Title 5"))
        data.add(DataClass("Simple Title 6"))
        data.add(DataClass("Simple Title 7"))
        data.add(DataClass("Simple Title 8"))
        data.add(DataClass("Simple Title 1"))
        data.add(DataClass("Simple Title 2"))
        data.add(DataClass("Simple Title 3"))
        data.add(DataClass("Simple Title 4"))
        data.add(DataClass("Simple Title 5"))
        data.add(DataClass("Simple Title 6"))
        data.add(DataClass("Simple Title 7"))
        data.add(DataClass("Simple Title 8"))
        data.add(DataClass("Simple Title 1"))
        data.add(DataClass("Simple Title 2"))
        data.add(DataClass("Simple Title 3"))
        data.add(DataClass("Simple Title 4"))
        data.add(DataClass("Simple Title 5"))
        data.add(DataClass("Simple Title 6"))
        data.add(DataClass("Simple Title 7"))
        data.add(DataClass("Simple Title 8"))
        data.add(DataClass("Simple Title 1"))
        data.add(DataClass("Simple Title 2"))
        data.add(DataClass("Simple Title 3"))
        data.add(DataClass("Simple Title 4"))
        data.add(DataClass("Simple Title 5"))
        data.add(DataClass("Simple Title 6"))
        data.add(DataClass("Simple Title 7"))
        data.add(DataClass("Simple Title 8"))
        data.add(DataClass("Simple Title 1"))
        data.add(DataClass("Simple Title 2"))
        data.add(DataClass("Simple Title 3"))
        data.add(DataClass("Simple Title 4"))
        data.add(DataClass("Simple Title 5"))
        data.add(DataClass("Simple Title 6"))
        data.add(DataClass("Simple Title 7"))
        data.add(DataClass("Simple Title 8"))
        data.add(DataClass("Simple Title 1"))
        data.add(DataClass("Simple Title 2"))
        data.add(DataClass("Simple Title 3"))
        data.add(DataClass("Simple Title 4"))
        data.add(DataClass("Simple Title 5"))
        data.add(DataClass("Simple Title 6"))
        data.add(DataClass("Simple Title 7"))
        data.add(DataClass("Simple Title 8"))
        return data

    }
}