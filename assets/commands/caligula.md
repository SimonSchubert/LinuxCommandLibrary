# TAGLINE

Write disk images to USB drives safely

# TLDR

**Flash** an ISO to a drive

```caligula burn [path/to/image.iso]```

Flash an ISO with a **pre-specified hash**

```caligula burn [path/to/image.iso] -s [hash]```

# SYNOPSIS

**caligula** _command_ [_options_] _image_

# DESCRIPTION

**caligula** is a user-friendly TUI (Text User Interface) application for writing disk images to USB drives and other storage devices. It provides a safer, more interactive alternative to dd for creating bootable media.

The tool verifies image integrity through hash checking and confirms target device selection to prevent accidental data loss.

# SUBCOMMANDS

**burn**
> Write an image to a device

# PARAMETERS

**-s, --hash** _hash_
> Verify image against specified hash

# CAVEATS

Requires root privileges for writing to devices. Always verify the target device before writing. All data on the target device will be destroyed.

# SEE ALSO

[dd](/man/dd)(1), [pv](/man/pv)(1), [balena-etcher](/man/balena-etcher)(1)
