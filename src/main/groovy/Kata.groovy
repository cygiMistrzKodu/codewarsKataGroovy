class Kata {
    static def dative(String word) {

        def frontVowels = ["e", "é", "i", "í", "ö", "ő", "ü", "ű"]
        def backVowels = ["a", "á", "o", "ó", "u", "ú"]

        def result = ""

        frontVowels.forEach {

            if (word.contains(it)) {
                result = word.concat("nek")
            }
        }

        backVowels.forEach {

            if (word.contains(it)) {
                result = word.concat("nak")
            }
        }

        result
    }
}