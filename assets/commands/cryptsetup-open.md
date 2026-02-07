# TAGLINE

open and map LUKS encrypted volume

# TLDR

**Open** a LUKS volume and create decrypted mapping

```cryptsetup open [/dev/sdXY] [mapping_name]```

Use a **keyfile** instead of passphrase

```cryptsetup open -k [path/to/file] [/dev/sdXY] [mapping_name]```

Enable **TRIM** support for SSDs

```cryptsetup open --allow-discards [/dev/sdXY] [mapping_name]```

Enable TRIM and make it **persistent**

```cryptsetup open --allow-discards --persistent [/dev/sdXY] [mapping_name]```

Open as **read-only**

```cryptsetup open -r [/dev/sdXY] [mapping_name]```

# SYNOPSIS

**cryptsetup open** [_options_] _device_ _mapping_name_

# DESCRIPTION

**cryptsetup open** creates a decrypted mapping of an encrypted LUKS volume. The decrypted device appears at /dev/mapper/mapping_name and can be used like any block device.

After opening, the mapped device can be mounted or used with LVM, filesystem creation, etc.

# PARAMETERS

**-k, --key-file** _file_
> Use keyfile instead of passphrase

**--allow-discards**
> Allow TRIM/discard passthrough (for SSDs)

**--persistent**
> Store options in LUKS header

**-r, --readonly**
> Open in read-only mode

**--type** _type_
> Specify device type (luks, luks1, luks2, plain, tcrypt)

# CAVEATS

With TRIM enabled, minimal data leakage about freed blocks may occur, potentially revealing the filesystem type. However, TRIM is generally recommended for SSD longevity, and the actual data remains encrypted.

# SEE ALSO

[cryptsetup](/man/cryptsetup)(8), [cryptsetup-close](/man/cryptsetup-close)(8), [cryptsetup-luksformat](/man/cryptsetup-luksformat)(8)
