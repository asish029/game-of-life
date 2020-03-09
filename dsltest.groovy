job('amazon-test') {
    scm {
        git('https://github.com/asish029/game-of-life.git')
    }
    
    steps {
        maven('-e clean package')
    }
    steps {
       shell("url -v -u admin:admin -T **/*.war 'http://127.0.1.1:8080/manager/text/deploy?path=/gameoflife&update=true'")
    }
}
