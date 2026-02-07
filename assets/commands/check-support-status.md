# TAGLINE

identify packages with limited security support

# TLDR

Display packages with **limited or ended support**

```check-support-status```

Show only packages whose support **has ended**

```check-support-status --type ended```

Skip printing a **headline**

```check-support-status --no-heading```

# SYNOPSIS

**check-support-status** [_options_]

# DESCRIPTION

**check-support-status** identifies installed Debian packages for which support has been limited or prematurely ended. This helps users understand which packages may not receive security updates.

The tool reports packages that have reached end-of-life earlier than the distribution's support period, or have limited security support due to various reasons.

# PARAMETERS

**--type** _type_
> Filter by support status type (ended, limited)

**--no-heading**
> Skip printing the headline

# CAVEATS

Specific to Debian-based distributions. Package support status depends on Debian's security team decisions and may change. Running this regularly helps maintain system security awareness.

# SEE ALSO

[apt](/man/apt)(8), [apt-cache](/man/apt-cache)(8), [debsecan](/man/debsecan)(1)
