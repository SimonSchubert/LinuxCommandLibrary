# TAGLINE

displays file contents in hexadecimal format

# TLDR

**Display file in hex**

```hd [file]```

**Show first 100 bytes**

```hd -n 100 [file]```

**Skip first 50 bytes**

```hd -s 50 [file]```

**One-byte octal display**

```hd -b [file]```

**Canonical hex+ASCII display**

```hd -C [file]```

# SYNOPSIS

**hd** [_options_] [_file_]

# PARAMETERS

_FILE_
> File to display.

**-n** _LENGTH_
> Number of bytes to display.

**-s** _OFFSET_
> Skip offset bytes.

**-b**
> One-byte octal display.

**-C**
> Canonical hex+ASCII display.

**-v**
> Display all data (no suppression).

**--help**
> Display help information.

# DESCRIPTION

**hd** displays file contents in hexadecimal format. It's equivalent to hexdump -C, showing both hex values and ASCII representation.

The tool is useful for examining binary files, analyzing data formats, and debugging. It formats output in readable columns.

# CAVEATS

Alias for hexdump -C on many systems. Large files produce extensive output. Binary data shown as dots in ASCII column.

# HISTORY

hd is typically a symlink to **hexdump** from **BSD** utilities, providing convenient hex dump functionality.

# SEE ALSO

[hexdump](/man/hexdump)(1), [xxd](/man/xxd)(1), [od](/man/od)(1)
