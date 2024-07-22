class Kata{
    public static final notes = ["C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"]
    static chords(String root){

        def index = notes.indexOf(root)
        [0,4,7,0,3,7].collect{notes[(index+it)%12]}.collate(3)
    }

}