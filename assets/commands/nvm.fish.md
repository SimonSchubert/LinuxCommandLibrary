# TAGLINE

node Version Manager for Fish shell

# TLDR

**Install Node.js version**

```nvm install [version]```

**Use specific version**

```nvm use [version]```

**List installed versions**

```nvm list```

**Set default version**

```set --universal nvm_default_version [version]```

**Install latest LTS**

```nvm install lts```

# SYNOPSIS

**nvm** [_command_] [_version_]

# PARAMETERS

**install** _VERSION_
> Install Node.js version.

**use** _VERSION_
> Switch to version.

**list**
> List installed versions.

**current**
> Show current version.

**uninstall** _VERSION_
> Remove version.

**--help**
> Display help information.

# DESCRIPTION

**nvm.fish** is Node Version Manager for Fish shell. Native Fish implementation.

The tool manages Node.js versions in Fish. Different from bash nvm.

# CAVEATS

Fish shell specific. Not compatible with bash nvm. Uses Fisher or manual install.

# HISTORY

nvm.fish was created as a **native Fish shell** implementation of Node Version Manager.

# SEE ALSO

[nvm](/man/nvm)(1), [fish](/man/fish)(1), [fnm](/man/fnm)(1)

