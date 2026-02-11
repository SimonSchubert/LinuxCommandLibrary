# TAGLINE

Extended Bourne shell with advanced features

# TLDR

**Start an interactive zsh shell**

```zsh```

**Execute a script**

```zsh [script.zsh]```

**Execute a command**

```zsh -c "[command]"```

**Start without loading config files**

```zsh -f```

**Start a login shell**

```zsh -l```

**Check script syntax** without executing

```zsh -n [script.zsh]```

# SYNOPSIS

**zsh** [**-cefinslvx**] [_script_ [_args_...]]

# PARAMETERS

**-c** _string_
> Execute commands from string

**-f**
> Don't source startup files

**-i**
> Force interactive mode

**-l**
> Login shell

**-n**
> No execute; check syntax only

**-s**
> Read commands from stdin

**-v**
> Verbose; print input as read

**-x**
> Xtrace; print commands as executed

# DESCRIPTION

**zsh** (Z Shell) is an extended Bourne shell with many improvements, combining features from bash, ksh, and tcsh. It offers powerful completion, theming, and scripting capabilities.

Zsh is highly configurable through **~/.zshrc** for interactive settings and **~/.zshenv** for all shells. Framework projects like Oh My Zsh and Prezto provide pre-configured themes and plugins.

Key features include advanced tab completion (programmable and context-aware), spelling correction, shared history across sessions, powerful globbing (recursive patterns, qualifiers), and extensive customization options.

Zsh is POSIX-compatible when needed but extends well beyond POSIX with associative arrays, floating-point math, and advanced parameter expansion.

# KEY FEATURES

**Completion**: Context-aware, programmable, menu selection
**Globbing**: **\*\*/** recursive, **(.)** qualifiers for filtering
**History**: Shared, searchable, substring matching
**Prompts**: Highly customizable with themes
**Aliases**: Global aliases, suffix aliases
**Arrays**: Indexed and associative arrays

# CAVEATS

Zsh syntax differs from bash in some areas (array indexing starts at 1 by default, different parameter expansion syntax). Scripts may need adjustment.

Heavy customization can slow shell startup. Profile with **zprof** and lazy-load plugins for faster interactive use.

The default completion system needs initialization with **compinit**. Most frameworks handle this automatically.

# HISTORY

Zsh was created by **Paul Falstad** at Princeton University in **1990**, named after Yale professor Zhong Shao (zsh = Zhong SHell). It has grown into one of the most feature-rich shells available and became the default shell in macOS Catalina (2019).

# SEE ALSO

[bash](/man/bash)(1), [sh](/man/sh)(1), [fish](/man/fish)(1), [ksh](/man/ksh)(1)
