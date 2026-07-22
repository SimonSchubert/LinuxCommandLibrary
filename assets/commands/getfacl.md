# TAGLINE

file access control list viewer

# TLDR

**Show** ACL

```getfacl path/to/file```

Show with **numeric** IDs

```getfacl -n path/to/file```

**Tabular** output

```getfacl -t path/to/file```

# SYNOPSIS

**getfacl** [_OPTIONS_] _files_...

# DESCRIPTION

**getfacl** displays file access control lists (ACLs). ACLs provide more fine-grained access control than traditional Unix permissions, allowing permissions for specific users and groups beyond owner/group/other.

# PARAMETERS

**-n, --numeric**
> Display numeric user and group IDs

**-t, --tabular**
> Use tabular output format

**-a, --access**
> Display access ACL

**-d, --default**
> Display default ACL

**-R, --recursive**
> Recurse into directories

**-p, --absolute-names**
> Don't strip leading slashes

# CAVEATS

ACLs must be supported by the filesystem (mount with acl option). The default ACL only applies to directories and affects newly created files within. Use setfacl to modify ACLs.

# HISTORY

**getfacl** is part of the **acl** package, providing POSIX ACL support on Linux.

# INSTALL

```apt: sudo apt install acl```

```dnf: sudo dnf install acl```

```pacman: sudo pacman -S acl```

```apk: sudo apk add acl```

```zypper: sudo zypper install acl```

```brew: brew install acl```

```nix: nix profile install nixpkgs#acl```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[setfacl](/man/setfacl)(1), [chmod](/man/chmod)(1)

# RESOURCES

```[Homepage](https://savannah.nongnu.org/projects/acl/)```

```[Documentation](https://manpages.debian.org/getfacl)```

<!-- verified: 2026-07-15 -->
