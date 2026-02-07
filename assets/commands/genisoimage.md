# TAGLINE

ISO9660 filesystem image creator

# TLDR

Create an **ISO image** from the given source directory

```genisoimage -o myimage.iso [path/to/source_directory]```

Create an ISO image with files **larger than 2GiB**

```genisoimage -o -allow-limited-size myimage.iso [path/to/source_directory]```

# SYNOPSIS

**genisoimage** [_options_] _-o output.iso_ _pathspec_

# PARAMETERS

**-o** _FILE_
> Output ISO filename

**-R**, **-rock**
> Generate Rock Ridge extensions (Unix permissions/symlinks)

**-J**, **-joliet**
> Generate Joliet extensions (Windows long filenames)

**-V** _ID_
> Set volume ID (volume label)

**-b** _FILE_
> Set El Torito boot image for bootable CD/DVD

**-c** _FILE_
> Set El Torito boot catalog file

**-allow-limited-size**
> Allow files larger than 2GiB by reporting smaller apparent size

**-udf**
> Generate UDF filesystem (supports larger files)

**-iso-level** _LEVEL_
> Set ISO9660 conformance level (1-4)

**-input-charset** _CHARSET_
> Set input character set

**-v**, **-verbose**
> Enable verbose output

# DESCRIPTION

**genisoimage** creates ISO9660 filesystem images suitable for CD/DVD burning or mounting as loop devices. It supports multiple filesystem extensions including Rock Ridge (Unix), Joliet (Windows), and HFS (Mac) for cross-platform compatibility.

The tool can create bootable images using El Torito specification, supporting both legacy BIOS and UEFI boot methods with appropriate configuration.

genisoimage is a fork of mkisofs from the cdrtools package, maintained separately in Debian and Ubuntu repositories.

# CAVEATS

Standard ISO9660 has a 4GiB file size limit. Use **-udf** or **-allow-limited-size** for larger files. Filename length and character restrictions vary by extension type. Boot image creation requires careful configuration.

# HISTORY

genisoimage is a fork of mkisofs created in **2006** due to licensing concerns with the original cdrtools package. It's maintained as part of the cdrkit project and is the default ISO creation tool on Debian-based systems.

# SEE ALSO

[mkisofs](/man/mkisofs)(1), [xorriso](/man/xorriso)(1), [wodim](/man/wodim)(1), [mount](/man/mount)(8)
