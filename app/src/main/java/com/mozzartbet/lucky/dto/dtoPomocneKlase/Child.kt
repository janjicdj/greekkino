package com.mozzartbet.lucky.dto.dtoPomocneKlase

import com.example.example.LottoOffer
import com.example.example.Offer

class Child(lotoOffer: LottoOffer):Base(1){
    var lotoOffer: LottoOffer = lotoOffer
        private set
}