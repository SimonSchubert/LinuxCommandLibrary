# TAGLINE

Initialize Sailfish OS build environment

# TLDR

**Initialize build environment**

```sfdk build-init```

**Initialize for a specific build target**

```sfdk -c target=[SailfishOS-4.5.0.24-armv7hl] build-init```

**Persist the target** for subsequent commands

```sfdk config --push target [SailfishOS-4.5.0.24-armv7hl]; sfdk build-init```

# SYNOPSIS

**sfdk** [_-c target=name_] **build-init** [_options_]

# PARAMETERS

**-c** _target=name_
> Global sfdk configuration option selecting the build target. The target is not specific to build-init; it is set with the **-c** option (or persisted with **sfdk config --push target** _name_) and reused by the other build subcommands.

# DESCRIPTION

**sfdk build-init** prepares (initializes) the build directory for a Sailfish OS project against the configured build target. It sets up a build engine snapshot and the build-time dependencies, after which commands like **sfdk build-shell**, **sfdk build**, or **sfdk make** can be run. Part of the Sailfish SDK command-line tool **sfdk**.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-build-requires](/man/sfdk-build-requires)(1)

