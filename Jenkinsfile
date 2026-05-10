pipeline {
    agent any

    tools {
        maven 'MyMaven'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                url: 'https://github.com/vikas-1421/MyMavenFirefoxApp.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {

        success {
            echo 'MyMavenFirefoxApp Build Successful'
        }

        failure {
            echo 'Build Failed'
        }

        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
