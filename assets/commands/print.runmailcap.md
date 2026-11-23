# TAGLINE

Print files using MIME type handlers

# TLDR

**Print** any file using its mailcap print rule

```print [path/to/file]```

Print a **compressed** file (decompressed automatically)

```print [output.ps.gz]```

Print **standard input**, specifying the MIME type explicitly

```cat [file.ps] | print application/postscript:-```

**Show the command** that would be run without running it

```print --norun [path/to/file]```

Print using **run-mailcap** directly

```run-mailcap --action=print [path/to/file]```

# SYNOPSIS

**print** [**--**_option_[=_value_]] [_MIME-TYPE_:[_ENCODING_:]]_FILE_ [...]

# PARAMETERS

**--action=**_ACTION_
> Override the action: view, cat, compose, composetyped, edit or print.

**--debug**
> Show extra information about how the handler is chosen.

**--nopager**
> Ignore any copiousoutput directive and send output to stdout.

**--norun**
> Display the matching command without executing it.

# DESCRIPTION

**print** is an alias for **run-mailcap** that defaults to the `print` action. It processes files based on their MIME type and sends them to the appropriate print handler defined in the mailcap configuration (`~/.mailcap` and `/etc/mailcap`).

If no MIME type is given, it is guessed from the file extension via `~/.mime.types` and `/etc/mime.types`, falling back to the **file** command. The encoding (gzip, bzip2, xz, zstd, compress) is likewise detected from the extension and the file is decompressed before printing. A filename of `-` means standard input, in which case the MIME type must be given.

The related aliases **see**, **edit**, and **compose** default to the view, edit, and compose actions respectively.

# CAVEATS

Requires a mailcap entry with a **print=** field for the file's MIME type; many types have none, in which case nothing is printed. Print behavior depends on system print configuration. On many systems **print** is shadowed by the zsh/ksh **print** builtin, so call **run-mailcap --action=print** from those shells.

# HISTORY

Part of Debian's **mime-support** package, which was split in Debian 11 into **mailcap** (run-mailcap and its aliases) and **media-types** (/etc/mime.types).

# SEE ALSO

[run-mailcap](/man/run-mailcap)(1), [see](/man/see)(1), [edit](/man/edit)(1), [compose](/man/compose)(1), [lpr](/man/lpr)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/debian/mailcap)```

```[Documentation](https://manpages.debian.org/trixie/mailcap/run-mailcap.1.en.html)```

<!-- verified: 2026-11-23 -->
