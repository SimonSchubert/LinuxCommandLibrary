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

Convert **in place, preserving the timestamp**

```dos2unix -k [path/to/file]```

Convert **many files at once**

```dos2unix [file1] [file2] [file3]```

Force conversion of a file **detected as binary**

```dos2unix -f [path/to/file]```

# SYNOPSIS

**dos2unix** [_options_] [_file_...]

**dos2unix** [_options_] **-n** _infile_ _outfile_ ...

# DESCRIPTION

**dos2unix** converts text files from DOS/Windows format (CRLF line endings) to Unix format (LF line endings). DOS/Windows systems use carriage return and line feed (\\r\\n) to mark line endings, while Unix-like systems use only line feed (\\n).

Line ending mismatches cause problems in scripts, compilation errors, or rendering issues in text editors. This tool resolves these issues by normalizing line endings to the Unix standard. It handles byte order marks (BOM) commonly found in UTF-8 files from Windows.

The tool operates in-place by default, modifying the original file, but can create new output files preserving the original. It intelligently detects file formats and can provide information about a file's current line ending format before conversion.

# PARAMETERS

**-o**, **--oldfile** _file_...
> Old file mode: convert each file and overwrite it. This is the default.

**-n**, **--newfile** _infile_ _outfile_...
> New file mode: convert _infile_ and write the result to _outfile_, leaving the original untouched.

**-i**[_FLAGS_], **--info**[=_FLAGS_] _file_...
> Report each file's line-break counts, BOM, and text/binary status. No conversion is done.

**-c**, **--convmode** _mode_
> Conversion mode: **ascii** (the default), **7bit**, **iso**, or **mac**.

**-k**, **--keepdate**
> Give the output file the same timestamp as the input file.

**-s**, **--safe**
> Skip binary files. This is the default.

**-f**, **--force**
> Convert a file even if it looks binary.

**-F**, **--follow-symlink**
> Follow symbolic links and convert their targets.

**-b**, **--keep-bom**
> Keep a Byte Order Mark: if the input has one, write one to the output.

**-m**, **--add-bom**
> Write a Byte Order Mark (UTF-8 by default) to the output.

**-r**, **--remove-bom**
> Do not write a Byte Order Mark to the output.

**-e**, **--add-eol**
> Add a line break to the last line if it does not have one.

**-l**, **--newline**
> Also add an extra newline, turning each single line break into a double one.

**-u**, **--keep-utf16**
> Keep the input file's original UTF-16 encoding rather than converting to UTF-8.

**-ul**, **--assume-utf16le** / **-ub**, **--assume-utf16be**
> Assume the input is UTF-16 little-endian or big-endian when there is no BOM to say so.

**-q**, **--quiet**
> Quiet mode: suppress all warnings and messages.

**-v**, **--verbose**
> Report extra detail about Byte Order Marks and the conversion performed.

**--allow-chown**
> Permit a change of file ownership in old file mode.

**-V**, **--version**
> Display version information and exit.

# CAVEATS

The default is to modify files in place, so keep a copy or use **-n** if the original matters. In old file mode dos2unix writes a new file and renames it over the old one, so the target's ownership can change when running as another user; that is why **--allow-chown** must be given explicitly. Binary files are skipped by default (**-s**), and forcing conversion with **-f** on a real binary will corrupt it, so check with **-i** first when unsure. Note that the ASCII conversion mode only rewrites line breaks; it does not transcode character sets, and **iso** mode assumes a specific DOS code page that may not match your file.

# HISTORY

dos2unix has existed in one form or another since the late 1980s, when moving text between DOS and Unix was routine. The version shipped by every current Linux distribution is **Erwin Waterlander's** rewrite, begun in **2009**, which added Unicode and UTF-16 support, BOM handling, and the mac conversion mode to what had been a very small utility. It is distributed with a companion **unix2dos** that performs the reverse conversion, and the two are usually the same binary invoked under different names.

# SEE ALSO

[unix2dos](/man/unix2dos)(1), [unix2mac](/man/unix2mac)(1), [file](/man/file)(1), [iconv](/man/iconv)(1), [tr](/man/tr)(1)

# RESOURCES

```[Source code](https://sourceforge.net/projects/dos2unix/)```

```[Homepage](https://dos2unix.sourceforge.io/)```

<!-- verified: 2026-07-14 -->

