package com.example.cryptotracker.feature_crypto.data.mappers

import com.example.cryptotracker.feature_crypto.data.networking.dto.CoinDto
import com.example.cryptotracker.feature_crypto.data.networking.dto.CoinPriceDto
import com.example.cryptotracker.feature_crypto.domain.Coin
import com.example.cryptotracker.feature_crypto.domain.CoinPrice
import java.time.Instant
import java.time.ZoneId

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        name = name,
        rank = rank,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}

fun CoinPriceDto.toCoinPrice(): CoinPrice {
    return CoinPrice(
        priceUsd = priceUsd,
        dateTime = Instant
            .ofEpochMilli(time)
            .atZone(ZoneId.systemDefault())
    )
}