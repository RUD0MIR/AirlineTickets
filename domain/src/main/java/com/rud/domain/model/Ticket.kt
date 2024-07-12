package com.rud.domain.model

data class Ticket(
    val id: Int,
    val badge: String,
    val price: Int,
    val providerName: String,
    val company: String,
    val departure: Destination,
    val arrival: Destination,
    val hasTransfer: Boolean,
    val hasVisaTransfer: Boolean,
    val luggage: Luggage,
    val handLuggage: HandLuggage,
    val isReturnable: Boolean,
    val isExchangeable: Boolean
)