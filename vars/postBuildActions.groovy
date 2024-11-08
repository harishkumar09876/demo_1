def call(String alertTo) {
    
    if (alertTo == 'email') {
        mail to:  "${env.EMAIL}",
             subject: "Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' Status",
             body: "The job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' has ${currentBuild.currentResult.toLowerCase()}."
    } else if (alertTo == 'teams') {
        
        sendTeamsAlert("Job '${env.JOB_NAME} [${env.BUILD_NUMBER}] [${env.SUBJECT}]' has ${currentBuild.currentResult.toLowerCase()}.")
    }
    cleanWs()
}

def sendTeamsAlert(String message) {
   
    echo "Sending to Teams: ${message}"
}
 

