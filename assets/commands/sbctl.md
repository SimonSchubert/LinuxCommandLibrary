# TLDR

Show current **secure boot status**

```sbctl status```

**Create** custom secure boot keys

```sbctl create-keys```

**Enroll** keys with Microsoft certificates

```sbctl enroll-keys -m```

**Auto-setup** based on configuration

```sbctl setup --setup```

**Sign** an EFI binary and save to database

```sbctl sign -s path/to/efi_binary```

**Re-sign** all saved files

```sbctl sign-all```

**Verify** all EFI executables are signed

```sbctl verify```

# SYNOPSIS

**sbctl** _command_ [_options_]

# PARAMETERS

**status**
> Show secure boot status

**create-keys**
> Generate custom secure boot keys

**enroll-keys**
> Enroll keys into UEFI firmware

**-m**, **--microsoft**
> Include Microsoft UEFI vendor certificates

**sign**
> Sign EFI binary

**-s**, **--save**
> Save file to database for re-signing

**sign-all**
> Re-sign all saved files

**verify**
> Verify EFI executables are signed

# DESCRIPTION

**sbctl** is a user-friendly secure boot key manager. It simplifies creating, enrolling, and managing custom secure boot keys and signing EFI binaries.

Custom keys allow booting only signed kernels and bootloaders, enhancing system security.

# CAVEATS

Not enrolling Microsoft certificates can brick some systems with Option ROMs. Keys are stored in /var/lib/sbctl by default.

# HISTORY

Developed as a user-friendly alternative to manual secure boot key management tools.

# SEE ALSO

[mokutil](/man/mokutil)(1), [efibootmgr](/man/efibootmgr)(8)
