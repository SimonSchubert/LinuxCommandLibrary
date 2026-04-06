# TAGLINE

Run commands on compressed files by auto-decompressing arguments

# TLDR

**Run command on compressed file**

```zrun [command] [file.gz]```

**Run diff on two compressed files**

```zrun diff [file1.gz] [file2.gz]```

**Run less on gzipped file**

```zrun less [file.gz]```

# SYNOPSIS

**zrun** _command_ [_arguments_]

# DESCRIPTION

**zrun** transparently decompresses compressed file arguments to temporary files before passing them to the specified command. It detects which arguments are compressed files by their extension, decompresses only those to temporary files (not pipes), runs the command with the decompressed paths, then cleans up.

This is useful for running commands that don't natively support compressed input without manual decompression steps.

The following compression types are supported: **gz**, **bz2**, **Z**, **xz**, **lzma**, **lzo**.

If **zrun** is symlinked to a name beginning with **z** (e.g., **zprog**), executing the link is equivalent to running **zrun prog**.

# CAVEATS

Modifications to the uncompressed temporary file are not fed back into the input file, so using this as a way to make an editor support compressed files will not work.

Large compressed files require temporary disk space for decompression.

The command sees different (temporary) filenames than the originals, which may matter for some tools.

# SEE ALSO

[zcat](/man/zcat)(1), [zless](/man/zless)(1), [zgrep](/man/zgrep)(1), [gzip](/man/gzip)(1), [bzip2](/man/bzip2)(1), [xz](/man/xz)(1)
