def gv
pipeline{
    agent any 
    tools {
        maven 'AkkiMaven'
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
                   gv.buildJar()
            }
        }
        stage("Build image"){
            steps{
                script{
                    buildImage()
            }
            }
        }
        stage("deploying"){
            steps{
                script { 
                   gv.buildApp()
                }
            }
        }
    }
}
