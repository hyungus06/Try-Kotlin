// このファイルが属するパッケージを指定する
package com.donghyun.simpleapi

// Spring Bootの自動設定を有効にするためのアノテーション
import org.springframework.boot.autoconfigure.SpringBootApplication
// Spring Bootアプリケーションを起動するための関数
import org.springframework.boot.runApplication


// 自動設定やコンポーネントスキャンを有効にする
@SpringBootApplication
// Spring Bootアプリケーションの起点となるクラス
class SimpleapiApplication

// アプリケーションのエントリーポイント
fun main(args: Array<String>) {
    // SimpleapiApplicationを起点としてSpring Bootを起動する
	runApplication<SimpleapiApplication>(*args)
}
