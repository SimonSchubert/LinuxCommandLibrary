# TAGLINE

push, pull, and diff a local folder against Google Drive

# TLDR

**Initialize** a local folder as a Drive sync root (opens a browser for OAuth)

```dsync init [~/gdrive] --remote-folder [backups/lab] --credentials [~/Downloads/client_secret.json]```

Show **what differs** without transferring anything (exit 1 if anything differs)

```dsync diff```

**Upload** local changes (prints a plan and asks first)

```dsync push```

**Download** remote changes

```dsync pull```

Apply a plan **without prompting** (refused if the plan has conflicts)

```dsync push -y```

Also **remove** destination files that no longer exist on the source (Drive trash on push; permanent delete on Linux pull)

```dsync pull --delete```

Trust equal **size and mtime** instead of hashing (rsync-style quick check)

```dsync diff --fast```

Show **workspace** state (remote folder, depth, cache, token expiry)

```dsync status```

Refresh the **remote index** only

```dsync update-cache```

Print the **version**

```dsync version```

# SYNOPSIS

**dsync** **init** [_DIR_] [**--remote-folder** _P_] [**--credentials** _FILE_] [**--client-id** _ID_] [**--client-secret** _SECRET_] [**--depth** _N_]

**dsync** {**push** | **pull**} [_PATH_] [**-y**] [**--force**] [**-j** _N_] [**--refresh**] [**--fast** | **--verify**] [**--delete**]

**dsync** **diff** [_PATH_] [**-j** _N_] [**--refresh**] [**--fast** | **--verify**]

**dsync** {**status** | **update-cache** [**--refresh**] | **version**}

# COMMANDS

