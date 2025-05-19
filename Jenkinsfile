pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build and Test') {
            steps {
                bat 'gradlew.bat clean test'
            }
        }
    }

    post {
        always {
            junit '**\\build\\test-results\\test\\*.xml'
        }
    }
}

