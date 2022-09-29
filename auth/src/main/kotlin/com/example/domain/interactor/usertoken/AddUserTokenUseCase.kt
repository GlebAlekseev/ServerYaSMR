package com.example.domain.interactor.usertoken

import com.example.domain.entity.UserToken
import com.example.domain.repository.UserTokenRepository

class AddUserTokenUseCase(private val userTokenRepository: UserTokenRepository) {
    suspend operator fun invoke(userToken: UserToken): UserToken? = userTokenRepository.addUserToken(userToken)
}
