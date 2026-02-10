# TAGLINE

node

# TLDR

**Install latest Node.js**

```n latest```

**Install LTS version**

```n lts```

**Install specific version**

```n [18.16.0]```

**List installed versions**

```n ls```

**Switch to installed version**

```n```

**Remove version**

```n rm [18.16.0]```

**Run specific version**

```n run [18.16.0] [script.js]```

**Purge all versions**

```n prune```

# SYNOPSIS

**n** [_command_] [_version_]

# PARAMETERS

_VERSION_
> Node.js version number.

**latest**
> Install latest version.

**lts**
> Install LTS version.

**ls**
> List installed versions.

**rm** _VERSION_
> Remove version.

**run** _VERSION_
> Run with specific version.

**prune**
> Remove old versions.

**--help**
> Display help information.

# DESCRIPTION

**n** is a Node.js version manager. It installs and switches between Node.js versions.

The tool manages multiple installations. Simple interface for version control.

# CAVEATS

Requires sudo for global install. Simpler than nvm. Bash script based.

# HISTORY

n was created by **TJ Holowaychuk** as a simpler alternative to nvm for Node.js version management.

# SEE ALSO

[nvm](/man/nvm)(1), [node](/man/node)(1), [npm](/man/npm)(1)

