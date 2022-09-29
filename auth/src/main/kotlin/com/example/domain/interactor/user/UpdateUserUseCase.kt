package com.example.domain.interactor.user

import com.example.domain.entity.User
import com.example.domain.repository.UserRepository

class UpdateUserUseCase(private val userRepository: UserRepository) {
    suspend operator fun invoke(user: User): User? = userRepository.updateUser(user)
}