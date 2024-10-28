def call(String alertTo) {
    // Assuming alertTo can be 'email' or 'teams'
    if (alertTo == 'email') {
        mail to: 'harishkumarbsr006@gmail.com',
             subject: "Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' Status",
             body: "The job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' has ${currentBuild.currentResult.toLowerCase()}."
    } else if (alertTo == 'teams') {
        // Teams alert logic (assume you have a method to send Teams alerts)
        sendTeamsAlert("Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' has ${currentBuild.currentResult.toLowerCase()}.")
    }
    cleanWs()
}

def sendTeamsAlert(String message) {
    // Method to send alerts to Microsoft Teams
    echo "Sending to Teams: ${message}"
}


