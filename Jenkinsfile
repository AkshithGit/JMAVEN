pipeline{
    agent any 
    tools {
        maven 'AkkiMaven'
    }
    
    stages{
        stage("build"){
            steps{
                echo "Building the application...."
                sh "mvn package"
            }
        }
        stage("Build image"){
            steps{
                script{
                echo "Building the docker image"
                withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'PASS', usernameVariable:'USER')])
                    sh 'docker build -t darkmatterdocker/java-maven-application:jma-3.0 .'
                    sh "echo $PASS | docker login -u $USER --password-stdin"
                    sh "docker push darkmatterdocker/java-maven-application:jma-3.0"
            }
            }
        }
        stage("deploying"){
            steps{
                echo "deploying the application...."
            }
        }
    }
}
