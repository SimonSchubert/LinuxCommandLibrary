# TLDR

**List available versions**

```pip index versions [package]```

**Show available versions with pre-releases**

```pip index versions --pre [package]```

# SYNOPSIS

**pip** **index** _command_ [_options_] _package_

# PARAMETERS

**versions** _package_
> List available versions for package.

**--pre**
> Include pre-release versions.

**-i**, **--index-url** _url_
> Use custom package index.

# DESCRIPTION

**pip index** inspects package index information. Shows available versions for packages from PyPI or custom indexes. Useful for checking which versions are available before installation.

# SEE ALSO

[pip](/man/pip)(1), [pip-search](/man/pip-search)(1), [pip-install](/man/pip-install)(1)

