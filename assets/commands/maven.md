# TAGLINE

build automation and project management tool for Java

# TLDR

**Compile project**

```mvn compile```

**Run tests**

```mvn test```

**Package (create JAR/WAR)**

```mvn package```

**Install to local repository**

```mvn install```

**Clean build artifacts**

```mvn clean```

**Skip tests during build**

```mvn package -DskipTests```

**Run specific goal**

```mvn dependency:tree```

# SYNOPSIS

**mvn** [_options_] [_goal_...]

# PARAMETERS

**clean**
> Remove build directory.

**compile**
> Compile source code.

**test**
> Run unit tests.

**package**
> Create JAR/WAR.

**install**
> Install to local repo.

**deploy**
> Deploy to remote repo.

**-DskipTests**
> Skip test execution.

**-U**
> Force update snapshots.

**-o**, **--offline**
> Offline mode.

**-P** _profile_
> Activate profile.

# DESCRIPTION

**Maven** is a build automation and project management tool for Java. It manages dependencies, compiles code, runs tests, and packages applications based on the Project Object Model (pom.xml).

Maven follows convention over configuration, using standard directory layouts and build lifecycles.

# PROJECT STRUCTURE

```
project/
├── pom.xml
├── src/
│   ├── main/java/
│   └── test/java/
└── target/
```

# CAVEATS

Requires pom.xml. First run downloads dependencies. Local repository in ~/.m2. Plugins extend functionality.

# HISTORY

Maven was created at the **Apache Software Foundation** in **2002** by Jason van Zyl as a successor to Apache Ant, emphasizing convention over configuration.

# SEE ALSO

[gradle](/man/gradle)(1), [ant](/man/ant)(1), [java](/man/java)(1), [mvnw](/man/mvnw)(1)
