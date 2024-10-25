 def call() {
mail to: 'harishkumarbsr006@gmail.com',
                 subject: "FAILURE: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                 body: "The job ${env.JOB_NAME} #${env.BUILD_NUMBER} has failed. \n\nCheck details: ${env.BUILD_URL}"
