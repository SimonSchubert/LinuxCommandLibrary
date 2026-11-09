# TAGLINE

end-to-end encrypted cloud storage CLI

# TLDR

**Start interactive mode**

```filen```

**List a directory** in long format

```filen ls -l [/Documents]```

**Upload a file or directory to the cloud**

```filen upload [local_path] [/cloud/path]```

**Download a file or directory from the cloud**

```filen download [/cloud/path] [local_destination]```

**Keep a local directory in sync** until Ctrl-C

```filen sync [~/Documents]:[/Documents]```

**Run a one-way backup once**

```filen sync --once [~/Photos]:localBackup:[/Backup/Photos]```

**Mount the drive** as a network drive

```filen mount```

**Serve the drive over WebDAV** on 127.0.0.1:1900

```filen serve webdav```

**Show the logged-in account**

```filen whoami```

# SYNOPSIS

**filen** [_options_] [_command_] [_arguments_]

# PARAMETERS

**upload** _SOURCE_ [_PATH_...]
> Upload local files or directories to the cloud. Use **-** to upload standard input.

**download** _SOURCE_ [_PATH_...]
> Download files or directories, or the target of a public link URL. Use **-** as destination for standard output.

**ls** [_PATH_]
> List directory contents.

**sync** _LOCAL_[:_MODE_]:_REMOTE_
> Synchronize directories, continuously by default. Use **--once** for a single run. Modes include two-way and one-way variants such as **localBackup**.

**mount** [_MOUNT_POINT_]
> Mount the drive as a network drive using a managed Rclone (default: /tmp/filen).

**serve** _TYPE_
> Serve the drive over WebDAV, S3, FTP, SFTP, HTTP, restic, or NFS.

**rclone** _COMMAND_
> Run any Rclone command with the drive available as the **filen** remote.

**mkdir** _PATH_
> Create a directory in the cloud.

**rm** _PATH_
> Move a file or directory to the trash. Use **-p** to delete permanently.

**mv** _FROM_ _TO_
> Move a file or directory.

**cp** _FROM_ _TO_
> Copy a file or directory.

**stat** _PATH_
> Display information about a file or directory.

**cat**, **head**, **tail**, **touch**, **write**, **edit**, **open**, **tree**, **du**, **search**, **versions**
> Further file operations.

**public-link** _PATH_
> Create or edit a public link.

**whoami**
> Print the email of the logged-in account.

**logout**
> Delete saved credentials and exit.

**export-auth-config** [_PATH_]
> Export an auth config for use with **--auth-config-path**.

**-e**, **--email** _EMAIL_
> Filen account email (requires **--password**). Also set by **FILEN_CLI_EMAIL**.

**-p**, **--password** _PASSWORD_
> Filen account password, given before the command. Also set by **FILEN_CLI_PASSWORD**.

**-t**, **--two-factor-code** _CODE_
> Two-factor code or recovery key, given before the command. Also set by **FILEN_CLI_2FA_CODE**.

**--auth-config-path** _FILE_
> Use an exported auth config file.

**--json**
> Format command output as JSON where applicable.

**-y**, **--yes**
> Answer yes to every yes/no question.

**--no-input**
> Never prompt: fail where a prompt would be needed.

**-v**, **--verbose**
> Increase verbosity (-v, -vv, -vvv).

**-q**, **--quiet**
> Hide progress bars and other non-essential output.

**--working-path** _PATH_
> Initial working path for the REPL or non-interactive commands (default: /).

**--config-dir**, **--data-dir** _PATH_
> Override the default configuration directory.

**--profile** _NAME_
> Use a separate profile with its own login, cache, and logs.

**--skip-update**
> Skip checking for updates.

**--upload-bandwidth-kbps** _N_, **--download-bandwidth-kbps** _N_
> Cap upload or download bandwidth in kilobytes per second.

**--help** [_TOPIC_]
> Display help about a command or topic.

# DESCRIPTION

**filen** is the command-line interface for Filen, an end-to-end encrypted cloud storage service. It provides file management, upload, download, synchronization, network drive mounting, and local servers for your drive, with zero-knowledge encryption.

All files are encrypted client-side before upload, ensuring the server never has access to unencrypted data. The CLI enables scripted backups and file management without the desktop app.

When invoked without any command, filen enters interactive mode, a REPL with tab completion. Credentials are requested when needed, or can be given with **--email** and **--password**, the environment variables above, or an exported auth config.

# CAVEATS

Requires Filen account. Encryption adds processing overhead. Storage limits depend on subscription. The current CLI is the Rust rewrite and is in public beta, so commands and output may still change between releases. The older TypeScript CLI (last supported version v0.0.36) has been sunset; it used different syntax, such as **sync --continuous**, the **webdav** and **s3** commands, and **rm --no-trash**. **mount** and **serve** download and configure a managed Rclone.

# HISTORY

filen is the CLI for **Filen**, a German cloud storage service emphasizing privacy through end-to-end encryption. The original TypeScript CLI was sunset in favor of a rewrite in Rust, developed in the filen-rs repository.

# SEE ALSO

[rclone](/man/rclone)(1), [aws](/man/aws)(1), [gsutil](/man/gsutil)(1)

# RESOURCES

```[Source code](https://github.com/FilenCloudDienste/filen-rs/tree/main/filen-cli)```

```[Homepage](https://filen.io/)```

```[Documentation](https://docs.filen.io/docs/cli-rs/readme/)```

<!-- verified: 2026-11-09 -->
