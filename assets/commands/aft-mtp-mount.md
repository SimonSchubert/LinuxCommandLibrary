# TAGLINE

FUSE mount for Android phones and other MTP devices

# TLDR

Create a mount point and **mount the first available MTP device** (phone unlocked, USB in file-transfer mode)

```mkdir -p [~/mnt] && aft-mtp-mount [~/mnt]```

**Browse** the mounted storages (internal memory, SD card, …)

```ls [~/mnt]```

Mount so **other users** can access the tree (requires `user_allow_other` in `/etc/fuse.conf`)

```aft-mtp-mount -o allow_other [~/mnt]```

Pick a device by **manufacturer, model, or serial** when several are plugged in

```aft-mtp-mount -D [Pixel] [~/mnt]```

**Reset the USB device** before connecting if the last session left it stuck

```aft-mtp-mount -R [~/mnt]```

Stay in the **foreground** with MTP debug output

```aft-mtp-mount -f -d [~/mnt]```

**Unmount** before unplugging (use fusermount, not aft-mtp-mount)

```fusermount -u [~/mnt]```

# SYNOPSIS

**aft-mtp-mount** [_options_] _mountpoint_

# PARAMETERS

**-D** _name_
> Connect only to a device whose manufacturer, model, or serial matches _name_ (partial match).

**-R**
> Reset the USB device before opening a session.

**-C**
> Do not claim the USB interface (when another process already owns it).

**-d**, **-o debug**, **-odebug**
> Enable MTP and FUSE debug output (implies foreground).

**-f**
> Run in the foreground (do not daemonize).

**-s**
> Single-threaded FUSE loop.

**-o** _options_
> FUSE mount options. **allow_other** lets users besides the mounter read the tree; **user_allow_other** must be uncommented in `/etc/fuse.conf` first.

**-h**, **--help**
> Print AFT-specific options and exit.

**-V**, **--version**
> Print the FUSE library version and exit.

# DESCRIPTION

**aft-mtp-mount** is the FUSE helper from **Android File Transfer for Linux**. It exposes an MTP device — typically an Android phone or tablet, but also cameras and Zune players — as a normal directory tree, using the project's own MTP stack rather than **libmtp** or **libptp**.

The mount point's top level is one directory per storage (internal memory, SD card, and so on), named from the device's storage description, or `sdcard0`, `sdcard1`, … when the description is empty. Partial reads and writes are supported when the device implements the corresponding MTP extensions, so media players can seek and editors can patch files in place. There is no file-size cap from the client side.

FUSE is convenient for `ls`, `cp`, and file managers, but the same project documents it as several times slower than **aft-mtp-cli** or the Qt UI for bulk copies. Album art is only picked up by media players if a file named `albumart.*` is copied into the destination folder first.

# CAVEATS

The device must be unlocked and in MTP (or PTP) mode; charging-only USB or a lock screen yields `connect failed: no MTP device found`. Only one process may talk to an MTP device at a time — stop **aft-mtp-cli**, the Qt UI, **jmtpfs**, GVFS, and **adb** if they have claimed the interface. Always unmount with **fusermount -u** before unplugging; a surprise disconnect can abort the FUSE process. Samsung devices that dropped Android MTP extensions often mount **read-only**. Devices without **GetPartialObject** keep a tiny in-memory cache of recently read files. USB timeouts can leave the phone unresponsive until it is replugged. Access to `/dev/bus/usb/*` needs udev rules (for example the **android-udev** package) or membership in the plugdev/usb group.

# HISTORY

**Android File Transfer for Linux** was written by **Vladimir Menshakov** starting in **2015** (LGPLv2.1) as a Linux counterpart to Google's macOS Android File Transfer, after gvfs/libmtp clients proved unreliable. The CLI, FUSE helper, and Qt UI share the same MTP stack.

# INSTALL

```apt: sudo apt install android-file-transfer```

```dnf: sudo dnf install android-file-transfer```

```pacman: sudo pacman -S android-file-transfer```

```nix: nix profile install nixpkgs#android-file-transfer```

<!-- packages: 2026-09-19 -->

# SEE ALSO

[aft-mtp-cli](/man/aft-mtp-cli)(1), [jmtpfs](/man/jmtpfs)(1), [simple-mtpfs](/man/simple-mtpfs)(1), [fusermount](/man/fusermount)(1), [gio](/man/gio)(1), [gvfs-mount](/man/gvfs-mount)(1)

# RESOURCES

```[Source code](https://github.com/whoozle/android-file-transfer-linux)```

```[Homepage](https://whoozle.github.io/android-file-transfer-linux/)```

```[Documentation](https://whoozle.github.io/android-file-transfer-linux/FAQ.html)```

<!-- verified: 2026-09-19 -->
