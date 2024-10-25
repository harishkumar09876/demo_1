def call() {
    post {
        success {
            mail to: 'harishkumarbsr006@gmail.com',
                subject: "SUCCESS: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
                body: "Good news, the job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' has succeeded."
        }
        failure {
            mail to: 'harishkumarbsr006@gmail.com',
                subject: "FAILURE: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
                body: "Unfortunately, the job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' has failed."
        }
        always {
            cleanWs()
        }
    }
}


