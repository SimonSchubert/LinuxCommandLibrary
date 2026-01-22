# TLDR

**Convert .Z file to .gz**

```znew [file.Z]```

**Convert multiple files**

```znew [*.Z]```

**Keep original file**

```znew -K [file.Z]```

**Use best compression**

```znew -9 [file.Z]```

**Force conversion even if .gz exists**

```znew -f [file.Z]```

# SYNOPSIS

**znew** [**-ftv9PK**] _file.Z_...

# PARAMETERS

**-f**
> Force recompression even if .gz file already exists

**-t**
> Test new file integrity before deleting original

**-v**
> Verbose output

**-9**
> Use best compression level

**-P**
> Use pipes for conversion (slower but uses less disk space)

**-K**
> Keep the original .Z file

# DESCRIPTION

**znew** recompresses files from the old compress format (.Z) to gzip format (.gz). The compress utility used LZW compression, while gzip uses DEFLATE which typically achieves better compression ratios.

The tool is useful for converting legacy compressed archives to the more modern and efficient gzip format. After conversion, the original .Z file is deleted by default.

znew verifies the integrity of the new .gz file before removing the original when using the **-t** flag, providing safety against corruption.

# HISTORY

The compress utility and .Z format date from the 1980s. gzip was created in 1992 as a free alternative that avoided LZW patent issues. znew was created to facilitate migration from the older format.

# CAVEATS

Only converts .Z files to .gz. Does not handle other compression formats.

Without **-K**, the original file is deleted after successful conversion.

The **-P** option uses more CPU but less temporary disk space.

Modern systems rarely encounter .Z files, making this tool primarily useful for archival work.

# SEE ALSO

[gzip](/man/gzip)(1), [gunzip](/man/gunzip)(1), [zcat](/man/zcat)(1), [compress](/man/compress)(1)
