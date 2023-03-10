package com.example.domain.usecase

import com.example.domain.repository.NotePadRepository

class UpdateMemoUseCase(private val notePadRepository: NotePadRepository) {
    suspend operator fun invoke(position: Int) = notePadRepository.updateMemo(position)
}