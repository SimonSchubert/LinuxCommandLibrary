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

**--help**
> Display help information.

# DESCRIPTION

**jf** is the JFrog CLI for interacting with JFrog platform services. It manages artifacts in Artifactory and integrates with CI/CD.

The tool supports all package types and registries. It handles uploads, downloads, builds, and security scanning.

jf manages JFrog services.

# CAVEATS

Alias for jfrog CLI. Requires server configuration. Enterprise features may need license.

# HISTORY

jf is the short alias for the **JFrog CLI**, introduced to simplify command-line usage of JFrog platform services.

# SEE ALSO

[jfrog](/man/jfrog)(1), [docker](/man/docker)(1), [npm](/man/npm)(1), [mvn](/man/mvn)(1)
