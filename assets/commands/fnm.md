# TAGLINE

fast Node.js version manager written in Rust

# TLDR

**Install a specific Node.js version**

```fnm install [18.17.0]```

**Install the latest LTS release**

```fnm install --lts```

**Switch the current shell to a version**

```fnm use [18]```

**Set the default global version**

```fnm default [18]```

**List installed versions**

```fnm list```

**List versions available for download**

```fnm list-remote```

**Enable automatic switching on cd and evaluate shell init**

```eval "$(fnm env --use-on-cd)"```

# SYNOPSIS

**fnm** _command_ [_options_] [_arguments_]

# PARAMETERS

**install** [_VERSION_] [**--lts**]
> Download and install a Node.js version. Accepts full versions (18.17.0), major versions (18), `latest`, or `--lts` for the newest LTS.

**use** _VERSION_ [**--install-if-missing**]
> Switch the current shell to _VERSION_. With `--install-if-missing`, installs the version first if it is not present.

**default** _VERSION_
> Set the default global Node.js version used in new shells.

**current**
> Print the active Node.js version.

**list**, **ls**
> List all versions installed locally.

**list-remote**, **ls-remote**
> List all versions available from the distribution mirror.

**uninstall** _VERSION_
> Remove an installed Node.js version.

**alias** _VERSION_ _NAME_
> Create a named alias for a version.

**unalias** _NAME_
> Remove a named alias.

**exec** **--using=**_VERSION_ _CMD_
> Run _CMD_ with a specific Node.js version without switching the shell.

**env** [**--shell**=_SHELL_] [**--use-on-cd**]
> Print shell configuration to be eval'd; enables fnm in the current shell and optionally auto-switches on directory change.

**completions** **--shell**=_SHELL_
> Print shell completion scripts for bash, zsh, fish, or PowerShell.

**--node-dist-mirror** _URL_
> Use an alternative Node.js distribution mirror.

**--fnm-dir** _PATH_
> Override the fnm installation directory (default `~/.fnm`).

**--log-level** _LEVEL_
> Control verbosity (quiet, error, info).

**--version**, **-V**
> Display version information.

**--help**, **-h**
> Display help information.

# DESCRIPTION

**fnm** (Fast Node Manager) is a Node.js version manager written in Rust. It provides quick installation and switching between Node.js versions with minimal overhead.

The tool reads .node-version or .nvmrc files for automatic version switching. Shell integration enables per-directory version selection without manual commands.

fnm emphasizes speed with Rust implementation and cross-platform support including Windows.

# CONFIGURATION

**.node-version**
> Specifies Node.js version for the current directory.

**.nvmrc**
> Alternative version file format compatible with nvm.

# CAVEATS

Shell integration via `eval "$(fnm env --use-on-cd)"` is required for `fnm use`, automatic version switching on `cd`, and keeping PATH in sync. fnm is not a drop-in replacement for **nvm**: it does not source bash profile or provide all nvm subcommands. Installed Node versions are stored under `$FNM_DIR` (default `~/.fnm`); the active version is symlinked into a per-shell directory, so different shells can have different active versions.

# HISTORY

fnm was created as a fast alternative to **nvm**, the original Node Version Manager. Written in Rust, it dramatically improves installation and switching speed over shell-based alternatives.

# SEE ALSO

[nvm](/man/nvm)(1), [node](/man/node)(1), [volta](/man/volta)(1)
