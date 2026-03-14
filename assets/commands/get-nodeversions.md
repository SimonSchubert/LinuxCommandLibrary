# TAGLINE

Node.js version discovery tool

# TLDR

**List available versions**

```get-nodeversions```

**Show LTS versions**

```get-nodeversions --lts```

**Filter by major** version

```get-nodeversions [18]```

# SYNOPSIS

**get-nodeversions** [_options_] [_version_]

# PARAMETERS

_VERSION_
> Filter by major version number.

**--lts**
> Show only LTS versions.

**--all**
> Show all versions.

**--help**
> Display help information.

# DESCRIPTION

**get-nodeversions** lists available Node.js versions for installation. It queries the Node.js release server to show available versions, and is part of the **ps-nvm** (PowerShell Node Version Manager) module.

The tool helps identify which Node.js versions are available when using version managers. It can filter by LTS status or major version number.

# CAVEATS

Requires network access to query the Node.js release server. LTS designation changes over time. This command is specific to ps-nvm; other version managers use different commands (e.g., `nvm ls-remote`).

# HISTORY

get-nodeversions is a utility provided by the **ps-nvm** PowerShell module for Node.js version management.

# SEE ALSO

[nvm](/man/nvm)(1), [fnm](/man/fnm)(1), [node](/man/node)(1), [ps-nvm](/man/ps-nvm)(1)
