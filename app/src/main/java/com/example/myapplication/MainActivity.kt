package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        Log.d("kotlintest", "ログへの出力テスト")
        Log.d("tag","logtest")

        val num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest", "10 + 5 - 2 * 4 / 2 = " + num1)

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest", "num2 < num3 = " + (num2 < num3))

        val flag3 = true
        val flag4 = false
        Log.d("kotlintest", "flag3 && flag4 = " + (flag3 && flag4))

        val num = 60

        if (num >= 90) {
            Log.d("kotlintest", "優")
        } else if (num >= 75) {
            Log.d("kotlintest", "良")
        } else if (num >= 60) {
            Log.d("kotlintest", "可")
        } else {
            Log.d("kotlintest", "不可")
        }

        val drink = 1

        when (drink) {
            0 -> {
                Log.d("kotlintest", "コーヒーを注文しました")
            }
            1 -> Log.d("kotlintest", "紅茶を注文しました")
            2 -> Log.d("kotlintest", "ミルクを注文しました")
            else -> Log.d("kotlintest", "オーダーミスです")
        }

        val num6 = 60
        val str = if (num6 >= 90) "優" else "その他"

        var num7 = 0

        while (num7 < 10) {
            Log.d("kotlintest", Integer.toString(num7))
            num7++
        }

        var num8 = 1
        while (num8 < 6) {
            Log.d("kotlintest", "while文の " + num8 + "回目")
            num8++
        }

        for (i in 6 downTo 0 step 2) {
            Log.d("kotlintest", "downTo関数の" + i + "の回")
        }

        val points = arrayOf(10, 6, 15, 23, 17)

        for (i in points) {
            Log.d("kotlintest", i.toString())
        }*/

        val dog1=Dog("わんわん",1);
        dog1.say()
    }
}
