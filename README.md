# Robot Movement

## Table of contents:

* [Setup](./README.md#setup)
* [Running the app](./README.md#running-the-app)
* [Running the tests](./README.md#running-the-tests)

### Setup
1. Make sure you have Java 8 installed in your machine. 

2. Build app from command line:

    ```./gradlew build```

### Running the app:
```java -jar ./build/libs/codechallenge-1.0-SNAPSHOT.jar```

### Running the tests:
    
```./gradlew clean test```

Then you would see testing report at 
```../codechallenge/build/reports/tests/test/index.html```

### (Optional) Running the Date Difference
1. Open `build.gradle`
2. Find the `'Main-Class'` and replace 
`'com.phan.codechallenge.toyrobot.Main'` with `'com.phan.codechallenge.datecalculate.Main'`
3. Rebuild app