def gv 
pipeline {
    agent any 
    tools {
        maven 'Maven'
    }
    stages{
        stage("init"){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }
        stage("Build Jar") {
            steps {
                script{
                   gv.buildJar()
                }
            }
        }
        stage("Build Image") {
            steps{
                script{
                   gv.buildImage()
                }
            }
        }
        stage("deploy"){
            steps {
                script{
                    gv.deployApp()
                }
            }
        }
    }
}
