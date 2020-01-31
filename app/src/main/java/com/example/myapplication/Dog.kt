package com.example.myapplication
import android.util.Log

class Dog(var name: String, var age: Int) {
    // プロパティの初期化以外の処理を記述する場合はinitを使う
    init {
        // 処理
        Log.d("kotlintest", "これは犬クラスです。")
    }

    // コンパニオンオブジェクトを使用した方法
    companion object {
        val to_jp = "犬"

        fun introduce() {
            Log.d("kotlintest", "これは犬クラスです。")
        }
    }
    // メソッド
    fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}