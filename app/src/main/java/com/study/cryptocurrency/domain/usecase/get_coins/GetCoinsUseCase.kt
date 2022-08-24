package com.study.cryptocurrency.domain.usecase.get_coins

import com.study.cryptocurrency.common.Resource
import com.study.cryptocurrency.domain.model.Coin
import com.study.cryptocurrency.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        repository.getCoins().collect {
            emit(it)
        }
    }
}