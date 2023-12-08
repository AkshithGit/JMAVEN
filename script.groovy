def buildJar() {
    echo "Building the application"
    sh 'mvn package'
}
def buildImage() {
     echo "Building the docker image"
     withCredentials([
          usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'USER', passwordVariable: 'PASS')
              ]){
                sh 'docker build -t darkmatterdocker/java-maven-app:1.1.0 .'
                sh "echo $PASS | docker login -u $USER --password-stdin"
                sh 'docker push darkmatterdocker/java-maven-app:1.1.0'
                }
}
def deployApp() {
    echo "Deploying the application"
}

return this
