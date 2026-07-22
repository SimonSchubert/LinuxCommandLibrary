# TAGLINE

Regenerate GRUB bootloader configuration

# TLDR

This command is an alias for **grub-mkconfig --output /boot/grub/grub.cfg**.

**View** documentation for the original command

```tldr grub-mkconfig```

# SYNOPSIS

**update-grub**

# DESCRIPTION

**update-grub** is a convenience wrapper that generates a new GRUB configuration file. It is equivalent to running **grub-mkconfig -o /boot/grub/grub.cfg** and is commonly found on Debian-based distributions.

The command reads configuration from **/etc/default/grub** and scripts in **/etc/grub.d/** to generate the bootloader configuration.

# CAVEATS

Requires root privileges. The actual path may vary (**/boot/grub2/grub.cfg** on some systems). Always review changes to GRUB configuration carefully.

# INSTALL

```apt: sudo apt install grub2-common```

```dnf: sudo dnf install grub2-common```

```pacman: sudo pacman -S grub```

```apk: sudo apk add grub```

```zypper: sudo zypper install grub2-common```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[grub-mkconfig](/man/grub-mkconfig)(8), [grub-install](/man/grub-install)(8)
