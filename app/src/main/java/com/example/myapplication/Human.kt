package com.example.myapplication
import android.util.Log
open class Human : Animal,thinkable {

    var hobby: String = ""
    // 引数付きコンストラクタ
    constructor(name: String, age: Int,hobby :String) : super(name, age){
        this.name = name
        this.age = age
        this.hobby=hobby
    }

    //私の名前は〜〜です。年は〜〜歳です。
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です"+ "年は"  + this.age + "歳です" )
    }

    override fun think()
    {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。" )
    }
}