def call(Map value = [:]) {
  loadEmpScript("info.sh")
  sh "./info.sh ${value.name} ${value.age}"
}
