# TAGLINE

Mount ISO, BIN, NRG, MDF, and IMG disc images with FUSE

# TLDR

Mount an image on a directory

```fuseiso [image.iso] [mountpoint]```

Create the mount point if it is missing, and remove it on exit

```fuseiso -p [image.iso] [mountpoint]```

Stay in the **foreground** (useful while debugging)

```fuseiso -f [image.iso] [mountpoint]```

Set the Joliet **character set** (the default is UTF-8)

```fuseiso -c [iso8859-1] [image.iso] [mountpoint]```

Unmount with the FUSE helper

```fusermount -u [mountpoint]```

# SYNOPSIS

**fuseiso** [**-npch**] [_FUSE options_] _image_ _mountpoint_

**fuseiso** [**-npch**] _image_ _mountpoint_ [_FUSE options_]

# PARAMETERS

**-n**

> Do not maintain `~/.mtab.fuseiso`

**-p**

> Create _mountpoint_ if it does not exist, and delete it when **fuseiso** exits

**-c** _iocharset_

> Character set for Joliet names. The default is UTF-8. `iconv --list` prints the names this system accepts

**-h**

> Print help and exit

**-o** _opts_

> Comma-separated FUSE and generic mount options

**-s**

> Run single-threaded

**-f**

> Stay in the foreground. Do not daemonize

**-d**

> Stay in the foreground and print debug information

**-V**

> Print the libfuse version and exit

# DESCRIPTION

**fuseiso** mounts a disc image as a directory through FUSE, so a normal user can read the files without a kernel loop device or root. It reads ISO 9660 from ISO, BIN, and NRG images, including the Joliet, Rock Ridge, and zisofs extensions.

CloneCD IMG files and Alcohol 120% MDF files use the same layout as BIN images, so **fuseiso** mounts those too. It does not read a CUE sheet. On a multi-track BIN image only the first track is visible.

CCD, ISZ, and MDS images are not supported. Their formats are not public.

# CAVEATS

Unmount with `fusermount -u`, not by killing the daemon if you still need a clean `~/.mtab.fuseiso` entry. **-n** skips that file entirely.

A CUE that points at later tracks is ignored. Audio and extra data tracks on a BIN image are not exposed.

FUSE options may be placed before the image or after the mount point. **-p** deletes the mount point it created when the filesystem is unmounted.

# HISTORY

**fuseiso** was written by Dmitry Morozhnikov. The Debian manual page was written by David Paleino and later revised by Sven Geuer.

# INSTALL

```apt: sudo apt install fuseiso```

```pacman: sudo pacman -S fuseiso```

```zypper: sudo zypper install fuseiso```

<!-- packages: 2026-11-07 -->

# SEE ALSO

[fusermount](/man/fusermount)(1), [mount](/man/mount)(8), [iconv](/man/iconv)(1)

# RESOURCES

```[Documentation](https://manpages.debian.org/fuseiso)```

<!-- verified: 2026-11-07 -->
