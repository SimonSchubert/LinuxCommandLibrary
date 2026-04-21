# TAGLINE

creates new Maven projects from templates

# TLDR

**Generate a project interactively** (default)

```mvn archetype:generate```

**Generate with specific archetype**

```mvn archetype:generate -DarchetypeGroupId=[org.apache.maven.archetypes] -DarchetypeArtifactId=[maven-archetype-quickstart]```

**Generate non-interactively with full coordinates**

```mvn archetype:generate -DinteractiveMode=false -DgroupId=[com.example] -DartifactId=[myapp] -DarchetypeArtifactId=[maven-archetype-quickstart]```

**Filter available archetypes by keyword**

```mvn archetype:generate -Dfilter=[spring-boot]```

**Create an archetype from the current project**

```mvn archetype:create-from-project```

**Update the local archetype catalog**

```mvn archetype:update-local-catalog```

# SYNOPSIS

**mvn archetype:**_goal_ [_-Dproperty=value_ ...]

# PARAMETERS

**-DarchetypeGroupId=**_id_
> Group ID of the archetype to use (e.g. `org.apache.maven.archetypes`).

**-DarchetypeArtifactId=**_id_
> Artifact ID of the archetype (e.g. `maven-archetype-quickstart`).

**-DarchetypeVersion=**_version_
> Version of the archetype.

**-DarchetypeCatalog=**_catalog_
> Comma-separated catalog list: `remote`, `local`, `internal` (default: `remote,local`).

**-DgroupId=**_id_
> Group ID of the generated project.

**-DartifactId=**_id_
> Artifact ID of the generated project.

**-Dversion=**_version_
> Version of the generated project (default `1.0-SNAPSHOT`).

**-Dpackage=**_name_
> Base Java package (defaults to the group ID).

**-DinteractiveMode=**_bool_
> Prompt for missing values when `true` (default follows `settings.xml`).

**-Dfilter=**_expr_
> Filter displayed archetypes by `groupId:artifactId` substring.

**-DoutputDirectory=**_dir_
> Directory where the project is created (default: current directory).

# GOALS

**archetype:generate**
> Create a new project from an archetype.

**archetype:create-from-project**
> Turn the current project into a reusable archetype.

**archetype:crawl**
> Scan a local Maven repository and build a catalog file.

**archetype:integration-test**
> Run the archetype's integration tests.

**archetype:jar**
> Package the current archetype project as a JAR.

**archetype:update-local-catalog**
> Refresh the local archetype catalog.

**archetype:help**
> Show plugin help. Use `-Ddetail=true -Dgoal=generate` for details.

# DESCRIPTION

**mvn archetype:generate** creates new Maven projects from templates called archetypes. An archetype bundles a project skeleton, `pom.xml`, and source/resource templates that are expanded with Velocity and user-supplied properties.

Common archetypes include `maven-archetype-quickstart` (a minimal Java app), `maven-archetype-webapp` (a servlet WAR), and third-party templates such as Spring Boot or Quarkus starters. Archetypes are discovered from remote catalogs, the local repository, and an internal fallback catalog.

When run without parameters the plugin enters interactive mode, listing numbered archetypes and prompting for coordinates.

# SEE ALSO

[mvn](/man/mvn)(1), [maven](/man/maven)(1), [mvn-compile](/man/mvn-compile)(1), [mvn-package](/man/mvn-package)(1), [mvn-dependency](/man/mvn-dependency)(1)
