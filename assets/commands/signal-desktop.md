# TLDR

**Start Signal Desktop**

```signal-desktop```

**Start minimized** to system tray

```signal-desktop --start-in-tray```

**Use a custom profile** with separate user data

```signal-desktop --user-data-dir=[~/.config/SignalProfile]```

**Enable system tray** icon

```signal-desktop --use-tray-icon```

**Start with DevTools open** for debugging

```signal-desktop --enable-dev-tools```

# SYNOPSIS

**signal-desktop** [_options_]

# PARAMETERS

**--start-in-tray**
> Start Signal with the window minimized to the system tray.

**--use-tray-icon**
> Display an icon in the system tray. Allows minimizing to tray instead of exiting the app.

**--user-data-dir=**_PATH_
> Use a custom user data directory. Useful for running multiple Signal profiles or managing multiple phone numbers.

**--enable-dev-tools**
> Start with Chromium DevTools panel open for debugging.

**--no-sandbox**
> Disable Chromium sandboxing (not recommended for security).

**--proxy-server=**_URL_
> Use a proxy server for network connections.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**signal-desktop** is the official Signal Private Messenger desktop application for Linux. It provides end-to-end encrypted messaging, voice calls, and video calls synchronized with the Signal mobile app. The desktop client requires Signal to first be installed and set up on a mobile phone, which acts as the primary device.

The application is built on Electron and provides a full-featured messaging interface including group chats, disappearing messages, reactions, and file sharing. Messages are synchronized across linked devices using Signal's secure protocol.

Signal Desktop can be installed via the official APT repository on Debian-based distributions, as a Snap package, or as a Flatpak.

# CAVEATS

Signal Desktop requires linking to an existing Signal account on a mobile device. The desktop app cannot be used as a standalone client. When using **--user-data-dir** for multiple profiles, each profile must be linked to a different phone number. Some features may require the mobile app to be online periodically for synchronization.

# HISTORY

**Signal Desktop** was originally released in **2015** as a Chrome app before transitioning to a standalone Electron application in **2017**. Signal itself evolved from TextSecure, developed by Open Whisper Systems (founded by Moxie Marlinspike in **2013**). The Signal Protocol for end-to-end encryption has been adopted by numerous other messaging platforms. In **2018**, the Signal Foundation was established as a non-profit to support Signal's development. The desktop client continues active development with regular security updates.

# SEE ALSO

[signal-cli](/man/signal-cli)(1), [telegram-desktop](/man/telegram-desktop)(1), [element-desktop](/man/element-desktop)(1)
