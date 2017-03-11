pipeline {
    agent any

    triggers { pollSCM('* * * * *') }

    stages {
        stage("Commit") {
            steps {
                sh 'sleep 1m'
            }
        }
    }
}
