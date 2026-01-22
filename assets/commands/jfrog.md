# TLDR

**Configure server**

```jfrog config add [server-id]```

**Upload to Artifactory**

```jfrog rt upload [file] [repo/path/]```

**Download from Artifactory**

```jfrog rt download [repo/path/]```

**Build integration**

```jfrog rt build-publish [name] [number]```

**Scan for vulnerabilities**

```jfrog xr scan [path]```

**Docker operations**

```jfrog docker push [image] [repo]```

# SYNOPSIS

**jfrog** _command_ [_subcommand_] [_options_]

# PARAMETERS

**config**
> Manage server configurations.

**rt**
> Artifactory commands.

**xr**
> Xray security scanning.

**docker**
> Container registry.

**npm**, **pip**, **go**, **maven**
> Package manager integrations.

**--url** _URL_
> Server URL.

**--help**
> Display help information.

# DESCRIPTION

**jfrog** is the official CLI for JFrog platform. It interacts with Artifactory, Xray, and other JFrog services.

The tool manages binary artifacts across all package types. It integrates with CI/CD for build info and security scanning.

jfrog manages artifact repositories.

# CAVEATS

Requires JFrog server. Enterprise features need license. Configuration per server.

# HISTORY

JFrog CLI was created by **JFrog** to provide unified command-line access to their artifact management platform.

# SEE ALSO

[jf](/man/jf)(1), [mvn](/man/mvn)(1), [npm](/man/npm)(1), [docker](/man/docker)(1)
