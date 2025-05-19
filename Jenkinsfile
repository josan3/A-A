pipeline {
    agent {
        docker {
            label 'docker-agent' // etiqueta que pusiste en el nodo
            image 'gradle:jdk11' // Imagen con Gradle y JDK 11 preinstalados
            args '-v /root/.gradle' // Para cachear dependencias
        }
    }
    stages {
        stage('Build and Test') {
            steps {
                sh './gradlew clean test'
            }
        }
    }
    post {
        always {
            junit '**/build/test-results/test/*.xml'
        }
    }
}
