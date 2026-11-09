# TAGLINE

Manage VirtualBox extension packs

# TLDR

**Install an extension pack**

```vboxmanage extpack install [extension.vbox-extpack]```

**Install and replace an existing version**

```vboxmanage extpack install --replace [extension.vbox-extpack]```

**Install non-interactively** by accepting the license with its SHA-256 hash

```vboxmanage extpack install --accept-license=[sha256] [extension.vbox-extpack]```

**Uninstall an extension pack by name**

```vboxmanage extpack uninstall "[Oracle VirtualBox Extension Pack]"```

**Force uninstall an extension pack**

```vboxmanage extpack uninstall --force "[Oracle VirtualBox Extension Pack]"```

**List installed extension packs**

```vboxmanage list extpacks```

**Clean up temporary files from failed operations**

```vboxmanage extpack cleanup```

# SYNOPSIS

**vboxmanage** **extpack** _command_ [_options_]

# PARAMETERS

**install** [**--replace**] [**--accept-license=**_sha256_] _tarball_
> Install an extension pack from the specified file. Fails if an older version is already installed unless --replace is used.

**uninstall** [**--force**] _name_
> Uninstall an extension pack by name. Succeeds even if the pack is not present.

**cleanup**
> Remove temporary files and directories left behind by failed install or uninstall operations.

**--replace**
> Used with install. Uninstall any existing version before installing the new one.

**--accept-license=**_sha256_
> Used with install. Accept the license text with the given SHA-256 hash, which VBoxManage displays during a manual installation.

**--force**
> Used with uninstall. Override most refusals to uninstall an extension pack.

# DESCRIPTION

**vboxmanage extpack** manages VirtualBox extension packs. Extension packs add features like USB 2.0/3.0, VirtualBox RDP, and disk encryption. Installing or uninstalling extension packs typically requires administrator privileges.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-list](/man/vboxmanage-list)(1)

# RESOURCES

```[Source code](https://github.com/VirtualBox/virtualbox)```

```[Homepage](https://www.virtualbox.org/)```

```[Documentation](https://www.virtualbox.org/manual/topics/vboxmanage.html)```

<!-- verified: 2026-11-09 -->
