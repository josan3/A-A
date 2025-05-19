pipeline {
  agent any
  stages {
    stage('Check Docker') {
      steps {
        sh 'which docker || echo "Docker no disponible"'
        sh 'docker --version || echo "Docker no se puede ejecutar"'
      }
    }
  }
}
