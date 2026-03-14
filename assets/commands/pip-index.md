# TAGLINE

Inspect package index version information

# TLDR

**List available versions of a package**

```pip index versions [package]```

**Show available versions including pre-releases**

```pip index versions --pre [package]```

**List versions from a custom package index**

```pip index versions --index-url [https://pypi.example.com/simple] [package]```

**List versions for a specific platform**

```pip index versions --platform [manylinux2014_x86_64] [package]```

# SYNOPSIS

**pip** **index** _command_ [_options_] _package_

# PARAMETERS

**versions** _package_
> List available versions for a package.

**--pre**
> Include pre-release and development versions.

**-i**, **--index-url** _url_
> Base URL of the Python Package Index (default: https://pypi.org/simple).

**--extra-index-url** _url_
> Extra URLs of package indexes to use in addition to --index-url.

**--platform** _platform_
> Only use wheels compatible with the specified platform.

**--python-version** _version_
> Python version for compatibility checks (e.g., 3.11).

**--implementation** _impl_
> Python implementation (e.g., cp for CPython, pp for PyPy).

**--abi** _abi_
> Only use wheels compatible with the specified ABI tag.

**--no-binary** _format_control_
> Do not use binary packages.

# DESCRIPTION

**pip index** inspects package index information. Shows available versions for packages from PyPI or custom indexes. Useful for checking which versions are available before installation.

The **versions** subcommand lists all available versions for a package, with the latest version shown first. Platform and Python version filters can restrict results to compatible packages.

# SEE ALSO

[pip](/man/pip)(1), [pip-install](/man/pip-install)(1), [pip-show](/man/pip-show)(1), [pip-list](/man/pip-list)(1)

