pipeline {
    agent any
    stages {
        stage('Build') { //feature/* develop main
            steps {
                sh '.gradlew build'
            }
        }
        stage('Test') {  //develop  main
            when {
                anyOf {
                branch 'main';
                branch 'development'
         }
        }
        steps {
               sh './gradlew test'
            }
        }
        stage('Deploy') { //main
            steps {
                echo "Deploy"
            }
        }
    }
}
