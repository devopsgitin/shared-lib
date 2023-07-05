def call(Map value = [:]) {
  loadEmpScript("info.sh")
  sh "bash info.sh ${value.name} ${value.age}"
}
