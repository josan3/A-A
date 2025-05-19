pipeline {
    agent {
        docker {
            image 'zenika/kotlin'
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
