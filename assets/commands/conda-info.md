# TAGLINE

installation information display

# TLDR

**Show conda information**

```conda info```

**List all environments**

```conda info --envs```

**Show base environment info**

```conda info --base```

**Show info in JSON format**

```conda info --json```

**Show info about a package**

```conda info [package_name]```

# SYNOPSIS

**conda** **info** [_options_] [_packages..._]

# PARAMETERS

**-e**, **--envs**
> List all known conda environments.

**--base**
> Display base environment path.

**--json**
> Output in JSON format.

**-s**, **--system**
> List environment variables.

# CONFIGURATION

**~/.condarc**
> User-level conda configuration for channels, package settings, and solver options.

**/opt/conda/.condarc**
> System-wide conda configuration.

# DESCRIPTION

**conda info** displays information about the current conda installation, including version, configuration, channels, and environment locations.

When a package name is provided, shows information about that package.

# SEE ALSO

[conda](/man/conda)(1), [conda-config](/man/conda-config)(1), [conda-list](/man/conda-list)(1)
