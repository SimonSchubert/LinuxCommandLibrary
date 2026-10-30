# TAGLINE

Sync browser profiles into tmpfs and periodically back to disk

# TLDR

**Preview** which browser profiles will be managed and their current state

```psd preview```

**Start** the user service (symlink profiles into tmpfs)

```systemctl --user start psd.service```

**Stop** the service and copy profiles back to disk

```systemctl --user stop psd.service```

**Enable** the service so it starts with the user session

```systemctl --user enable --now psd.service```

**Delete** every crash-recovery snapshot without prompting

```psd clean```

**Recover** profiles left by a crash or a failed stop

```psd recover```

# SYNOPSIS

**psd** [_preview_ | _clean_ | _recover_ | _sync_ | _resync_ | _unsync_]

# DESCRIPTION

**psd** (Profile-sync-daemon) manages browser profile directories in tmpfs and periodically copies them back to disk with **rsync**. Browser I/O then hits RAM instead of the physical disk, which reduces wear and can make the browser feel faster. The usual way to run it is the systemd user unit **psd.service**; an hourly **psd-resync.timer** starts with that unit.

From v7.00 the only supported mode is overlayfs: a read-only base copy of the profile stays on disk, and new writes live in a fuse-overlayfs mount under `$XDG_RUNTIME_DIR/psd/`. Crash recovery keeps timestamped snapshots next to the real profile. The daemon refuses to start if a target profile is a symlink, if two profiles would share the same tmpfs directory name, or if a managed browser is still running.

The package is a bash script plus systemd units. It is intended for Linux with systemd. Backup profiles before the first run.

# COMMANDS

**preview**, **p**, **parse**, **debug**
> Print which profiles the config will manage, their sizes, tmpfs paths, overlayfs sizes, systemd state, and any crash-recovery snapshots.

**clean**, **c**
> Delete every crash-recovery snapshot for every managed profile, including copies ending in **-unused**. There is no prompt.

**recover**
> Finish an interrupted stop or a crash: copy remaining overlay writes to disk if they are still in memory, then put the last good copy back. **psd.service** runs this after every stop.

**sync**, **resync**
> Copy tmpfs back to disk (or perform the initial overlay mount if psd is not yet running). Prefer **systemctl --user start psd.service** and the resync timer over calling this by hand.

**unsync**
> Copy tmpfs back to disk, unmount overlays, and restore the original profile directories. Prefer **systemctl --user stop psd.service**.

**startup**, **suspend-sync**
> Internal targets used by **psd.service** and the suspend helper. Not meant to be typed at a shell.

# CONFIGURATION

User settings live in `$XDG_CONFIG_HOME/psd/psd.conf` (usually `~/.config/psd/psd.conf`). Edits apply the next time psd starts. Diff this file against `/usr/share/psd/psd.conf` after package upgrades.

**BROWSERS**
> Optional bash array of browser ids to manage. If unset, every detected supported browser is managed. Values include **chromium**, **firefox**, **firefox-flatpak**, **google-chrome**, **opera**, **qutebrowser**, **vivaldi**, and others listed in the default config.

**USE_BACKUPS**
> Crash-recovery snapshots. Default **yes**. Set to **no** to disable them.

**BACKUP_LIMIT**
> How many timestamped crash-recovery snapshots to keep (oldest deleted first). Default **5**. Copies ending in **-unused** are never rotated; remove them with **psd clean**.

**USE_SUSPSYNC**
> If **yes**, resync on suspend (needs **gdbus** from glib2). Default **no**.

**FIREJAIL**
> Set to **1** when using Firejail so psd can use a fuse-overlayfs mount. Also uncomment **user_allow_other** in `/etc/fuse.conf`.

# CAVEATS

Do not use psd on eCryptFS home directories; several cases of profile corruption have been reported.

Close every managed browser before starting the service. psd refuses to start while they run.

Symlinked profiles are not supported. For Firefox, point `profiles.ini` at the real path with **IsRelative=0** instead of replacing the profile directory with a symlink.

Two profiles whose paths end in the same directory name (for example two `default` dirs) cannot share one tmpfs name; rename one before starting.

tmpfs size is capped by **RuntimeDirectorySize** in logind.conf (default 10% of RAM). Only used pages are consumed.

Calling **sync** / **unsync** by hand is discouraged; use the systemd user unit. After a crash, inspect snapshots named like `~/.config/chromium-backup-crashrecovery-YYYYMMDD_HHMMSS` before deleting anything.

Firefox Flatpak needs a one-time filesystem override: `flatpak override --user org.mozilla.firefox --filesystem=/run/user/$UID/psd`.

# INSTALL

```apt: sudo apt install profile-sync-daemon```

```dnf: sudo dnf install profile-sync-daemon```

```pacman: sudo pacman -S profile-sync-daemon```

```zypper: sudo zypper install profile-sync-daemon```

```nix: nix profile install nixpkgs#profile-sync-daemon```

<!-- packages: 2026-10-30 -->

# SEE ALSO

[rsync](/man/rsync)(1), [systemctl](/man/systemctl)(1), [firefox](/man/firefox)(1), [chromium](/man/chromium)(1), [fusermount](/man/fusermount)(1), [firejail](/man/firejail)(1), [gdbus](/man/gdbus)(1)

# RESOURCES

```[Source code](https://github.com/graysky2/profile-sync-daemon)```

```[Documentation](https://wiki.archlinux.org/title/Profile-sync-daemon)```

<!-- verified: 2026-10-30 -->
