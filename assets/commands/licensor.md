# TAGLINE

generates license text for open source projects

# TLDR

**Generate MIT license** with a copyright holder name

```licensor MIT "[Your Name]"```

**Generate Apache license** and save to file

```licensor Apache-2.0 > LICENSE```

**Generate GPL license**

```licensor GPL-3.0```

**Generate license** with exception expression

```licensor "Apache-2.0 WITH LLVM-exception" --skip-optional```

**List available licenses**

```licensor --licenses```

# SYNOPSIS

**licensor** _license_ [_name_] [_options_]

# PARAMETERS

_LICENSE_
> SPDX license identifier (MIT, Apache-2.0, GPL-3.0, etc.). Supports exception expressions.

_NAME_
> Copyright holder name (optional, for licenses that include it).

**--licenses**
> List all available SPDX license identifiers.

**--skip-optional**
> Omit optional sections from the license text.

**--help**
> Display help information.

# DESCRIPTION

**licensor** writes license text to stdout given an SPDX license identifier. All licenses are compiled into the binary. If the provided ID isn't found, similar ones will be suggested.

The tool outputs properly formatted license text with copyright holder and year filled in.

# CAVEATS

Uses SPDX identifiers. Rust-based tool. May need installation via cargo.

# HISTORY

licensor was created by **Raphael Theriault** (raftario) as a **Rust-based** license text generator using SPDX license identifiers.

# SEE ALSO

[license](/man/license)(1), [cargo](/man/cargo)(1)

