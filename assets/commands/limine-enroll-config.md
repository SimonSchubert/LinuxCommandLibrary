# TAGLINE

embeds or resets the BLAKE2B hash of a Limine configuration file into

# TLDR

**Embed** a config file's BLAKE2B hash into the Limine EFI executable

```limine-enroll-config [path/to/BOOTX64.EFI] [blake2b_hash]```

**Remove** the enrolled hash from the executable, disabling config integrity check

```limine-enroll-config --reset [path/to/BOOTX64.EFI]```

Display **help**

```limine-enroll-config --help```

# SYNOPSIS

**limine-enroll-config** [_--reset_] _EFI_FILE_ [_HASH_]

# PARAMETERS

**--reset**
> Remove the enrolled configuration hash from the EFI executable

**--help**
> Display help information

**_EFI_FILE_**
> Path to the Limine UEFI executable (e.g., BOOTX64.EFI)

**_HASH_**
> The BLAKE2B hash of the limine.conf configuration file

# DESCRIPTION

**limine-enroll-config** embeds or resets the BLAKE2B hash of a Limine configuration file (limine.conf) into the Limine EFI executable. This ensures the bootloader configuration has not been tampered with when Secure Boot is enabled.

When Secure Boot validates the signed Limine executable, the embedded hash is used to verify the configuration file's integrity before applying boot settings. If the hash doesn't match, Limine will refuse to load the configuration.

# CAVEATS

The configuration hash must be regenerated and re-enrolled whenever limine.conf is modified. This tool is only relevant for UEFI Secure Boot environments; BIOS systems do not support this verification mechanism.

# SEE ALSO

[limine](/man/limine)(1), [limine-entry-tool](/man/limine-entry-tool)(1), [sbsign](/man/sbsign)(1)
