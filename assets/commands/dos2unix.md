# TAGLINE

convert DOS/Windows line endings to Unix

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

**dos2unix** converts text files from DOS/Windows format (CRLF line endings) to Unix format (LF line endings). DOS/Windows systems use carriage return and line feed (\\r\\n) to mark line endings, while Unix-like systems use only line feed (\\n).

Line ending mismatches cause problems in scripts, compilation errors, or rendering issues in text editors. This tool resolves these issues by normalizing line endings to the Unix standard. It handles byte order marks (BOM) commonly found in UTF-8 files from Windows.

The tool operates in-place by default, modifying the original file, but can create new output files preserving the original. It intelligently detects file formats and can provide information about a file's current line ending format before conversion.

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
