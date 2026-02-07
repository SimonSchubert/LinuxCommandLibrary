# TAGLINE

Extract Microsoft cabinet archives

# TLDR

**Extract cabinet file**

```cabextract [file.cab]```

**List contents without extracting**

```cabextract -l [file.cab]```

**Extract to specific directory**

```cabextract -d [output_dir] [file.cab]```

**Test archive integrity**

```cabextract -t [file.cab]```

**Extract with filter pattern**

```cabextract -F "*.dll" [file.cab]```

**Extract with lowercase filenames**

```cabextract -L [file.cab]```

**Extract from embedded cabinet in exe**

```cabextract [setup.exe]```

# SYNOPSIS

**cabextract** [_options_] _cabinet_file_...

# DESCRIPTION

**cabextract** extracts files from Microsoft cabinet (.cab) archives. It can also extract cabinets embedded in other files like executables. Supports all Microsoft cabinet formats and Windows CE installation files.

# PARAMETERS

**-l**, **--list**
> List contents without extracting

**-t**, **--test**
> Test integrity, show MD5 checksums

**-d** _directory_, **--directory**=_directory_
> Extract to specified directory

**-F** _pattern_, **--filter**=_pattern_
> Extract only files matching shell pattern

**-f**, **--fix**
> Attempt to salvage corrupted archives

**-L**, **--lowercase**
> Convert filenames to lowercase

**-p**, **--pipe**
> Pipe extracted files to stdout

**-s**, **--single**
> Don't follow multi-part cabinet links

**-q**, **--quiet**
> Suppress normal output

**-v**, **--version**
> Show version

# MULTI-PART CABINETS

For multi-part cabinet archives, only specify the first file. cabextract automatically locates and processes remaining parts.

# CAVEATS

Can only extract archives, not create them. Use **gcab** to create cabinet files. Preserves internal directory structure, permissions, and dates.

# SEE ALSO

[gcab](/man/gcab)(1), [unzip](/man/unzip)(1), [7z](/man/7z)(1)
