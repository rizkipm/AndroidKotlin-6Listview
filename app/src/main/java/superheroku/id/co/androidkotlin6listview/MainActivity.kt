package superheroku.id.co.androidkotlin6listview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var array = arrayOf("Melbourne", "Vienna", "Vancouver", "Toronto", "Calgary", "Adelaide", "Perth", "Auckland", "Helsinki", "Hamburg", "Munich", "New York", "Sydney", "Paris", "Cape Town", "Barcelona", "London", "Bangkok")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
