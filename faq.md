# Frequent answer to questions

## 1. I have regular JUnit test, how could i parse to a VPL ++ Test?

[take a look this video](https://www.youtube.com/watch?v=0Oa3lQuSGhI)


## 2. The Jail execution microservice throws "api is unreacheable"

It means the moodle microservice cant reach the jail microservice. It would has been happening by a wrong configuration of your Jail microservice.
If you already reviewed the jail configuration, it would  has been pasing by a SSL/TSL problem. Please review your certificates of your microservices ecosystem.


## 3. The Google Auth does not work on VPL++ front end

Please review the configuration var called REACT_APP_CLIENT_ID, you need allow the acces for yor app client id in google project. [More info](https://developers.google.com/maps/documentation/javascript/get-api-key)

## 4. I get "VPLPluPlusCore.Exceptions.NoTestsFound: No tests found" However i ensured those files exist

If you modified the vpl test classes, let ensure the test classes has the appropiate annotations for vpl . Also, you can download the moodle activity, restore it and copy-paste the vpl test classes. Also, This issue should happened because you need to keep the .java files at execution time. See "Files to keep when running" in vpl activity options