class Kata {
    static sumMul(int n, int m) {

        if (m <= 0 || n > m) {
            return 'INVALID'
        }

        def multiplesSum = 0d
        def multiplesOfN = 0d

        while (multiplesOfN < m) {

            multiplesSum += multiplesOfN
            multiplesOfN += n

        }

        return multiplesSum

    }
}