# TAGLINE

generate PBKDF2 password hash for GRUB protection

# TLDR

Create a **password hash** for GRUB 2

```sudo grub2-mkpasswd-pbkdf2```

Create hash with custom **iteration count** and **salt length**

```sudo grub2-mkpasswd-pbkdf2 -c [10000] -s [64]```

# SYNOPSIS

**grub2-mkpasswd-pbkdf2** [_options_]

# PARAMETERS

**-c**, **--iteration-count** _COUNT_
> Number of PBKDF2 iterations (higher is more secure but slower). Defaults to 10000.

**-s**, **--salt** _LENGTH_
> Length of the salt in bytes. Defaults to 64.

**-l**, **--buflen** _LENGTH_
> Length of the generated hash in bytes. Defaults to 64.

# DESCRIPTION

**grub2-mkpasswd-pbkdf2** generates hashed passwords for protecting GRUB 2 bootloader configuration. The output hash can be used in grub.cfg to password-protect boot entries or the GRUB command line.

PBKDF2 (Password-Based Key Derivation Function 2) provides strong protection against brute-force attacks by using multiple iterations and a random salt. The resulting hash is safe to store in configuration files.

# CAVEATS

Requires root privileges to run. The generated hash must be manually added to GRUB configuration. Higher iteration counts increase security but also boot-time password verification delay. On RHEL/Fedora the tool is named **grub2-mkpasswd-pbkdf2** to match the grub2 package naming; it is the same tool upstream calls **grub-mkpasswd-pbkdf2**.

# HISTORY

grub2-mkpasswd-pbkdf2 is part of GRUB 2. Password protection for GRUB was introduced to prevent unauthorized users from modifying boot parameters or accessing single-user mode. PBKDF2 replaced simpler hashing methods for improved security.

# SEE ALSO

[grub-mkconfig](/man/grub-mkconfig)(8), [grub-install](/man/grub-install)(8), [grub-editenv](/man/grub-editenv)(1)

# RESOURCES

```[Homepage](https://www.gnu.org/software/grub/)```

```[Source code](https://git.savannah.gnu.org/cgit/grub.git)```

```[Documentation](https://www.gnu.org/software/grub/manual/grub/grub.html)```

<!-- verified: 2026-07-17 -->
