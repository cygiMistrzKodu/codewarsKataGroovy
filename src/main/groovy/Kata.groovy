class Kata{
    public static final notes = ["C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"]
    static chords(String root){

        def rootNotePosition = notes.indexOf(root)

        def secondMajorSemitone = foundSemitonePosition(rootNotePosition, 4)
        def secondMinorSemitone = foundSemitonePosition(rootNotePosition, 3)
        def thirdSemitone = foundSemitonePosition(rootNotePosition, 7)


        def majorChord = [root,notes[secondMajorSemitone] , notes[thirdSemitone]]
        def minorChord = [root,notes[secondMinorSemitone] , notes[thirdSemitone]]

        [majorChord,minorChord]


    }

    private static int foundSemitonePosition(int rootNotePosition, int semitonePositionFromRoot) {
        def searchSemitonePosition = rootNotePosition + semitonePositionFromRoot

        if (searchSemitonePosition >= notes.size()) {
            searchSemitonePosition = searchSemitonePosition -  notes.size()
        }
        searchSemitonePosition
    }
}