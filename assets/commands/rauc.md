# TAGLINE

Robust Auto-Update Controller for embedded Linux

# TLDR

**Create and sign an update bundle** from a content directory

```rauc bundle --cert=[cert.pem] --key=[key.pem] [content_dir/] [update.raucb]```

**Install a bundle** on the running system (local path or HTTP URL)

```rauc install [update.raucb]```

**Show the current update status** of all slots

```rauc status```

**Show status** as JSON for scripting

```rauc status --output-format=json-pretty```

**Print the metadata** of an update bundle

```rauc info [update.raucb]```

**Mark the currently booted slot as good** after a successful update

```rauc status mark-good booted```

**Mark a slot as bad** to force a rollback on next boot

```rauc status mark-bad other```

**Extract a bundle's contents** into a directory for inspection

```rauc extract [update.raucb] [output_dir/]```

# SYNOPSIS

**rauc** [_global-options_] _command_ [_command-options_] [_arguments_]

# PARAMETERS

**-c** _FILE_, **--conf=**_FILE_
> Use an alternative _system.conf_.

**-C** _SECTION:KEY=VALUE_, **--confopt=**_SECTION:KEY=VALUE_
> Override a config value at runtime.

**--keyring=**_PEM_
> Trust anchor(s) used to verify bundle signatures.

**--mount=**_PATH_
> Mount-point prefix for bundles (default _/mnt/rauc_).

**-d**, **--debug**
> Enable debug output.

**-h**, **--help**
> Print usage information.

**--version**
> Print RAUC version and exit.

# COMMANDS

**bundle** _INPUTDIR_ _BUNDLE_
> Create and sign a bundle. Requires **--cert** and **--key**.

**resign** _IN_ _OUT_
> Replace (or **--append**) the signature of an existing bundle.

**convert** _IN_ _OUT_
> Convert a classic bundle to a verity/casync bundle.

**encrypt** _IN_ _OUT_ **--to** _PEM_
> Encrypt a bundle for the given recipient certificate(s).

**extract** _BUNDLE_ _DIR_
> Extract the raw contents of a bundle (verification required).

**extract-signature** _BUNDLE_ _SIGFILE_
> Write the detached CMS signature to a file.

**install** _BUNDLE_
> Install the bundle onto the inactive slot group. Accepts local paths, _file://_ URIs, and _http(s)://_ URLs. Use **--progress** for a TTY progress bar.

**info** _BUNDLE_
> Display manifest, images, and signature chain.

**status** [_SLOT_], **mark-good**|**mark-bad**|**mark-active** [**booted**|**other**|_SLOT_]
> Query slot status or change the boot state of a slot.

**write-slot** _SLOT_ _IMAGE_
> Write an image directly to a slot (for manufacturing or recovery).

**mount** _BUNDLE_
> Mount a bundle for debugging (development use).

# DESCRIPTION

**rauc** is both a target update client and a host-side packaging tool for embedded Linux systems. It delivers atomic, fail-safe A/B updates by writing a signed bundle into the inactive slot group and switching the active boot target only after integrity has been verified. If the new system fails to boot or confirm, the bootloader falls back to the previous slot.

An update bundle (_.raucb_) is a SquashFS archive of root-filesystem images, kernel/initrd, and a manifest, signed with an x509 certificate. On the target, **rauc install** validates the signature against a pre-installed keyring, ensures the bundle is **compatible** with the device, and dispatches each image to its slot (ext4, UBIFS, raw block devices, boot partitions, etc.). A D-Bus service exposes progress and state to other services.

# CONFIGURATION

The behavior of rauc on the target is controlled by **/etc/rauc/system.conf**. Representative fragment:

```
[system]
compatible=my-device-v1
bootloader=uboot
bundle-formats=-plain

[keyring]
path=/etc/rauc/ca.cert.pem

[slot.rootfs.0]
device=/dev/mmcblk0p2
type=ext4
bootname=A

[slot.rootfs.1]
device=/dev/mmcblk0p3
type=ext4
bootname=B
```

Bootloader integration (**bootname**, marking slots good/bad) is supplied for U-Boot, GRUB, Barebox, EFI, and custom scripts.

# CAVEATS

A RAUC-based design requires early planning: the target must have at least two root slots, a bootloader able to switch between them, and a trust anchor baked into the rootfs. Bundles are tied to the **compatible** string; mismatches are rejected. Encrypted (crypt) bundles require the matching private key at install time. Signing certificates should be kept offline and rotated via **rauc resign**.

# HISTORY

RAUC was created by **Jan Lübbe** and **Enrico Jörns** at **Pengutronix** and released as open source in **2015** to give embedded Linux projects a vendor-neutral, secure update framework. It has since become a de facto standard in the **Yocto** and **Buildroot** ecosystems and ships with integration layers (**meta-rauc**, **hawkBit** connector) that connect devices to large-scale update servers.

# SEE ALSO

[mkfs.squashfs](/man/mkfs.squashfs)(1), [casync](/man/casync)(1), [swupdate](/man/swupdate)(1), [mender](/man/mender)(1), [fwupd](/man/fwupd)(1)
