# TAGLINE

Run commands in the Sailfish build environment

# TLDR

**Open an interactive shell in the build environment**

```sfdk build-shell```

**Run a command in the build environment**

```sfdk build-shell [command]```

**Run a maintenance command that inspects or modifies the environment**

```sfdk build-shell --maintain [command]```

# SYNOPSIS

**sfdk build-shell** [**--maintain**] [**--**] [_command_ [_arg_...]]

# PARAMETERS

**--maintain**
> Required for commands that inspect or modify the build environment installation. Omitting it leads to undefined results.

# DESCRIPTION

**sfdk build-shell** executes an arbitrary command in the Sailfish OS build environment, or opens an interactive shell when no command is given. Part of the Sailfish SDK command-line tool.

# CAVEATS

Unless the **no-snapshot** configuration option is used, modifications made this way can be reverted by **sfdk build-requires reset**, which also happens implicitly under certain conditions. Use the **pull-build-requires** hooks to persist changes, or **sfdk tools exec** to modify the original build target directly.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-build-requires](/man/sfdk-build-requires)(1), [sfdk-engine](/man/sfdk-engine)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-08 -->
