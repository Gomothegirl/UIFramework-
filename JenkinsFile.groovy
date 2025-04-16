pipeline{
    agent any
    stages{
        stage("Clean Up"){
            steps{
                deleteDir()
            }
        }
        stage("Clone Repo"){
            steps{
                sh "git clone https://github.com/Gomothegirl/UIFramework-.git"
            }
        }
        stage("Build"){
            steps{
                dir("ui-tests-java-maven"){
                    sh "mvn clean install"
                }
            }
        }
        stage("Test"){
            steps{
                dir("ui-tests-java-maven"){
                    sh "mvn test"
                }
            }
        }
    }
}