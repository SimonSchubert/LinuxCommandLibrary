# TAGLINE

Uninstall Flatpak applications and runtimes

# TLDR

**Uninstall** an application or runtime

```flatpak uninstall [com.example.app]```

Uninstall from the **per-user** installation

```flatpak uninstall --user [com.example.app]```

Uninstall and **delete app data** under `~/.var/app`

```flatpak uninstall --delete-data [com.example.app]```

Remove **unused** applications and runtimes

```flatpak uninstall --unused```

Delete data of apps that are **no longer installed**

```flatpak uninstall --delete-data```

Uninstall **without prompting**

```flatpak uninstall -y [com.example.app]```

Uninstall **everything**

```flatpak uninstall --all```

# SYNOPSIS

**flatpak uninstall** [_OPTIONS_] [_REF_...]

# PARAMETERS

_REF_
> Full or partial Flatpak ref, `(app|runtime)/ID/ARCH/BRANCH`. Every part except ID is optional. Fuzzy matching (for example `gedit` vs `org.gnome.gedit`) is disabled when the argument contains a slash or a period.

**-u**, **--user**
> Uninstall from the per-user installation.

**--system**
> Uninstall from the default system-wide installation.

**--installation**=_NAME_
> Uninstall from the named system-wide installation. **--installation=default** is the same as **--system**.

**--arch**=_ARCH_
> Architecture to uninstall instead of the host architecture.

**--app**
> Only look for an application.

**--runtime**
> Only look for a runtime.

**--unused**
> Remove unused refs.

**--all**
> Remove every ref on the system.

**--keep-ref**
> Keep the OSTree ref and objects in the local repository.

**--no-related**
> Do not uninstall related extensions such as locale data.

**--force-remove**
> Remove files even if a running application is using them.

**--delete-data**
> Remove app data in `~/.var/app` and in the permission store. With no _REF_, remove unowned app data.

**-y**, **--assumeyes**
> Answer yes to every prompt.

**--noninteractive**
> Minimal output; avoid most questions (for scripts).

**-h**, **--help**
> Show help and exit.

**-v**, **--verbose**
> Print debug information during command processing.

# DESCRIPTION

**flatpak uninstall** removes an installed application or runtime. It is a **flatpak** subcommand, not a separate binary. **flatpak remove** is an alias.

Without **--user**, **--system**, or **--installation**, the command searches both the system-wide and per-user installations and errors if the ref exists in more than one.

By default it deletes the ref from the local OSTree repository and purges objects that nothing else needs. Reinstalling later pulls those objects from the remote again unless **--keep-ref** was used.

# CAVEATS

System-wide uninstalls need root or polkit. If the same ID is installed as both app and runtime, pass **--app** or **--runtime**, or include that prefix in the ref. **--all** removes every ref in the selected installation. **--delete-data** without a ref deletes leftover data for apps that are already gone.

# INSTALL

```apt: sudo apt install flatpak```

```dnf: sudo dnf install flatpak```

```pacman: sudo pacman -S flatpak```

```apk: sudo apk add flatpak```

```zypper: sudo zypper install flatpak```

```nix: nix profile install nixpkgs#flatpak```

<!-- packages: 2026-11-12 -->

# SEE ALSO

[flatpak](/man/flatpak)(1), [flatpak-install](/man/flatpak-install)(1), [flatpak-update](/man/flatpak-update)(1), [flatpak-run](/man/flatpak-run)(1)

# RESOURCES

```[Documentation](https://docs.flatpak.org/en/latest/flatpak-command-reference.html#flatpak-uninstall)```

```[Source code](https://github.com/flatpak/flatpak)```

<!-- verified: 2026-11-12 -->