**init** [_DIR_]
> Authorize with Google Drive and turn _DIR_ (default **.**) into a sync folder mirroring **My Drive/**_P_. Writes **.gd/** inside the folder. **--remote-folder** _P_ is created if missing and defaults to the My Drive root. **--depth** _N_ limits how many levels to traverse (**-1**, the default, is unlimited). Supply a Desktop-app **client_secret.json** with **--credentials**, or **--client-id** and **--client-secret** together (also **GOOGLE_CLIENT_ID** / **GOOGLE_CLIENT_SECRET**).

**push** [_PATH_]
> Upload files that are new or newer locally. Shows the plan and asks first. _PATH_ is relative to the current directory and defaults to **.**.

**pull** [_PATH_]
> Download files that are new or newer on Drive. Same plan-and-confirm behaviour as **push**.

**diff** [_PATH_]
> List what differs, with both modification times. Changes nothing. Exit **1** if anything differs, **0** if the trees match, **2** on error.

**status**
> Print the local folder, remote folder, depth, cache state, ignore file, filesystem kind, and token expiry. Does not take the workspace lock.

**update-cache**
> Refresh the local index of the remote tree (incrementally, or fully with **--refresh**).

**version**
> Print `dsync <version> (https://scaleninja.com/drivesync/)`.

# PARAMETERS

**-y**, **--no-prompt**
> Apply the plan without asking. Refused if the plan contains conflicts. **push** / **pull** only.

**--force**
> Also overwrite conflicts where the destination is newer or has different content at the same mtime. Case / Unicode-normalization collisions are never forced. **push** / **pull** only.

**-j** _N_, **--threads** _N_
> Parallel transfer (or hashing) streams. Default **8**, range **1–64**.

**--refresh**
> Ignore the cached remote index and re-list the whole remote tree.

**--fast**
> Trust equal size and mtime without reading the file (rsync-style quick check). Conflicts with **--verify**.

**--verify**
> Re-read every file that needs hashing instead of trusting the local hash cache.

**--delete**
> After transfers succeed, remove from the destination whatever no longer exists on the source. **push** moves Drive entries to the Drive trash. **pull** moves local files to Trash (macOS) or Recycle Bin (Windows) and **deletes them permanently on Linux**. Off by default. **push** / **pull** only.

# DESCRIPTION

**dsync** is the command-line binary for **DriveSync**, a small Rust tool that keeps one local folder and one Google Drive folder in step. It is modelled on **odeke-em/drive**: you **push**, **pull**, or **diff** on demand rather than running a background sync daemon.

Run any command from anywhere inside the sync folder. Each side is compared as a set of paths with size, mtime, and MD5 (Drive returns MD5s in listings). Different sizes mean different content; otherwise the local MD5 is compared against a cache keyed on size and mtime. Equal MD5 wins over mtime. Different MD5 with a newer side (1 s tolerance) is a transfer; the same mtime with different content is a **conflict**.

Push and pull print one line per change (`+` create, `M` overwrite, `!` skipped, `C` conflict, `E` unreadable local file, `D` delete with **--delete**) and ask before doing anything. While conflicts exist the prompt defaults to **no**, **--no-prompt** refuses to run, and end-of-input is never taken as yes. Destinations are re-checked immediately before each write. Uploads over 5 MB use resumable sessions stored in **.gd/**. Google Docs, Sheets, and Slides have no binary content and are always skipped. Symlinks and non-regular files are never synced.

Exit status is **0** on success, **1** when **diff** found differences, and **2** on an error or when any transfer failed. Only one **dsync** command runs in a workspace at a time (even **diff** writes the index); a second one waits. **PATH** is taken in its on-disk spelling, so on a case-insensitive filesystem `push Docs` and `push docs` mean the same folder.

# CONFIGURATION

**.gd/**
> Per-workspace state inside the sync root (mode **0600** on Unix, never uploaded). Must be a real directory, not a symlink.

**.gd/config.json**
> Client id/secret, remote folder path and id, and traversal depth.

**.gd/credentials.json**
> OAuth tokens from **init**. Google expires refresh tokens after 7 days for External apps still in Testing; publish the consent-screen app for personal use to keep tokens.

**.gd/cache.db**
> SQLite index of the remote tree plus the local hash cache. Rebuilt automatically if damaged. Unreliable on NFS or SMB; keep the sync folder on a local disk.

**.driveignore**
> gitignore-style patterns at the sync root. **init** creates one with `.DS_Store`, `._*`, `Thumbs.db`, and `desktop.ini`.

**GOOGLE_CLIENT_ID** / **GOOGLE_CLIENT_SECRET**
> Alternative to **--client-id** / **--client-secret** when no **--credentials** file is given.

There is no global config file. Create a Desktop OAuth client in Google Cloud Console (enable the Drive API, External consent screen, add yourself as a test user) and pass the downloaded JSON to **init**. A Web-application client is rejected because the loopback redirect port is chosen at run time.

# CAVEATS

Linux and Windows binaries are built and smoke-tested in CI; the project documents live Drive testing on **macOS** only.

Two machines syncing the same Drive folder are not coordinated. The Drive API has no conditional update, so a write from elsewhere between the pre-write check and the upload can be lost.

**pull --delete** on Linux deletes local files permanently (no trash). An empty source is refused so **--delete** cannot wipe the destination. Deletions run last and only if every transfer succeeded.

Do not overwrite conflicts without **--force**. Pull keeps no local backup of files it overwrites. The hash cache trusts unchanged size and mtime; use **--verify** after restoring from backup or when a tool rewrites files with mtimes preserved.

The binary name is **dsync**; the project, Homebrew formula, and GitHub repo are named **drivesync**. Other unrelated tools also ship a `dsync` command.

# HISTORY

**DriveSync** is an MIT-licensed Rust CLI by **ScaleNinja**. The public repository was created on **7 September 2026**. It is an explicit successor in spirit to **odeke-em/drive** (2015): Git-style push/pull against Google Drive, with MD5 comparison, a Drive Changes-API index, and no background daemon. Version **0.4.1** is the crate version at documentation time.

# SEE ALSO

[rclone](/man/rclone)(1), [drive](/man/drive)(1), [gdrive](/man/gdrive)(1), [rsync](/man/rsync)(1)

# RESOURCES

```[Source code](https://github.com/scaleninja/drivesync)```

```[Homepage](https://scaleninja.com/drivesync/)```

```[Documentation](https://github.com/scaleninja/drivesync/blob/main/docs/SETUP.md)```

<!-- verified: 2026-09-08 -->
