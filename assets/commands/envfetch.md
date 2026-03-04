# TAGLINE

Cross-platform CLI for environment variables

# TLDR

**Display** all environment variables

```envfetch```

**Get** a specific variable

```envfetch [VARIABLE_NAME]```

**Search** for variables matching pattern

```envfetch --search [pattern]```

**Output** in JSON format

```envfetch --json```

# SYNOPSIS

**envfetch** [_options_] [_variable_]

# PARAMETERS

**--search** _PATTERN_
> Search for variables matching pattern

**--json**
> Output in JSON format

**--export**
> Output as shell export commands

**--no-color**
> Disable colored output

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**envfetch** is a cross-platform tool for displaying and querying environment variables. It provides a unified interface across different operating systems and shells for inspecting environment configuration.

The tool supports searching, filtering, and various output formats, making it useful for debugging environment issues and extracting configuration values.

# CAVEATS

Cross-platform compatibility may have slight variations. Sensitive variables are displayed by default. Large environment sets may require filtering.

# HISTORY

**envfetch** was developed as a portable alternative to platform-specific environment inspection tools.

# SEE ALSO

[env](/man/env)(1), [printenv](/man/printenv)(1), [set](/man/set)(1)