package com.study.cryptocurrency.domain.repository

import com.study.cryptocurrency.common.Resource
import com.study.cryptocurrency.domain.model.Coin
import com.study.cryptocurrency.domain.model.CoinDetail
import kotlinx.coroutines.flow.Flow

interface CoinRepository {
    suspend fun getCoins(): Flow<Resource<List<Coin>>>
    suspend fun getCoinById(coinId: String): Flow<Resource<CoinDetail>>
}