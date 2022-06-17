#Execution:

### Java
```
// Run jar
java -jar spongebugs-runner-2.0.0.jar <file absolute path>
// Relative paths don't seem to work here, so you should use the absolute path
```

### To clear the jar execution to try again
```
// Go to the java folder
bash reset.sh
```

Other languages are not supported by the ```spongebugs-runner-2.0.0.jar``` file
If you try to run them, the following error will be thrown:
```
Files should end with '.java' and be readable and writable
        at runner.Runner$ArgsValidator.validatePaths(Runner.java:250)
        at runner.Runner$ArgsValidator.<init>(Runner.java:199)
        at runner.Runner.main(Runner.java:49)
```

Original ```.jar``` file from: https://github.com/dvmarcilio/SpongeBugs

