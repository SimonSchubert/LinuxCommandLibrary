# TAGLINE

graphical client for the Soulseek peer-to-peer file sharing network

# TLDR

**Start Nicotine+**

```nicotine```

**Start with headless mode**

```nicotine --headless```

**Start minimized to tray**

```nicotine --hidden```

**Specify configuration directory**

```nicotine --config [/path/to/config]```

**Show version**

```nicotine --version```

# SYNOPSIS

**nicotine** [_--headless_] [_--hidden_] [_--config dir_] [_options_]

# PARAMETERS

**--headless**, **-s**
> Run without GUI.

**--hidden**, **-t**
> Start minimized to tray.

**-c** _DIR_, **--config** _DIR_
> Configuration directory.

**-u** _USER_, **--user** _USER_
> Username for login.

**-p** _PASS_, **--password** _PASS_
> Password for login.

**--rescan**
> Rescan shared files.

**--version**, **-v**
> Show version.

**--help**, **-h**
> Show help.

# DESCRIPTION

**Nicotine+** is a graphical client for the Soulseek peer-to-peer file sharing network. It enables searching, downloading, and sharing files with other Soulseek users.

The network specializes in music, particularly rare and obscure recordings. Users share their collections and browse others' libraries.

Search finds files across the network. Results show file details, user status, and download slots. Queue management handles multiple downloads.

Chat rooms and private messaging enable community interaction. Users discuss music, share recommendations, and coordinate trades.

Shared folders define what you offer to others. Upload limits and slot management control bandwidth usage.

Headless mode runs without GUI, useful for dedicated sharing servers.

# CAVEATS

Requires Soulseek network account. Network has its own culture and expectations about sharing. File verification is user responsibility. Some content may be copyrighted.

# HISTORY

**Nicotine+** is a fork of the original Nicotine client, which was created as an open-source Soulseek client in the early **2000s**. Nicotine+ has been actively maintained since **2020**, modernizing the codebase and adding features.

# SEE ALSO

[soulseekqt](/man/soulseekqt)(1), [transmission](/man/transmission)(1), [deluge](/man/deluge)(1)
