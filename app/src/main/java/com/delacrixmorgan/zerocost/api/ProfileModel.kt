package com.delacrixmorgan.zerocost.api

import com.google.gson.annotations.SerializedName

/**
 * com.delacrixmorgan.zerocost.api
 * ZeroCost
 *
 * Created by morgan on 21/10/2018.
 * Copyright (c) 2018 Apptivity Lab. All Rights Reserved.
 */

object ProfileModel {
    //Data - first_name, nric, address, contact, income_tax (optional)
    data class Result(
        @SerializedName("first_name")
        val firstName: String = "Aerith",

        @SerializedName("nric")
        val nric: String = "920215-10-9855",

        @SerializedName("address")
        val address: String = "Aerith",

        @SerializedName("income_tax")
        val incomeTax: String = "1234567890"
    )
}