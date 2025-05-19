pipeline {
    agent {
        docker {
            image 'jetbrains/kotlin:1.9.0-jdk17'
        }
    }

    stages {
        stage('Compilar y Ejecutar') {
            steps {
                sh 'kotlinc errores.kt -include-runtime -d errores.jar'
                sh 'java -jar errores.jar'
            }
        }
    }
}
