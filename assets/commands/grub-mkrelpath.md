# TAGLINE

make a system path relative to its filesystem root for GRUB

# TLDR

Print the **GRUB-relative path** of a file

```grub-mkrelpath [/usr/share/grub/unicode.pf2]```

Print the GRUB path of a file on a **separately mounted** filesystem

```grub-mkrelpath [/mnt/partition/path/to/file]```

Show **help**

```grub-mkrelpath --help```

Print the GRUB **version**

```grub-mkrelpath --version```

# SYNOPSIS

**grub-mkrelpath** [_OPTION_ ...] _PATH_

# PARAMETERS

**-?**, **--help**
> Print a summary of the command-line options and exit

**--usage**
> Print a short usage message and exit

**-V**, **--version**
> Print the version number of GRUB and exit

# DESCRIPTION

**grub-mkrelpath** makes a filesystem path relative to the root of the filesystem that contains it. GRUB addresses files from the root of each filesystem, so a Linux path that includes a mount point is not the path GRUB uses.

For instance, if **/usr** is a mount point:

```grub-mkrelpath /usr/share/grub/unicode.pf2```

prints `/share/grub/unicode.pf2`.

Other GRUB utilities such as **grub-mkconfig** call it internally. Running it by hand is useful when debugging boot paths or checking how GRUB will see a file on a given partition.

# CAVEATS

The result is relative to the **containing filesystem**, not to `/`. A path on the root filesystem still has its leading `/` stripped only for the portion after that filesystem's root. The path must exist; otherwise the command fails.

# HISTORY

**grub-mkrelpath** is a user-space utility in **GRUB 2** (GRand Unified Bootloader). It is used while generating configuration so that paths remain valid when GRUB boots from a device whose Linux mount point is not `/`.

# INSTALL

```apt: sudo apt install grub-common```

```pacman: sudo pacman -S grub```

```apk: sudo apk add grub```

<!-- packages: 2026-10-08 -->

# SEE ALSO

[grub-mkconfig](/man/grub-mkconfig)(8), [grub-probe](/man/grub-probe)(1), [grub-install](/man/grub-install)(8)

# RESOURCES

```[Homepage](https://www.gnu.org/software/grub/)```

```[Documentation](https://www.gnu.org/software/grub/manual/grub/html_node/Invoking-grub_002dmkrelpath.html)```

```[Source code](https://git.savannah.gnu.org/cgit/grub.git)```

<!-- verified: 2026-10-08 -->
