package jp.techacademy.takehito.kotlinlog

import android.util.Log

open class Human : Animal, Thinkable{

    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    //変数の設定
    var hobby: String

    //インターフェイスの設定
    override fun think() {
        Log.d("kotlintest", "私は" + hobby + "について考える。")
    }

    //コンストラクタ
    constructor(name: String, age: Int, hobby: String) : super(name, age) {
        this.hobby = hobby
    }
}