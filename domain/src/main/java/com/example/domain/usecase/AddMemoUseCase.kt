package com.example.domain.usecase

import com.example.domain.repository.NotePadRepository

class AddMemoUseCase(private val notePadRepository: NotePadRepository) {
    suspend operator fun invoke() = notePadRepository.addMemo()
}