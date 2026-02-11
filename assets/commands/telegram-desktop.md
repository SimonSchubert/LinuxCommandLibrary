# TAGLINE

Telegram messaging desktop client

# TLDR

**Start Telegram**

```telegram-desktop```

**Open with URL**

```telegram-desktop -- [tg://resolve?domain=username]```

**Start minimized**

```telegram-desktop -startintray```

**With working directory**

```telegram-desktop -workdir [~/.telegram]```

**Debug mode**

```telegram-desktop -debug```

# SYNOPSIS

**telegram-desktop** [_-startintray_] [_-workdir dir_] [_options_]

# PARAMETERS

**-startintray**
> Start minimized to tray.

**-workdir** _DIR_
> Data directory.

**-debug**
> Debug mode.

**-scale** _N_
> UI scale factor.

**--**
> Open URL.

# DESCRIPTION

**telegram-desktop** is the official desktop client for the Telegram messaging platform. It provides access to all Telegram features including text messages, voice and video calls, media sharing, and channels from a native desktop application.

The client supports group chats with up to 200,000 members, secret chats with end-to-end encryption, file transfers up to 2GB per file, and seamless synchronization across all devices. It is built with Qt and runs on Linux, macOS, and Windows, with data stored in a configurable working directory.

# CAVEATS

Account required. Internet needed. Qt-based application.

# HISTORY

**Telegram Desktop** is the official desktop client for **Telegram**, created by the Durov brothers' team.

# SEE ALSO

[signal-desktop](/man/signal-desktop)(1), [discord](/man/discord)(1)
