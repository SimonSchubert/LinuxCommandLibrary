# TAGLINE

manages disk images for systemd containers and system extensions

# TLDR

**Download** a tarball image from URL

```sudo importctl pull-tar [URL] [name]```

**Pull** a raw or qcow2 disk image

```sudo importctl pull-raw [https://example.com/source.ext] [name] --class=[machine|portable|sysext|confext]```

**Import** a raw disk image

```importctl import-raw [path/to/file.ext] [name] --class=[machine|portable|sysext|confext]```

**List** current transfers in progress

```importctl list-transfers```

**Cancel** a running transfer

```importctl cancel-transfer [transfer-id]```

**Export** a container image as tarball

```importctl export-tar --class=[machine|portable|sysext|confext] [name] [path/to/file.ext]```

# SYNOPSIS

**importctl** _command_ [_options_]

# PARAMETERS

**pull-tar** _URL_ _NAME_
> Download and import tarball from URL

**pull-raw** _URL_ _NAME_
> Download and import raw/qcow2 disk image

**import-tar** _FILE_ _NAME_
> Import local tarball into image directory

**import-raw** _FILE_ _NAME_
> Import local raw disk image

**export-tar** _NAME_ _FILE_
> Export container as tarball

**export-raw** _NAME_ _FILE_
> Export container as raw disk image

**list-transfers**
> Show currently running transfers

**cancel-transfer** _ID_
> Cancel a running import, export, or download

**--class** _TYPE_
> Image class: machine, portable, sysext, confext

**--verify** _MODE_
> Verification mode for downloads: no, checksum, signature (default: signature)

**--format** _FORMAT_
> Image format for raw operations: raw, qcow2 (default: raw)

# DESCRIPTION

**importctl** manages disk images for systemd containers and system extensions. It can download, import, and export various image formats including tarballs, raw disk images, and qcow2 virtual machine images.

The tool integrates with systemd-machined and systemd-importd services to handle image management for containers, portable services, and system/configuration extensions.

# CAVEATS

Requires systemd and appropriate services running. Some operations require root privileges. Network operations depend on systemd-importd service.

# HISTORY

importctl is part of systemd, introduced to provide a unified interface for managing container and extension images. It replaces older, more fragmented approaches to image management in the systemd ecosystem.

# SEE ALSO

[machinectl](/man/machinectl)(1), [systemd-nspawn](/man/systemd-nspawn)(1), [systemctl](/man/systemctl)(1)
