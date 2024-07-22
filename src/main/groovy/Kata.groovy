class Kata {
    static String oddOrEven(List<Integer> list) {

        if (list.isEmpty()) {
            return 'even'
        }

        list.sum() % 2 == 0 ? 'even' : 'odd'

    }
}