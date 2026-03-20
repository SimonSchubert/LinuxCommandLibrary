# TAGLINE

Confetti and fireworks over SSH

# TLDR

**Connect to the confettysh SSH server for a confetti animation**

```ssh [host] -t confetti```

**Connect for a fireworks animation**

```ssh [host] -t fireworks```

**Connect to a local confettysh server**

```ssh -p [2222] localhost```

# SYNOPSIS

**confettysh**

# DESCRIPTION

**confettysh** is an SSH server that displays confetti and fireworks animations in the terminal. It is built by Charmbracelet using the Wish framework and provides an SSH interface to the confeTTY project by Maas Lalani.

The server accepts SSH connections and renders particle-based animations directly in the connected terminal. Users can choose between confetti and fireworks animations by passing the animation type as the SSH command. Pressing any key triggers additional particles.

confettysh is primarily a demonstration of building SSH-based TUI applications with Go and the Bubble Tea framework, and is also used as a fun celebratory tool.

# CAVEATS

confettysh is an SSH server, not a standalone CLI tool. It requires a running server instance to connect to. The animation quality depends on the terminal emulator's Unicode support and rendering speed.

# HISTORY

**confettysh** was created by **Charmbracelet** as part of their suite of terminal tools built with the Bubble Tea TUI framework and the Wish SSH library. It wraps the confeTTY animation engine by Maas Lalani in an SSH server, written in Go.

# SEE ALSO

[ssh](/man/ssh)(1), [sl](/man/sl)(1), [cowsay](/man/cowsay)(1), [lolcat](/man/lolcat)(1)
