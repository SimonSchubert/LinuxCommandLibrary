# TAGLINE

Verify PNG file integrity and structure

# TLDR

**Check PNG file** for integrity

```pngcheck [image.png]```

**Verbose** output (per-chunk details)

```pngcheck -v [image.png]```

**Check multiple files**

```pngcheck [*.png]```

**Colorized** output

```pngcheck -c [image.png]```

**Print text chunks** (titles, comments, etc.)

```pngcheck -t [image.png]```

**Quiet mode** - only show errors

```pngcheck -q [image.png]```

**Search for embedded PNGs** in a file

```pngcheck -s [file]```

# SYNOPSIS

**pngcheck** [**-cfpqstvx7**] _file_...

# PARAMETERS

_FILE_
> PNG, JNG, or MNG file(s) to check.

**-v**
> Verbose mode; show details of each chunk.

**-c**
> Colorize text output.

**-f**
> Force continuation after major errors.

**-p**
> Print contents of PLTE, tRNS, hIST, sPLT, and PPLT chunks.

**-q**
> Quiet mode; only show errors and warnings.

**-s**
> Search for sub-images (embedded PNGs/MNGs) in a file.

**-t**
> Print contents of tEXt, zTXt, and iTXt text chunks.

**-x**
> Search for and extract sub-images (use with **-s**).

**-7**
> Print tEXt chunks in 7-bit clean ASCII (escape high bytes).

**--help**
> Display help.

# DESCRIPTION

**pngcheck** verifies the integrity and structure of PNG, JNG, and MNG image files. It validates CRC checksums, checks chunk ordering, and reports structural errors or corruption.

In verbose mode it lists each chunk with dimensions, color type, bit depth, compression method, and filter type. With **-t** it prints embedded text metadata (tEXt, zTXt, iTXt). With **-s** it can locate PNG/MNG images embedded in other files, and **-x** can extract them.

# CAVEATS

PNG/JNG/MNG formats. Read-only analysis.

# HISTORY

pngcheck was created for **PNG file validation** and inspection.

# INSTALL

```apt: sudo apt install pngcheck```

```dnf: sudo dnf install pngcheck```

```zypper: sudo zypper install pngcheck```

```brew: brew install pngcheck```

```nix: nix profile install nixpkgs#pngcheck```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pngcrush](/man/pngcrush)(1), [optipng](/man/optipng)(1), [file](/man/file)(1)

