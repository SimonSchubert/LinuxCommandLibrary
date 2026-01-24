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

**rarcrack** [_--type format_] [_--threads n_] [_--charset chars_] [_options_] _archive_

# PARAMETERS

**--type** _FORMAT_
> Archive type (rar, zip, 7z).

**--threads** _N_
> Number of threads.

**--charset** _CHARS_
> Characters to try.

**-h**, **--help**
> Show help.

# DESCRIPTION

**rarcrack** recovers passwords from encrypted archives. It uses brute-force testing of password combinations.

Archive type is auto-detected or specified. RAR, ZIP, and 7Z formats supported.

Character sets limit the search space. Knowing password composition speeds recovery.

Multi-threading uses available CPU cores. More threads increase speed.

Progress is saved automatically. Interrupted sessions resume from last position.

XML status file tracks current position. Delete to restart from beginning.

# CAVEATS

Brute-force is slow for long passwords. For authorized recovery only. Strong passwords may be impractical.

# HISTORY

**rarcrack** was created for password recovery from encrypted archives. It provides a simple brute-force tool for RAR, ZIP, and 7Z files.

# SEE ALSO

[john](/man/john)(1), [hashcat](/man/hashcat)(1), [zip2john](/man/zip2john)(1), [rar2john](/man/rar2john)(1)
