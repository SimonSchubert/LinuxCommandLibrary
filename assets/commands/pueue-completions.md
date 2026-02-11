# TAGLINE

Generate shell completion scripts for pueue

# TLDR

**Generate bash completions**

```pueue completions bash > [pueue.bash]```

**Generate zsh completions**

```pueue completions zsh > [_pueue]```

**Generate fish completions**

```pueue completions fish > [pueue.fish]```

# SYNOPSIS

**pueue completions** _shell_

# PARAMETERS

_SHELL_
> Shell type (bash, zsh, fish, powershell).

# DESCRIPTION

**pueue completions** generates shell tab-completion scripts for pueue commands. It outputs completion definitions to stdout for bash, zsh, fish, or PowerShell, which should be redirected to the appropriate shell completion directory for automatic loading.

# CAVEATS

Output to appropriate location. Shell-specific.

# HISTORY

pueue completions provides **shell completion** generation.

# SEE ALSO

[pueue](/man/pueue)(1)

