package kg.example.lovecalculator.network.model

data class Result(
    val chapters_quantity: Int,
    val created_at: String,
    val description: String,
    val dir: String,
    val en_name: String,
    val genre: List<Int>,
    val id: Int,
    val image: String,
    val issue_year: Int,
    val likes: Int,
    val rating: Double,
    val ru_name: String,
    val type: String,
    val updated_at: String
)