# TAGLINE

JFrog CLI for interacting with JFrog platform services

# TLDR

**Configure Artifactory**

```jf config add```

**Upload artifact**

```jf rt u [file.jar] [repo/path/]```

**Download artifact**

```jf rt dl [repo/path/file.jar]```

**Search artifacts**

```jf rt s [repo/] --include-dirs```

**Build publish**

```jf rt bp [build-name] [build-number]```

**Docker push**

```jf docker push [image:tag] [repo]```

**Run Xray scan** on a build

```jf xr scan --watches "[watch_name]"```

**Show server configuration**

```jf config show```

# SYNOPSIS

**jf** _command_ [_options_]

# PARAMETERS

**config** _CMD_
> Configure server connections.

**rt** _CMD_
> Artifactory commands.

**docker** _CMD_
> Docker registry commands.

**npm** _CMD_
> npm registry commands.

**pip** _CMD_
> Python registry commands.

**xr** _CMD_
> Xray security scanning commands.

**go** _CMD_
> Go registry commands.

**--server-id** _ID_
> Server ID from configured servers.

**--help**
> Display help information.

# DESCRIPTION

**jf** is the JFrog CLI for interacting with JFrog platform services including Artifactory, Xray, Distribution, and Pipelines. It manages artifact upload/download, build info collection, security scanning, and CI/CD integration.

The tool supports all major package types (Maven, npm, Docker, Go, Python, NuGet, etc.) and provides both interactive and automation-friendly interfaces. The `rt` subcommand prefix targets Artifactory operations specifically.

# CAVEATS

Alias for jfrog CLI. Requires server configuration. Enterprise features may need license.

# HISTORY

jf is the short alias for the **JFrog CLI**, introduced to simplify command-line usage of JFrog platform services.

# SEE ALSO

[jfrog](/man/jfrog)(1), [docker](/man/docker)(1), [npm](/man/npm)(1), [mvn](/man/mvn)(1)
