pipeline {
  agent any 
  parameters {
     choice(name: 'VERSION', choices: ['1.1.0','1.2.0','1.3.0', description: '')
     booleanParam(name: 'executeTests', defaultValue: true, description: '')
  }
  stages {
    stage("test"){
      when {
        expression{
          params.executeTests
        }
      }
      steps{
        echo "Hi this is a test stage"
      }
    }
    stage("build"){
      
      steps{
        echo "Hi this is a build stage"
      }
    }
    stage("deploy"){
      steps{
        echo "Hi this is a deploy stage"
        echo "deploy the version ${params.VERSION}"
      }
    }
  }
}
