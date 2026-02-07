# TAGLINE

generate GRUB bootloader configuration file

# TLDR

Print configuration to **stdout** (dry run)

```sudo grub-mkconfig```

Generate configuration to **file**

```sudo grub-mkconfig -o /boot/grub/grub.cfg```

Display **help**

```grub-mkconfig --help```

Display **version**

```grub-mkconfig --version```

# SYNOPSIS

**grub-mkconfig** [_OPTION_]

# PARAMETERS

**-o, --output=FILE**
> Write the generated configuration to FILE instead of stdout

**-h, --help**
> Display help message and exit

**-V, --version**
> Display version information and exit

# DESCRIPTION

**grub-mkconfig** generates a GRUB bootloader configuration file by processing system settings and detecting installed operating systems. It is typically used after kernel updates or when modifying boot parameters.

The command reads settings from /etc/default/grub and executes scripts in /etc/grub.d/ to produce the final grub.cfg file.

# CONFIGURATION

**/etc/default/grub**
> Main settings file controlling timeout, default entry, kernel parameters, and display options.

**/etc/grub.d/**
> Directory of scripts executed during configuration generation. Custom boot entries can be added here.

# CAVEATS

This command should be run as root. The generated configuration depends on scripts in /etc/grub.d/ and settings in /etc/default/grub. After making changes to GRUB settings, always run grub-mkconfig to regenerate the configuration.

# HISTORY

**grub-mkconfig** is part of **GRUB 2** (GRand Unified Bootloader), which replaced the original GRUB Legacy. It provides automatic detection of installed kernels and operating systems.

# SEE ALSO

[grub-install](/man/grub-install)(8), [update-grub](/man/update-grub)(8), [grub-set-default](/man/grub-set-default)(8)
