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

**--homedir** _dir_
> GnuPG home directory.

**--style** _style_
> Visual style (colored, plain, minimal).

**--output-format** _format_
> Output format for exports.

**-h**, **--help**
> Show help information.

**-V**, **--version**
> Show version.

# DESCRIPTION

**gpg-tui** is a terminal user interface for managing GnuPG keys. It provides an interactive interface for listing, viewing, importing, exporting, signing, editing, and deleting keys. Written in Rust, it makes GPG key management more accessible without memorizing complex command-line options.

# SEE ALSO

[gpg](/man/gpg)(1), [gpg-agent](/man/gpg-agent)(1)

