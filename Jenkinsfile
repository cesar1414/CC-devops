pipeline {
    agent any

    stages {
        stage ('Build') {
            steps {
                sh './webapplication/gradlew clean assemble -p webapplication'
            }
        }
        stage ('Testing') {
            steps {
                sh './webapplication/gradlew test -p webapplication'
                junit '**/test-results/test/*.xml'
            }
        }
        stage ('Publish') {
            steps {
                sh './webapplication/gradlew uploadArchives -p webapplication'
                archiveArtifacts artifacts: '**/repos/*.war'
            }
        }
    }
}
