# TAGLINE

configfs-based USB gadget management tool

# TLDR

**List available USB device controllers (UDCs)**

```gt udc```

**List existing gadgets**

```gt gadget```

**Create a new gadget**

```gt create [gadget-name]```

**Set gadget attributes** (vendor/product IDs)

```gt set [gadget-name] idVendor=[0x1d6b] idProduct=[0x0104]```

**Create a USB function** (e.g. Ethernet)

```gt func create [gadget-name] [ecm] [usb0]```

**Create a configuration and bind the function to it**

```gt config create [gadget-name] [c] [1]```

```gt config add [gadget-name] [c] [1] [ecm] [usb0]```

**Enable a gadget on the first available UDC**

```gt enable [gadget-name]```

**Save the current gadget setup as a reusable template**

```gt save [gadget-name] [template-name]```

**Remove a gadget and all its configurations/functions**

```gt rm -rf [gadget-name]```

# SYNOPSIS

**gt** _command_ [_options_...]

**gadgetctl** _command_ [_options_...]

# PARAMETERS

_COMMAND_
> Subcommand to execute (see below).

**udc**
> Show the list of available USB device controllers.

**create** _gadget_ [_attr=val_...]
> Create a gadget with the given name and optionally set its attributes. `-f`/`--force` overrides an existing gadget with the same name.

**rm** _gadget_
> Remove a gadget. `-f`/`--force` disables it first if enabled; `-r`/`--recursive` also removes its configurations and functions.

**get** _gadget_ [_attr_]
> Print the given attribute, or all attributes if none is specified.

**set** _gadget_ _attr=val_...
> Set one or more gadget attributes to new values.

**enable** [_gadget_]
> Enable a gadget on a UDC. If only one gadget/UDC exists it is chosen automatically.

**disable** [_gadget_]
> Disable a gadget. `-u`/`--udc` _udc_ disables whichever gadget is active on the given UDC.

**gadget** [_name_]
> List all gadgets, or show details for one. `-v`/`--verbose` also prints attributes; `-r`/`--recursive` also shows function/config details.

**func create/rm/show** _gadget_ _type_ _instance_
> Create, remove, or show a USB function (e.g. **ecm**, **acm**, **mass_storage**) bound to a gadget.

**func list-types**
> Print the list of function types supported by the running kernel.

**config create/rm/show** _gadget_ _label_ _id_
> Create, remove, or show a gadget configuration.

**config add/del** _gadget_ _label_ _id_ _func-type_ _func-instance_
> Bind or unbind a function to/from a configuration.

**save** _gadget_ [_name_]
> Store the gadget's current setup as a system template. `--file`, `--stdout`, and `--path` redirect where it is stored.

**load** _name_ [_gadget_]
> Create and enable a gadget from a saved template. `-o`/`--off` skips enabling it.

**template** [_name_]
> List templates, or show one template's configurations and functions.

**settings set/get/append/detach** _variable_ [_value_]
> Manage gt's own configuration variables (some of which hold lists).

# DESCRIPTION

**gt** (gadget-tool) configures Linux USB gadgets through the kernel's **configfs** interface, replacing manual `mkdir`/`echo` manipulation of the configfs tree with a small set of subcommands. It builds gadgets out of **functions** (e.g. Ethernet, mass storage, serial, HID) grouped into one or more **configurations**, which are then enabled on a USB Device Controller (UDC).

**gt** operates directly on configfs and therefore needs root privileges. The companion binary **gadgetctl** talks to a **gadgetd** daemon instead using the same command syntax, but gadgetd is considered obsolete.

# CAVEATS

Requires root and a kernel built with USB gadget/configfs support (`CONFIGFS_FS`, `USB_CONFIGFS`, and the relevant function drivers); which function types are available depends on the running kernel. Mainly used on embedded boards and devices with a USB device-mode controller, not on typical desktop hardware.

# SEE ALSO

[mount](/man/mount)(8), [lsusb](/man/lsusb)(8), [modprobe](/man/modprobe)(8)

# RESOURCES

```[Source code](https://github.com/linux-usb-gadgets/gt)```

<!-- verified: 2026-07-17 -->
