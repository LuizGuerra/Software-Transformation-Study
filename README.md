# Execution:

### Java

Please run only the files in the folder "edited" to make sure the ```reset.sh``` script works correctly.
⚠️ Also, note that relative paths doesn't seem to work here, so you should use absolute paths.

#### Run a specific file with the ```jar```
```
// Go to the java folder
cd java
java -jar spongebugs-runner-2.0.0.jar <file absolute path>
```

#### Run all files from a directory with the ```jar```
```
// Go to the java folder
cd java
java -jar spongebugs-runner-2.0.0.jar <folder absolute path>
```

### To clear the jar execution to try again
```
// Go to the java folder
cd java
bash reset.sh
```

### Problems
Other languages are not supported by the ```spongebugs-runner-2.0.0.jar``` file
If you try to run them, the following error will be thrown:
```
Files should end with '.java' and be readable and writable
        at runner.Runner$ArgsValidator.validatePaths(Runner.java:250)
        at runner.Runner$ArgsValidator.<init>(Runner.java:199)
        at runner.Runner.main(Runner.java:49)
```

Original ```.jar``` file from: https://github.com/dvmarcilio/SpongeBugs

