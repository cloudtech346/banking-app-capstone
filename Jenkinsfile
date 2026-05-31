pipeline {
    agent any

    stages {

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
