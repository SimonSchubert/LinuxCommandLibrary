# TAGLINE

enhanced shell history browser

# TLDR

**Launch hstr**

```hstr```

**Search command history**

```hstr [pattern]```

**Show favorites**

```hstr -f```

**Non-interactive search**

```hstr -n [pattern]```

**Add current binding**

```hstr --show-configuration >> ~/.bashrc```

# SYNOPSIS

**hstr** [_options_] [_pattern_]

# DESCRIPTION

**hstr** (HiSToRy) is an enhanced shell history browser. It provides a visual interface for searching and selecting commands from history, with ranking by frequency and recency.

The tool integrates with bash and zsh, replacing or augmenting Ctrl+R with a more powerful search interface.

# PARAMETERS

**-f**, **--favorites**
> Show favorite commands.

**-n**, **--non-interactive**
> Non-interactive mode.

**-s**, **--show-configuration**
> Show shell configuration.

**-b**, **--show-blacklist**
> Show blacklisted commands.

**--show-zsh-configuration**
> Show zsh configuration.

**-V**, **--version**
> Show version.

# KEYBOARD SHORTCUTS

**Ctrl+R**: Search history
**Tab**: Select command
**Ctrl+F**: Add to favorites
**Ctrl+/**: Toggle sort order
**Ctrl+E**: Toggle regex mode

# CAVEATS

Requires shell configuration. Large history may be slow initially. Favorites stored separately. Works best with large history limit.

# HISTORY

**hstr** was created by **Martin Dvorak** to improve command-line history navigation. It addresses the limitations of basic Ctrl+R search by providing visual feedback and better ranking algorithms.

# SEE ALSO

[fzf](/man/fzf)(1), [mcfly](/man/mcfly)(1), [history](/man/history)(1), [bash](/man/bash)(1)
