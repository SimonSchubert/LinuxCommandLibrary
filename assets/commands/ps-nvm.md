# TAGLINE

Node.js version manager for PowerShell

# TLDR

**List Node versions (PowerShell)**

```ps-nvm list```

**Install Node version**

```ps-nvm install [18.0.0]```

**Use specific version**

```ps-nvm use [18.0.0]```

**Set default version**

```ps-nvm default [18.0.0]```

# SYNOPSIS

**ps-nvm** _command_ [_version_]

# PARAMETERS

**list**
> List installed versions.

**install** _VERSION_
> Install Node version.

**use** _VERSION_
> Switch to version.

**default** _VERSION_
> Set default version.

**uninstall** _VERSION_
> Remove version.

# DESCRIPTION

**ps-nvm** is a Node.js version manager designed natively for PowerShell on Windows. It allows installing, switching between, and managing multiple Node.js versions on a single system, similar to nvm on Unix but built specifically for the PowerShell environment.

The tool downloads and manages Node.js binaries, adjusting the system PATH to point to the selected version. A default version can be set to persist across new PowerShell sessions.

# CAVEATS

PowerShell only. Windows alternative to nvm.

# HISTORY

ps-nvm was created for **PowerShell** Node.js version management.

# SEE ALSO

[nvm](/man/nvm)(1), [node](/man/node)(1), [volta](/man/volta)(1)

