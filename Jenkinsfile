pipeline {
    agent any

    triggers { cron('* * * * *') }

    stages {
        stage("Commit") {
            steps {
                sh 'sleep 1m'
            }
        }
    }
}
