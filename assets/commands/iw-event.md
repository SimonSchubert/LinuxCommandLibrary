# TAGLINE

Monitor wireless (nl80211) events from the kernel

# TLDR

**Monitor** all wireless events

```iw event```

**Print a timestamp** with each event

```iw event -t```

**Print a relative timestamp** with each event

```iw event -r```

**Also show frequency** information for events

```iw event -f```

# SYNOPSIS

**iw** **event** [_-t_] [_-r_] [_-f_]

# DESCRIPTION

**iw event** listens on the nl80211 multicast groups and prints wireless events as the kernel emits them. Typical events include scan results becoming available, (dis)connections, authentication and association state changes, regulatory-domain updates, and interface state transitions.

It runs until interrupted, making it useful for watching what happens during connection attempts or for debugging driver and supplicant behaviour in real time.

# PARAMETERS

**-t**
> Prefix each event with an absolute timestamp.

**-r**
> Prefix each event with a timestamp relative to the previous event.

**-f**
> Include frequency information in the event output.

# SEE ALSO

[iw](/man/iw)(8), [iwconfig](/man/iwconfig)(8), [wpa_supplicant](/man/wpa_supplicant)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/linux/kernel/git/jberg/iw.git)```

```[Documentation](https://wireless.wiki.kernel.org/en/users/documentation/iw)```

<!-- verified: 2026-06-10 -->
