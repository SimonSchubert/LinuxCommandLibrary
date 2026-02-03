# TLDR

**Install to local repository**

```mvn install```

**Install skipping tests**

```mvn install -DskipTests```

**Clean install**

```mvn clean install```

**Install with profile**

```mvn install -P [profile]```

# SYNOPSIS

**mvn install** [_options_]

# PARAMETERS

**-DskipTests**
> Skip test execution.

**-P** _profile_
> Activate profile.

**-o**
> Work offline.

**-U**
> Force snapshot updates.

**-T** _threads_
> Parallel builds.

# DESCRIPTION

**mvn install** builds the project and installs the artifact to the local Maven repository (~/.m2/repository). Makes the artifact available for other local projects. Executes compile, test, package, and install phases.

# SEE ALSO

[mvn](/man/mvn)(1), [mvn-package](/man/mvn-package)(1), [mvn-deploy](/man/mvn-deploy)(1)

