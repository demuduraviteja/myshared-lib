def call(def giturl, def branch)
{
  echo ""
  echo "******* Git URL : ${giturl} *******"
  echo ""
  echo "******* branch : ${branch} *******"
  echo ""
  if (giturl.contains("github.com"))
  {
    checkout([$class: 'GitSCM', branches: [[name: branch]], extensions: [], userRemoteConfigs: [[credentialsId: 'githubcredentials', url: giturl]]])
  }
  else
  {
    error("please provide valid github url")
  }
}
