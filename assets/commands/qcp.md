# TAGLINE

Copy files with progress display

# TLDR

**Copy with progress**

```qcp [source] [destination]```

**Copy directory**

```qcp -r [source_dir] [destination_dir]```

**Preserve attributes**

```qcp -p [source] [destination]```

**Verbose copy**

```qcp -v [source] [destination]```

# SYNOPSIS

**qcp** [_options_] _source_ _destination_

# PARAMETERS

**-r**, **--recursive**
> Copy directories recursively.

**-p**, **--preserve**
> Preserve file attributes.

**-v**, **--verbose**
> Verbose output.

**-f**, **--force**
> Overwrite without prompt.

**-i**, **--interactive**
> Prompt before overwrite.

# DESCRIPTION

**qcp** (quick copy) is a file copy utility that may refer to various enhanced copy tools with features like progress bars, speed display, or queued copying.

Note: Specific implementation varies. Common alternatives include pv, rsync, or gcp.

# EXAMPLES

```bash
# Basic copy
qcp file.txt /backup/

# Directory copy
qcp -r /data /backup/

# Preserve permissions
qcp -p important.doc /archive/

# Force overwrite
qcp -f new.conf /etc/app.conf
```

# ALTERNATIVES

```bash
# rsync with progress
rsync -ah --progress source dest

# pv for progress
pv file.iso > /dev/sdX

# cp with verbose
cp -v source dest
```

# CAVEATS

Tool availability varies by distribution. May refer to different utilities. Check which qcp is installed.

# HISTORY

Various "quick copy" or enhanced copy tools have been developed to improve on basic cp functionality.

# SEE ALSO

[cp](/man/cp)(1), [rsync](/man/rsync)(1), [pv](/man/pv)(1), [gcp](/man/gcp)(1)
