package com.example.myapplication
import android.util.Log

open class Dog: Animal{

    // 引数付きコンストラクタ
    constructor(name: String, age: Int) : super(name, age){
        this.name = name
        this.age = age
    }

    // メソッド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" )
    }

}