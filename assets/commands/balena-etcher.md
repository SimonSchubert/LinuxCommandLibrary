# TLDR

**Launch Balena Etcher** graphical interface

```balena-etcher```

**Flash an image** to a drive (Electron app)

```balena-etcher-electron```

**Launch from applications menu**

```balenaEtcher```

# SYNOPSIS

**balena-etcher** [_options_]

**balena-etcher-electron** [_options_]

# DESCRIPTION

**Balena Etcher** is a cross-platform graphical application for flashing OS images to SD cards and USB drives. It provides a simple three-step process: select image, select drive, and flash.

The application validates writes by reading back and comparing checksums, ensuring reliable image flashing. It supports raw images (.img, .iso), compressed images (.zip, .gz, .xz, .bz2), and can flash directly from URLs.

Etcher automatically detects removable drives and prevents accidental selection of system drives. It uses a multi-write feature to flash multiple drives simultaneously.

# PARAMETERS

**--help**
> Display help information.

**--version**
> Show version number.

# CAVEATS

Etcher is primarily a GUI application and has limited command-line functionality. It requires elevated privileges to write to devices. The application prevents selection of system drives but users should still verify target selection carefully. Large images may require significant time to flash and verify.

# HISTORY

**Etcher** was created by **Balena** (formerly Resin.io) and released in **2016** as an open-source tool to simplify the process of flashing OS images for IoT devices and single-board computers like Raspberry Pi. The name changed from "Etcher" to "Balena Etcher" when the company rebranded. It has become one of the most popular image flashing tools, known for its user-friendly interface and cross-platform support.

# SEE ALSO

[dd](/man/dd)(1), [dcfldd](/man/dcfldd)(1), [pv](/man/pv)(1), [lsblk](/man/lsblk)(1)
