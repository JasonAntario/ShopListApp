package com.example.shoplistapp.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem = shopListRepository.getShopItem(shopItemId)
}