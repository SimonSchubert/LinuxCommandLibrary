# TAGLINE

Terminal dashboard for AdGuard Home

# TLDR

**Launch and enter connection details** at the interactive prompts

```adguardian```

**Launch the dashboard** with connection details

```ADGUARD_IP="192.168.1.1" ADGUARD_PORT="3000" ADGUARD_USERNAME="admin" ADGUARD_PASSWORD="pass" adguardian```

**Launch with command-line flags**

```adguardian --adguard-ip [192.168.1.1] --adguard-port [3000] --adguard-username [admin] --adguard-password [pass]```

**Run via Docker**

```docker run -e ADGUARD_IP=192.168.1.1 -e ADGUARD_PORT=3000 -e ADGUARD_USERNAME=admin -e ADGUARD_PASSWORD=pass -it lissy93/adguardian```

# SYNOPSIS

**adguardian** [_options_]

# PARAMETERS

**--adguard-ip** _address_
> IP address of the AdGuard Home instance

**--adguard-port** _port_
> Port number of the AdGuard Home instance

**--adguard-username** _user_
> Authentication username

**--adguard-password** _pass_
> Authentication password

# DESCRIPTION

**adguardian-term** is a terminal-based real-time traffic monitoring and statistics dashboard for AdGuard Home instances. It displays DNS query activity, block/allow statistics, active filter lists, and top queried domains in an interactive TUI. Written in Rust using ratatui for the interface, it communicates with the AdGuard Home API to provide a lightweight alternative to the web UI.

The dashboard refreshes automatically and shows queries allowed, filtered, or blocked, along with historical trends and domain analytics.

# CONFIGURATION

Configuration can be set via environment variables or command-line flags. Supported environment variables: **ADGUARD_IP**, **ADGUARD_PORT**, **ADGUARD_USERNAME**, **ADGUARD_PASSWORD**, **ADGUARD_PROTOCOL** (default: http), **ADGUARD_UPDATE_INTERVAL** (default: 2 seconds), **ADGUARD_TIMEOUT** (per-request timeout, default: 5 seconds), and **ADGUARD_QUERYLOG_LIMIT** (query log entries fetched per update, default: 100). The protocol, interval, timeout and query log limit have no command-line flags.

# CAVEATS

Requires a running AdGuard Home instance, version 0.107.29 or later, with API access. Any connection details not given by environment variable or flag are prompted for at startup. Besides the configured AdGuard Home instance, the tool contacts crates.io to check for a newer release. GL.iNet routers running AdGuard Home in **--glinet** mode do not accept a username and password, so authentication fails there.

# HISTORY

**adguardian-term** was created by **Alicia Sykes** (Lissy93) and is open-source under the MIT license. It was originally written in Go and later rewritten in Rust. The project was inspired by **PADD**, a similar dashboard for Pi-hole.

# SEE ALSO

[pihole](/man/pihole)(1), [htop](/man/htop)(1)

# RESOURCES

```[Homepage](https://adguardian.as93.net/)```

```[Source code](https://github.com/lissy93/AdGuardian-Term)```

<!-- verified: 2026-11-09 -->
