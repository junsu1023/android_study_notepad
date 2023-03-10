package com.example.domain.usecase

import com.example.domain.repository.NotePadRepository

class DeleteMemoUseCase(private val notePadRepository: NotePadRepository) {
    suspend fun invoke(position: Int) = notePadRepository.deleteMemo(position)
}