def gv
pipeline{
    agent any 
    tools {
        maven 'Maven'
    }
    
    stages{
        stage("init"){
           steps{ 
               script{
                   gv = load"script.groovy"
               }
           }
        }
        stage("build"){
            steps{
                script{
                   gv.buildJar()
                }
            }
        }
        stage("Build image"){
            steps{
                script{
                    gv.buildImage()
            }
            }
        }
        stage("deploying"){
            steps{
                script { 
                   gv.deployApp()
                }
            }
        }
    }
}
