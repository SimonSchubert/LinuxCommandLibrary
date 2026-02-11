# TAGLINE

Disable swap devices and files

# TLDR

**Disable** a swap area

```sudo swapoff /path/to/swapfile```

Disable **all** swap areas

```sudo swapoff -a```

Disable swap by **label**

```sudo swapoff -L swap_label```

Disable swap by **UUID**

```sudo swapoff -U uuid```

# SYNOPSIS

**swapoff** [_-va_] [_specialfile_...]

# DESCRIPTION

**swapoff** disables swapping on the specified devices and files. When swapoff is called, all pages that are swapped to the specified areas are swapped back into RAM before the swap area is disabled.

# PARAMETERS

**-a, --all**
> Disable all swap areas listed in /proc/swaps

**-L label**
> Disable swap partition with the specified label

**-U uuid**
> Disable swap partition with the specified UUID

**-v, --verbose**
> Enable verbose output

**-h, --help**
> Display help text and exit

**-V, --version**
> Display version information and exit

# CAVEATS

Disabling swap requires enough RAM to hold all swapped-out pages. If there is insufficient RAM, swapoff will fail. This can take significant time on heavily used swap areas.

# HISTORY

**swapoff** is part of the **util-linux** package. It is the counterpart to swapon for disabling swap space.

# SEE ALSO

[swapon](/man/swapon)(8), [mkswap](/man/mkswap)(8), [free](/man/free)(1)
