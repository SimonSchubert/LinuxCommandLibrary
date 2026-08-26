# TAGLINE

pair an iPhone with a Linux Wayland desktop for clipboard, files, and messages

# TLDR

Print remaining **Bluetooth** system setup commands

```tether --bt-setup```

Start **Wi-Fi** pairing

```tether pair```

List nearby Bluetooth **devices**

```tether --bt-devices```

**Pair** over Bluetooth (messages and notifications)

```tether --bt-pair [address]```

Show Bluetooth **connection** status

```tether --bt-connection```

# SYNOPSIS

**tether** [_command_ | _options_]

# COMMANDS

**pair**
> Wi-Fi / mDNS pairing with the iOS app (mTLS).

**--bt-setup**
> Print only the BlueZ/systemd steps this machine still needs. Tether never applies them itself.

**--bt-devices**
> List Bluetooth addresses for pairing.

**--bt-pair** _address_
> Pair the iPhone over Bluetooth.

**--bt-connection**
> Show what is up and what is not.

# DESCRIPTION

**tether** is the CLI for the Tether Linux companion: clipboard sync, file drop, SMS/iMessage, and notification mirroring with an iPhone. A daemon (**tetherd**) owns Wayland (`wlr-data-control`), Avahi, TLS, and BlueZ. **tether-gtk** is the GUI. The CLI also talks to **tetherd** for the Firefox/Thunderbird WebExtension (native messaging, OTP autofill).

Wi-Fi pairing uses the App Store app **Tether - Linux Companion**. Messages and notifications use Bluetooth; enable "Show Message Notifications" and "Sync Contacts" on the phone after pairing (iOS 18 and earlier lack notification mirroring).

# CAVEATS

Needs a compositor with **wlr-data-control** (Sway, Hyprland, and similar). Bluetooth path wants BlueZ 5.86+ with the experimental bearer API; **tether --bt-setup** prints the drop-in. GTK UI and daemon are installed together (`make install` or Arch `tether`).

# HISTORY

MIT project by zackb. Packages exist for Arch; source builds on Debian/Ubuntu and Fedora.

# SEE ALSO

[wl-copy](/man/wl-copy)(1), [bluetoothctl](/man/bluetoothctl)(1)

# RESOURCES

```[Source code](https://github.com/zackb/tether)```

<!-- verified: 2026-08-26 -->
