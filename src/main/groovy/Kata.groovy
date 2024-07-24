class BMWRemover {
    static removeBMW(str) {

        if (!(str instanceof String)) {
            throw new IllegalArgumentException("This program only works for text.")
        }

        return str.findAll("[^BMWbmw]").join("")
    }
}