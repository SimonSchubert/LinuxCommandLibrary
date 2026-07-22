# TAGLINE

command-line client for Google Drive

# TLDR

**Initialize drive in directory**

```drive init [~/gdrive]```

**Pull files from Google Drive**

```drive pull [path/to/file]```

**Push files to Google Drive**

```drive push [path/to/file]```

**List files in Google Drive**

```drive list```

**Pull all changes**

```drive pull -all```

**Push with force**

```drive push -force [path]```

**Show differences**

```drive diff [path]```

# SYNOPSIS

**drive** _command_ [_options_] [_path_]

# PARAMETERS

**init**
> Initialize drive context in directory.

**pull** [_path_]
> Download files from Google Drive.

**push** [_path_]
> Upload files to Google Drive.

**list** [_path_]
> List files and directories.

**diff** [_path_]
> Show differences between local and remote.

**trash** [_path_]
> Move files to trash.

**untrash** [_path_]
> Restore files from trash.

**delete** [_path_]
> Permanently delete files.

**-all**
> Apply operation to all files.

**-force**
> Force operation without confirmation.

**-no-prompt**
> Disable confirmation prompts.

**-depth** _n_
> Limit directory traversal depth.

# DESCRIPTION

**drive** is a command-line client for Google Drive that deliberately borrows Git's model: you **pull** and **push** rather than letting a daemon sync in the background. Nothing moves until you say so, which is the whole appeal for anyone who has watched an automatic sync client propagate a mistake.

`drive init` creates a context directory (`.gd/`) that marks a local folder as the root of a Drive mirror, much as `.git/` marks a repository. Subsequent commands compare local state against the remote and report what would change; `drive diff` shows the differences without transferring anything.

Note that its flags are Go-style **single-dash** long options: `-force`, `-no-prompt`, `-depth`, not `--force`. This trips up people who expect GNU conventions.

# CAVEATS

The project is **effectively dormant**: the last upstream commit was in early **2024**, and Google's Drive API and OAuth requirements have continued to move. New installations often stumble on OAuth setup, which now expects you to register your own client credentials in a Google Cloud project rather than use a bundled key.

For most people **rclone** is the better tool today: it is actively maintained, handles Drive alongside dozens of other backends, supports server-side copies and encryption, and has a far more capable sync engine.

There is no conflict resolution to speak of. When a file has changed on both sides, drive asks, and `-force` simply overwrites, so a careless push can discard remote edits. Google Docs, Sheets, and Slides are not real files and cannot be pulled as-is; they must be exported to a concrete format.

# HISTORY

drive was written by **Emmanuel Odeke** in **2015**, at a time when Google shipped no official Drive client for Linux at all and the alternatives were FUSE mounts that tended to hang. Its Git-like explicit push/pull model was a direct reaction to the automatic sync clients on other platforms, and it earned a large following on that basis. It has since been overtaken by rclone, which covers the same ground and much more.

# INSTALL

```nix: nix profile install nixpkgs#drive```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[rclone](/man/rclone)(1), [gdrive](/man/gdrive)(1), [rsync](/man/rsync)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/odeke-em/drive)```

<!-- verified: 2026-07-14 -->

