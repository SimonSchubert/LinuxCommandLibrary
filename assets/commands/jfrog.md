# TAGLINE

official CLI for JFrog platform

# TLDR

**Configure a server connection**

```jfrog config add [server-id]```

**Upload artifacts to Artifactory**

```jfrog rt upload [file] [repo/path/]```

**Download artifacts from Artifactory**

```jfrog rt download [repo/path/]```

**Publish build info**

```jfrog rt build-publish [build-name] [build-number]```

**Scan for vulnerabilities**

```jfrog audit```

**Push a Docker image**

```jfrog docker push [image:tag] [repo]```

**Search for artifacts**

```jfrog rt search [repo/path/]```

# SYNOPSIS

**jfrog** _command_ [_subcommand_] [_options_]

# PARAMETERS

**config**
> Manage server configurations.

**rt**
> Artifactory commands.

**audit**
> Security scanning and vulnerability detection.

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

# CAVEATS

Requires JFrog server. Enterprise features need license. Configuration per server.

# HISTORY

JFrog CLI was created by **JFrog** to provide unified command-line access to their artifact management platform.

# SEE ALSO

[jf](/man/jf)(1), [mvn](/man/mvn)(1), [npm](/man/npm)(1), [docker](/man/docker)(1)
