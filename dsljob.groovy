job('amazon-test') {
    scm {
        git('https://github.com/asish029/gamutkart.git')
    }
    
    steps {
        maven('-e clean test')
    }
}
