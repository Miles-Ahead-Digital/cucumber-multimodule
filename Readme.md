## Cucumber with multiple Spring Contexts (using JUnit5)

[Demo repository to demonstrate ISSUE 2294](https://github.com/cucumber/cucumber-jvm/issues/2294)


### This is a multimodule project. 

```
rootProject.name = 'cucumber-multimodule'
include 'micro:service1'
include 'micro:service2'
include 'acceptance'     # cucumber tests of service1, service2
```
executed tests:
```
gradle test
```

