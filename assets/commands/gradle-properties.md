# TAGLINE

Gradle project properties viewer

# TLDR

**List all project properties**

```gradle properties```

**List with wrapper**

```./gradlew properties```

**Set property via command line**

```gradle build -PmyProp=value```

**Set multiple properties**

```gradle build -Pprop1=val1 -Pprop2=val2```

# SYNOPSIS

**gradle** **properties**

**gradle** [**-P**_name_=_value_] _task_

# PARAMETERS

**-P**_name_=_value_
> Set project property.

**-D**org.gradle.project._name_=_value_
> Set property via system property.

# DESCRIPTION

**gradle properties** displays all properties available in a Gradle project, including built-in properties and those defined in gradle.properties files. Properties can be set via command line with **-P**, through environment variables (ORG_GRADLE_PROJECT_name), or in gradle.properties files at project or user level.

# SEE ALSO

[gradle](/man/gradle)(1), [gradle-tasks](/man/gradle-tasks)(1)
