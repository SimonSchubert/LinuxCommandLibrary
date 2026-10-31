# TAGLINE

Command-line client for the CDEmu optical-drive emulator

# TLDR

Load an image into the **first** virtual drive

```cdemu load 0 [path/to/image.mds]```

Load a **multi-file** image (CUE/TOC sessions)

```cdemu load 0 [path/to/session1.toc] [path/to/session2.toc]```

Load into the first **empty** device, creating one if needed

```cdemu load any --create [path/to/image.cue]```

**Unload** a device (or every device)

```cdemu unload 0```

```cdemu unload all```

Show **status** of every virtual drive

```cdemu status```

Show **device mapping** (`sr` / `sg` nodes)

```cdemu device-mapping```

Add or remove a **virtual drive**

```cdemu add-device```

```cdemu remove-device```

Create a **blank DVD+R** image for burning software

```cdemu create-blank --writer-id=WRITER-ISO --medium-type=dvd+r 0 [path/to/output.iso]```

Connect over the **system** D-Bus instead of the session bus

```cdemu --bus system status```

# SYNOPSIS

**cdemu** [**--bus** **session**|**system**] [**-h**] [**-v**] _command_ [_command-parameters_]

# PARAMETERS

**-h**, **--help**
> Print help. With a command name, print that command's synopsis.

**-v**, **--version**
> Print the client version and exit.

**-b**, **--bus** **session**|**system**
> D-Bus to use when talking to the daemon. Default **session**, unless a config file sets otherwise.

**load** [_options_] _device_ _file_ [_file_ ...]
> Load an image into _device_ (a number, or **any** for the first empty drive). Extra files are extra sessions of a multi-file image. **--replace** / **--unload** ejects a loaded drive first. **--create** (only with **any**) adds a drive when none is empty. **--encoding** _string_ sets the text encoding for CUE and similar descriptors.

**create-blank** [**--writer-id=**_id_] [**--medium-type=**_type_] [**--param=**_writer.key=value_] _device_ _image-file_
> Load a blank recordable image. **--writer-id** is required (`WRITER-ISO`, `WRITER-TOC`, …; list them with **enum-writers**). **--medium-type** is one of **cdr74**, **cdr80**, **cdr90**, **cdr99**, **dvd+r**, **bdr**. Repeat **--param** for writer keys from **enum-writer-parameters**.

**unload** _device_
> Eject the image. _device_ is a number, or **all**.

**status**
> Print whether each drive is loaded and which image it holds.

**add-device**
> Create another virtual drive.

**remove-device**
> Remove the last virtual drive.

**device-mapping**
> Print the kernel `sr` / `sg` mapping for each drive.

**dpm-emulation** _device_ [_0_|_1_]
> Show or set DPM (density/position) emulation. _device_ is a number, or **all**.

**tr-emulation** _device_ [_0_|_1_]
> Show or set transfer-rate emulation.

**bad-sector-emulation** _device_ [_0_|_1_]
> Show or set bad-sector emulation.

**dvd-report-css** _device_ [_0_|_1_]
> Report the loaded DVD as CSS-encrypted. Lets a deCSS-capable player play a raw `dd`/`readcd` dump that has no Disc Structure 0x01.

**device-id** _device_ [_vendor_] [_product_] [_revision_] [_vendor-specific_]
> Show or set the SCSI inquiry strings (8 / 16 / 4 / 20 characters).

**daemon-debug-mask** _device_ [_value_]
> Show or set the daemon debug mask. _value_ is a number (`0x01`), a pipe-joined list of numbers, or named flags from **enum-daemon-debug-masks**.

**library-debug-mask** _device_ [_value_]
> Same for libMirage, using **enum-library-debug-masks**.

**enum-parsers**, **enum-writers**, **enum-filter-streams**
> List image parsers, writers, and filter streams the daemon supports.

**enum-daemon-debug-masks**, **enum-library-debug-masks**
> List named debug flags.

**enum-writer-parameters** _writer-id_
> Print the parameter sheet for one writer.

**version**
> Print daemon and library versions.

# DESCRIPTION

**cdemu** is the command-line client for **CDEmu**, a Linux CD/DVD/Blu-ray device emulator. The kernel **vhba** module registers virtual SCSI optical drives. **cdemu-daemon** implements those drives in userspace with **libMirage**, and this client talks to the daemon over D-Bus.

Users load cue/bin, MDS/MDF, NRG, CCD, TOC, ISO, and other images into a virtual drive, then mount or play the resulting `sr` device as if it were a physical disc. **create-blank** presents a writable CD-R, DVD+R, or BD-R so burning software can write a new image through the same stack.

The client starts the user **cdemu-daemon** service through D-Bus activation when it is not already running. The default bus is the session bus, so each login session can have its own daemon instance.

# CONFIGURATION

The first existing file of `~/.cdemu-client` then `/etc/cdemu-client.conf` is read. **--bus** overrides it. Example:

```
[defaults]
bus = session
```

Valid **bus** values are **session** and **system**.

**CDEMU-ASKPASS**
> Command whose stdout is the password for an encrypted image. Strongly discouraged: the password is visible in the process list and is sent over D-Bus as a plain string.

**SSH-ASKPASS**
> Fallback password helper when stdin is not a terminal and **CDEMU-ASKPASS** is unset.

**CDEMU-USE-ZENITY**
> When set to a value other than `0`, password and error dialogs go through **zenity** instead of the helpers above. Intended for desktop "Open with CDEmu" actions that have no terminal.

# CAVEATS

The **vhba** module must be loaded (`/dev/vhba_ctl`). Without it the daemon fails to start and the client times out on D-Bus activation. Custom kernels need the DKMS variant of the module.

Passwords for encrypted images travel over D-Bus in the clear.

**unload** is an eject request. If the kernel has the disc mounted and locked, the image stays loaded until the filesystem is unmounted.

The system bus needs extra D-Bus policy and is discouraged for ordinary desktop use.

# HISTORY

**CDEmu** is written by **Rok Mandeljc**. The client has been a Python D-Bus front end since 2006 (GPL-2.0-or-later). Version **3.0** (2014) added image writers and blank-disc recording. Version **3.2** (2018) switched the Python tools to Python 3 and added Blu-ray profiles. The client is **3.3.1**.

# INSTALL

```apt: sudo apt install cdemu-client```

```pacman: sudo pacman -S cdemu-client```

```zypper: sudo zypper install cdemu-client```

```nix: nix profile install nixpkgs#cdemu-client```

<!-- packages: 2026-10-31 -->

# SEE ALSO

[losetup](/man/losetup)(8), [mount](/man/mount)(8), [isoinfo](/man/isoinfo)(1), [genisoimage](/man/genisoimage)(1), [wodim](/man/wodim)(1), [cdrdao](/man/cdrdao)(1), [udisksctl](/man/udisksctl)(1), [zenity](/man/zenity)(1)

# RESOURCES

```[Source code](https://github.com/cdemu/cdemu)```

```[Homepage](https://cdemu.sourceforge.io/)```

```[Documentation](https://manpages.debian.org/unstable/cdemu-client/cdemu.1.en.html)```

<!-- verified: 2026-10-31 -->
