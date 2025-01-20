package com.hal_domae.kadai10_pi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // Activityが生成される時に実行される
    // 最初にしか実行しない
    override fun onCreate(savedInstanceState: Bundle?) {
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
}