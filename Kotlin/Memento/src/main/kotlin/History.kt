// Caretaker class
class History {
    private val states: MutableList<EditorState> = mutableListOf()

    fun push(state: EditorState) {
        states.add(state)
    }

    fun pop(): EditorState {
        val lastIndex = states.size - 1
        val lastState = states.elementAt(lastIndex)
        states.remove(lastState)
        return lastState
    }
}
