# TAGLINE

splits a multi-image PAM/PNM stream into separate files

# TLDR

**Split** a multi-image PAM/PNM stream into numbered files

```pamsplit [input.pam] "[image%d.pam]"```

**Pad** the sequence number to a fixed width

```pamsplit -padname [4] [input.pam] "[image%d.pam]"```

**Use default filenames** (image0.pam, image1.pam, ...)

```pamsplit [input.pam]```

**Read from stdin** while writing numbered outputs

```cat [stream.pnm] | pamsplit - "[frame%d.pnm]"```

# SYNOPSIS

**pamsplit** [**-padname** _digits_] [_inputfile_] [_outputpattern_]

# PARAMETERS

_inputfile_
> Multi-image PAM/PNM input file. Use **-** or omit to read from stdin.

_outputpattern_
> Output filename pattern containing a single **%d** which is replaced with the (zero-based) image index. Defaults to **image%d**.

**-padname** _digits_
> Pad the sequence number with leading zeros to at least _digits_ characters (so **-padname 3** produces image000, image001, ...). Useful for ensuring lexicographic ordering of output files.

# DESCRIPTION

**pamsplit** reads a Netpbm stream that contains multiple concatenated PAM, PNM, PBM, PGM, or PPM images and writes each image to a separate file. The output filenames are generated from a printf-style pattern that includes a **%d** for the image index.

The tool is the inverse of **pnmcat** / **pamcat** and is part of the **Netpbm** package.

# CAVEATS

The output pattern must contain exactly one **%d** specifier. Existing files at the generated paths are silently overwritten. For PBM/PGM/PPM streams without alpha channels, **pamsplit** preserves the original format of each frame.

# HISTORY

**pamsplit** is part of the **Netpbm** package by Bryan Henderson and others, and supersedes the older **pnmsplit** utility from PBMplus.

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

[pamundice](/man/pamundice)(1), [pnmcat](/man/pnmcat)(1), [netpbm](/man/netpbm)(1)
