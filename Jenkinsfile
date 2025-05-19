pipeline {
    agent {
        docker {
            image 'kotlin-jenkins-agent' // o la imagen que hayas creado
        }
    }
    stages {
        stage('Compilar y ejecutar') {
            steps {
                sh 'kotlinc errores.kt -include-runtime -d errores.jar'
                sh 'java -jar errores.jar'
            }
        }
    }
}
