# TAGLINE

TUI for editing and managing your PATH environment variable

# TLDR

**Launch the PATH editor**

```pathos```

# SYNOPSIS

**pathos** [_options_]

# DESCRIPTION

**pathos** is a terminal user interface for interactively editing your shell's PATH environment variable. It lets you reorder, add, and remove directories with color-coded indicators: yellow for the current position, red for non-existent directories, and aqua for duplicates. Changes are written to **~/pathos.sh** which must be sourced to take effect.

# CAVEATS

Changes do not apply automatically. You must source **~/pathos.sh** in your shell configuration for modifications to persist.

# HISTORY

**pathos** was created by **chip** and is written in **Go**.

# SEE ALSO

[export](/man/export)(1), [env](/man/env)(1), [direnv](/man/direnv)(1)
