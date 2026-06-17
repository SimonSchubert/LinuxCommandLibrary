# TAGLINE

Pack and extract Electron application archives.

# TLDR

**Create** asar archive

```asar pack [dir/] [output.asar]```

**Extract** asar archive

```asar extract [archive.asar] [output_dir/]```

**List** contents

```asar list [archive.asar]```

Extract **single file**

```asar extract-file [archive.asar] [path/in/archive] [output_file]```

Pack while keeping files **unpacked**

```asar pack [dir/] [output.asar] --unpack [*.node]```

# SYNOPSIS

**asar** _pack_|_extract_|_list_|_extract-file_ [_options_] _arguments_

# DESCRIPTION

**asar** creates and extracts Electron archive files. ASAR (Atom Shell Archive) is a tar-like format used by Electron applications to package source files into a single file while maintaining random access capability.

The format allows Electron to read files directly from the archive without extraction, improving load times. The tool is distributed on npm as **@electron/asar** (formerly the standalone **asar** package).

# PARAMETERS

**pack** _dir_ _output_ (alias **p**)
> Create archive from directory

**extract** _archive_ _dest_ (alias **e**)
> Extract archive to directory

**list** _archive_ (alias **l**)
> List archive contents

**extract-file** _archive_ _file_ _dest_ (alias **ef**)
> Extract single file

**--unpack** _glob_
> Keep files matching the glob unpacked (stored in a sibling app.asar.unpacked directory)

**--unpack-dir** _glob_
> Keep directories matching the glob unpacked

**--exclude-hidden**
> Exclude hidden (dotfile) files from the archive

**--ordering** _file_
> Pack files in the order listed in the given file

# CAVEATS

ASAR archives are not encrypted; contents can be easily extracted. Some Electron apps may integrity-check their archives. Not suitable for sensitive data.

# HISTORY

**ASAR** was developed for the Atom text editor (later Electron framework) as a way to package Node.js applications efficiently.

# SEE ALSO

[tar](/man/tar)(1), [npm](/man/npm)(1), [electron](/man/electron)(1)

# RESOURCES

```[Source code](https://github.com/electron/asar)```

```[Homepage](https://www.electronjs.org)```

<!-- verified: 2026-06-16 -->
