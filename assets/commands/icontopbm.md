# TAGLINE

converts a Sun icon file to PBM format

# TLDR

**Convert icon to PBM**

```icontopbm [file.icon] > [output.pbm]```

**Convert from stdin**

```cat [file.icon] | icontopbm > [output.pbm]```

**Convert and pipe** to PNG via Netpbm tools

```icontopbm [file.icon] | pnmtopng > [output.png]```

# SYNOPSIS

**icontopbm** [_iconfile_]

# PARAMETERS

_iconfile_
> Sun icon format input file. If not specified, reads from standard input.

# DESCRIPTION

**icontopbm** converts a Sun icon file to PBM (Portable Bitmap) format. Sun icon files are a simple bitmap format historically used by Sun Microsystems workstations for desktop icons. The output is written to standard output in PBM format, which can be piped to other Netpbm tools for further conversion.

Part of the Netpbm package of graphics manipulation tools.

# CAVEATS

Only reads Sun icon format files. The format is largely obsolete, but conversion may be needed for legacy file archives.

# SEE ALSO

[pbmtoicon](/man/pbmtoicon)(1), [xbmtopbm](/man/xbmtopbm)(1), [netpbm](/man/netpbm)(1)

