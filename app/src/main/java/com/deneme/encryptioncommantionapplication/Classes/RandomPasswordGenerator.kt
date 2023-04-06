import kotlin.random.Random

class RandomPasswordGenerator(
    private val containNumber: Boolean,
    private val containUppercaseLetter: Boolean,
    private val containLowercaseLetter: Boolean,
    private val passwordLength: Int
) {
    private val charPool = mutableListOf<Char>()

    init {
        if (containNumber) charPool.addAll('0'..'9')
        if (containUppercaseLetter) charPool.addAll('A'..'Z')
        if (containLowercaseLetter) charPool.addAll('a'..'z')
    }

    fun generatePassword(): String {
        return buildString {
            repeat(passwordLength) {
                append(charPool[Random.nextInt(0, charPool.size)])
            }
        }
    }
}