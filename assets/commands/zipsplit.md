# TAGLINE

Split ZIP archive into smaller parts

# TLDR

**Split** archive

```zipsplit [path/to/archive.zip]```

Split with **size** limit

```zipsplit -n [size] [path/to/archive.zip]```

**Pause** between parts

```zipsplit -p -n [size] [path/to/archive.zip]```

Output to **directory**

```zipsplit -b [path/to/output_directory] -n [size] [path/to/archive.zip]```

# SYNOPSIS

**zipsplit** [_OPTIONS_] _ZIPFILE_

# PARAMETERS

**-n** _SIZE_
> Maximum bytes per split archive

**-p**
> Pause between creating each part

**-b** _PATH_
> Output directory for split archives

**-t**
> Report how many files would be created

**-r** _ROOM_
> Leave room for extra bytes in first archive

# DESCRIPTION

**zipsplit** splits a ZIP archive into smaller ZIP archives. The default size limit is 36000 bytes (36KB) if not specified.

Output files are named with numeric suffixes based on the original filename.

# CAVEATS

Files that exceed the size limit cannot be split. All parts are needed to extract the complete archive contents.

# SEE ALSO

[zip](/man/zip)(1), [unzip](/man/unzip)(1), [split](/man/split)(1)
