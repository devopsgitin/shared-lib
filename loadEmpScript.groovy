def call(String script) {
    def content = libraryResource "resources/emp/${filename}"
    writeFile file: script, text: content
}
