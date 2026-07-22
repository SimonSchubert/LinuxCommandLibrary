# TAGLINE

UEFI boot entry decoder

# TLDR

Dump boot entries from **file**

```efibootdump -f [/sys/firmware/efi/efivars/Boot0000-8be4df61-93ca-11d2-aa0d-00e098032b8c]```

Dump a boot entry by **variable name**

```efibootdump [Boot0000]```

# SYNOPSIS

**efibootdump** [**-f**|**--file**] _variable_|_file_...

# DESCRIPTION

**efibootdump** decodes EFI load options such as Boot0000 or BootOrder and prints them in human-readable form: the description, attributes, and the device path of the loader.

It accepts either the name of a boot variable, which it reads from the running firmware, or a file containing the raw variable data when **-f** is given. This makes it useful both for inspecting the live boot configuration and for examining a variable dumped from another machine.

# PARAMETERS

_variable_|_file_
> The boot variable name, or a file path when **-f** is used.

**-f**, **--file**
> Treat the arguments as files containing raw variable data rather than variable names.

# CAVEATS

Only works on UEFI systems, and reading live variables requires efivarfs to be mounted at /sys/firmware/efi/efivars. Part of the **efivar** package, not efibootmgr, so it may need to be installed separately. Root privileges are usually needed to read the raw variable files.

# INSTALL

```apt: sudo apt install efibootmgr```

```dnf: sudo dnf install efibootmgr```

```pacman: sudo pacman -S efibootmgr```

```apk: sudo apk add efibootmgr```

```zypper: sudo zypper install efibootmgr```

```nix: nix profile install nixpkgs#efibootmgr```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[efibootmgr](/man/efibootmgr)(8), [efivar](/man/efivar)(1)

# RESOURCES

```[Source code](https://github.com/rhboot/efivar)```

<!-- verified: 2026-07-14 -->
