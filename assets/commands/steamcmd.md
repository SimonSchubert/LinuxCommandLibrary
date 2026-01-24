# TLDR

**Start interactive mode**

```steamcmd```

**Login anonymously**

```steamcmd +login anonymous```

**Install game server**

```steamcmd +login anonymous +app_update [740] +quit```

**Install to directory**

```steamcmd +force_install_dir [/path/to/server] +login anonymous +app_update [740] +quit```

**Validate installation**

```steamcmd +login anonymous +app_update [740] validate +quit```

**Login with credentials**

```steamcmd +login [username] [password]```

# SYNOPSIS

**steamcmd** [_+command_]...

# PARAMETERS

**+login** _USER_ [_PASS_]
> Login to Steam.

**+app_update** _APPID_
> Install/update app.

**+force_install_dir** _PATH_
> Installation directory.

**+quit**
> Exit after commands.

**+validate**
> Verify files.

**+app_info_print** _APPID_
> Show app info.

**+workshop_download_item** _APPID_ _ITEMID_
> Download workshop item.

# DESCRIPTION

**steamcmd** is Steam's command-line client. It manages dedicated game servers.

Anonymous login works for many servers. Some require Steam account ownership.

App IDs identify games and servers. Different from store IDs sometimes.

Batch mode chains commands with +. Each + starts a new command.

Validation checks file integrity. Repairs corrupted installations.

# COMMON APP IDS

**740** - Counter-Strike: Global Offensive
**232250** - Team Fortress 2
**258550** - Rust
**376030** - ARK

# CAVEATS

Some apps require game ownership. Downloads can be large. SteamGuard may require codes.

# HISTORY

**SteamCMD** was released by **Valve** for headless server management. It enables automated game server deployment without the full Steam client.

# SEE ALSO

[steam](/man/steam)(1), [screen](/man/screen)(1), [tmux](/man/tmux)(1)
