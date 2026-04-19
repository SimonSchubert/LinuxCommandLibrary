# TAGLINE

manage deployment environments via gh-environments extension

# TLDR

**Install the gh-environments extension**

```gh extension install katiem0/gh-environments```

**List environments for a repository**

```gh environments list [owner] --repo [repo]```

**List environments across all repos for an owner**

```gh environments list [owner]```

**Create environments from a CSV file**

```gh environments create [owner] --from-file [envs.csv]```

**List environment secrets to CSV**

```gh environments secrets list [owner] --repo [repo] -o [secrets.csv]```

**List environment variables to CSV**

```gh environments variables list [owner] --repo [repo] -o [vars.csv]```

**Create environment secrets from a CSV file**

```gh environments secrets create --from-file [secrets.csv]```

# SYNOPSIS

**gh** **environments** _subcommand_ [_options_]

# SUBCOMMANDS

**list**
> Generate a CSV report of environments and metadata for a repository or owner.

**create**
> Create environments and metadata from a CSV file.

**secrets list**
> Generate a CSV report of environment secrets.

**secrets create**
> Create environment secrets from a CSV file.

**variables list**
> Generate a CSV report of environment variables.

**variables create**
> Create environment variables from a CSV file.

# PARAMETERS

**-t**, **--token** _token_
> GitHub Personal Access Token (overrides `gh auth`).

**--hostname** _host_
> GitHub Enterprise Server hostname.

**-o**, **--output-file** _file_
> Output CSV filename for list commands.

**-f**, **--from-file** _file_
> Path to CSV file used by create commands.

**-d**, **--debug**
> Enable debug logging.

**--help**
> Show help information.

# DESCRIPTION

**gh-environments** is a GitHub CLI extension for managing repository deployment environments in bulk. It is not a built-in `gh` command; install it with `gh extension install katiem0/gh-environments`.

Environments represent deployment targets (production, staging, etc.) with optional protection rules and environment-specific secrets and variables. The extension reads and writes CSV files, making it suitable for auditing or replicating environment configuration across many repositories.

For inspecting the **environment variables** that control the `gh` CLI itself, run `gh help environment`.

# CAVEATS

This is a third-party extension, not a core `gh` subcommand. Protection rules (required reviewers, wait timer, branch restrictions) are not fully manageable via this extension — use the web UI or the REST API for advanced configuration.

# SEE ALSO

[gh](/man/gh)(1), [gh-secret](/man/gh-secret)(1)
