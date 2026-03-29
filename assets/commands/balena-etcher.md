# TAGLINE

Flash OS images to SD cards and USB drives

# TLDR

**Launch Balena Etcher** graphical interface

```balena-etcher```

**Flash an image** to a specific drive in CLI mode

```balena-etcher [image.img] --drive [/dev/sdX] --yes```

**Flash an image** to multiple drives simultaneously

```balena-etcher [image.img] --drive [/dev/sdb] --drive [/dev/sdc]```

**Flash and validate** the write after flashing

```balena-etcher [image.img] --drive [/dev/sdX] --check --yes```

# SYNOPSIS

**balena-etcher** [_options_] [_image_] [_drive..._]

# DESCRIPTION

**Balena Etcher** is a cross-platform graphical application for flashing OS images to SD cards and USB drives. It provides a simple three-step process: select image, select drive, and flash.

When launched without arguments, it opens the GUI. When given command-line arguments specifying an image and drive, it operates in CLI mode.

The application validates writes by reading back and comparing checksums, ensuring reliable image flashing. It supports raw images (.img, .iso), compressed images (.zip, .gz, .xz, .bz2), and can flash directly from URLs.

Etcher automatically detects removable drives and prevents accidental selection of system drives. It supports a multi-write feature to flash multiple drives simultaneously.

# PARAMETERS

**-d**, **--drive** _device_
> Specify the target drive to flash (repeatable for multiple drives).

**-y**, **--yes**
> Confirm automatically without prompting.

**-c**, **--check**
> Validate the write by reading back and comparing checksums after flashing.

**-u**, **--unmount**
> Unmount drives before flashing.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Show version number.

# CAVEATS

Etcher is primarily a GUI application and has limited command-line functionality. It requires elevated privileges to write to devices. The application prevents selection of system drives but users should still verify target selection carefully. Large images may require significant time to flash and verify.

# HISTORY

**Etcher** was created by **Balena** (formerly Resin.io) and released in **2016** as an open-source tool to simplify the process of flashing OS images for IoT devices and single-board computers like Raspberry Pi. The name changed from "Etcher" to "Balena Etcher" when the company rebranded. It has become one of the most popular image flashing tools, known for its user-friendly interface and cross-platform support.

# SEE ALSO

[dd](/man/dd)(1), [dcfldd](/man/dcfldd)(1), [ventoy](/man/ventoy)(1), [lsblk](/man/lsblk)(1)
