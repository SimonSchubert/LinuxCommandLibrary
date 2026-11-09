# TAGLINE

Official CLI for the JFrog Platform

# TLDR

**Configure** a server connection interactively

```jfrog config add [server-id]```

**Upload** artifacts to Artifactory

```jfrog rt upload [file_pattern] [repo/path/]```

**Download** artifacts from Artifactory

```jfrog rt download [repo/path/pattern]```

**Search** for artifacts in Artifactory

```jfrog rt search [repo/path/pattern]```

**Publish** build info to Artifactory

```jfrog rt build-publish [build-name] [build-number]```

**Log in** through the browser

```jfrog login```

**Scan** the current project for security vulnerabilities

```jfrog audit```

**Push** a Docker image to an Artifactory Docker registry

```jfrog docker push [registry/image:tag]```

**Delete** artifacts matching a pattern

```jfrog rt delete [repo/path/pattern]```

# SYNOPSIS

**jfrog** _command_ [_subcommand_] [_options_] [_arguments_]

# PARAMETERS

**config**
> Manage server configurations (add, edit, show, remove, import, export, use).

**rt**
> Artifactory commands (upload, download, search, delete, copy, move, build-publish, etc.).

**xr**
> Xray commands for security scanning and vulnerability management.

**audit**
> Scan project dependencies for security vulnerabilities and license compliance.

**login**
> Authenticate with the JFrog Platform through a web browser.

**docker**
> Docker client integration (push, pull and build via Artifactory) with build-info collection.

**npm**, **yarn**, **pip**, **pipenv**, **poetry**, **go**, **mvn**, **gradle**, **nuget**, **dotnet**, **helm**, **twine**, **ruby**, **terraform**
> Package manager and build tool integrations with build-info collection.

**--url** _URL_
> JFrog Platform URL.

**--access-token** _TOKEN_
> Access token for authentication.

**--user** _USER_
> Username for authentication.

**--password** _PASSWORD_
> Password for authentication.

**--server-id** _ID_
> Use a specific configured server.

**--help**
> Display help information for a command.

# DESCRIPTION

**jfrog** is the official CLI for the JFrog Platform. It provides unified command-line access to Artifactory, Xray, Distribution, Pipelines, and other JFrog services.

The tool manages binary artifacts across all major package types including Maven, npm, PyPI, Docker, Go, NuGet, and generic files. It integrates with CI/CD pipelines for build-info collection, promotion, and security scanning. The CLI supports file specs (JSON-based query syntax) for advanced artifact operations.

Current JFrog documentation uses the executable name **jf**. The same program is also distributed as a separate **jfrog** executable with identical commands.

# CAVEATS

Requires a JFrog server (self-hosted or SaaS). Enterprise features such as Xray scanning require appropriate licensing. Server configuration is stored locally per user and must be set up before use with **jfrog config add**.

# HISTORY

JFrog CLI was created by **JFrog** to provide unified command-line access to their artifact management platform. JFrog CLI v2 introduced the **jf** executable name, and **jfrog** remains available.

# SEE ALSO

[jf](/man/jf)(1), [docker](/man/docker)(1), [mvn](/man/mvn)(1), [npm](/man/npm)(1), [pip](/man/pip)(1), [go](/man/go)(1), [gradle](/man/gradle)(1)

# RESOURCES

```[Source code](https://github.com/jfrog/jfrog-cli)```

```[Homepage](https://jfrog.com/getcli/)```

```[Documentation](https://docs.jfrog.com/integrations/docs/jfrog-cli)```

<!-- verified: 2026-11-09 -->
