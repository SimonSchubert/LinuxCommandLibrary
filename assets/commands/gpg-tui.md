# TAGLINE

Terminal user interface for GnuPG key management

# TLDR

**Launch gpg-tui**

```gpg-tui```

**Specify keyring to use**

```gpg-tui --homedir [~/.gnupg]```

**Use specific style**

```gpg-tui --style [colored]```

**Export output format**

```gpg-tui --output-format [minimal]```

# SYNOPSIS

**gpg-tui** [_options_]

# PARAMETERS

**--homedir** _DIR_
> Use _DIR_ as the GnuPG home directory (overrides **GNUPGHOME**).

**-c**, **--color** _COLOR_
> Set the accent color (e.g. _gray_, _red_, _green_, _blue_, or a hex value).

**-s**, **--style** _STYLE_
> Set the table border style: _plain_, _bold_, _double_, or _light_.

**-d**, **--detail-level** _LEVEL_
> Initial detail level for keys: _minimum_, _standard_, or _full_.

**-r**, **--no-tty**
> Run without TTY interaction (useful when piping).

**-x**, **--select** _SELECTION_
> Pre-select rows on startup (key IDs or fingerprints).

**--splash**
> Show the splash screen at startup.

**-h**, **--help**
> Show help information.

**-V**, **--version**
> Show version.

# DESCRIPTION

**gpg-tui** is a terminal user interface for managing GnuPG keys. Written in Rust, it provides an interactive interface for listing, viewing, importing, exporting, signing, editing, and deleting keys without memorizing complex gpg command-line options.

The tool reads from the standard GnuPG keyring and supports multiple visual styles for display customization.

# INSTALL

```pacman: sudo pacman -S gpg-tui```

```apk: sudo apk add gpg-tui```

```zypper: sudo zypper install gpg-tui```

```brew: brew install gpg-tui```

```nix: nix profile install nixpkgs#gpg-tui```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gpg](/man/gpg)(1), [gpg2](/man/gpg2)(1)
