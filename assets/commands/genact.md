# TAGLINE

Nonsense activity generator for the terminal

# TLDR

**Run** random fake activity scenes

```genact```

**Show help** and options

```genact --help```

**Run selected modules** only

```genact -m [cargo]```

# SYNOPSIS

**genact** [*OPTIONS*]

# DESCRIPTION

**genact** pretends to be busy in the terminal: it plays fake scenes (compilers, network dumps, installs, and similar eye candy) so it looks like serious work is happening when nothing useful is. Multiple instances increase the chaos. There is also a WebAssembly web build at the project homepage.

Install via release binaries, **cargo install genact**, Homebrew, FreeBSD **pkg**, Scoop, and other packages. No external services required.

# PARAMETERS

Common options (see **genact --help** for the authoritative list of your build):

**-l**, **--list-modules**

> List available scenes/modules.

**-m**, **--modules** *name*

> Run only selected modules.

**-s**, **--speed-factor** *n*

> Speed multiplier.

**-h**, **--help** / **-V**, **--version**

> Help and version.

# CAVEATS

Purely cosmetic; does not perform real builds or network work (beyond what a scene might simulate). Intended as humor and demos, not production tooling.

# SEE ALSO

[cmatrix](/man/cmatrix)(1), [sl](/man/sl)(1)


# RESOURCES

```[Source code](https://github.com/svenstaro/genact)```

```[Homepage](https://svenstaro.github.io/genact/)```

<!-- verified: 2026-07-19 -->
