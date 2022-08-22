@Library('Devops_library@main') _
def call(body) {
def config = [:]
body.resolveStrategy = Closure.DELEGATE_FIRST
body.delegate = config
body()
node
{
  stage('Gitcheckout')
  {
     sourcecheckout("https://github.com/demuduraviteja/myshared-lib.git","main")
  }
}
}
