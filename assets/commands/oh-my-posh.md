# TAGLINE

prompt theme engine

# TLDR

**Initialize for shell**

```eval "$(oh-my-posh init [bash|zsh|fish])"```

**Use specific theme**

```eval "$(oh-my-posh init bash --config [theme.json])"```

**List available themes**

```oh-my-posh get themes```

**Print current config**

```oh-my-posh print primary```

**Debug prompt**

```oh-my-posh debug```

# SYNOPSIS

**oh-my-posh** [_command_] [_options_]

# PARAMETERS

**init** _SHELL_
> Initialize for shell.

**print** _SEGMENT_
> Print prompt segment.

**get themes**
> List themes.

**debug**
> Debug prompt.

**--config** _FILE_
> Configuration file.

**--help**
> Display help information.

# DESCRIPTION

**oh-my-posh** is a prompt theme engine. Customizes shell prompts with themes.

The tool provides rich prompt customization. Cross-shell compatible.

# CAVEATS

Requires Nerd Font for icons. Cross-platform. Config in JSON/YAML/TOML.

# HISTORY

oh-my-posh was created for **customizable shell prompts** across different shells.

# SEE ALSO

[starship](/man/starship)(1), [powerline](/man/powerline)(1), [p10k](/man/p10k)(1)

