# TLDR

**Fix previous command**

```fuck```

**Confirm before running**

```fuck --yeah```

**Use specific correction**

```fuck --yes [number]```

**Show available fixes**

```fuck --help```

# SYNOPSIS

**fuck** [_options_]

# PARAMETERS

**--yeah**, **--yes**
> Confirm fix immediately.

**--help**
> Display help information.

# DESCRIPTION

**fuck** is the command from The Fuck application that corrects previous console commands. It analyzes the previous failed command and suggests corrections.

When you mistype a command or forget sudo, running fuck proposes the corrected command. It learns from your shell history and supports many common mistake patterns.

fuck integrates with shells through aliases or key bindings for quick access.

# CAVEATS

Alias setup required. May not catch all errors. Some corrections may not be appropriate. Use with caution.

# HISTORY

fuck is part of **The Fuck** project created by Vladimir Iakovlev. The application provides an amusing yet practical way to correct command-line mistakes through Python-based rule matching.

# SEE ALSO

[thefuck](/man/thefuck)(1), [bash](/man/bash)(1)
