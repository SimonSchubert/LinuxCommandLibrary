# TAGLINE

Binary delta compression and patching

# TLDR

**Create delta**

```xdelta delta [old_file] [new_file] [patch.xdelta]```

**Apply patch**

```xdelta patch [patch.xdelta] [old_file] [new_file]```

**Create with compression**

```xdelta -9 delta [old_file] [new_file] [patch.xdelta]```

**Show patch info**

```xdelta info [patch.xdelta]```

**Test patch**

```xdelta test [patch.xdelta] [old_file]```

# SYNOPSIS

**xdelta** _command_ [_options_] [_files_]

# PARAMETERS

**delta**
> Create delta file.

**patch**
> Apply delta file.

**info**
> Show patch info.

**test**
> Verify patch.

**-0** to **-9**
> Compression level.

**-f**, **--force**
> Force overwrite.

**-s** _SOURCE_
> Source file.

# DESCRIPTION

**xdelta** creates and applies binary delta patches between two versions of a file. The delta command compares an old file with a new file and produces a compact patch file containing only the differences, which is typically much smaller than distributing the full new file.

The patch command reconstructs the new file by applying the delta to the original file. Configurable compression levels trade processing time for smaller patch sizes. The tool is commonly used for software update distribution, ROM patching, and efficient file synchronization where only changes need to be transmitted.

# CAVEATS

Old file must match exactly. Large files need memory. Version compatibility matters.

# HISTORY

**xdelta** was created for efficient binary differencing. Version 1 evolved into xdelta3 with VCDIFF standard support.

# SEE ALSO

[xdelta3](/man/xdelta3)(1), [bsdiff](/man/bsdiff)(1), [rdiff](/man/rdiff)(1)
