# TLDR

Show current **build configuration** to verify what would be built

```mkosi summary```

**Build an image** with specified distribution

```mkosi build --distribution [fedora|debian|ubuntu|arch|opensuse]```

Build an image and run an **interactive shell** in the container

```mkosi shell```

**Boot an image** in a virtual machine using QEMU

```mkosi qemu```

**Force rebuild** of existing image

```mkosi -f build```

**Clean** build artifacts

```mkosi clean```

Display **help**

```mkosi help```

# SYNOPSIS

**mkosi** [_options_] {**build**|**shell**|**boot**|**vm**|**ssh**|**clean**|**summary**|**genkey**|**help**}

# PARAMETERS

**build**
> Generate the image (default if no verb specified)

**shell**
> Interactive shell in built image via systemd-nspawn container

**boot**
> Boot systemd in image container

**vm, qemu**
> Boot image in virtual machine using QEMU

**ssh**
> Connect to booted VM via SSH

**clean**
> Remove build artifacts

**summary**
> Display human-readable configuration overview

**cat-config**
> Output all loaded configuration file contents

**burn _device_**
> Write image to block device

**genkey**
> Generate SecureBoot keypairs

**-f, --force**
> Replace existing output; repeat for cache purge

**-i, --incremental**
> Enable caching between builds

**-C, --directory _dir_**
> Change to directory before processing

**--distribution _distro_**
> Target distribution: fedora, debian, ubuntu, arch, opensuse, etc.

**--release _version_**
> Specific distribution version

**--format _type_**
> Output type: directory, tar, disk, uki, etc.

**--debug**
> Enable verbose output

# DESCRIPTION

**mkosi** builds customized, modern Linux OS images. It wraps package managers (dnf, apt, pacman, zypper) to generate disk images, container images, and unified kernel images with extensive customization options.

Supported output formats include raw GPT disk images, plain directories, tar and CPIO archives, unified kernel images (UKI), and OCI-compatible images. The tool supports multiple distributions and can create bootable images with systemd-boot or GRUB.

Configuration is read from mkosi.conf files, allowing declarative image definitions with support for profiles, conditional sections, and modular configurations.

# CAVEATS

Running mkosi on a filesystem with reflink support (XFS, btrfs) significantly improves performance. SELinux may block sshd access to VSock when connecting to VMs. Incremental build cache invalidation is basic; use -ff for clean rebuilds. Some features require root privileges.

# HISTORY

**mkosi** is part of the **systemd** project, developed by Lennart Poettering and others. It was designed to build modern, legacy-free Linux images using systemd components like systemd-nspawn, systemd-repart, and unified kernel images. The tool emphasizes reproducibility and image-based deployments.

# SEE ALSO

[systemd-nspawn](/man/systemd-nspawn)(1), [systemd-repart](/man/systemd-repart)(8), [qemu](/man/qemu)(1)
