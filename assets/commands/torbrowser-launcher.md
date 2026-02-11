# TAGLINE

Download and launch Tor Browser

# TLDR

**Launch Tor Browser**

```torbrowser-launcher```

**Open settings dialog**

```torbrowser-launcher --settings```

**Check for updates**

```torbrowser-launcher```

# SYNOPSIS

**torbrowser-launcher** [_options_]

# PARAMETERS

**--settings**
> Open the Tor Browser Launcher Settings dialog.

**--help**
> Display help information.

# DESCRIPTION

**torbrowser-launcher** downloads, installs, and launches the Tor Browser on Linux. On first run, it downloads the latest Tor Browser from the Tor Project, verifies the signature, and installs it in the user's home directory.

Subsequent runs check for updates and launch the browser. The launcher handles downloading the correct version for your architecture and language, and preserves bookmarks and preferences across updates.

The settings dialog allows configuring the download mirror, whether to use the system Tor service for downloads, and other options.

Tor Browser enables anonymous web browsing by routing traffic through the Tor network, encrypting connections and hiding the user's IP address.

# CAVEATS

First launch requires internet connection to download Tor Browser. Downloads may take time depending on network speed. Some networks block Tor; use bridges in settings if needed. Signature verification requires GPG.

# HISTORY

**torbrowser-launcher** was created by Micah Lee to simplify Tor Browser installation on Linux. It addresses security concerns of manual installation by automating signature verification. The launcher is widely packaged in Linux distributions including Debian, Ubuntu, and Fedora.

# SEE ALSO

[tor](/man/tor)(1), [firefox](/man/firefox)(1), [gpg](/man/gpg)(1)
