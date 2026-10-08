# TAGLINE

install and configure systemd-boot-password

# TLDR

**Install** the boot manager into the EFI system partition

```sudo sbpctl install [/boot/efi]```

Install only as the **default EFI loader** (`/EFI/BOOT/BOOT*.EFI`)

```sudo sbpctl install -d [/boot/efi]```

Install with **/etc/sbp/loader.conf** baked into the EFI binary

```sudo sbpctl install -i [/boot/efi]```

Install and **sign** for Secure Boot with the keys in `/etc/sbp`

```sudo sbpctl install -s [/boot/efi]```

Generate a **SHA-512 password hash** for the `password` option in `loader.conf`

```sbpctl generate```

Build a **standalone EFI application** from a Linux EFI binary and an initramfs

```sudo sbpctl standalone -i [/boot/initramfs-linux.img] [/boot/vmlinuz-linux] [/boot/efi/linux.efi]```

# SYNOPSIS

**sbpctl install** [**-i**] [**-d**] [**-s**] _path_

**sbpctl standalone** [**-o** _osrel_] [**-c** _cmdline_] [**-i** _initrd_] [**-s**] _efi_ _output_

**sbpctl generate**

# DESCRIPTION

**sbpctl** controls **systemd-boot-password**, a systemd-boot fork whose kernel-parameter editor can be locked with a password. **install** copies the boot manager onto an EFI system partition (ESP). **standalone** packs a Linux EFI application and one or more initramfs images into a single EFI binary. **generate** prompts for a password and prints a SHA-512 hash for the **password** line in `loader.conf`.

The boot menu still uses systemd-boot-style entries. The extra option is **password**: when it is set, pressing **e** to edit kernel parameters asks for that password.

# COMMANDS

**install** _path_
> Install systemd-boot-password on the ESP at _path_. By default it is also installed as the fallback loader at `/EFI/BOOT/BOOT*.EFI`

**standalone** _efi_ _output_
> Create a standalone EFI application at _output_ from the Linux EFI binary _efi_, with optional os-release, cmdline, and initrd sections

**generate**
> Prompt for a password and print its SHA-512 hash for `loader.conf`

# PARAMETERS

**-i**, **--include** (install)
> Embed `/etc/sbp/loader.conf` in the EFI binary so the boot manager never reads a file from the ESP

**-d**, **--default** (install)
> Install only as `/EFI/BOOT/BOOT*.EFI`

**-s**, **--sign** (install and standalone)
> Sign the resulting EFI binary with **sbsign** using `/etc/sbp/db.key` and `/etc/sbp/db.crt`

**-o**, **--osrel** _file_ (standalone)
> Embed an os-release file (usually `/etc/os-release`)

**-c**, **--cmdline** _file_ (standalone)
> Embed a kernel command line (usually `/proc/cmdline`)

**-i**, **--initrd** _file_ (standalone)
> Embed an initramfs. May be given more than once

# CONFIGURATION

Loader settings live in **$ESP/loader/loader.conf**, or in **/etc/sbp/loader.conf** when **install --include** is used. Entries live in **$ESP/loader/entries/*.conf**, or in the same file as the loader settings, separated by a blank line.

**default**
> Default entry: a `*.conf` file name, or **entryINDEX** when entries are inlined

**timeout**
> Menu timeout in seconds. **0** hides the menu unless **Esc** is held at boot

**editor**
> **1** enables the kernel-parameter editor on **e** (the default); **0** disables it

**password**
> SHA-512 hash from **sbpctl generate**. Required to open the editor

Entry keys include **title**, **version**, **machine-id**, **efi**, **linux**, **initrd**, **architecture**, and **options**. **linux** also adds an **initrd** argument to the kernel command line.

# CAVEATS

**install** and **standalone** need write access to the ESP (typically root). **--sign** needs **sbsigntools** and keys in `/etc/sbp`. Restrict `/etc/sbp` to mode **700**, and consider `fmask=0077` or `0177` for the ESP in `/etc/fstab`. This is a fork of systemd-boot, not a drop-in for **bootctl**.

# HISTORY

**systemd-boot-password** is a small fork of systemd-boot by kitsunyan that adds a hashed password for the on-firmware editor. Arch Linux packages it from the AUR as **systemd-boot-password**.

# SEE ALSO

[bootctl](/man/bootctl)(1), [sbctl](/man/sbctl)(8), [mokutil](/man/mokutil)(1), [ukify](/man/ukify)(1)

# RESOURCES

```[Source code](https://github.com/kitsunyan/systemd-boot-password)```

<!-- verified: 2026-10-08 -->
