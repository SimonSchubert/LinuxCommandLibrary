# TLDR

**Deploy to repository**

```mvn deploy```

**Deploy specific file**

```mvn deploy:deploy-file -Dfile=[file.jar] -DrepositoryId=[repo-id] -Durl=[repo-url]```

**Deploy with specific profile**

```mvn deploy -P [profile-name]```

**Skip tests and deploy**

```mvn deploy -DskipTests```

**Deploy to snapshot repository**

```mvn deploy -DaltSnapshotDeploymentRepository=[id::url]```

**Deploy single module**

```mvn deploy -pl [module-name]```

# SYNOPSIS

**mvn** **deploy** [_options_]

# PARAMETERS

**-Dfile** _JAR_
> File to deploy.

**-DrepositoryId** _ID_
> Repository identifier.

**-Durl** _URL_
> Repository URL.

**-P** _PROFILE_
> Activate profile.

**-pl** _MODULE_
> Build specific module.

**--help**
> Display help information.

# DESCRIPTION

**mvn deploy** uploads artifacts to remote repository. It's the final Maven lifecycle phase.

The goal publishes built artifacts. Requires repository configuration in settings.xml.

mvn deploy publishes artifacts.

# CAVEATS

Requires repository access. Credentials in settings.xml. Network operation.

# HISTORY

The deploy goal is part of **Apache Maven's** build lifecycle for artifact distribution.

# SEE ALSO

[mvn](/man/mvn)(1), [mvn-dependency](/man/mvn-dependency)(1), [gradle](/man/gradle)(1)

