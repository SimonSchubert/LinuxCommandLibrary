# TLDR

**Mask** a flatpak to ignore updates

```flatpak mask [com.example.app]```

**Remove** a mask to allow updates again

```flatpak mask --remove [com.example.app]```

**List** all currently masked patterns (user installation)

```flatpak mask --user```

**List** all currently masked patterns (system installation)

```flatpak mask --system```

Mask all apps from a **specific domain**

```flatpak mask app/org.domain.*```

Mask a specific **branch** of an application

```flatpak mask [com.example.app]//unstable```

# SYNOPSIS

**flatpak mask** [_options_] [_pattern..._]

# PARAMETERS

**--remove**
> Remove specified mask patterns instead of adding them

**-u, --user**
> Apply mask to per-user installation

**--system**
> Apply mask to default system-wide installation

**--installation** _name_
> Target a specific named system installation

**-v, --verbose**
> Output debug information during processing

**-h, --help**
> Display help and exit

# DESCRIPTION

**Flatpak mask** prevents specified applications or extensions from being updated or automatically installed. A masked ref will never receive updates, and masked extensions marked for auto-download will not be downloaded.

Patterns support wildcards using **\*** to match content within ref sections. You can mask specific applications, entire domains, architecture-specific builds, or particular branches.

Running the command without patterns lists all current masks for the specified installation (user or system).

# CAVEATS

Masking prevents all updates including security patches. Use sparingly and remember to unmask applications when you want to receive updates again. Masks are stored separately for user and system installations.

# HISTORY

The mask feature was added to **Flatpak** to give users control over automatic updates, particularly useful for pinning specific versions or avoiding problematic releases. Flatpak itself was developed by Alexander Larsson at Red Hat, evolving from the xdg-app project around **2015**.

# SEE ALSO

[flatpak](/man/flatpak)(1), [flatpak-update](/man/flatpak-update)(1), [flatpak-install](/man/flatpak-install)(1)
