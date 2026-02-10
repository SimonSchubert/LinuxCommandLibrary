# TAGLINE

creates new Maven projects from templates

# TLDR

**Generate project from archetype**

```mvn archetype:generate```

**Generate with specific archetype**

```mvn archetype:generate -DarchetypeGroupId=[org.apache.maven.archetypes] -DarchetypeArtifactId=[maven-archetype-quickstart]```

**Generate interactively**

```mvn archetype:generate -DinteractiveMode=true```

**Generate with coordinates**

```mvn archetype:generate -DgroupId=[com.example] -DartifactId=[myapp]```

# SYNOPSIS

**mvn archetype:generate** [_options_]

# PARAMETERS

**-DarchetypeGroupId** _id_
> Archetype group ID.

**-DarchetypeArtifactId** _id_
> Archetype artifact ID.

**-DgroupId** _id_
> Project group ID.

**-DartifactId** _id_
> Project artifact ID.

**-Dversion** _version_
> Project version.

**-DinteractiveMode** _bool_
> Interactive mode.

# DESCRIPTION

**mvn archetype:generate** creates new Maven projects from templates (archetypes). Generates project structure, pom.xml, and basic code. Many archetypes available for different project types.

# SEE ALSO

[mvn](/man/mvn)(1), [mvn-compile](/man/mvn-compile)(1)

