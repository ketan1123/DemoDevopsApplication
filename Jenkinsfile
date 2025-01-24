pipeline {
  agent any
  environment {
    DOCKER_IMAGE = "ketan897654/demo_devops:latest"
  }
  stages {
    stage('Clone Repository') {
      steps {
        script {
          checkout scm
        }
      }
    }
    stage('Build Maven Project') {
      steps {
        script {
          bat 'mvn clean package'
        }
      }
    }
    stage('Build Docker Image') {
      steps {
        script {
          bat "docker build -t ${DOCKER_IMAGE} ."
        }
      }
    }
    stage('Push Docker Image to Dockerhub') {
      steps {
        script {
          withDockerRegistry([credentialsId: '8f21f922-09cb-4cf6-944e-e353b46fd9f4', url: 'https://index.docker.io/v1/']) {
            bat "docker push ${DOCKER_IMAGE}"
          }
        }
      }
    }
    stage('Deploy to Kubernetes') {
      steps {
        script {
          bat 'kubectl apply -f deployment.yaml'
        }
      }
    }
  }
  post {
    success {
      echo "Pipeline executed successfully!"
    }
    failure {
      echo "Pipeline failed."
    }
   
  }
}
