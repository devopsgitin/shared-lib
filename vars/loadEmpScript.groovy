def call(String script) {
    def content = libraryResource "emp/${script}"
    writeFile file: script, text: content
    // sh "chmod +x ${script}"
}
