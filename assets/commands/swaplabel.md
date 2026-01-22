# TLDR

**Display** the current label and UUID of a swap area

```swaplabel [path/to/device]```

**Set** the label of a swap area

```swaplabel -L [new_label] [path/to/device]```

**Set** the UUID of a swap area

```swaplabel -U [new_uuid] [path/to/device]```

# SYNOPSIS

**swaplabel** [_options_] _device_

# PARAMETERS

**-L, --label _label_**
> Set the swap area label

**-U, --uuid _uuid_**
> Set the swap area UUID (use **uuidgen** to create)

**-h, --help**
> Display help information

**-V, --version**
> Display version information

# DESCRIPTION

**swaplabel** prints or changes the label or UUID of a Linux swap area. The device can be a partition or a regular file configured as swap space.

Labels and UUIDs are useful for identifying swap areas in **/etc/fstab** instead of using device paths, which may change between boots. Using UUIDs is particularly recommended for reliable identification.

# CAVEATS

The swap area must be inactive (not in use) when changing label or UUID. Requires root privileges. After changing UUID, update **/etc/fstab** if it references the old UUID. Part of the util-linux package.

# SEE ALSO

[mkswap](/man/mkswap)(8), [swapon](/man/swapon)(8), [swapoff](/man/swapoff)(8), [uuidgen](/man/uuidgen)(1)
