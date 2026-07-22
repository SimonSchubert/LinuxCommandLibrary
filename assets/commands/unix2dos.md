# TAGLINE

Convert Unix line endings to DOS format

# TLDR

**Change** the line endings of a file to DOS-style

```unix2dos [path/to/file]```

**Create** a copy with DOS-style line endings

```unix2dos -n [path/to/file] [path/to/new_file]```

**Display** file information

```unix2dos -i [path/to/file]```

**Keep/add/remove** Byte Order Mark

```unix2dos --keep-bom|--add-bom|--remove-bom [path/to/file]```

# SYNOPSIS

**unix2dos** [_options_] [_file_...]

# PARAMETERS

**-n, --newfile _infile_ _outfile_**
> Write to new file instead of modifying in place

**-i, --info _flags_**
> Display file information (line endings, BOM)

**-k, --keepdate**
> Keep output file date same as input

**--keep-bom**
> Keep Byte Order Mark

**--add-bom**
> Add Byte Order Mark

**--remove-bom**
> Remove Byte Order Mark

**-q, --quiet**
> Quiet mode, suppress warnings

# DESCRIPTION

**unix2dos** converts text files from Unix line ending format (LF) to DOS/Windows format (CRLF). It modifies files in place by default or can write to new files with the **-n** option.

The tool is commonly used when preparing files for Windows systems or when working with cross-platform projects that require consistent line endings.

# CAVEATS

Binary files should not be processed. Large files are processed efficiently. The tool can handle UTF-8 and other encodings. Part of the dos2unix package.

# INSTALL

```apt: sudo apt install dos2unix```

```dnf: sudo dnf install dos2unix```

```pacman: sudo pacman -S dos2unix```

```apk: sudo apk add dos2unix```

```zypper: sudo zypper install dos2unix```

```brew: brew install dos2unix```

```nix: nix profile install nixpkgs#dos2unix```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dos2unix](/man/dos2unix)(1), [unix2mac](/man/unix2mac)(1), [mac2unix](/man/mac2unix)(1)
