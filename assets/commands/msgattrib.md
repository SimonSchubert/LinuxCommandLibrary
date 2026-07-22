# TAGLINE

filters gettext PO files by message attributes

# TLDR

**Extract translated messages**

```msgattrib --translated [input.po] -o [output.po]```

**Extract untranslated messages**

```msgattrib --untranslated [input.po] -o [output.po]```

**Extract fuzzy messages**

```msgattrib --fuzzy [input.po] -o [output.po]```

**Clear fuzzy flags**

```msgattrib --clear-fuzzy [input.po] -o [output.po]```

# SYNOPSIS

**msgattrib** [_options_] _inputfile_

# PARAMETERS

**--translated**
> Keep only translated messages.

**--untranslated**
> Keep only untranslated messages.

**--fuzzy**
> Keep only fuzzy messages.

**--clear-fuzzy**
> Remove fuzzy flags.

**--set-fuzzy**
> Set fuzzy flags.

**-o** _file_
> Output file.

# DESCRIPTION

**msgattrib** filters gettext PO files by message attributes. Extracts or modifies messages based on translation status (translated, fuzzy, obsolete). Part of GNU gettext for internationalization workflows.

# INSTALL

```apt: sudo apt install gettext```

```dnf: sudo dnf install gettext```

```pacman: sudo pacman -S gettext```

```apk: sudo apk add gettext```

```brew: brew install gettext```

```nix: nix profile install nixpkgs#gettext```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[msgcat](/man/msgcat)(1), [msgfmt](/man/msgfmt)(1), [msgunfmt](/man/msgunfmt)(1)

