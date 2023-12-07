pipeline {
    agent any 
    stages{
        stage("Build Jar") {
            steps {
                script{
                   echo "Building the application"
                   sh 'mvn package'
                }
            }
        }
        stage("Build Image") {
            steps{
                script{
                    echo "Building the docker image"
                    withCredentials([
                      usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'USER', passwordVariable: 'PASS')
                    ]){
                        sh 'docker build -t darkmatterdocker/java-maven-app:1.1.0 .'
                        sh "echo $PASS | docker login -u $USER --password-stdin"
                        sh 'docker push darkmatterdocker/java-maven-app:1.1.0'
                    }
                }
            }
        }
    }
}
