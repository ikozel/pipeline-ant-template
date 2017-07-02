node {
  stage('Checkout') {
        checkout scm
  }
  stage('Build') {
        sh '~/workspace/apache-ant-1.10.1/bin/ant clean compile'
  }
  stage('Test') {
        sh '~/workspace/apache-ant-1.10.1/bin/ant test'
  }
  stage('Package') {
        sh '~/workspace/apache-ant-1.10.1/bin/ant package'
  }
}
