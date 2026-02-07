# TAGLINE

Compress executables into self-extracting archives

# TLDR

**Compress an executable file in place**

```bzexe [path/to/executable]```

**Compress multiple executables**

```bzexe [executable1] [executable2]```

**Decompress a previously compressed executable**

```bzexe -d [path/to/executable]```

# SYNOPSIS

**bzexe** [**-d**] _file..._

# DESCRIPTION

**bzexe** compresses executable files in place, creating self-extracting executables that automatically decompress and run when executed. The original file is saved with a tilde (~) suffix as a backup.

When a compressed executable is run, it transparently decompresses itself to a temporary location and executes. This trades execution speed for disk space savings, making it useful on systems with limited storage.

For example, compressing **/bin/cat** creates:
- **/bin/cat** - the self-decompressing executable
- **/bin/cat~** - the original uncompressed binary (backup)

# PARAMETERS

**-d**
> Decompress the specified executables instead of compressing them

# CAVEATS

The compressed executable is implemented as a shell script, which may create security concerns. It relies on the **PATH** environment variable to find **bzip2** and utilities like **tail**, **chmod**, **ln**, and **sleep**.

File attributes may not be perfectly preserved. You may need to manually fix permissions using **chmod** or ownership using **chown** after compression.

The backup file (with ~ suffix) can be removed once the compressed executable is verified to work correctly.

# SEE ALSO

[bzip2](/man/bzip2)(1), [bunzip2](/man/bunzip2)(1), [gzexe](/man/gzexe)(1)
