# TAGLINE

Draw shapes and text on PPM images

# TLDR

**Draw on PPM image with script**

```ppmdraw -script "[line 0 0 100 100]" [input.ppm] > [output.ppm]```

**Use script file**

```ppmdraw -scriptfile [commands.txt] [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmdraw** [_options_] [_file_]

# PARAMETERS

**-script** _commands_
> Drawing commands inline.

**-scriptfile** _file_
> File containing drawing commands.

# DESCRIPTION

**ppmdraw** draws shapes and text on PPM images using a scripting language. Supports lines, circles, text, and filled shapes. Part of Netpbm toolkit.

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

[ppmlabel](/man/ppmlabel)(1), [pbmtext](/man/pbmtext)(1)

