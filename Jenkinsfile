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

                sh './gradlew clean test'
            }
        }
    }

    post {
        always {
            junit '**/build/test-results/test/*.xml'  // Ruta típica de reportes de test en Gradle
        }
    }
}
