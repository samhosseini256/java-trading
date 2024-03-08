package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Currency {

    XAU_USD ("XAU_USD"),
    USD_JPY ("USD_JPY"),
    USD_CAD ("USD_CAD"),
    NZD_USD ("NZD_USD"),
    GPB_JPY ("GPB_JPY"),
    GBP_CAD ("GBP_CAD"),
    GBP_AUD ("GBP_AUD"),
    EUR_USD ("EUR_USD"),
    EUR_NZD ("EUR_NZD"),
    EUR_JPY ("EUR_JPY"),
    EUR_GBP ("EUR_GBP"),
    EUR_CAD ("EUR_CAD"),
    EUR_AUD ("EUR_AUD"),
    CAD_JPY ("CAD_JPY"),
    AUD_USD ("AUD_USD"),
    AUD_CHF ("AUD_CHF"),
    AUD_CAD ("AUD_CAD");

    private final String Currency;
}