package Tomteland

class Tomteland {

    var tomteMap = mapOf(
        "Tomten" to listOf("Glader", "Butter"),
        "Glader" to listOf("Trötter", "Blyger", "Tröger"),
        "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"),
        "Trötter" to listOf("Skumtomten"),
        "Skumtomten" to listOf("Dammråttan"),
        "Räven" to listOf("Gråsuggan", "Myran"),
        "Myran" to listOf("Bladlusen")
    )

    fun getUnderlings(currentName: String): List<String> {
        val res = mutableListOf<String>()
        fun underling(find: MutableList<String>) {
            for (i in 0 until find.size) {
                if (!tomteMap[find[i]].isNullOrEmpty()) {
                    val underlings = tomteMap[find[i]]!!
                    res.addAll(underlings)
                    underling(underlings.toMutableList())
                }
            }
        }
        underling(mutableListOf(currentName))
        return res
    }

}
fun main() {
    val tomteland = Tomteland()
    while (true) {
        print("Ange namn på tomte eller underordnad: ")
        val name = readLine()
        if (name != null) {
            val underlings = tomteland.getUnderlings(name)
            if (underlings.isNotEmpty()) {
                println("Underordnade till $name: $underlings \n")
            } else {
                println("Hm, $name verkar inte ha några underordnade eller så finns $name inte i registret. Testa ange en annan tomte! \n")
            }
        }
    }
}