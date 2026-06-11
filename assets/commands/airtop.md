# TAGLINE

Live 802.11 Wi-Fi RF dashboard in the terminal using eBPF (htop for the airwaves)

# TLDR

Launch the live Wi-Fi spectrum dashboard

```airtop```

Run with SSIDs and MACs anonymized (great for screenshots)

```airtop --anonymize```

Force a Wi-Fi scan from another terminal to populate neighboring networks

```nmcli dev wifi rescan```

# SYNOPSIS

**airtop** [_options_]

# DESCRIPTION

**airtop** turns the Wi-Fi traffic your Linux kernel is already seeing into a beautiful, real-time terminal dashboard. It shows:

- A frequency spectrum of nearby access points with signal strength
- Per-station RSSI traces over time (braille graphs)
- A live heatmap of frame types (beacons, data, deauth, etc.)
- RSSI histogram and a rolling list of discovered networks

It does **not** require monitor mode or raw sockets. It attaches eBPF programs to the normal `cfg80211`/`mac80211` stack, so your interface stays associated and you keep your connection.

This makes airtop extremely practical for everyday debugging: "why is my video call dropping?", "which channel should I use for the demo?", "is someone sending deauth frames?"

# PARAMETERS

**--anonymize**  
> Replace real SSIDs and MAC addresses with stable pseudonyms (network-01, station-02, ...)

The dashboard is fully interactive: resize the terminal and the layout reflows. Minimum recommended size is 80×24.

# CAVEATS

- Only sees traffic on the channel your interface is currently on (plus brief glimpses during background scans).
- Counts frames, not airtime or bytes.
- Requires a reasonably modern Linux kernel with BTF enabled (most current distros).

# SEE ALSO

[iw](/man/iw)(8), [nmcli](/man/nmcli)(1), [kismet](/man/kismet)(1)
