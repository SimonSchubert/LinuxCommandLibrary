# TAGLINE

Mathematical equation preprocessor for troff

# TLDR

**Process equations** in troff input

```eqn [document.ms] | troff -ms```

**Process with groff**

```groff -e -ms [document.ms]```

**Process to stdout**

```eqn [equations.eqn]```

# SYNOPSIS

**eqn** [_options_] [_files_...]

# PARAMETERS

_FILES_
> Input files containing equations.

**-d** _XY_
> Set delimiters for inline equations.

**-f** _FONT_
> Set font for equations.

**-s** _SIZE_
> Set point size.

**-p** _N_
> Subscript/superscript size reduction.

**-C**
> Recognize .EQ and .EN even in comments.

# DESCRIPTION

**eqn** is a preprocessor for troff that formats mathematical equations. It converts a high-level equation description language into troff commands for typeset output.

Equations are enclosed between .EQ and .EN macros or inline delimiters. The language uses words like "over" for fractions, "sup" for superscripts, and "sqrt" for roots.

eqn is typically used in a pipeline with troff/groff for producing technical documents with mathematical notation.

# CAVEATS

Syntax differs from LaTeX. Output requires troff processing. Complex equations need careful formatting. Limited symbol set compared to TeX.

# HISTORY

eqn was written by **Brian Kernighan** and **Lorinda Cherry** at Bell Labs in the 1970s. It was one of the first tools for typesetting mathematics and influenced later systems.

# INSTALL

```apt: sudo apt install groff-base```

```dnf: sudo dnf install groff-base```

```pacman: sudo pacman -S groff```

```apk: sudo apk add groff```

```zypper: sudo zypper install groff```

```brew: brew install groff```

```nix: nix profile install nixpkgs#groff```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[groff](/man/groff)(1), [troff](/man/troff)(1), [tbl](/man/tbl)(1), [pic](/man/pic)(1), [neqn](/man/neqn)(1)

# RESOURCES

```[Source code](https://cgit.git.savannah.gnu.org/cgit/groff.git)```

```[Homepage](https://www.gnu.org/software/groff/)```

```[Documentation](https://www.gnu.org/software/groff/manual/groff.html)```

<!-- verified: 2026-07-14 -->
