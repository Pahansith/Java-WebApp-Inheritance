# Java Web Application Inheritance Demo
Architectural demonstration of inheritance between two web applications using Apache Maven

Developr can use the parent-web-app as a template and create new web applications while modifying and adding new functionalities to the parent-web-app. Using the parent-webapp as a maven dependancy, developer can create customized child web applications without duplication of code in parent web-app.

When creating a child-web-app, user can add jsp page segments to replace the default segments in the parent web-app, also full jsp pages to replace the page content. And user can add new jsp files parent project has not included.

Also user can replace servlet classes of the parent by adding new classes that has the same name as parent and add new classes to perform new functions.

And user is able to override the default deployment descriptor located in the parent app by providing new deployment descriptor.
