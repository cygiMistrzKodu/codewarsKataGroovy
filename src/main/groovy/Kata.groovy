class Kata {
    static countBy(int x, int n) {
        return (1..n).stream().map { it * x}.collect()
    }
}