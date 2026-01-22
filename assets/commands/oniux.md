# TLDR

**Isolate** an application and route traffic over Tor

```oniux [command]```

**Query** a website through Tor

```oniux curl [https://example.com]```

Query an **onion site**

```oniux curl [http://example.onion]```

Run an entire **shell** in torified isolation

```oniux bash```

Isolate **graphical applications**

```oniux hexchat```

# SYNOPSIS

**oniux** [_options_] _command_ [_args_...]

# DESCRIPTION

**oniux** is an experimental tool from the Tor Project that isolates arbitrary applications and routes their network traffic through the Tor network. It uses Linux namespaces to create network isolation, ensuring that applications cannot leak traffic outside of Tor.

Unlike traditional torification methods (like torsocks), oniux provides stronger isolation by placing applications in a separate network namespace where only Tor traffic is permitted. This makes it suitable for applications that might otherwise bypass SOCKS proxy settings.

The tool can handle both regular websites and .onion hidden services, making it useful for privacy-focused workflows and accessing Tor-only resources.

# CAVEATS

This is **experimental software** from the Tor Project and may have bugs or security issues. Network namespace isolation requires appropriate Linux kernel support and privileges. Some applications may not function correctly when isolated, particularly those that require specific network configurations or local service access. Does not anonymize application-layer data leaks (hostname, username, etc.).

# HISTORY

Developed by the **Tor Project** as part of their efforts to improve application-level Tor integration on Linux. Uses Linux namespace technology (similar to containers) to provide stronger isolation guarantees than traditional LD_PRELOAD-based torification approaches like torsocks.

# SEE ALSO

[tor](/man/tor)(1), [torsocks](/man/torsocks)(1), [torify](/man/torify)(1)
