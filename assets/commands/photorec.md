# TAGLINE

recovers deleted files from hard disks, memory cards, and other storage media

# TLDR

Run PhotoRec on a **device**

```sudo photorec /dev/sdb```

Run PhotoRec on a **disk image**

```sudo photorec [path/to/image.dd]```

# SYNOPSIS

**photorec** [**/log**] [**/debug**] [**/d** _directory_] _device_|_image_

# PARAMETERS

**/log**
> Create a photorec.log file

**/debug**
> Add debug information to log

**/d _directory_**
> Destination directory for recovered files

# DESCRIPTION

**photorec** recovers deleted files from hard disks, memory cards, and other storage media by scanning for file signatures (file carving). It ignores the filesystem and works even on severely damaged or reformatted media.

The tool recognizes over 480 file formats including images, videos, documents, and archives. It operates in a text-based interactive mode, guiding users through partition selection and recovery options.

# CAVEATS

Write recovered files to a different drive than the one being recovered from. Original filenames are not preserved. Large drives can take significant time to scan. Running on a mounted filesystem may cause further data loss.

# HISTORY

**photorec** was created by **Christophe Grenier** as a companion to **TestDisk**. Originally focused on photo recovery (hence the name), it has expanded to recover many file types. It's part of the TestDisk package and is widely used for data recovery.

# SEE ALSO

[testdisk](/man/testdisk)(8), [foremost](/man/foremost)(1), [scalpel](/man/scalpel)(1)
