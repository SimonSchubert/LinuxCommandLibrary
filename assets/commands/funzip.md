# TAGLINE

streaming ZIP extraction filter

# TLDR

**Extract from stdin**

```cat [file.zip] | funzip > [output]```

**Extract from pipe**

```curl -s [url/file.zip] | funzip > [output]```

# SYNOPSIS

**funzip** [_password_] < _file.zip_

# DESCRIPTION

**funzip** extracts the first member from a ZIP archive piped through stdin. Useful for extracting from pipes without creating intermediate files. Only extracts the first file in the archive.

# CAVEATS

Only extracts the first file from the archive. For multi-file archives, use unzip instead.

# SEE ALSO

[unzip](/man/unzip)(1), [zcat](/man/zcat)(1)

