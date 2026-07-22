# TAGLINE

probes a partition for bootable Linux operating systems

# TLDR

**Probe** partition for bootable systems

```sudo linux-boot-prober /dev/sdXY```

# SYNOPSIS

**linux-boot-prober** _partition_

# DESCRIPTION

**linux-boot-prober** probes a partition for bootable Linux operating systems. It is part of os-prober and is used by bootloaders like GRUB to detect other installed Linux systems and add them to the boot menu.

# PARAMETERS

**partition**
> Device path of partition to probe (e.g., /dev/sda1)

# CAVEATS

Requires root privileges. Only detects Linux installations, not other operating systems. Use os-prober for broader detection.

# INSTALL

```apt: sudo apt install os-prober```

```dnf: sudo dnf install os-prober```

```pacman: sudo pacman -S os-prober```

```apk: sudo apk add os-prober```

```zypper: sudo zypper install os-prober```

```nix: nix profile install nixpkgs#os-prober```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[grub-mkconfig](/man/grub-mkconfig)(8), [update-grub](/man/update-grub)(8)
