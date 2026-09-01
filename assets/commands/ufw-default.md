# TAGLINE

Set Uncomplicated Firewall default incoming, outgoing, and routed policies

# TLDR

**Deny** unmatched incoming traffic (typical host default)

```sudo ufw default deny incoming```

**Allow** unmatched outgoing traffic

```sudo ufw default allow outgoing```

**Deny** unmatched forwarded (routed) traffic

```sudo ufw default deny routed```

**Reject** unmatched incoming traffic instead of dropping it

```sudo ufw default reject incoming```

**Allow** unmatched incoming traffic (open default; pair with deny/limit rules)

```sudo ufw default allow incoming```

**Preview** a policy change without applying it

```sudo ufw --dry-run default deny incoming```

# SYNOPSIS

**ufw** [_--dry-run_] **default** _allow_|_deny_|_reject_ [_incoming_|_outgoing_|_routed_]

# PARAMETERS

**default**
> Change the policy that applies when no user rule matches

**allow**
> Accept unmatched traffic in that direction

**deny**
> Drop unmatched traffic silently (iptables/nftables DROP)

**reject**
> Refuse unmatched traffic and notify the peer (REJECT)

**incoming**
> Traffic destined for this host (INPUT). Installation default is **deny**

**outgoing**
> Traffic originating on this host (OUTPUT). Installation default is **allow**

**routed**
> Forwarded traffic (FORWARD). Installation default is **deny** (disabled forwarding)

**--dry-run**
> Show what would change without applying it

# DESCRIPTION

**ufw default** sets the fallback policy Uncomplicated Firewall uses for a traffic direction when no earlier user rule matches. It is a **ufw** subcommand, not a separate binary.

On a fresh install the policies are deny incoming, allow outgoing, and deny routed/forwarded traffic, with stateful tracking of NEW incoming and forwarded connections. Changing a default does not rewrite existing user rules; those must be migrated by hand if they assumed the old fallback.

**deny** silently drops packets. **reject** sends an explicit refusal (typically ICMP unreachable or TCP reset). Use **allow** as a default only when you intend to block with explicit deny/limit rules instead.

Default policies live in `/etc/default/ufw` and are applied when the firewall is enabled or reloaded. Inspect the live values with `ufw status verbose`.

# CAVEATS

Requires root or sudo. Changing a default policy can flush ufw's chains while the new policy is applied, which may drop existing connections (including SSH). Preview with `--dry-run` first. If the default is **reject**, rules added outside the ufw framework may not behave as expected. Setting **routed** to allow is not enough for a gateway: IP forwarding must also be enabled (for example via `/etc/ufw/sysctl.conf`). Do not confuse this command with `ufw app default`, which only controls how application profiles are added.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), the Ubuntu-originated frontend for iptables/nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-09-01 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-allow](/man/ufw-allow)(8), [ufw-deny](/man/ufw-deny)(8), [ufw-delete](/man/ufw-delete)(8), [ufw-status](/man/ufw-status)(8), [ufw-enable](/man/ufw-enable)(8), [iptables](/man/iptables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://help.ubuntu.com/community/UFW)```

<!-- verified: 2026-09-01 -->
