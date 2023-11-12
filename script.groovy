def buildJar() {
                echo "Building the application...."
                sh "mvn package"  
}
def buildImage() {
  echo "Building the docker image"
  withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'PASS', usernameVariable:'USER')]){
                    sh 'docker build -t darkmatterdocker/java-maven-application:jma-3.0 .'
                    sh "echo $PASS | docker login -u $USER --password-stdin"
                    sh "docker push darkmatterdocker/java-maven-application:jma-3.0"
                }
}
def deployApp(){
  echo "deploying the application...."
}

return this
