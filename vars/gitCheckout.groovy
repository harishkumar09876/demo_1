def call(String repoUrl, String branch = 'master') {
    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${master}"]],
        userRemoteConfigs: [[url: https://github.com/harishkumar09876/demo_1.git]]
    ])
}

