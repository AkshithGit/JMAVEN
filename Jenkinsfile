pipeline {
  agent any 
  stages {
    stage("test"){
      steps{
        echo "Hi this is a test stage"
      }
    }
    stage("build"){
      steps{
        echo "Hi this is a build stage"
      }
    }
    stage("test"){
      steps{
        echo "Hi this is a deploy stage"
      }
    }
  }
}
