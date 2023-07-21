@Library("greeting") _
pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                hello("Gagan")
                script{
                    echo "functions.add(5,4)"
                    
                }
            }
        }
    }
}
