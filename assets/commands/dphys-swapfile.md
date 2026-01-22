# TLDR

**Disable** swap file

```dphys-swapfile swapoff```

**Enable** swap file

```dphys-swapfile swapon```

**Create** a new swap file

```dphys-swapfile setup```

# SYNOPSIS

**dphys-swapfile** _command_

# DESCRIPTION

**dphys-swapfile** manages swap files on Debian-based systems, particularly useful on systems like Raspberry Pi. It automatically sizes the swap file based on available RAM.

Configuration is in /etc/dphys-swapfile.

# PARAMETERS

**setup**
> Create or resize swap file

**swapon**
> Enable the swap file

**swapoff**
> Disable the swap file

**uninstall**
> Remove swap file

# CAVEATS

Common on Raspberry Pi OS. Swap files on SD cards can reduce card lifespan. Consider using zram as an alternative. Configure CONF_SWAPSIZE in /etc/dphys-swapfile.

# SEE ALSO

[swapon](/man/swapon)(8), [swapoff](/man/swapoff)(8), [mkswap](/man/mkswap)(8)
