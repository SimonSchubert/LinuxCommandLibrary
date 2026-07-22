# TAGLINE

Secure and simple terminal sharing

# TLDR

**Share your terminal**

```warp open [session-name]```

**Connect to a shared terminal**

```warp connect [session-name]```

**Grant write access to a connected user**

```warp authorize [username]```

# SYNOPSIS

**warp** _command_ [_options_]

# DESCRIPTION

**warp** enables secure terminal sharing with a simple command. One user opens a session and others can connect to view the terminal in real-time. Connections are TLS-encrypted and read-only by default, with explicit authorization required for write access. No SSH or shared server needed.

# HISTORY

**warp** was created by **spolu** and is written in **Go**.

# INSTALL

```apt: sudo apt install libghc-wai-app-static-dev```

```pacman: sudo pacman -S warp```

```apk: sudo apk add warp```

```zypper: sudo zypper install warp```

```nix: nix profile install nixpkgs#warp```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[tmux](/man/tmux)(1), [screen](/man/screen)(1)
