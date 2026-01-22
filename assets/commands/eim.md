# TLDR

**Run Erlang installation** manager

```eim install [version]```

**List available versions**

```eim list```

**Activate version**

```eim activate [version]```

**Show current version**

```eim current```

# SYNOPSIS

**eim** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: install, list, activate, current, etc.

**install** _VERSION_
> Install Erlang version.

**list**
> List available versions.

**activate** _VERSION_
> Set active version.

**current**
> Show current version.

**--help**
> Display help information.

# DESCRIPTION

**eim** (Erlang Installation Manager) manages multiple Erlang/OTP installations, allowing easy switching between versions for development and testing.

The tool handles downloading, building, and switching between Erlang versions. This is useful when projects require specific Erlang versions or when testing compatibility.

Similar to tools like nvm for Node.js, eim simplifies Erlang version management.

# CAVEATS

Build times vary by version. Requires build dependencies. Disk space for multiple versions. May need Elixir rebuild after switching.

# HISTORY

eim is one of several Erlang version management tools in the ecosystem, providing command-line management of Erlang/OTP installations for developers working with multiple versions.

# SEE ALSO

[erl](/man/erl)(1), [kerl](/man/kerl)(1), [asdf](/man/asdf)(1)
