# TAGLINE

converts PAM images to PNM format

# TLDR

**Convert PAM to PNM format**

```pamtopnm [input.pam] > [output.pnm]```

**Convert, overriding tuple type check with -assume**

```pamtopnm -assume [input.pam] > [output.pnm]```

**Convert silently without informational messages**

```pamtopnm -quiet [input.pam] > [output.pnm]```

# SYNOPSIS

**pamtopnm** [**-assume**] [**-quiet**] [_file_]

# PARAMETERS

**-assume**
> Override the tuple type requirement. Asserts that the tuples contain valid PBM, PGM, or PPM data regardless of the PAM tuple type. The depth must still conform to the target format.

**-quiet**
> Suppress informational messages to standard error.

# DESCRIPTION

**pamtopnm** reads a PAM image as input and produces an equivalent PBM, PGM, or PPM (i.e. PNM) image as output. The output format is chosen automatically based on the input: BLACKANDWHITE becomes PBM, GRAYSCALE becomes PGM, and RGB becomes PPM.

If the input PAM does not have an appropriate tuple type (BLACKANDWHITE, GRAYSCALE, or RGB) and depth, pamtopnm fails unless **-assume** is specified. To force conversion of images with extra channels, run the input through **pamchannel** first to select the desired channels.

Part of the Netpbm toolkit.

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

[pamtopam](/man/pamtopam)(1), [netpbm](/man/netpbm)(1)
