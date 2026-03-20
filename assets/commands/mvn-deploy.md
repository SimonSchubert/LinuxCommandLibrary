# TAGLINE

uploads artifacts to remote repository

# TLDR

**Deploy to repository**

```mvn deploy```

**Deploy specific file**

```mvn deploy:deploy-file -Dfile=[file.jar] -DgroupId=[com.example] -DartifactId=[my-lib] -Dversion=[1.0] -Durl=[repo-url] -DrepositoryId=[repo-id]```

**Deploy with specific profile**

```mvn deploy -P [profile-name]```

**Skip tests and deploy**

```mvn deploy -DskipTests```

**Deploy to an alternate repository**

```mvn deploy -DaltDeploymentRepository=[id::url]```

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

**-DgroupId** _GROUP_
> Group ID for deploy-file goal.

**-DartifactId** _ARTIFACT_
> Artifact ID for deploy-file goal.

**-Dversion** _VERSION_
> Version for deploy-file goal.

**-DaltDeploymentRepository** _id::url_
> Alternative repository for deployment (format: id::url).

**-DskipTests**
> Skip running tests during the build.

**-P** _PROFILE_
> Activate profile.

**-pl** _MODULE_
> Build specific module.

# DESCRIPTION

**mvn deploy** uploads artifacts to remote repository. It's the final Maven lifecycle phase.

The goal publishes built artifacts. Requires repository configuration in settings.xml.

# CAVEATS

Requires repository access. Credentials in settings.xml. Network operation.

# HISTORY

The deploy goal is part of **Apache Maven's** build lifecycle for artifact distribution.

# SEE ALSO

[mvn](/man/mvn)(1), [mvn-dependency](/man/mvn-dependency)(1), [gradle](/man/gradle)(1)

