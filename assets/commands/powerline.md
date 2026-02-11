# TAGLINE

Statusline plugin for shells and editors

# TLDR

**Start daemon**

```powerline-daemon --replace```

**Use with bash**

```powerline-daemon -q && PROMPT_COMMAND="powerline-bash-prompt"```

**Check configuration**

```powerline-lint```

**Reload configuration**

```powerline-daemon --kill && powerline-daemon```

# SYNOPSIS

**powerline** _ext_ _side_ [_options_]

**powerline-daemon** [_options_]

# PARAMETERS

**-q**, **--quiet**
> Suppress output.

**--replace**
> Replace running daemon.

**--kill**
> Kill daemon.

**-p**, **--config-path** _path_
> Configuration path.

# DESCRIPTION

**Powerline** is a statusline plugin for vim, tmux, zsh, bash, and other applications. It provides informative, visually appealing status displays showing contextual information such as Git branch and status, Python virtualenv, current working directory, hostname, and battery level.

The tool runs as a daemon process for performance, communicating with shell prompts and editor plugins via a client. Configuration files in **~/.config/powerline/** control themes, color schemes, and which segments appear in each context. A powerline-compatible font is required for the special glyphs used in the status bar separators.

# EXAMPLES

```bash
# Start daemon
powerline-daemon -q

# Check config
powerline-lint

# Test shell prompt
powerline shell left

# Install for bash (in .bashrc)
powerline-daemon -q
PROMPT_COMMAND="_update_ps1; $PROMPT_COMMAND"
```

# SHELL SETUP (bash)

```bash
# In ~/.bashrc
if [ -f /usr/share/powerline/bindings/bash/powerline.sh ]; then
    source /usr/share/powerline/bindings/bash/powerline.sh
fi
```

# TMUX SETUP

```
# In ~/.tmux.conf
source /usr/share/powerline/bindings/tmux/powerline.conf
```

# CONFIGURATION

**~/.config/powerline/config.json**
> Main configuration file defining default theme, colorscheme, and per-extension overrides for shell, tmux, vim, and other contexts.

**~/.config/powerline/themes/**
> Theme files controlling which segments appear in each statusline context (shell prompt, tmux status bar, vim statusline).

**~/.config/powerline/colorschemes/**
> Color scheme files mapping segment highlight groups to terminal colors.

# CAVEATS

Requires powerline-compatible font. Configuration in ~/.config/powerline/. Daemon improves performance.

# HISTORY

Powerline was created by **Kim Silkebækken** originally as a vim plugin, later expanded to shells and tmux.

# SEE ALSO

[starship](/man/starship)(1), [oh-my-zsh](/man/oh-my-zsh)(1), [tmux](/man/tmux)(1)
