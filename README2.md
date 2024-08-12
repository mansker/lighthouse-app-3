Use data.sql to create insert statements to initialize system tables if empty
data.sql contains insert statements for Account and Policy

Ensure that application.properties is correct
To run with db inits `mvn spring-boot:run -Dspring-boot.run.profiles=db_init` 


Mans' Notes:
Vaadin Autogrid
Create Entity java class 
Create Service java class
Create Endpoint java class
Declare grid variable on Entity class in view class
See https://vaadin.com/docs/latest/hilla/guides/data-grids
