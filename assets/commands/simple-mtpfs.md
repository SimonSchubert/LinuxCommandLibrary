# TAGLINE

FUSE filesystem driver for MTP devices

# TLDR

**List** attached MTP devices

```simple-mtpfs --list-devices```

**Mount** the first available MTP device

```simple-mtpfs [mountpoint]```

**Mount** a specific device by number

```simple-mtpfs --device [number] [mountpoint]```

**Mount** using a libmtp device file

```simple-mtpfs /dev/libmtp-[id] [mountpoint]```

**Unmount** the MTP filesystem

```fusermount -u [mountpoint]```

# SYNOPSIS

**simple-mtpfs** [_options_] [_device_] _mountpoint_

# PARAMETERS

**-l**, **--list-devices**
> List available MTP devices with order numbers and names.

**--device** _number_
> Select which attached device to mount by its order number.

**-h**, **--help**
> Print help and exit.

**-V**, **--version**
> Print version and exit.

**-o** _options_
> Comma-separated mount options. SIMPLE-MTPFS-specific options include **enable-move** (allows move operations, which can be slow). Standard FUSE options such as **allow_other**, **allow_root**, **default_permissions**, **uid=**, **gid=**, and **umask=** are also supported.

**-f**
> Run in the foreground.

**-d**
> Enable debug output (implies **-f**).

# DESCRIPTION

**simple-mtpfs** is a FUSE-based filesystem driver that exposes files on MTP (Media Transfer Protocol) devices over USB as a normal directory tree on Linux, macOS, and other systems with FUSE support. Once mounted, you can browse, copy, rename, and delete files on phones, cameras, and other MTP-capable hardware using standard shell tools.

The driver uses **libmtp** to communicate with devices and **FUSE** to present their storage as a userspace filesystem. Temporary files downloaded from the device are stored in a configurable directory (default **/tmp**). When multiple MTP devices are connected, use **--list-devices** to see their order numbers, then pass **--device** or a **/dev/libmtp-*** special file to choose which one to mount.

Unmount with **fusermount -u** on the mountpoint. The project is no longer actively maintained upstream; many distributions still package it, but alternatives such as **jmtpfs** or **gvfs-mtp** may be preferable for new setups.

# CAVEATS

Move operations are disabled by default because they can be very slow on MTP devices; enable them with **-o enable-move** if needed. Performance is slower than a native block-device mount because every file access goes through the MTP protocol. The upstream project is unmaintained and deprecated in some package managers. Requires **libfuse** (version 2.7.3 or later) and **libmtp** at build time.

# HISTORY

**simple-mtpfs** was written by **Peter Hatina** and first released around **2013** as a lightweight alternative to heavier MTP browser tools. Version **0.2** shipped with a manual page in **January 2015**. The project reached **0.4.0** but has seen little upstream activity since; Homebrew and several Linux distributions still distribute it while marking it deprecated.

# SEE ALSO

[fusermount](/man/fusermount)(1), [mount](/man/mount)(8), [sshfs](/man/sshfs)(1), [mtp-detect](/man/mtp-detect)(1)

# RESOURCES

```[Source code](https://github.com/phatina/simple-mtpfs)```

<!-- verified: 2026-06-29 -->