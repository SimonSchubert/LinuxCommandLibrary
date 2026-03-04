# TAGLINE

Environment snapshot and diff tool

# TLDR

**Capture** current environment state

```envdiff capture```

**Compare** current environment to snapshot

```envdiff diff [snapshot.json]```

**List** all captured snapshots

```envdiff list```

**Compare** two snapshots

```envdiff diff [snapshot1.json] [snapshot2.json]```

# SYNOPSIS

**envdiff** [_command_] [_options_] [_snapshots_]

# PARAMETERS

**capture** [_NAME_]
> Capture current environment state

**diff** [_SNAPSHOT1_] [_SNAPSHOT2_]
> Compare environments (defaults to current if only one specified)

**list**
> List all saved snapshots

**delete** _NAME_
> Delete a snapshot

**--format** _FORMAT_
> Output format: text, json, yaml (default: text)

**--include** _VARS_
> Comma-separated list of variables to include

**--exclude** _VARS_
> Comma-separated list of variables to exclude

**--sensitive**
> Include sensitive variables (masked by default)

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**envdiff** is a tool for capturing and comparing environment variable states. It allows users to snapshot their environment, compare different states, and track changes over time.

The tool is useful for debugging environment-related issues, verifying configuration consistency across different systems, and documenting environment setups.

# CAVEATS

Sensitive data is masked by default but may still be captured. Large environment variable sets can create large snapshot files. System-specific variables may differ between platforms.

# HISTORY

**envdiff** was created to help developers troubleshoot environment-related issues by providing a way to track and compare environment states over time.

# SEE ALSO

[env](/man/env)(1), [printenv](/man/printenv)(1), [export](/man/export)(1)