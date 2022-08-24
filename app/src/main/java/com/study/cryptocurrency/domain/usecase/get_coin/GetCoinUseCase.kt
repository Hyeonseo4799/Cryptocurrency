package com.study.cryptocurrency.domain.usecase.get_coin

import com.study.cryptocurrency.common.Resource
import com.study.cryptocurrency.domain.model.CoinDetail
import com.study.cryptocurrency.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> {
        return flow {
            repository.getCoinById(coinId).collect {
                emit(it)
            }
        }
    }
}