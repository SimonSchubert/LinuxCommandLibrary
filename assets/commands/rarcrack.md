# TAGLINE

Brute-force password recovery for archives

# TLDR

**Crack RAR password**

```rarcrack [archive.rar]```

**Crack ZIP password**

```rarcrack [archive.zip] --type zip```

**Crack 7z password**

```rarcrack [archive.7z] --type 7z```

**Set thread count**

```rarcrack [archive.rar] --threads [4]```

**Set character set**

```rarcrack [archive.rar] --charset [abc123]```

**Resume cracking**

```rarcrack [archive.rar]```

# SYNOPSIS

**rarcrack** _archive_ [_--type_ _format_] [_--threads_ _n_] [_--charset_ _chars_]

# PARAMETERS

**--type** _FORMAT_
> Archive type (rar, zip, 7z). Auto-detected from file extension if not specified.

**--threads** _N_
> Number of threads for parallel password testing.

**--charset** _CHARS_
> Characters to use in brute-force attempts. Narrowing this reduces search space significantly.

**-h**, **--help**
> Show help.

# DESCRIPTION

**rarcrack** recovers passwords from encrypted RAR, ZIP, and 7Z archives using brute-force testing of all possible character combinations. It systematically tries passwords of increasing length from a configurable character set, with the archive type either auto-detected from the file extension or explicitly specified.

The tool automatically saves progress to an XML status file alongside the archive, allowing interrupted sessions to resume from the last tested position without starting over. Multi-threading distributes password testing across available CPU cores for faster throughput. Narrowing the character set with **--charset** significantly reduces the search space when the password composition is partially known.

# CAVEATS

Brute-force is slow for long passwords. For authorized recovery only. Strong passwords may be impractical.

# HISTORY

**rarcrack** was created for password recovery from encrypted archives. It provides a simple brute-force tool for RAR, ZIP, and 7Z files.

# SEE ALSO

[john](/man/john)(1), [hashcat](/man/hashcat)(1), [zip2john](/man/zip2john)(1), [rar2john](/man/rar2john)(1)
