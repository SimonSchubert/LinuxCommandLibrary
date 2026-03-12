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
> Generate shell initialization script (bash, zsh, fish, powershell, cmd, nu).

**get themes**
> List available themes.

**get shell**
> Display current shell information.

**config export**
> Export current theme configuration.

**config migrate**
> Migrate configuration to current version format.

**font install**
> Install a Nerd Font.

**cache clear**
> Clear the prompt cache.

**upgrade**
> Update oh-my-posh to the latest version.

**toggle** _segment_
> Enable or disable a specific prompt segment.

**debug**
> Show prompt rendering diagnostics.

**--config** _FILE_
> Path to configuration file (JSON, YAML, or TOML).

# DESCRIPTION

**oh-my-posh** is a cross-platform prompt theme engine that renders customizable shell prompts using configurable segments for git status, language versions, execution time, and more. It works with bash, zsh, fish, PowerShell, cmd, and nu.

# CAVEATS

Requires Nerd Font for icons. Cross-platform. Config in JSON/YAML/TOML.

# HISTORY

oh-my-posh was created for **customizable shell prompts** across different shells.

# SEE ALSO

[starship](/man/starship)(1), [powerline](/man/powerline)(1), [p10k](/man/p10k)(1)

