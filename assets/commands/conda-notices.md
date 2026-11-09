# TAGLINE

Retrieve and display channel notices

# TLDR

**Show channel notices**

```conda notices```

**Show notices from a specific channel**

```conda notices -c [channel_name]```

**Output notices as JSON**

```conda notices --json```

# SYNOPSIS

**conda** **notices** [_options_]

# PARAMETERS

**-c**, **--channel** _CHANNEL_
> Include the given channel. Can be specified multiple times.

**--use-local**
> Use locally built packages.

**-O**, **--override-channels**
> Do not search default or .condarc channels. Requires **--channel**.

**--json**
> Report all output as JSON.

**--console** _BACKEND_
> Select the backend used for normal output rendering.

**-v**, **--verbose**
> Increase output verbosity.

**-q**, **--quiet**
> Do not display the progress bar.

# CONFIGURATION

**~/.condarc**
> User-level conda configuration for channels, package settings, and solver options.

**/etc/conda/.condarc**
> System-wide conda configuration (also searched in **$CONDA_ROOT/.condarc**).

# DESCRIPTION

**conda notices** retrieves and displays notices from conda channels. Channel maintainers can publish informational messages or notices about channel stability, which are shown through this command. Notices are cached locally and only fetched again after the cache expires.

# INSTALL

```dnf: sudo dnf install conda```

```nix: nix profile install nixpkgs#conda```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[conda](/man/conda)(1), [conda-config](/man/conda-config)(1), [conda-info](/man/conda-info)(1)

# RESOURCES

```[Source code](https://github.com/conda/conda)```

```[Homepage](https://conda.io)```

```[Documentation](https://docs.conda.io/projects/conda/en/stable/commands/notices.html)```

<!-- verified: 2026-11-09 -->
