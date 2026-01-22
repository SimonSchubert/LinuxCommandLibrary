# TLDR

**Create archive**

```pax -wf [archive.pax] [directory]```

**Extract archive**

```pax -rf [archive.pax]```

**List archive contents**

```pax -f [archive.pax]```

**Copy directory**

```pax -rw [source] [destination]```

**Create compressed archive**

```pax -wf - [directory] | gzip > [archive.pax.gz]```

# SYNOPSIS

**pax** [_options_] [_pattern_...]

# PARAMETERS

**-r**
> Read (extract) archive.

**-w**
> Write (create) archive.

**-f** _FILE_
> Archive file.

**-v**
> Verbose output.

**-d**
> Match directories only.

**-k**
> Don't overwrite existing files.

# DESCRIPTION

**pax** is the POSIX archiver. Combines tar and cpio functionality.

The tool creates and extracts archives. Portable archive exchange format.

pax handles archives.

# CAVEATS

POSIX standard. Less common than tar. Portable format.

# HISTORY

pax was created as a **POSIX standard** replacement for tar and cpio.

# SEE ALSO

[tar](/man/tar)(1), [cpio](/man/cpio)(1), [gzip](/man/gzip)(1)

