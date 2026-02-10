# TAGLINE

detects internet censorship and network interference

# TLDR

**Run all tests**

```ooniprobe run```

**Run specific test**

```ooniprobe run [websites]```

**List available tests**

```ooniprobe list```

**Show results**

```ooniprobe list results```

**Upload pending results**

```ooniprobe upload```

**Show version**

```ooniprobe version```

# SYNOPSIS

**ooniprobe** [_options_] _command_ [_args_]

# PARAMETERS

**run**
> Run network tests.

**list**
> List tests or results.

**upload**
> Upload pending results.

**version**
> Show version.

**--config** _FILE_
> Configuration file.

**--batch**
> Non-interactive mode.

**-v**, **--verbose**
> Verbose output.

# TEST CATEGORIES

**websites**
> Test website blocking.

**im**
> Instant messaging apps.

**circumvention**
> Censorship circumvention tools.

**performance**
> Network performance.

**middlebox**
> Network manipulation detection.

# DESCRIPTION

**ooniprobe** detects internet censorship and network interference. It's part of the Open Observatory of Network Interference project.

Website testing checks if sites are blocked or filtered. DNS, TCP, and HTTP layers are examined for interference.

Instant messaging tests check access to WhatsApp, Telegram, Facebook Messenger, and Signal.

Performance tests measure network speed and quality. Middlebox detection finds proxies and traffic manipulation.

Results can be uploaded to OONI's public dataset. This contributes to global censorship research.

# CAVEATS

Running tests may be illegal in some countries. Tests reveal your network to OONI servers. Some tests may trigger network monitoring.

# HISTORY

**OONI** (Open Observatory of Network Interference) was founded in **2012** as part of the Tor Project. **ooniprobe** provides the client-side testing tool used by volunteers worldwide to measure internet censorship.

# SEE ALSO

[tor](/man/tor)(1), [nmap](/man/nmap)(1), [traceroute](/man/traceroute)(1)
