// このファイルが属するパッケージを指定する
package com.donghyun.simpleapi

// GETリクエストを処理するためのアノテーション
import org.springframework.web.bind.annotation.GetMapping
// クラスをREST APIのコントローラーとして登録するためのアノテーション
import org.springframework.web.bind.annotation.RestController

// HTTPリクエストを処理するRESTコントローラーとして登録する
@RestController
class HelloController {
    
    // GET / のリクエストをこのメソッドに割り当てる
    @GetMapping("/")
    fun hello(): String {
        // HTTPレスポンスとして文字列を返す
        return "Hello Spring!"
    }
}