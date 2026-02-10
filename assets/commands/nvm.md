# TAGLINE

node Version Manager

# TLDR

**Install Node.js version**

```nvm install [version]```

**Install latest LTS**

```nvm install --lts```

**Use specific version**

```nvm use [version]```

**List installed versions**

```nvm ls```

**List available versions**

```nvm ls-remote```

**Set default version**

```nvm alias default [version]```

# SYNOPSIS

**nvm** [_command_] [_options_]

# PARAMETERS

**install** _VERSION_
> Install Node.js version.

**use** _VERSION_
> Switch to version.

**ls**
> List installed versions.

**ls-remote**
> List available versions.

**alias** _NAME_ _VERSION_
> Create version alias.

**uninstall** _VERSION_
> Remove version.

**--help**
> Display help information.

# DESCRIPTION

**nvm** is Node Version Manager. Manages multiple Node.js installations.

The tool enables version switching per project. Shell-based version management.

# CAVEATS

Shell function not executable. Source in profile. Per-shell activation required.

# HISTORY

nvm was created to allow **easy switching** between Node.js versions for development.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [fnm](/man/fnm)(1), [n](/man/n)(1)

