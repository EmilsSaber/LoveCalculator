package kg.example.lovecalculator.network.model

import com.google.gson.annotations.SerializedName


//{4 items
//"fname":"Isedeath"
//"sname":"Emil"
//"percentage":"94"
//"result":"Congratulations! Good choice"
//}

data class LoveModel(
    @SerializedName("fname")
    val firsName: String,
    @SerializedName("sname")
    val secondName: String,
    val percentage: String,
    val result: String,

    )
