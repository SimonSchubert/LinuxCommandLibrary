# TAGLINE

Display Poetry debugging information

# TLDR

**Show Poetry and environment information**

```poetry debug info```

**Debug dependency resolution**

```poetry debug resolve```

**Resolve a specific package**

```poetry debug resolve [package_name]```

# SYNOPSIS

**poetry debug** _command_ [_options_]

# PARAMETERS

**info**
> Show Poetry version, Python version, system platform, and virtualenv details.

**resolve** [_package_]
> Run the dependency resolver in verbose mode. Optionally specify a package name to resolve only that dependency.

# DESCRIPTION

**poetry debug** provides diagnostic information for troubleshooting Poetry issues. The **info** subcommand displays Poetry version, Python version, system platform, and virtual environment details.

The **resolve** subcommand performs dependency resolution in debug mode, showing the solver's decision process. This is useful for diagnosing version conflicts or understanding why specific package versions were selected.

# CAVEATS

Must be run from a directory containing a **pyproject.toml** file. The **resolve** subcommand may take a long time on projects with many dependencies.

# HISTORY

The **debug** subcommand was added as part of Poetry's built-in diagnostic tooling to help users and maintainers troubleshoot environment and resolution issues.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-check](/man/poetry-check)(1), [poetry-env](/man/poetry-env)(1), [poetry-show](/man/poetry-show)(1)

