# TAGLINE

Display pip environment debug information

# TLDR

**Show debug information**

```pip debug```

**Show verbose debug info**

```pip debug --verbose```

# SYNOPSIS

**pip** **debug** [_options_]

# PARAMETERS

**-v**, **--verbose**
> Show detailed debug information including all platform tags and resolved compatibility specs.

**--platform** _platform_
> Display compatibility tags for the given platform.

**--python-version** _version_
> Display compatibility tags for the given Python version.

**--implementation** _impl_
> Display compatibility tags for the given Python implementation (e.g. **cp**, **pp**).

**--abi** _abi_
> Display compatibility tags for the given ABI.

# DESCRIPTION

**pip debug** prints debugging information about pip and the current Python environment. Output includes the pip version, location, sys.path, the active Python interpreter, the supported wheel compatibility tags, and the configured indexes.

The command is intended for diagnosing wheel selection problems (e.g. "no matching distribution found"), index configuration issues, and SSL/cert misconfiguration. It is **not** a stable interface — output format may change between pip releases and should not be parsed by scripts.

# CAVEATS

Marked as unstable: pip explicitly warns "This command is only meant for debugging" and may change format. Combine with **--verbose** to see full tag enumeration.

# INSTALL

```apk: sudo apk add py3-pip```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pip](/man/pip)(1), [pip-config](/man/pip-config)(1), [pip-list](/man/pip-list)(1)
