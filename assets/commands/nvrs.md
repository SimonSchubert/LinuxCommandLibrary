# TAGLINE

Fast new version checker for software releases

# TLDR

**Check for new versions**

```nvrs```

**Check a specific package**

```nvrs check [package_name]```

# SYNOPSIS

**nvrs** [_command_] [_options_]

# DESCRIPTION

**nvrs** is a CLI tool for tracking and updating software versions. It checks package updates across multiple sources including GitHub, GitLab, AUR, crates.io, and regex-defined URLs.

Built for speed, it can monitor many packages in parallel and report which ones have newer versions available.

# CAVEATS

Requires configuration of package sources. API rate limits may apply for some sources like GitHub.

# HISTORY

**nvrs** is written in **Rust**.

# SEE ALSO

[nix](/man/nix)(1)
