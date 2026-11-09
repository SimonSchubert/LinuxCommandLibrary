# TAGLINE

Node.js version manager for PowerShell

# TLDR

**Install the module** from the PowerShell Gallery

```Install-Module nvm```

**List installed Node versions**

```Get-NodeVersions```

**List versions available** to download

```Get-NodeVersions -Remote -Filter "[>=18.0.0 <21.0.0]"```

**Install a Node version** or semver range

```Install-NodeVersion [18]```

**Use a version** in the current session

```Set-NodeVersion [18]```

**Set the default version** for the current user (Windows only)

```Set-NodeVersion -Persist User [18]```

**Install the version** from .nvmrc or package.json

```Install-NodeVersion```

**Remove a version**

```Remove-NodeVersion [v18.0.0]```

# SYNOPSIS

**Install-NodeVersion** [_-Version_ _range_] [_-Force_] [_-Architecture_ _arch_] [_-Proxy_ _url_]

**Set-NodeVersion** [_-Version_ _range_] [_-SemVer_ _version_] [_-Persist_ _User|Machine_]

**Get-NodeVersions** [_-Remote_] [_-Filter_ _range_]

**Remove-NodeVersion** _-Version_ _version_

**Get-NodeInstallLocation**

**Set-NodeInstallLocation** _-Path_ _path_

# PARAMETERS

**Install-NodeVersion**
> Download and install one or more versions. **-Force** reinstalls, **-Architecture** selects Arm, Arm64, X64, X86 or AMD64, **-Proxy** sets an HTTP proxy.

**Set-NodeVersion**
> Activate a version in PATH. **-Persist** also writes it to the permanent User or Machine path.

**Get-NodeVersions**
> List installed versions, or downloadable ones with **-Remote**. **-Filter** takes a semver range.

**Remove-NodeVersion**
> Remove an installed version and its npm modules.

**Get-NodeInstallLocation**
> Show the directory Node versions are installed into.

**Set-NodeInstallLocation** _-Path_ _path_
> Override the install directory (absolute path).

# DESCRIPTION

**ps-nvm** is a PowerShell module for installing and switching between multiple Node.js versions, inspired by the Bash **nvm** tool. It is published on the PowerShell Gallery as **nvm** and provides cmdlets rather than a **ps-nvm** executable.

Versions accept npm-style semver ranges such as **^6.0.0**, **6** or **>=6.0.0 <9.0.0**. When no version is given, the cmdlets read **.nvmrc** in the current directory, then the **engines.node** field of **package.json**. Returned versions are SemVer objects that can be compared with **-gt** and **-lt**.

# CAVEATS

Works on Windows, macOS and Linux, but **-Persist** is Windows only. The default install path is relative to the module, which can hit the Windows path length limit; use **Set-NodeInstallLocation** to move it.

# HISTORY

ps-nvm was created by **Aaron Powell** as a PowerShell counterpart to creationix's **nvm**.

# SEE ALSO

[nvm](/man/nvm)(1), [node](/man/node)(1), [volta](/man/volta)(1)

# RESOURCES

```[Source code](https://github.com/aaronpowell/ps-nvm)```

```[Documentation](https://github.com/aaronpowell/ps-nvm/blob/master/.docs/reference.md)```

<!-- verified: 2026-11-09 -->
