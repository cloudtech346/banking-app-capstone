pipeline {
    agent any

    stages {

        stage('Git Checkout') {
            steps {
                git 'https://github.com/cloudtech346/banking-app.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run Application') {
            steps {
                sh '''
                pkill -f demo || true
                nohup java -jar target/demo-0.0.1-SNAPSHOT.jar --server.port=8081 > app.log 2>&1 &
                '''
            }
        }
    }
}
