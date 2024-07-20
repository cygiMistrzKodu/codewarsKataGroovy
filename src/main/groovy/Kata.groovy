class Kata {
    static def orderedCount(String input) {

        def signList = input.split('').toList()

        def singCountMap = [:]
        signList.forEach { sign ->
            singCountMap.put(sign, input.count(sign))
        }

        return singCountMap.collect {key , value -> new Tuple(key as String,value)}

    }
}
