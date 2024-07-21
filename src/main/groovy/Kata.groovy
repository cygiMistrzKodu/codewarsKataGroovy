class Kata {
    static def switcheroo(String string) {

        def abMap = ['a': 'b', 'b': 'a']
        string.split('').collect { sign -> abMap.getOrDefault(sign, sign) }.join('')

    }
}
