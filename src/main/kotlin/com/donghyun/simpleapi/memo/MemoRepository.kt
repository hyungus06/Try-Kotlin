package com.donghyun.simpleapi.memo

import org.springframework.jdbc.core.simple.JdbcClient
import org.springframework.stereotype.Repository

@Repository
class MemoRepository(
    private val jdbcClient: JdbcClient
) {
    
    fun save(content: String) {
        jdbcClient.sql(
            """
            INSERT INTO memo (content)
            VALUES (:content)
            """
        ).param("content", content).update()
    }
}