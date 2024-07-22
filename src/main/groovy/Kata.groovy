class Kata{
    public static final notes = ["C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"]
    static chords(String root){

        def rootIndex = notes.indexOf(root)
        def minorChord = (rootIndex + 3) % notes.size()
        def majorChord = (rootIndex + 4) % notes.size()
        def seventh = (rootIndex + 7) % notes.size()

        return [[root, notes[majorChord], notes[seventh]], [root, notes[minorChord], notes[seventh]]]

    }

}