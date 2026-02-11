# TAGLINE

Set up and control zram devices

# TLDR

**Check** if zram is enabled

```lsmod | grep -i zram```

**Enable** zram with dynamic number of devices

```sudo modprobe zram```

**Enable** zram with exactly 2 devices

```sudo modprobe zram num_devices=2```

**Find** and initialize the next free zram device

```sudo zramctl -f -s 2GB -a lz4```

**List** currently initialized devices

```sudo zramctl```

# SYNOPSIS

**zramctl** [_options_] [_zram-device_]

# PARAMETERS

**-f, --find**
> Find and initialize the next free zram device

**-s, --size _size_**
> Set the size of the zram device

**-a, --algorithm _alg_**
> Set compression algorithm (lz4, lzo, zstd, etc.)

**-t, --streams _number_**
> Set number of compression streams

**-r, --reset**
> Reset the device

**-o, --output _list_**
> Define output columns

**--raw**
> Raw output format

# DESCRIPTION

**zramctl** sets up and controls zram devices, which are compressed RAM-based block devices. Zram is useful for creating compressed swap space or temporary filesystems, improving memory efficiency.

After creating a zram device with zramctl, use **mkswap** and **swapon** to use it as swap, or **mkfs** to create a filesystem.

# CAVEATS

Requires the zram kernel module. Compression algorithms vary by kernel version. Zram swap can improve performance on memory-constrained systems but uses CPU for compression. Part of the util-linux package.

# SEE ALSO

[mkswap](/man/mkswap)(8), [swapon](/man/swapon)(8), [free](/man/free)(1)
