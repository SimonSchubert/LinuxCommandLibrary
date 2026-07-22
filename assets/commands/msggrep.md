# TAGLINE

searches PO files for messages

# TLDR

**Search for messages**

```msggrep -K -e "[pattern]" [input.po] -o [output.po]```

**Search in translations**

```msggrep -T -e "[pattern]" [input.po]```

**Search in source references**

```msggrep -N "[file.c]" [input.po]```

**Invert match**

```msggrep -v -K -e "[pattern]" [input.po]```

**Case insensitive search**

```msggrep -K -e "[pattern]" -i [input.po]```

# SYNOPSIS

**msggrep** [_options_] [_inputfile_]

# PARAMETERS

_INPUTFILE_
> PO file to search.

**-K**
> Search in msgid (key).

**-T**
> Search in msgstr (translation).

**-e** _PATTERN_
> Regular expression pattern.

**-N** _FILE_
> Search by source reference.

**-v**
> Invert match.

**--help**
> Display help information.

# DESCRIPTION

**msggrep** searches PO files for messages. It's part of GNU gettext.

The tool filters messages by pattern. Extracts matching entries to new PO file.

# CAVEATS

Part of gettext-tools. Regex syntax. Use -K for keys, -T for translations.

# HISTORY

msggrep is part of **GNU gettext**, providing search functionality for translation files.

# INSTALL

```apt: sudo apt install gettext```

```dnf: sudo dnf install gettext```

```pacman: sudo pacman -S gettext```

```apk: sudo apk add gettext```

```brew: brew install gettext```

```nix: nix profile install nixpkgs#gettext```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[msgfilter](/man/msgfilter)(1), [msgconv](/man/msgconv)(1), [grep](/man/grep)(1)

