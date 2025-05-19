pipeline {
    agent any

    environment {
        KOTLIN_VERSION = '1.9.0'
        KOTLIN_HOME = "${env.WORKSPACE}/kotlin"
        PATH = "${env.KOTLIN_HOME}/bin:${env.PATH}"
    }

    stages {
        stage('Setup Kotlin') {
            steps {
                sh '''
                curl -s -L -o kotlin.zip https://github.com/JetBrains/kotlin/releases/download/v${KOTLIN_VERSION}/kotlin-compiler-${KOTLIN_VERSION}.zip
                unzip -q kotlin.zip -d kotlin
                '''
            }
        }

        stage('Compile Kotlin') {
            steps {
                sh 'kotlinc MainApp.kt -include-runtime -d app.jar'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'java -jar app.jar'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished.'
        }
    }
}
