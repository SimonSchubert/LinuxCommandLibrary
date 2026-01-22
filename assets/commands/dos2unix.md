# TLDR

**Convert** file line endings

```dos2unix [path/to/file]```

Create **copy** with Unix line endings

```dos2unix -n [path/to/file] [path/to/new_file]```

Display **file information**

```dos2unix -i [path/to/file]```

Handle **BOM** (keep/add/remove)

```dos2unix --[keep-bom|add-bom|remove-bom] [path/to/file]```

# SYNOPSIS

**dos2unix** [_options_] [_file_...]

# DESCRIPTION

**dos2unix** converts text files from DOS/Windows format (CRLF line endings) to Unix format (LF line endings). It modifies files in place by default.

Essential when working with files created on Windows or transferred between operating systems.

# PARAMETERS

**-n, --newfile** _in_ _out_
> Write to new file instead of in-place

**-i, --info** [_flags_]
> Display file information

**--keep-bom**
> Keep Byte Order Mark

**--add-bom**
> Add Byte Order Mark

**--remove-bom**
> Remove Byte Order Mark

**-c, --convmode** _mode_
> Conversion mode (ascii, 7bit, iso)

# CAVEATS

Modifies files in place by default; use -n to preserve original. Binary files may be corrupted. Check with -i before converting.

# SEE ALSO

[unix2dos](/man/unix2dos)(1), [unix2mac](/man/unix2mac)(1), [file](/man/file)(1)
