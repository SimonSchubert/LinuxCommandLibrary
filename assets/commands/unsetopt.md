# TAGLINE

Disable zsh shell options

# TLDR

**Disable option**

```unsetopt [optionname]```

**Disable glob**

```unsetopt glob```

**Disable extended glob**

```unsetopt extendedglob```

**Show all options**

```unsetopt```

# SYNOPSIS

**unsetopt** [_options_]

# PARAMETERS

_option_
> Option to disable.

# COMMON OPTIONS

- **glob** - Filename globbing
- **extendedglob** - Extended patterns
- **nomatch** - Error on no match
- **correct** - Command correction

# DESCRIPTION

**unsetopt** is a zsh builtin that disables shell options, serving as the counterpart to **setopt**. It controls various aspects of zsh behavior including filename globbing, command correction, history handling, and prompt expansion.

When called without arguments, unsetopt displays all options that are currently unset. Option names are case-insensitive and underscores in option names are ignored, so **extendedglob**, **EXTENDED_GLOB**, and **ExtendedGlob** all refer to the same option.

Changes only affect the current shell session unless added to zsh configuration files like ~/.zshrc. This command is specific to zsh and has no equivalent in bash, which uses **shopt -u** for a similar purpose with different option names.

# CAVEATS

Zsh only. Use setopt to enable. See zshoptions(1).

# HISTORY

**unsetopt** is a zsh builtin for disabling shell options, counterpart to setopt.

# SEE ALSO

[setopt](/man/setopt)(1), [zshoptions](/man/zshoptions)(1), [zsh](/man/zsh)(1)
