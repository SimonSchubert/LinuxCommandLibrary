# TAGLINE

Harden npm, pnpm, yarn, bun and uv configurations against supply-chain risk

# TLDR

**Launch** the interactive TUI to scan and apply fixes

```depsguard```

**Scan only** and print a read-only report

```depsguard scan```

**Skip recursive file discovery** and check only local configs

```depsguard --no-search```

**Restore** a previous backup created by depsguard

```depsguard restore```

**Display** help

```depsguard --help```

# SYNOPSIS

**depsguard** [_scan_|_restore_] [_options_]

# DESCRIPTION

**depsguard** is a Rust CLI that audits JavaScript and Python package manager configuration files for supply-chain hardening settings and applies missing protections after explicit user approval.

It inspects user-level files such as `~/.npmrc`, `~/.yarnrc.yml`, `~/.bunfig.toml` and `uv.toml`, and repository-level files including `package.json`, lockfiles, Renovate config and Dependabot config. It checks for settings like minimum release age (delaying installation of newly published versions), blocking install scripts, restricting exotic transitive dependencies, trust policies, and strict build requirements.

In its default interactive mode depsguard presents detected issues in a TUI, lets the user select which fixes to apply, and writes timestamped backups under `~/.depsguard/backups/` before modifying any file. The `restore` subcommand replays a chosen backup.

The tool itself never installs packages and ships with zero third-party crate dependencies.

# PARAMETERS

**scan**
> Read-only report. Does not modify any files.

**restore**
> Recover configuration from a timestamped backup.

**--no-search**
> Check only local config files in the current directory. Skip recursive discovery.

**--help**
> Show CLI documentation.

# CONFIGURATION

Backups are written to `~/.depsguard/backups/` before each apply operation.

# CAVEATS

Some hardening options require recent package manager versions (for example npm 11.10 or newer for certain flags). A VT-capable terminal is recommended for proper TUI rendering. Building from source requires Rust 1.74 or newer.

# SEE ALSO

[npm](/man/npm)(1), [pnpm](/man/pnpm)(1), [yarn](/man/yarn)(1), [bun](/man/bun)(1), [uv](/man/uv)(1)
