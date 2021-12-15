// Originator class
class Editor {
    private var content: String = ""

    fun createState(): EditorState {
        return EditorState(content)
    }

    fun restore(state: EditorState) {
        content = state.getContent()
    }

    fun getContent(): String {
        return content
    }

   fun setContent(content: String) {
        this.content = content
    }
}
