package cat.moki.myapplication

import android.content.res.Resources
import android.graphics.drawable.TransitionDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //          getResources
        val trans = resources.getDrawable(R.drawable.transition) as TransitionDrawable
        //findViewById(R.id.background)
        background.background = trans


        thread {
            while (true){
                trans.startTransition(1000)
                Thread.sleep(1000)
                trans.reverseTransition(1000)
                Thread.sleep(1000)
            }
        }
    }

}