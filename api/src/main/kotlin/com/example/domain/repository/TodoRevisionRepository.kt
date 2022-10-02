package com.example.domain.repository

import com.example.domain.entity.TodoItem
import com.example.domain.entity.TodoRevision

interface TodoRevisionRepository {
    suspend fun getTodoRevision(userId: String, deviceId: String): TodoRevision?
    suspend fun setTodoRevision(todoRevision: TodoRevision): TodoRevision?
}