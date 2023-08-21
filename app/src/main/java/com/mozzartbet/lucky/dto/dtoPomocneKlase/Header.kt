package com.mozzartbet.lucky.dto.dtoPomocneKlase

import com.example.example.Offer

class Header(offer: Offer, isEnabled: Boolean) : Base(0) {
    var offer: Offer = offer
        private set

    var isEnabled: Boolean = isEnabled
        private set

}