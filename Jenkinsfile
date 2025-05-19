pipeline {
    agent {
    docker {
        image 'openjdk:17'
        args '-u root' // Para permitir instalación dentro del contenedor
    }
}

    tools {
        jdk 'JDK17' 
    }

    stages {
        stage('Preparar') {
            steps {
                echo 'Preparando entorno de build...'
                sh 'kotlinc -version'
            }
        }

        stage('Compilar') {
            steps {
                echo 'Compilando errores.kt...'
                sh 'kotlinc errores.kt -include-runtime -d errores.jar'
            }
        }

        stage('Ejecutar tests') {
            steps {
                echo 'Ejecutando pruebas (main)...'
                sh 'java -jar errores.jar'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finalizado.'
        }
        failure {
            echo 'Ocurrió un error durante el pipeline.'
        }
    }
}
