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

**get-nodeversions** lists available Node.js versions for installation. It queries the Node.js release server to show available versions.

The tool helps identify which Node.js versions are available when using version managers like nvm or fnm. It can filter by LTS status or major version.

get-nodeversions simplifies finding the right Node.js version to install.

# CAVEATS

Requires network access. LTS designation changes over time.

# HISTORY

get-nodeversions is a utility script commonly included with Node.js version managers, providing version discovery functionality.

# SEE ALSO

[nvm](/man/nvm)(1), [fnm](/man/fnm)(1), [node](/man/node)(1)
