# TAGLINE

update installed Flatpak applications and runtimes

# TLDR

**Update all** installed applications and runtimes

```flatpak update```

Update all and **auto-confirm** prompts

```flatpak update -y```

Update a **specific application**

```flatpak update [com.example.app]```

**Downgrade** to a specific commit

```flatpak update --commit [COMMIT_HASH] [com.example.app]```

Update only **user installations**

```flatpak update --user```

Update only **system installations**

```flatpak update --system```

**Download** updates without deploying

```flatpak update --no-deploy```

# SYNOPSIS

**flatpak update** [_options_] [_ref..._]

**flatpak update** [_options_] **--appstream** [_remote_]

# PARAMETERS

**-u, --user**
> Update per-user installations

**--system**
> Update system-wide installations

**--commit** _commit_
> Update to a specific commit (can downgrade)

**--no-pull**
> Deploy locally available versions without downloading

**--no-deploy**
> Download updates without deploying them

**--app**
> Only update applications

**--runtime**
> Only update runtimes

**-y, --assumeyes**
> Automatically answer yes to all prompts

**--noninteractive**
> Minimal output for scripting/automation

**--appstream** [_remote_]
> Update appstream metadata for remotes

**-v, --verbose**
> Output debug information

# DESCRIPTION

**Flatpak update** updates applications and runtimes to their latest versions from configured remotes. Without arguments, it updates everything including appstream metadata for all remotes.

References follow the format **(app|runtime)/ID/ARCH/BRANCH**, where most elements are optional. The tool automatically resolves partial references.

The command offers to uninstall unused end-of-life runtimes while preserving those explicitly installed or pinned. Use **--commit** to update or downgrade to a specific version identified by its commit hash.

# CAVEATS

Updates may require significant download bandwidth and disk space. Using **--commit** to pin specific versions prevents automatic security updates. The **--no-deploy** option is useful for pre-downloading updates on slow connections. Masked applications (via **flatpak mask**) are skipped during updates.

# HISTORY

Part of the **Flatpak** project developed by Alexander Larsson at Red Hat. Flatpak evolved from the xdg-app project around **2015** and provides a sandboxed, distribution-agnostic application delivery system for Linux.

# SEE ALSO

[flatpak](/man/flatpak)(1), [flatpak-install](/man/flatpak-install)(1), [flatpak-mask](/man/flatpak-mask)(1), [flatpak-remote-info](/man/flatpak-remote-info)(1)
