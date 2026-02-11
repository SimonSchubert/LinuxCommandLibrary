# TAGLINE

Run commands on gzip-compressed files

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

**zrun** automatically decompresses gzip-compressed file arguments before passing them to the specified command. It creates temporary decompressed files, runs the command, then cleans up.

This is useful for running commands that don't natively support compressed input on gzipped files without manual decompression steps.

The tool detects which arguments are gzip-compressed files (by .gz extension) and decompresses only those, passing other arguments unchanged.

After the command completes, temporary files are automatically removed.

# CAVEATS

Only handles gzip (.gz) compression. Other formats (bzip2, xz, zstd) are not supported.

Large compressed files require temporary disk space for decompression.

The command sees different (temporary) filenames than the originals, which may matter for some tools.

For commands with native gzip support (like zcat, zgrep, zless), use those directly instead for better performance.

# SEE ALSO

[zcat](/man/zcat)(1), [zless](/man/zless)(1), [zgrep](/man/zgrep)(1), [gzip](/man/gzip)(1)
