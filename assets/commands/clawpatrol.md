# TAGLINE

Security firewall that gates AI agent traffic

# TLDR

**Run the gateway** with an HCL policy file

```clawpatrol gateway [config.hcl]```

**Wrap a single process** so its traffic is filtered

```clawpatrol run [claude]```

**Join a host** to a running gateway over a tunnel

```clawpatrol join [gateway-url]```

**Install** clawpatrol

```curl -fsSL https://clawpatrol.dev/install.sh | sh```

# SYNOPSIS

**clawpatrol** _subcommand_ [_options_]

# DESCRIPTION

**clawpatrol** is a security firewall for AI agents. It sits between an agent and the systems it talks to, parses the traffic at the wire level, and evaluates each action against rules you write in HCL before letting it through. Because it inspects protocol facts rather than just URLs, rules can react to specifics such as a destructive SQL statement or a dangerous Kubernetes call and block them or require human approval.

It runs in three shapes. The **gateway** loads a policy file and proxies traffic for everything pointed at it; **join** connects a host to a gateway over a WireGuard tunnel; and **run** wraps a single process so only that program's traffic is filtered, using network namespaces on Linux and the Network Extension framework on macOS.

# PARAMETERS

**gateway** _CONFIG_
> Run the proxy, loading policy from the given HCL file.

**join** _GATEWAY-URL_
> Connect this host to a running gateway through a WireGuard tunnel.

**run** _COMMAND_
> Launch _COMMAND_ with its network traffic routed through clawpatrol.

# CAVEATS

Policies are written in HCL and enforce wire-level protocol facts, so coverage depends on clawpatrol understanding the protocol in use. Per-process wrapping relies on platform-specific networking (network namespaces on Linux, Network Extension on macOS).

# SEE ALSO

[mitmproxy](/man/mitmproxy)(1), [iptables](/man/iptables)(8)

# RESOURCES

```[Source code](https://github.com/denoland/clawpatrol)```

```[Homepage](https://clawpatrol.dev)```

<!-- verified: 2026-06-10 -->
