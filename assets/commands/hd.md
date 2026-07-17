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

**hd** displays file contents in hexadecimal format. Invoking **hexdump** as **hd** is equivalent to running it with **-C**, showing offset, hex bytes, and the ASCII representation side by side.

The tool is useful for examining binary files, analyzing data formats, and debugging. It formats output in readable columns.

# CAVEATS

Non-printable bytes are shown as dots in the ASCII column. Large files produce extensive output; pipe through a pager or use **-n**/**-s** to limit the range.

# HISTORY

**hd** originated as a BSD convenience alias for **hexdump**. On current Linux systems it's provided by the **util-linux** package (which absorbed hexdump from the older bsdmainutils package around 2017), so both **hexdump** and **hd** invoke the same binary.

# SEE ALSO

[hexdump](/man/hexdump)(1), [xxd](/man/xxd)(1), [od](/man/od)(1)

# RESOURCES

```[Source code](https://github.com/util-linux/util-linux/blob/master/text-utils/hexdump.c)```
```[Documentation](https://man7.org/linux/man-pages/man1/hexdump.1.html)```

<!-- verified: 2026-07-17 -->
