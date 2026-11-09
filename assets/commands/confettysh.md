# TAGLINE

Confetti and fireworks over SSH

# TLDR

**Start the server** on the default port 2222

```confettysh```

**Listen on a specific address and port**

```confettysh --listen [0.0.0.0] --port [2222]```

**Connect to a confettysh server**

```ssh -p [2222] [host]```

**Request the confetti animation**

```ssh -p [2222] [host] -t confetti```

**Request the fireworks animation**

```ssh -p [2222] [host] -t fireworks```

# SYNOPSIS

**confettysh** [**--listen** _address_] [**--port** _port_] [**--metrics-port** _port_]

# PARAMETERS

**--listen** _ADDRESS_
> Address to listen on. Default: localhost.

**--port** _PORT_
> SSH port to listen on. Default: 2222.

**--metrics-port** _PORT_
> Port for the Prometheus metrics endpoint. Default: 9222.

# DESCRIPTION

**confettysh** is an SSH server that displays confetti and fireworks animations in the terminal. It is built by Charmbracelet using the Wish framework and provides an SSH interface to the confeTTY project by Maas Lalani.

The server accepts SSH connections and renders particle-based animations directly in the connected terminal. Users can choose between confetti and fireworks animations by passing the animation type as the SSH command. Pressing any key triggers additional particles.

# CAVEATS

By default the server only listens on **localhost**; use **--listen** to accept remote connections. The animation quality depends on the terminal emulator's Unicode support and rendering speed.

# HISTORY

**confettysh** was created by **Charmbracelet** in **2021**, wrapping the confeTTY animation engine by Maas Lalani in an SSH server written in Go, using the Bubble Tea framework and the Wish SSH library.

# SEE ALSO

[ssh](/man/ssh)(1), [sl](/man/sl)(1), [cowsay](/man/cowsay)(1), [lolcat](/man/lolcat)(1)

# RESOURCES

```[Source code](https://github.com/charmbracelet/confettysh)```

<!-- verified: 2026-11-09 -->
