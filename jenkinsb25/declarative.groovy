pipeline {
    agent { label 'webserver-prod' } // Specifies where the pipeline will run

    stages {
        stage('pull'){
            steps{
                echo "we are pulling the source code from git repository"
                git 'https://github.com/harshalipatil14/deleteafterpractice.git'
            }
        }
        stage('Build') {
            steps {
                echo "Building theis app using maven"
                // Add build commands here
            }
        }
        stage('Test') {
            steps {
                echo "testing this app using Sonarqube"
                // Add test commands here
            }
        }
        stage('Deploy') {
            steps {
                echo "deploying this app to the prod server in apache tomcat"
                // Add deployment commands here
            }
        }
    }
}
    