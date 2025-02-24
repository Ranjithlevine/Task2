pipeline {
    agent any

    tools {
        maven 'Maven3' // Use the configured Maven tool
    }

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/your-repo-url.git' // Replace with your repo
            }
        }

        stage('Install Dependencies') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Publish Extent Reports') {
            steps {
                publishHTML (target: [
                    allowMissing: true,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'test-output',
                    reportFiles: 'ExtentReport.html',
                    reportName: 'Extent Reports'
                ])
            }
        }
    }
}
