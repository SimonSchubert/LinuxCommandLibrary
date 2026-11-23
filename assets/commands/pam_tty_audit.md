# TAGLINE

logs TTY keystrokes

# TLDR

**Enable TTY auditing** for all users

```session required pam_tty_audit.so enable=*```

**Audit only root** (recommended pattern for administrative actions)

```session required pam_tty_audit.so disable=* enable=root```

**Audit a UID range** (regular users from 1000 up)

```session required pam_tty_audit.so disable=* enable=1000:```

**Audit sudo sessions** (services that do not fork need open_only)

```session required pam_tty_audit.so enable=root open_only```

**Review recorded keystrokes**

```sudo aureport --tty```

# SYNOPSIS

**pam_tty_audit.so** [_options_]

# PARAMETERS

**enable=**_PATTERNS_
> Enable TTY auditing for matching users. Overrides any previous **disable** option matching the same user.

**disable=**_PATTERNS_
> Disable TTY auditing for matching users. Overrides any previous **enable** option matching the same user.

**open_only**
> Set the TTY audit flag when opening the session, but do not restore it when closing. Needed for services that do not fork() to run the session, such as **sudo**.

**log_passwd**
> Also log keystrokes entered while ECHO is off but ICANON is active (password entry). Passwords are not logged by default.

**debug**
> Log additional information for debugging via `syslog(3)`.

# DESCRIPTION

**pam_tty_audit** is a PAM session module that toggles the per-process TTY input auditing flag at session open and restores it on close. When enabled, every keystroke read from a controlling TTY by the affected processes is recorded by the kernel and forwarded to **auditd** as `TTY` records.

Patterns are comma-separated lists of glob patterns or UID ranges written as _min_uid_:_max_uid_ (either side may be empty). The last matching option wins.

It is commonly placed in `/etc/pam.d/system-auth` (or distribution-specific equivalent) as a `session` rule and used to satisfy compliance requirements (PCI-DSS, STIG) that mandate logging of administrative shell activity.

# CAVEATS

Requires kernel audit support (`CONFIG_AUDIT`) and a running **auditd**. The audit flag is inherited by all child processes, so daemons restarted by an audited user keep auditing input from other users; use `disable=*` as the first option for daemons. Logging keystrokes raises serious privacy concerns: passwords can be captured with `log_passwd`, and even without it, anything typed into an outgoing ssh session is logged. Audit records are written to `/var/log/audit/audit.log`; review with **aureport --tty** or **ausearch -m TTY**.

# HISTORY

**pam_tty_audit** is part of **Linux-PAM**. It was written by **Miloslav Trmač** of Red Hat; the **log_passwd** option was added later by **Richard Guy Briggs**.

# SEE ALSO

[pam](/man/pam)(8), [auditd](/man/auditd)(8), [aureport](/man/aureport)(8), [ausearch](/man/ausearch)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man7.org/linux/man-pages/man8/pam_tty_audit.8.html)```

<!-- verified: 2026-11-23 -->

