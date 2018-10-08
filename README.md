# Java Web Application Inheritance Demo
Architectural demonstration of inheritance between two web applications using Apache Maven

Using the parent-webapp as a dependancy, user can create child web applications without duplication of code.

Configuring a child-web-app, user can add jsp page segments that should be replaced the default segments, also full jsp pages to replace the page content. And user can add new jsp files parent project has not included.

Also user can replace servlet classes of the parent by adding new classes that has the same name as parent and add new classes to perform new functions.

And user is able to override the default deployment descriptor located in the parent app by providing new deployment descriptor.
