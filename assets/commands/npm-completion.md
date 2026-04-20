# TAGLINE

generates shell completion scripts

# TLDR

**Print the completion script** (same output for bash and zsh)

```npm completion```

**Load completion for the current bash session**

```source <(npm completion)```

**Persist for bash**

```npm completion >> ~/.bashrc```

**Persist for zsh** (requires `compinit` to be loaded first)

```npm completion >> ~/.zshrc```

# SYNOPSIS

**npm** **completion**

# PARAMETERS

**--help**
> Display help information.

# DESCRIPTION

**npm completion** generates shell completion scripts. Enables tab completion for npm.

The command outputs script to stdout. Append to shell rc file.

# CAVEATS

Only **bash** and **zsh** are supported. The script will do nothing under other shells (fish, PowerShell). When used in zsh, `bashcompinit` must be active, which zsh's own `compinit` handles automatically in any modern setup. Reload the shell (or `source` the rc file) after appending.

# HISTORY

npm completion provides **shell integration** for command-line tab completion.

# SEE ALSO

[npm](/man/npm)(1), [bash-completion](/man/bash-completion)(1)

