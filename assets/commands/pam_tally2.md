# TAGLINE

tracks failed login attempts and locks accounts (deprecated)

# TLDR

**Lock an account after 5 failures**, auto-unlock after 15 minutes (in /etc/pam.d)

```auth required pam_tally2.so deny=5 unlock_time=900```

**Also lock root**, auto-unlocking it after 10 minutes

```auth required pam_tally2.so deny=4 even_deny_root root_unlock_time=600```

**Reset the counter** in the account phase for services that do not call pam_setcred

```account required pam_tally2.so```

**Show failure counts** of all users

```pam_tally2```

**View a user's tally**

```pam_tally2 --user=[username]```

**Unlock a user** by resetting the counter

```pam_tally2 --user=[username] --reset```

**Reset all tallies**

```pam_tally2 --reset```

# SYNOPSIS

**pam_tally2.so** [**file=**_/path/to/counter_] [**onerr=**[**fail**|**succeed**]] [**magic_root**] [**even_deny_root**] [**deny=**_n_] [**lock_time=**_n_] [**unlock_time=**_n_] [**root_unlock_time=**_n_] [**serialize**] [**audit**] [**silent**] [**no_log_info**] [**debug**]

**pam_tally2** [**--file** _/path/to/counter_] [**--user** _username_] [**--reset**[=_n_]] [**--quiet**]

# PARAMETERS

**deny=**_N_
> Deny access if the tally for this user exceeds N.

**unlock_time=**_SECONDS_
> Allow access again this many seconds after the last failed attempt. Without it, the account stays locked until an administrator resets it.

**lock_time=**_SECONDS_
> Always deny access for this many seconds after a failed attempt.

**magic_root**
> Do not increment (auth) or reset (account) the counter when the module is invoked by uid 0; use for user-launched services like **su**.

**even_deny_root**
> Apply the deny policy to root too.

**root_unlock_time=**_SECONDS_
> Unlock time for the root account (implies **even_deny_root**).

**file=**_PATH_
> Path to the tally database (default `/var/log/tallylog`).

**onerr=**[**fail**|**succeed**]
> Return value if something goes wrong, such as the tally file not being readable.

**serialize**
> Serialize access to the tally file using fcntl locks (not for multithreaded services).

**audit**
> Log the user name to the system log if the user is not found.

**silent**
> Do not print informative messages (which would otherwise reveal whether an account exists).

**no_log_info**
> Do not log informative messages via syslog.

**debug**
> Log the tally count at debug level whenever it is incremented.

**--file** _PATH_
> CLI: use an alternative tally file.

**--user** _NAME_
> CLI: restrict the action to a single user.

**--reset**[=_N_]
> CLI: reset the counter (optionally to _N_ instead of zero).

**--quiet**
> CLI: do not print the resulting counts.

# DESCRIPTION

**pam_tally2** maintains a count of attempted accesses, can reset the count on success, and can deny access if too many attempts fail. It consists of two parts: the PAM module **pam_tally2.so** and the stand-alone **pam_tally2** program, which displays or modifies the counter file. Setting artificially high counts can block users without changing their passwords.

In the auth phase the counter is incremented and checked; on successful authentication it is reset when the application calls **pam_setcred**. The module provides the **auth** and **account** module types.

By default failed root logins do not lock the root account, to avoid denial of service.

# CAVEATS

**Deprecated and removed**: no longer built by default in Linux-PAM 1.4.0 and removed in 1.5.0 (2020). Modern distributions (RHEL 9+, Debian 12+, Ubuntu 24.04+) ship only **pam_faillock**, which should be used instead. The `/var/log/tallylog` format is not compatible with the old **pam_tally** faillog file, nor with pam_faillock's per-user files under `/var/run/faillock/`.

If the tally file cannot be opened due to insufficient permissions (e.g. when called from an unprivileged screensaver), the module returns PAM_IGNORE.

# HISTORY

**pam_tally2** was written by **Tim Baverstock** and **Tomas Mraz** and added in Linux-PAM **1.0.90** (2008) as a replacement for **pam_tally** with a word-size independent tally format. It was superseded by **pam_faillock**.

# SEE ALSO

[pam](/man/pam)(8), [pam_faillock](/man/pam_faillock)(8), [pam_tally](/man/pam_tally)(8), [faillock](/man/faillock)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

<!-- verified: 2026-11-23 -->
