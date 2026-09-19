# TAGLINE

interactive MTP client for Android phones and other USB media devices

# TLDR

Start an **interactive session** (device must be unlocked and in MTP mode)

```aft-mtp-cli```

**List** attached MTP devices

```aft-mtp-cli -l```

Connect to a device by **partial name** (model or manufacturer)

```aft-mtp-cli -d [Pixel]```

Run a **single command** and exit (batch mode)

```aft-mtp-cli ls```

**Upload** a local file to the current device directory

```aft-mtp-cli put [path/to/file]```

**Download** a file from the device into the current directory

```aft-mtp-cli get [DCIM/Camera/IMG_0001.jpg]```

Run commands from a **script file**

```aft-mtp-cli -f [path/to/commands.txt]```

Show **debug** output

```aft-mtp-cli -v```

# SYNOPSIS

**aft-mtp-cli** [_options_] [_command_...]

# PARAMETERS

**-h**, **--help**
> Show this help and exit.

**-v**, **--verbose**
> Show debug output.

**-i**, **--interactive**
> Force interactive mode even when stdin is not a terminal.

**-b**, **--batch**
> Batch command processing (no prompt). Combined with leftover arguments, each argument is run as one command.

**-e**, **--events**
> Allow MTP event processing and print `:done` after each command.

**-f**, **--input-file** _file_
> Read commands from _file_ instead of stdin (implies batch mode).

**-C**, **--no-claim**
> Do not claim the USB interface.

**-R**, **--reset-device**
> Reset the USB device before connecting.

**-d**, **--device-name** _name_
> Select a device by partial name (model, manufacturer, or filesystem-friendly name).

**-l**, **--device-list**
> List matching MTP devices and exit.

**-V**, **--version**
> Show version information and exit.

# INTERACTIVE COMMANDS

When stdin is a terminal (or **-i** is given) and no command arguments remain, **aft-mtp-cli** opens an FTP-like prompt. Type **help** to list every command. The most useful ones:

**ls** [_path_], **ls-r**, **lsext**
> List the current or given directory. **-r** is recursive; **lsext** adds object id, storage, format, size, and date.

**cd** _path_, **pwd**
> Change or print the current object directory.

**put** _file_ [_dir_], **get** _file_ [_dst_]
> Upload a local file (or directory) / download a device object. **get** of a folder copies it recursively.

**mkdir** _path_, **mkpath** _path_, **rename** _path_ _new-name_, **rm** _path_
> Create directories, rename, or delete. **rm** is recursive.

**storage** _name_, **storage-list**, **storage-info** _id_
> Switch among device storages (internal memory, SD card) and print capacity.

**device-info**, **device-properties**
> Print identity and MTP device properties.

**cat** _file_
> Print a device file to stdout.

**flash** _file_
> Send a file as firmware (`UndefinedFirmware`). Used for Zune recovery.

**exit**, **quit**
> Leave the session.

Commands can also be passed as arguments: `aft-mtp-cli ls DCIM` runs **ls** on `DCIM` and exits.

# DESCRIPTION

**aft-mtp-cli** is the command-line client from **Android File Transfer for Linux**, a from-scratch MTP implementation that talks to Android phones, cameras, Zune players, and other USB media devices without **libmtp** or **libptp**.

It opens a session on the first matching device, selects the first storage, and either runs the given commands or starts an interactive prompt with GNU Readline completion. Transfers show a progress bar when stdout is a terminal. The same project also ships a Qt GUI and **aft-mtp-mount** (FUSE); the CLI is typically faster and more reliable for bulk copies than the FUSE mount.

# CAVEATS

The device must be unlocked and in MTP (or PTP) mode; a charging-only USB mode or a locked screen produces "device not found" or `InvalidStorageID`. Only one process may talk to an MTP device at a time, so unmount **aft-mtp-mount** / **jmtpfs** first. **rm** deletes recursively with no confirmation. Samsung devices that dropped Android MTP extensions can behave poorly. USB timeouts can leave the phone unresponsive until it is replugged. **flash** and **device-reboot** are for Zune-class firmware recovery, not Android phones.

# HISTORY

**Android File Transfer for Linux** was written by **Vladimir Menshakov** starting in **2015** (LGPLv2.1) as a Linux counterpart to Google's macOS Android File Transfer, after gvfs/libmtp clients proved unreliable. The CLI, FUSE helper, and Qt UI share the same MTP stack.

# INSTALL

```apt: sudo apt install android-file-transfer```

```dnf: sudo dnf install android-file-transfer```

```pacman: sudo pacman -S android-file-transfer```

```nix: nix profile install nixpkgs#android-file-transfer```

<!-- packages: 2026-09-16 -->

# SEE ALSO

[aft-mtp-mount](/man/aft-mtp-mount)(1), [jmtpfs](/man/jmtpfs)(1), [simple-mtpfs](/man/simple-mtpfs)(1), [gio](/man/gio)(1), [gvfs-mount](/man/gvfs-mount)(1), [fusermount](/man/fusermount)(1)

# RESOURCES

```[Source code](https://github.com/whoozle/android-file-transfer-linux)```

```[Homepage](https://whoozle.github.io/android-file-transfer-linux/)```

<!-- verified: 2026-09-16 -->
