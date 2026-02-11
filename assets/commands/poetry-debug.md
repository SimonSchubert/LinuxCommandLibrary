# TAGLINE

Display Poetry debugging information

# TLDR

**Show debug information**

```poetry debug info```

**Resolve dependencies with debug**

```poetry debug resolve```

# SYNOPSIS

**poetry debug** _command_ [_options_]

# PARAMETERS

**info**
> Show system info.

**resolve**
> Debug dependency resolution.

# DESCRIPTION

**poetry debug** provides diagnostic information for troubleshooting Poetry issues. The **info** subcommand displays Poetry version, Python version, system platform, and virtual environment details.

The **resolve** subcommand performs dependency resolution in debug mode, showing the solver's decision process. This is useful for diagnosing version conflicts or understanding why specific package versions were selected.

# CAVEATS

For debugging purposes. Shows environment details.

# HISTORY

poetry debug provides **debugging capabilities** for troubleshooting.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-check](/man/poetry-check)(1)

