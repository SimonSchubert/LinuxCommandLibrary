# TAGLINE

renders text as a PBM bitmap image

# TLDR

**Create text image**

```pbmtext "[Hello World]" > [output.pbm]```

**Create with specific font**

```pbmtext -font [fixed] "[Hello]" > [output.pbm]```

**Create with built-in font**

```pbmtext -builtin [fixed] "[Hello]" > [output.pbm]```

# SYNOPSIS

**pbmtext** [_options_] [_text_]

# PARAMETERS

**-font** _file_
> BDF font file.

**-builtin** _name_
> Built-in font (fixed, bdf).

**-space** _pixels_
> Space between characters.

**-lspace** _pixels_
> Line spacing.

**-nomargins**
> No margins around text.

# DESCRIPTION

**pbmtext** renders text as a PBM bitmap image. Part of Netpbm toolkit for creating text graphics. Supports BDF fonts and built-in fonts.

# INSTALL

```apt: sudo apt install netpbm```

```dnf: sudo dnf install netpbm```

```pacman: sudo pacman -S netpbm```

```apk: sudo apk add netpbm```

```zypper: sudo zypper install netpbm```

```brew: brew install netpbm```

```nix: nix profile install nixpkgs#netpbm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pbmtextps](/man/pbmtextps)(1), [ppmlabel](/man/ppmlabel)(1)

