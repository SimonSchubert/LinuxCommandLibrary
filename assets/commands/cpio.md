# TLDR

**Create** archive

```find . -depth | cpio -o > [archive.cpio]```

**Extract** archive

```cpio -i < [archive.cpio]```

**List** archive contents

```cpio -t < [archive.cpio]```

**Copy** files

```find . | cpio -pd [/destination]```

# SYNOPSIS

**cpio** [_options_]

# DESCRIPTION

**cpio** (copy in/out) is an archiving utility that reads file lists from stdin and creates or extracts archives. It's commonly used in initramfs images, RPM packages, and for copying directory trees.

The tool offers more flexibility than tar in some scenarios due to its stdin-based operation.

# PARAMETERS

**-o**, **--create**
> Create archive (copy-out mode)

**-i**, **--extract**
> Extract archive (copy-in mode)

**-p**, **--pass-through**
> Copy files (pass-through mode)

**-t**, **--list**
> List archive contents

**-v**, **--verbose**
> Verbose mode

**-d**, **--make-directories**
> Create directories as needed

**-u**, **--unconditional**
> Overwrite files unconditionally

**-m**, **--preserve-modification-time**
> Preserve modification times

# MODES

**Copy-out (-o):**
> Create archive from file list

**Copy-in (-i):**
> Extract from archive

**Pass-through (-p):**
> Copy files without archiving

# WORKFLOW

```bash
# Create archive
find . -name "*.txt" | cpio -o > textfiles.cpio

# Create with verbose output
find . | cpio -ov > backup.cpio

# Extract archive
cpio -i < archive.cpio

# Extract with verbose
cpio -idv < archive.cpio

# List contents
cpio -t < archive.cpio

# Copy directory tree (like cp -r but preserves more)
find /source | cpio -pdm /destination

# Extract specific files
cpio -i "*.conf" < archive.cpio
```

# COMPRESSION

```bash
# Create compressed archive
find . | cpio -o | gzip > archive.cpio.gz

# Extract compressed archive
gunzip < archive.cpio.gz | cpio -i

# With bzip2
find . | cpio -o | bzip2 > archive.cpio.bz2
zcat archive.cpio.bz2 | cpio -i
```

# COMMON USES

**Initramfs extraction:**
```bash
mkdir initramfs
cd initramfs
gunzip -c /boot/initramfs.img | cpio -i
```

**RPM content extraction:**
```bash
rpm2cpio package.rpm | cpio -idmv
```

# CAVEATS

Less intuitive than tar. Requires file list from stdin. No built-in compression. Pathname length limits. Different behavior between GNU and POSIX versions. Not as widely used as tar.

# HISTORY

**cpio** was included in Unix PWB/UNIX in **1977** and became part of POSIX, predating tar and offering more flexible file selection.

# SEE ALSO

[tar](/man/tar)(1), [find](/man/find)(1), [pax](/man/pax)(1)
