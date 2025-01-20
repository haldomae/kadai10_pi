package com.hal_domae.kadai10_pi

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // Activityが生成される時に実行される
    // 最初にしか実行しない
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("LifeCycle", "MainActivityのonCreateが実行")
        super.onCreate(savedInstanceState)
        // アプリのヘッダーを表示するかどうか
        // フルスクリーンでアプリを表示できる
        enableEdgeToEdge()
        // レイアウトの設定(どのXMLを使うか)
        setContentView(R.layout.activity_main)
        // アプリの画面がステータスバーやナビゲーションバーに重ならないようにしてくれる
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // Activityがユーザに見える状態になった時に実行される
    // 操作可能になるまでの間実行される
    // 初期化処理などを行う
    // 画面遷移で元に時にも実行される
    override fun onStart() {
        Log.i("LifeCycle", "MainActivityのonStartが実行")
        super.onStart()
    }

    // Activityが前面に表示され、ユーザとやり取りが可能になる直前に実行される
    // Activityがユーザに表示可能になる為に必要な処理をする(DB処理、必要な情報を画面にセットする)
    // 割り込み処理の発生(アプリ表示中に電話がくるなど)してActivityが一時停止して、再開すると再びonResume()が実行される
    override fun onResume() {
        Log.i("LifeCycle", "MainActivityのonResumeが実行")
        super.onResume()
    }

    // アプリがバックグラウンドに移動した事を示す為に実行される
    // Activityが一時停止状態になっている為、Activityがきえるとは限らない
    // 処理を停止しておく時などに使用する
    // 非常に短いので、データの保存等は行わない
    override fun onPause() {
        Log.i("LifeCycle", "MainActivityのonPauseが実行")
        super.onPause()
    }

    // アプリが完全にバックグランドに移動した時に実行される
    // Activityは非表示になり、停止する
    // 不要なリソースを解放したり、アニメーションの停止などの処理の負荷を抑えるような事を行う
    override fun onStop() {
        Log.i("LifeCycle", "MainActivityのonStopが実行")
        super.onStop()
    }

    // Activityの再表示の際に実行される
    // アプリキル(Activityが消滅)されるときには実行されない
    override fun onRestart() {
        Log.i("LifeCycle", "MainActivityのonRestartが実行")
        super.onRestart()
    }

    // Activityが破棄されるときに実行される
    // アプリキル(Activityが消滅)されたとき
    // 画面構成の変更(回転やテーマ変更など)されたときにも実行される
    override fun onDestroy() {
        Log.i("LifeCycle", "MainActivityのonDestroyが実行")
        super.onDestroy()
    }
}