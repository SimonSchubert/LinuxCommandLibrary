# TLDR

**Apply a theme**

```flavours apply [theme-name]```

**List available themes**

```flavours list```

**Generate shell completions**

```flavours generate [bash|zsh|fish]```

**Build templates**

```flavours build [template-path]```

**Update schemes**

```flavours update schemes```

# SYNOPSIS

**flavours** [_options_] _command_ [_args_]

# PARAMETERS

**apply** _theme_
> Apply Base16 theme to configured applications.

**list**
> List available themes.

**info** _theme_
> Show theme information.

**build** _template_
> Build configuration from template.

**update** _target_
> Update schemes, templates, or all.

**generate** _shell_
> Generate shell completions.

**current**
> Show currently applied theme.

# DESCRIPTION

**flavours** is a Base16 theme manager written in Rust. It applies consistent color schemes across multiple applications by generating configuration files from templates.

Base16 provides 16-color schemes designed to work across terminals, editors, and other applications. flavours automates applying these schemes to all configured applications simultaneously.

# CONFIGURATION

```yaml
# ~/.config/flavours/config.toml
[[items]]
file = "~/.config/alacritty/alacritty.yml"
template = "alacritty"
subtemplate = "default-256"

[[items]]
file = "~/.config/nvim/colors/base16.vim"
template = "vim"
```

# CAVEATS

Requires templates for each application. Not all applications support Base16. Applications may need restart after theme change. Template syntax must be correct.

# HISTORY

flavours was created as a Rust alternative to existing Base16 managers. Base16 itself was created by **Chris Kempson** to provide a consistent theming architecture across different applications.

# SEE ALSO

[base16-shell](/man/base16-shell)(1), [pywal](/man/pywal)(1)
