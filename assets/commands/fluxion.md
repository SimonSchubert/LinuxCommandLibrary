# TLDR

**Start Fluxion**

```fluxion```

**Run with language**

```fluxion -l [en]```

**Restore from session**

```fluxion --restore```

**Run specific attack**

```fluxion -a [handshake]```

# SYNOPSIS

**fluxion** [_options_]

# PARAMETERS

**-l** _LANGUAGE_
> Interface language.

**-a** _ATTACK_
> Attack type to launch.

**--restore**
> Restore previous session.

**-d**, **--debug**
> Enable debug mode.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**Fluxion** is a security auditing tool for testing WiFi network security through social engineering attacks. It creates rogue access points to capture WPA/WPA2 credentials.

The tool combines wireless scanning, deauthentication, and captive portal techniques. It presents victims with fake login pages to capture passwords, validating them against captured handshakes.

Fluxion automates complex wireless attack workflows into a menu-driven interface.

# CAVEATS

**Authorized testing only.** Requires compatible wireless hardware. Illegal to use without permission. Detection methods exist.

# HISTORY

Fluxion evolved from earlier WiFi auditing tools, providing an automated framework for security testing of wireless networks through social engineering vectors.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [wifite](/man/wifite)(1), [hostapd](/man/hostapd)(1)
