# TAGLINE

apache Maven build tool

# TLDR

**Build project**

```mvn package```

**Clean and build**

```mvn clean install```

**Run tests**

```mvn test```

**Skip tests**

```mvn install -DskipTests```

**Generate project**

```mvn archetype:generate```

**Deploy to repository**

```mvn deploy```

**Show dependency tree**

```mvn dependency:tree```

**Update dependencies**

```mvn versions:display-dependency-updates```

# SYNOPSIS

**mvn** [_options_] [_goals_]

# PARAMETERS

_GOALS_
> Build goals to execute.

**clean**
> Remove target directory.

**compile**
> Compile sources.

**test**
> Run tests.

**package**
> Build JAR/WAR.

**install**
> Install to local repo.

**-D** _PROPERTY_
> Set system property.

**--help**
> Display help information.

# DESCRIPTION

**mvn** is the Apache Maven build tool. It manages Java project builds and dependencies.

The tool uses POM files for configuration. Handles compilation, testing, and packaging.

# CAVEATS

Requires pom.xml. Downloads dependencies. JDK required.

# HISTORY

Maven was created by **Apache** in 2004 to provide standardized Java project builds and dependency management.

# SEE ALSO

[gradle](/man/gradle)(1), [ant](/man/ant)(1), [java](/man/java)(1)

