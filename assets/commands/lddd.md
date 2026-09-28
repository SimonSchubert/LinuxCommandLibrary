# TAGLINE

Find binaries and libraries with broken shared library links

# TLDR

Scan the system for **broken library links**

```lddd```

Show the **packages** that may need a rebuild (path is printed at the end of the run)

```cat /tmp/lddd-script.[XXXX]/possible-rebuilds.txt```

# SYNOPSIS

**lddd**

# DESCRIPTION

**lddd** scans every directory in **$PATH**, plus **/lib**, **/usr/lib**, **/usr/local/lib** and the directories listed in **/etc/ld.so.conf.d/**, for ELF files. Each ELF file is run through **ldd**, and any file with a "not found" dependency is recorded.

The affected files are then mapped to their owning packages with **pacman -Qo**, giving a list of packages that probably need to be rebuilt, typically after a soname bump of a library. It takes no options or arguments.

All results are written to a temporary directory created with **mktemp** (for example **/tmp/lddd-script.XXXX**):

**raw.txt**
> Every affected file followed by the missing libraries.

**affected-files.txt**
> Paths of the affected files only.

**pacman.txt**
> Owning package name and version of each affected file.

**possible-rebuilds.txt**
> Sorted, de-duplicated list of packages that may need a rebuild.

# CAVEATS

Arch Linux specific; part of the **devtools** package. The scan runs **file** and **ldd** on every candidate file and can take a long time. Run it as a user that can read all scanned files, otherwise some may be skipped. Files not owned by any package (e.g. in /usr/local) show up in raw.txt but not in the package list.

# SEE ALSO

[ldd](/man/ldd)(1), [pacman](/man/pacman)(8), [devtools](/man/devtools)(1), [namcap](/man/namcap)(1), [checkupdates](/man/checkupdates)(8)

# RESOURCES

```[Source code](https://gitlab.archlinux.org/archlinux/devtools)```

```[Documentation](https://man.archlinux.org/man/lddd.1)```

<!-- verified: 2026-09-29 -->
