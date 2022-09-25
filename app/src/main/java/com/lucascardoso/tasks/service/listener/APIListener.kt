package com.lucascardoso.tasks.service.listener

interface APIListener<T> {
    fun onSuccess(result: T)
    fun onFailure(message: String)
}