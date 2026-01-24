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

**xdelta** creates binary differences. It generates small patches between files.

Delta creation compares old and new. Output is much smaller than full file.

Patching reconstructs new file. Requires old file and patch.

VCDIFF format is standardized. Interoperable with other tools.

Useful for software updates. Distribute patches instead of full files.

Compression reduces patch size. Higher levels take more time.

# CAVEATS

Old file must match exactly. Large files need memory. Version compatibility matters.

# HISTORY

**xdelta** was created for efficient binary differencing. Version 1 evolved into xdelta3 with VCDIFF standard support.

# SEE ALSO

[xdelta3](/man/xdelta3)(1), [bsdiff](/man/bsdiff)(1), [rdiff](/man/rdiff)(1)
