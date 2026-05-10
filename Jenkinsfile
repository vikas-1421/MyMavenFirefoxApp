pipeline {
    agent any

    tools {
        maven 'MyMaven'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                url: 'https://github.com/vikas-1421/MyMavenFirefox.git'
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
            echo 'MyMavenSeleniumApp04 Build Successful'
        }

        failure {
            echo 'Build Failed'
        }

        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
