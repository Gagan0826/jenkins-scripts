@Library("greeting") _
pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                hello("Gagan")
                script{
                    functions.add(5,4)
                }
            }
        }
    }
}


