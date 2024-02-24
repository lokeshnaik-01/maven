# maven

- `maven archetype:generate` will download all the maven plugins
- archetype is a model on how a project needs to be structured 
- if we choose a number maven will create all the dependencies and all the jar
- after this is run maven will create a new folder named as the same as ArtifactId
- `mvn compile` will compile the file in the application directory
- `mvn package` will package it into a jar file in the target folder
- to execute the jar file we need to use `java -cp <jar_filepath> className` className having main method

# Maven Structure
- it has two infos Archetype and dependency info
- Archetype info has details about different types of projects we want to create and the folder structure and info about creating project of particular type
- Dependency info about the list of jar files and dependent jar files