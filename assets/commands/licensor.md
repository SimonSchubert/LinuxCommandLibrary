# TLDR

**Generate MIT license**

```licensor MIT```

**Generate Apache license**

```licensor Apache-2.0```

**Generate GPL license**

```licensor GPL-3.0```

**Save to LICENSE file**

```licensor MIT -o LICENSE```

**List available licenses**

```licensor --list```

**With custom name**

```licensor MIT "[Your Name]"```

# SYNOPSIS

**licensor** [_options_] _license_ [_name_]

# PARAMETERS

_LICENSE_
> License identifier (MIT, Apache-2.0, GPL-3.0, etc.).

_NAME_
> Copyright holder name.

**-o** _FILE_
> Output to file.

**--list**
> List available licenses.

**--help**
> Display help information.

# DESCRIPTION

**licensor** generates license text for open source projects. It supports SPDX license identifiers.

The tool outputs properly formatted license text with copyright holder and year filled in.

licensor generates license text.

# CAVEATS

Uses SPDX identifiers. Rust-based tool. May need installation via cargo.

# HISTORY

licensor is a **Rust-based** license text generator using SPDX license identifiers for standardized open source licensing.

# SEE ALSO

[license](/man/license)(1), [cargo](/man/cargo)(1)

