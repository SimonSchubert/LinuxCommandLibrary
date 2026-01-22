# TLDR

**Create** asar archive

```asar pack [dir/] [output.asar]```

**Extract** asar archive

```asar extract [archive.asar] [output_dir/]```

**List** contents

```asar list [archive.asar]```

Extract **single file**

```asar extract-file [archive.asar] [path/in/archive] [output_file]```

# SYNOPSIS

**asar** _pack_|_extract_|_list_|_extract-file_ _arguments_

# DESCRIPTION

**asar** creates and extracts Electron archive files. ASAR (Atom Shell Archive) is a tar-like format used by Electron applications to package source files into a single file while maintaining random access capability.

The format allows Electron to read files directly from the archive without extraction, improving load times.

# PARAMETERS

**pack** _dir_ _output_
> Create archive from directory

**extract** _archive_ _dest_
> Extract archive to directory

**list** _archive_
> List archive contents

**extract-file** _archive_ _file_ _dest_
> Extract single file

# CAVEATS

ASAR archives are not encrypted; contents can be easily extracted. Some Electron apps may integrity-check their archives. Not suitable for sensitive data.

# HISTORY

**ASAR** was developed for the Atom text editor (later Electron framework) as a way to package Node.js applications efficiently.

# SEE ALSO

[tar](/man/tar)(1), [npm](/man/npm)(1), [electron](/man/electron)(1)
