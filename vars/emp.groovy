def call(Map info = [:]) {
  sh "echo NAME:${info.name} AGE:${info.age}"
}
