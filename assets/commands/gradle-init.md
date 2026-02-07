# TAGLINE

Gradle project scaffolding generator

# TLDR

**Create new project interactively**

```gradle init```

**Create Java application**

```gradle init --type java-application```

**Create with Kotlin DSL**

```gradle init --type java-application --dsl kotlin```

**Create library with test framework**

```gradle init --type java-library --test-framework junit-jupiter```

**Create Kotlin application**

```gradle init --type kotlin-application```

**Create basic empty project**

```gradle init --type basic```

# SYNOPSIS

**gradle** **init** [**--type** _type_] [**--dsl** _dsl_] [_options_]

# PARAMETERS

**--type** _type_
> Project type: java-application, java-library, kotlin-application, etc.

**--dsl** _dsl_
> Build script DSL: groovy or kotlin.

**--test-framework** _framework_
> Test framework: junit, junit-jupiter, spock, testng.

**--project-name** _name_
> Project name.

**--package** _package_
> Source package name.

# DESCRIPTION

**gradle init** creates a new Gradle project with a standard directory structure. It can run interactively, prompting for project type, language, and build script DSL, or non-interactively with command-line options. Supported types include applications and libraries for Java, Kotlin, Groovy, Scala, C++, and Swift.

# SEE ALSO

[gradle](/man/gradle)(1), [gradle-build](/man/gradle-build)(1)
