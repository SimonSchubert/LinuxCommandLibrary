# TAGLINE

Node.js version discovery tool

# TLDR

**List locally installed versions**

```Get-NodeVersions```

**List remote versions** available to install

```Get-NodeVersions -Remote```

**Filter versions** by semver range

```Get-NodeVersions -Remote -Filter ">=18.0.0 <19.0.0"```

**List local versions** matching a filter

```Get-NodeVersions -Filter ">=16.0.0"```

# SYNOPSIS

**Get-NodeVersions** [**-Remote**] [**-Filter** _range_]

# PARAMETERS

**-Remote**
> List versions available for download from the Node.js release server instead of locally installed versions.

**-Filter** _range_
> A semver version range to filter results (e.g., ">=18.0.0 <19.0.0").

# DESCRIPTION

**Get-NodeVersions** lists Node.js versions installed locally or available remotely for installation. It is part of the **ps-nvm** (PowerShell Node Version Manager) module.

Versions are returned as SemVer.Version objects sorted from highest to lowest, and can be compared with PowerShell comparison operators. Use **-Remote** to query the Node.js release server and **-Filter** to narrow results by semver range.

# CAVEATS

The **-Remote** flag requires network access to query the Node.js release server. This command is specific to ps-nvm; other version managers use different commands (e.g., `nvm ls-remote`).

# HISTORY

get-nodeversions is a utility provided by the **ps-nvm** PowerShell module for Node.js version management.

# SEE ALSO

[nvm](/man/nvm)(1), [fnm](/man/fnm)(1), [node](/man/node)(1), [ps-nvm](/man/ps-nvm)(1)
