def call(String filename) {
    def content = libraryResource "resources/emp/${filename}"
    writeFile file: filename, text: content
    sh "chmod +x ${filename}"
}
