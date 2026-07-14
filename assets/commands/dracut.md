# TAGLINE

initramfs image generator

# TLDR

Generate initramfs for **current kernel**

```dracut```

Generate and **overwrite** existing

```dracut -f```

Generate for **specific kernel**

```dracut --kver [kernel_version]```

**List** available modules

```dracut --list-modules```

**Rebuild every** installed kernel's initramfs

```dracut --regenerate-all -f```

Build a **generic** image that boots on any hardware

```dracut -f --no-hostonly [/boot/initramfs-rescue.img]```

Show which **kernel command line** the image expects

```dracut --print-cmdline```

Add an extra **module and driver**

```dracut -f --add [crypt] --add-drivers [nvme]```

# SYNOPSIS

**dracut** [_options_] [_image_] [_kernel-version_]

# DESCRIPTION

**dracut** builds an initramfs: the small root filesystem the kernel unpacks into memory and runs before the real root is available. Its job is to load whatever is needed to *find* and mount the real root, which may mean assembling an LVM volume group, unlocking a LUKS device, starting a RAID array, or bringing up the network for an NFS or iSCSI root.

Where older generators used hand-written scripts, dracut is event-driven: it populates the image with **udev** rules and systemd units, and the boot proceeds as devices appear rather than by polling in a fixed order. The image content comes from **dracut modules**, small shells of scripts and dependencies under `/usr/lib/dracut/modules.d/`, which are selected automatically from what the running system needs and can be forced in or out with **--add** and **--omit**.

The most consequential choice is **host-only** mode. With **-H** the image contains only the drivers and modules this specific machine needs to boot, which is small and fast; most distributions default to it. A **--no-hostonly** image includes far more and will boot on hardware other than the one that built it, which is what you want for a rescue image or for an image built inside a container or chroot.

# PARAMETERS

**-f**, **--force**
> Overwrite an existing image.

**--kver** _VERSION_
> Build for a specific kernel version rather than the running one.

**--regenerate-all**
> Rebuild the initramfs for every installed kernel.

**-a**, **--add** _MODULES_
> Add dracut modules on top of the automatically selected set.

**-o**, **--omit** _MODULES_
> Leave dracut modules out.

**--force-add** _MODULES_
> Add modules even if they would otherwise be omitted.

**-m**, **--modules** _MODULES_
> Use exactly these dracut modules and nothing else.

**--add-drivers** _MODULES_ / **--omit-drivers** _MODULES_
> Add or exclude specific *kernel* modules (drivers).

**-d**, **--drivers** _MODULES_
> Include exactly these kernel modules.

**-H**, **--hostonly** / **-N**, **--no-hostonly**
> Build a host-specific image, or a generic one that boots on other hardware.

**--list-modules** / **-M**, **--show-modules**
> List the available dracut modules, or print the ones being included during a build.

**--print-cmdline**
> Print the kernel command line parameters this system's root setup requires.

**--kernel-cmdline** _PARAMS_
> Embed default kernel command line parameters in the image.

**-I**, **--install** _FILES_
> Install extra files into the image, resolving their library dependencies.

**--include** _SRC_ _TARGET_
> Copy a file or directory into the image at a given path.

**--fstab**
> Use `/etc/fstab` rather than `/proc/self/mountinfo` to work out the mounts.

**--uefi**
> Produce a UEFI executable combining kernel, initramfs, and command line.

**--gzip** / **--xz** / **--zstd** / **--no-compress**
> Choose the compression algorithm, or skip compression entirely.

**--sysroot** _DIR_
> Build against another root directory, for cross-building or installers.

**-v**, **--verbose** / **-q**, **--quiet**
> Raise or lower the verbosity.

# CONFIGURATION

**/etc/dracut.conf**
> Main configuration file for dracut behavior and module selection.

**/etc/dracut.conf.d/**
> Directory for additional configuration files.

**/usr/lib/dracut/dracut.conf.d/**
> System-wide dracut configuration directory.

# CAVEATS

A bad initramfs makes the machine unbootable, and you will not find out until the next reboot. Always keep the previous kernel and its image installed, so the boot menu still offers a way in, and prefer `dracut -f` on a spare image name over overwriting the one you are currently running from.

**Host-only images are not portable.** An image built with **-H** on one machine, in a container, or in a chroot may lack the drivers needed on the target and drop you into the emergency shell. Build with **--no-hostonly** whenever the image will boot hardware other than the machine that produced it.

`--print-cmdline` is worth running before switching bootloader configuration: an image can only find the root filesystem if the kernel command line tells it where to look, and a missing `rd.luks.uuid` or `rd.lvm.lv` fails at exactly the point where debugging is hardest.

Historically dracut was the Fedora/RHEL/SUSE generator while Debian and Ubuntu used **initramfs-tools**, but Debian and Ubuntu now package dracut as an alternative, and it is no longer a Red Hat-only tool.

# HISTORY

dracut was started around **2008** by Harald Hoyer and others at Red Hat to replace `mkinitrd`, whose generated images were an unmaintainable tangle of distribution-specific shell script. The design goal was to keep as little logic as possible in the initramfs itself and let udev events drive the boot, so that one generator could serve every distribution instead of each rolling its own. Fedora, RHEL, and SUSE adopted it, and it became the de facto standard.

In **March 2024** development moved to **dracut-ng**, a coordinated fork involving the previous maintainer along with several distributions, after the original repository stalled. dracut-ng is where releases now come from, and distributions have followed it.

# SEE ALSO

[mkinitramfs](/man/mkinitramfs)(8), [lsinitrd](/man/lsinitrd)(1), [update-initramfs](/man/update-initramfs)(8), [mkinitcpio](/man/mkinitcpio)(8)

# RESOURCES

```[Source code](https://github.com/dracut-ng/dracut-ng)```

```[Homepage](https://dracut-ng.github.io/)```

<!-- verified: 2026-07-14 -->

