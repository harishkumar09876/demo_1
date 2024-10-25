def call() {
    // No need for `post` block here
    mail to: 'harishkumarbsr006@gmail.com',
         subject: "Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' Status",
         body: "The job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' has ${currentBuild.currentResult.toLowerCase()}."
    cleanWs()
}


