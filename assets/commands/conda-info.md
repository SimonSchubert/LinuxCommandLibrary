# TAGLINE

Display information about the current conda installation

# TLDR

**Show conda information**

```conda info```

**Show all information** (verbose, includes channels, config files, plugins)

```conda info --all```

**List all environments**

```conda info --envs```

**Show base environment path**

```conda info --base```

**Show environment variables that affect conda**

```conda info --system```

**Show disk usage of conda-managed directories**

```conda info --size```

**Show info in JSON format** (machine-readable)

```conda info --json```

**Show info about a package** (replaces the removed `conda info <pkg>`)

```conda search [package_name] --info```

# SYNOPSIS

**conda** **info** [_options_]

# PARAMETERS

**-a**, **--all**
> Show all information (channels, config files, plugins, env list, etc.).

**--base**
> Display base environment path.

**-e**, **--envs**
> List all known conda environments. Combine with **--json** for more details.

**-s**, **--system**
> List environment variables that affect conda.

**--size**
> Show disk usage for conda-managed directories per environment.

**--unsafe-channels**
> Display the channel list with auth tokens exposed (use with care).

**--json**
> Output in JSON format. Suitable for programmatic consumption.

**-v**, **--verbose**
> Increase logging verbosity. Repeat up to four times for TRACE level.

**-q**, **--quiet**
> Suppress progress bars.

# CONFIGURATION

**~/.condarc**
> User-level conda configuration for channels, package settings, and solver options.

**/opt/conda/.condarc**
> System-wide conda configuration.

# DESCRIPTION

**conda info** displays information about the current conda installation, including version, configuration files, configured channels, and environment locations.

The legacy form **conda info** _package_ for inspecting a package was deprecated and removed in **conda 24.3 (March 2024)**. Use **conda search** _package_ **--info** instead.

# CAVEATS

**conda info** _package_ no longer prints package metadata; use **conda search** _package_ **--info**. The **--unsafe-channels** option exposes channel auth tokens in plain text, so avoid using it in shared logs.

# INSTALL

```dnf: sudo dnf install conda```

```nix: nix profile install nixpkgs#conda```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[conda](/man/conda)(1), [conda-config](/man/conda-config)(1), [conda-list](/man/conda-list)(1)
