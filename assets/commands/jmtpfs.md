# TAGLINE

FUSE filesystem for accessing MTP devices like Android phones

# TLDR

**Mount the first available MTP device**

```jmtpfs [mountpoint]```

**List attached MTP devices** (shows bus, device, vendor, product)

```jmtpfs -l```

**Mount a specific device** by bus and device number

```jmtpfs -device=[bus],[dev] [mountpoint]```

**Mount with allow-other and a specific UID**

```jmtpfs -o allow_other,uid=[1000] [mountpoint]```

**Run in the foreground with debug output**

```jmtpfs -f -d [mountpoint]```

**Unmount the device** (use fusermount, not jmtpfs)

```fusermount -u [mountpoint]```

# SYNOPSIS

**jmtpfs** [_options_] _mountpoint_

# PARAMETERS

**-l**
> List available MTP devices and exit.

**-device=**_bus_,_dev_
> Mount the device at the given USB bus and device number.

**-o** _options_
> Pass FUSE mount options (e.g. `allow_other`, `uid=1000`, `gid=1000`, `fsname=phone`).

**-f**
> Run in the foreground (do not daemonize).

**-d**
> Enable FUSE debug output (implies `-f`).

**-s**
> Disable multi-threaded operation.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**jmtpfs** is a FUSE filesystem that exposes MTP (Media Transfer Protocol) devices — Android phones, tablets, cameras, and portable media players — as regular directories. It is built on top of **libmtp** and **libusb** and provides read/write access to device storage without requiring root.

Only one process may talk to an MTP device at a time, so unlock the phone and dismiss any "USB mode" dialog before mounting. Multiple storages (internal, SD card) appear as separate top-level directories inside the mount point.

# CAVEATS

MTP is session-based: file metadata such as size and modification time may update slowly, and random-access writes to existing files are not supported by the protocol (files are typically rewritten in full). Always unmount with **fusermount -u** before disconnecting the device, and re-plug the cable if the device becomes unresponsive.

# SEE ALSO

[fusermount](/man/fusermount)(1), [fuser](/man/fuser)(1)
