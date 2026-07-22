# TAGLINE

Discord client for the terminal

# TLDR

**Start** Discordo

```discordo```

**Login** with a token / browser flow (see first-run prompts)

```discordo```

# SYNOPSIS

**discordo** [*options*]

# DESCRIPTION

**discordo** is a lightweight TUI Discord client written in Go. It supports browsing guilds/channels, sending messages, and keyboard-driven navigation. Install via distro packages, nightly binaries, or build from source.

**Important:** Automating user accounts (“self-bots”) violates Discord’s Terms of Service. Prefer official bot accounts where applicable; use at your own risk.

# PARAMETERS

Primarily interactive. Configuration and token storage paths are documented in the upstream README. Run **discordo --help** for flags on your build.

# CAVEATS

ToS risk for user-token logins. WIP project—expect breaking changes. Handle auth tokens like passwords.

# INSTALL

```nix: nix profile install nixpkgs#discordo```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[discord](/man/discord)(1), [weechat](/man/weechat)(1)

# RESOURCES

```[Source code](https://github.com/ayn2op/discordo)```

<!-- verified: 2026-07-19 -->
