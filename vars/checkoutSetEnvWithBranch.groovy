void call(String Branch='') {
    Map scmVars =  Map scmVars = checkout([$class: 'GitSCM', 
                          branches: [[name: Branch]], 
                          doGenerateSubmoduleConfigurations: false, 
                          extensions: [], 
                          gitTool: 'Default'])
        
    env.GIT_BRANCH = scmVars.GIT_BRANCH
    env.GIT_COMMIT = scmVars.GIT_COMMIT
    env.GIT_PREVIOUS_COMMIT = scmVars.GIT_PREVIOUS_COMMIT
    env.GIT_PREVIOUS_SUCCESSFUL_COMMIT = scmVars.GIT_PREVIOUS_SUCCESSFUL_COMMIT
    env.GIT_URL = scmVars.GIT_URL
}