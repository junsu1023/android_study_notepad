package com.example.domain.repository

interface NotePadRepository {
    suspend fun addMemo()
    
    suspend fun deleteMemo(position: Int)

    suspend fun updateMemo(position: Int)
}