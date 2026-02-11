# TAGLINE

Cross-shell customizable prompt in Rust

# TLDR

**Initialize for bash**

```eval "$(starship init bash)"```

**Initialize for zsh**

```eval "$(starship init zsh)"```

**Initialize for fish**

```starship init fish | source```

**Print configuration**

```starship print-config```

**Generate preset config**

```starship preset [pastel-powerline] > ~/.config/starship.toml```

**Display prompt**

```starship prompt```

**Explain prompt segments**

```starship explain```

**Time prompt rendering**

```starship timings```

# SYNOPSIS

**starship** [_init shell_] [_prompt_] [_preset_] [_options_]

# PARAMETERS

**init** _SHELL_
> Generate shell init script.

**prompt**
> Print prompt.

**preset** _NAME_
> Print preset configuration.

**print-config**
> Print config.

**explain**
> Explain prompt segments.

**timings**
> Time prompt rendering.

**completions** _SHELL_
> Generate completions.

**bug-report**
> Generate bug report.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**starship** is a minimal, fast, cross-shell prompt. Written in Rust, it provides consistent appearance and features across bash, zsh, fish, PowerShell, and more.

Configuration in ~/.config/starship.toml customizes modules. Each module shows specific information: git status, language versions, cloud context, etc.

Modules appear contextually. Python version shows only in Python projects. Git info shows only in repositories. This keeps prompts clean.

Presets provide ready-made configurations. They range from minimal to information-rich, with various color schemes.

Speed is a priority. The prompt renders quickly even with many modules enabled. Timings command helps identify slow modules.

The prompt is cross-platform, working on Linux, macOS, and Windows. Configuration is portable across systems.

# CONFIGURATION

**~/.config/starship.toml**
> Main configuration file defining enabled modules, display format, colors, and per-module settings.

**STARSHIP_CONFIG**
> Environment variable to specify an alternate configuration file path.

# CAVEATS

Requires Nerd Font for icons. Configuration syntax may differ from shell prompts. Some modules need external commands.

# HISTORY

**Starship** was created by **Matan Kushner** around **2019**. It gained popularity as a fast, configurable alternative to framework-specific prompts like Oh My Zsh themes.

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1), [powerline](/man/powerline)(1)
