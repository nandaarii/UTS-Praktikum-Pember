package com.example.utspembernew

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    lateinit var recycleview: RecyclerView
    lateinit var recycleAdapter: ItemAdapter
    lateinit var datalist: ArrayList<Data>

    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        recycleview = findViewById(R.id.recycle_id)
        datalist = ArrayList()

        val layoutManager = GridLayoutManager(this, 1)
        recycleview.layoutManager = layoutManager
        recycleAdapter = ItemAdapter(datalist, this)

        recycleview.adapter = recycleAdapter
        datalist.add(Data("Iron Man", "2 jam 6 menit", "2008", R.drawable.ironmann))
        datalist.add(Data("The Incredible Hulk", "1 jam 52 menit", "2008", R.drawable.hulksatu))
        datalist.add(Data("Iron Man 2", "2 jam 5 menit", "2010", R.drawable.ironmannn))
        datalist.add(Data("Thor", "1 jam 54 menit", "2011", R.drawable.thorsatu))
        datalist.add(Data("Captain America", "2 jam 4 menit", "2011", R.drawable.captainsatu))
        datalist.add(Data("Marvel's The Avengers", "2 jam 2 menit", "2012", R.drawable.avengers))
        datalist.add(Data("Iron Man 3", "2 jam 10 menit", "2013", R.drawable.ironmannnn))
        datalist.add(Data("Thor: The Dark World ", "1 jam 52 menit", "2013", R.drawable.thedark))
        datalist.add(Data("Catain America: The Winter Soldier", "2 jam 16 menit", "2014", R.drawable.captaindua))
        datalist.add(Data("Guardians of the galaxy", "2 jam 2menit", "2014", R.drawable.guardians))
        datalist.add(Data("Avengers: Age of Ultron", "2 jam 21 menit", "2015", R.drawable.avengersage))
        datalist.add(Data("Ant-Man", "1 jam 58 menit", "2015", R.drawable.antmann))
        datalist.add(Data("Captain America: civil war", "2 jam 28 menit", "2016", R.drawable.civilwar))
        datalist.add(Data("Doctor Strange", "1 jam 55 menit", "2016", R.drawable.doctorsatu))
        datalist.add(Data("Black Panther", "2jam 7 menit", "2018", R.drawable.blackpantherr))
        datalist.add(Data("Avengers: Infinity war", "2 jam 29 menit", "2018", R.drawable.infinity))
        datalist.add(Data("Avengers: End Game", "3 jam 1 menit", "2019", R.drawable.endgame))
        datalist.add(Data("SpiderMan: Far From Home ", "2 jam 9 menit", "2019", R.drawable.farfrom))
        datalist.add(Data("Doctor Strange in the Multiverse of Madness", "2 jam 6 menit", "2022", R.drawable.multivers))
        datalist.add(Data("Thor: Love and Thunder", "1 jam 59 menit", "2022", R.drawable.love))
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.top_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.grid_id ->{
                startActivity(Intent(this@MainActivity2, MainActivity::class.java))
                true
            }
            else ->return super.onOptionsItemSelected(item)
        }
        return super.onOptionsItemSelected(item)
    }
}
