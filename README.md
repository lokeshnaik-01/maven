# maven

- `maven archetype:generate` will download all the maven plugins
- archetype is a model on how a project needs to be structured 
- if we choose a number maven will create all the dependencies and all the jar
- after this is run maven will create a new folder named as the same as ArtifactId
- `mvn compile` will compile the file in the application directory
- `mvn package` will package it into a jar file in the target folder
- to execute the jar file we need to use `java -cp <jar_filepath> groupId className` className having main method

# Maven Structure
- it has two infos Archetype and dependency info
- Archetype info has details about different types of projects we want to create and the folder structure and info about creating project of particular type
- Dependency info about the list of jar files and dependent jar files

# archetype:generate
- inputs to the command
## archetype
- Archetype is a Maven project templating toolkit. 
- An archetype is defined as an original pattern or model from which all other things of the same kind are made. 
- The name fits as we are trying to provide a system that provides a consistent means of generating Maven projects.
- Archetype defines the particular type of project we want to develop
## groupId
- used for grouping
- if we have 5 to 6 artifacts and we want to group those we use groupId
## artifactId
- basically the output of the package if it is a java then jar file
## Version
- gives version
## package
- what package the class should belong to