# TAGLINE

Netcat-style encrypted pipe over Tailscale's data plane, without a Tailscale account

# TLDR

**Listen** for one connection and print received data (prints a shareable address)

```tailcat```

**Send stdin** to a listening server

```echo hello | tailcat [token]```

**Forward local TCP ports** through the tunnel

```tailcat --serve=[8080,8443]```

Connect to a **forwarded port** on the server

```tailcat [token] [8080]```

**SSH** over the tunnel (auth-free server on Linux/macOS)

```tailcat --serve=no-auth-ssh```

```tailcat ssh [token]```

**Ping** until a direct (non-relay) path works

```tailcat ping --until-direct [token]```

Run a command through a **SOCKS5** proxy over the tunnel

```tailcat socks [token] curl http://server.tailcat:8081/```

**Generate a saved server key** so the address stays stable across restarts

```tailcat genkey --fixed-region```

# SYNOPSIS

**tailcat** [_options_]

**tailcat** [_options_] _token_ [_port_]

**tailcat** **ping** [**--until-direct**] [**--timeout=**_duration_] _token_

**tailcat** **ssh** [_user_@]_token_ [_command_ ...]

**tailcat** **socks** [_token_] _command_ [_args_ ...]

**tailcat** **parse** _token_

**tailcat** **resolve** _token_

**tailcat** **genkey** [_options_]

**tailcat** **printpub**

# PARAMETERS

**--serve=**_list_
> Comma-separated ports, ranges, or service names to accept. Empty (the default) listens on a single connection and writes it to stdout. Named services: **all** (every TCP port), **no-auth-ssh** (auth-free SSH server, Linux/macOS), **exit-node** (clients can reach the server's network).

**--key=**_name_
> Key to use. **new** forces an ephemeral key. Empty uses the saved **default** key in server mode (or **client-default** in client modes) if it exists, otherwise an ephemeral key. Otherwise a name under **$XDG_CONFIG_HOME/tailcat/keys/** or a path to a **\*.private.json** file.

**--allow=**_keys_
> Comma-separated client public keys (or **none**) allowed to connect. Empty allows every client.

**--full-address**
> In server mode, print a longer token with DERP server details embedded so clients need not fetch the DERP map.

**--json**
> In server mode, write `{"listenAddr": ...}` JSON to stdout.

**--derpmap-url=**_url_
> JSON DERP map used to resolve or auto-select a relay region. Default **https://tailcat.dev/derpmap.json**.

**--verbose**
> Verbose logging.

**--readme**
> Print the project README and exit.

**ping**
> Probe connectivity. Each pong reports latency and whether it arrived via a DERP relay or a direct path.

**ssh**
> Open an SSH session through the tunnel (to **no-auth-ssh** or to a forwarded port 22).

**socks**
> Start an ephemeral SOCKS5 proxy and run _command_ with **all_proxy** set. Destination hostnames that are themselves tokens are dialed as Tailcat servers; **server.tailcat** names the server from the optional token argument.

**parse**
> Decode a token to JSON (WireGuard public key and DERP info) without connecting.

**resolve**
> Expand a short region-ID token into a self-contained token with DERP details embedded.

**genkey**
> Generate and save a persistent key. **--client** writes a client identity and prints its public key for **--allow**. **--fixed-region** bakes the nearest DERP region in at generation time. **--region=**_name_ pins a region, hostname, or **auto**. **--list** / **--delete** manage saved keys.

**printpub**
> Print the public key of the client key that would be used.

# DESCRIPTION

**tailcat** is a userspace CLI from Tailscale that behaves like **nc** (netcat) over Tailscale's data plane (WireGuard encryption, magicsock NAT traversal, and DERP relays) without using Tailscale's control plane. No Tailscale account, tailnet, IP address, or root is required: it does not change routing tables or DNS.

One side runs a server and prints a short connection token (prefix **tc** plus base64-encoded CBOR). The other side passes that token to connect. The handshake bootstraps through a DERP relay, then magicsock tries to upgrade to a direct peer-to-peer UDP path. All payload traffic is end-to-end WireGuard-encrypted.

With no **--serve** list, a server accepts one connection and copies it to stdout (netcat style). With **--serve**, inbound TCP ports are forwarded to localhost, or the process can act as an auth-free SSH server or an exit node. Tokens can also be published as a DNS TXT record `tailcat=tc...` and used as a hostname anywhere the CLI takes a token.

A Go library is importable as **github.com/tailscale/tailcat**. An experimental in-browser WASM demo at **https://tailscale.github.io/tailcat/** interoperates with the CLI over DERP only.

# CONFIGURATION

Saved keys live under **$XDG_CONFIG_HOME/tailcat/keys/** (typically **~/.config/tailcat/keys/**) as **_name_.private.json**. The magic names **default** (server) and **client-default** (client) are used automatically once they exist.

DERP maps are cached under **$XDG_CACHE_HOME/tailcat/**.

**TAILCAT_ADDR_FILE**
> In server mode, write the token to this path, or with a **tcp:** prefix send it to that TCP address.

# CAVEATS

A connection token is a capability: treat it like a password. Ephemeral keys (the default) die when the process exits; a saved **default** key keeps the same address across restarts, so anyone who ever received it can reconnect unless **--allow** restricts clients.

The CLI, Go API, and wire format have **no stability promises**. Public Tailcat DERP relays are rate-limited, have no uptime SLA, and keep metadata logs — they are not a privacy service. Run your own **derper** (or pass **--region=**_hostname_ / **--derpmap-url**) for private relays. **--serve=no-auth-ssh** really has no authentication; restrict it with **--allow** or proxy to system sshd instead (**--serve=22**). Browser WASM traffic stays on DERP until WebRTC is added.

# HISTORY

Tailcat started in **September 2023** as **derpcat** (first working commit on a long-haul flight) inside a fork of the Tailscale repo. It was later extracted as a regular Go module and **open sourced in August 2026** at the TailscaleUp conference. BSD-3-Clause.

# SEE ALSO

[nc](/man/nc)(1), [ncat](/man/ncat)(1), [socat](/man/socat)(1), [ssh](/man/ssh)(1), [tailscale](/man/tailscale)(1), [wg](/man/wg)(8)

# RESOURCES

```[Source code](https://github.com/tailscale/tailcat)```

```[Homepage](https://tailscale.com/tailcat)```

```[Documentation](https://github.com/tailscale/tailcat#readme)```

<!-- verified: 2026-08-27 -->
