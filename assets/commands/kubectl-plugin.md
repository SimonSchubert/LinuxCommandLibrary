# TAGLINE

Manage kubectl plugins

# TLDR

**List all available plugins with full paths**

```kubectl plugin list```

**List only plugin binary names without paths**

```kubectl plugin list --name-only```

# SYNOPSIS

**kubectl plugin** list [**--name-only**] [_options_]

# PARAMETERS

**list**
> List all available plugin executables on the user's PATH.

**--name-only**
> Show only the binary name of each plugin, rather than its full path.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**kubectl plugin** provides utilities for interacting with plugins. It discovers plugin executables in PATH that begin with the **kubectl-** prefix. For example, a binary named **kubectl-foo** becomes available as **kubectl foo**.

Running **kubectl plugin list** traverses all directories in PATH and displays matching executables in the order they appear. A warning is shown for any files beginning with **kubectl-** that are not executable, and for valid plugin files that shadow each other (duplicate names in different PATH directories).

Plugins can be installed manually by placing executables in PATH, or managed through **krew**, the kubectl plugin manager. Krew provides a curated index of community plugins and handles installation, upgrades, and removal.

# CAVEATS

Plugins must be executable files with the **kubectl-** prefix. Only the **list** subcommand is available; there are no built-in install or remove commands (use krew for that). If multiple plugins share the same name in different PATH directories, only the first one is used and a warning is displayed.

# HISTORY

kubectl plugin support was added to **Kubernetes** to enable extensible command-line functionality, following the pattern of git's plugin system.

# SEE ALSO

[kubectl](/man/kubectl)(1), [krew](/man/krew)(1)
