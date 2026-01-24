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

**unsetopt** disables zsh options. It's a zsh builtin.

Option control. Disable features.

Zsh specific. Not in bash.

Many options. Shell behavior.

Session scope. Current shell.

# CAVEATS

Zsh only. Use setopt to enable. See zshoptions(1).

# HISTORY

**unsetopt** is a zsh builtin for disabling shell options, counterpart to setopt.

# SEE ALSO

[setopt](/man/setopt)(1), [zshoptions](/man/zshoptions)(1), [zsh](/man/zsh)(1)
