# TAGLINE

legacy PAM module that counts failed logins and locks accounts

# TLDR

**Lock after more than 5 failures** (in a file under /etc/pam.d/)

```auth required pam_tally.so deny=[5]```

**Lock and unlock automatically** after a timeout

```auth required pam_tally.so deny=[5] unlock_time=[600]```

**Maintain the counter** in the account phase

```account required pam_tally.so```

**View a user's failure count**

```pam_tally --user=[username]```

**Clear a user's failure count**

```pam_tally --user=[username] --reset```

**Set a user's failure count** to a value

```pam_tally --user=[username] --reset=[n]```

# SYNOPSIS

**pam_tally.so** [_options_]

**pam_tally** [**--file** _path_] [**--user** _name_] [**--reset**[=_n_]] [**--quiet**]

# PARAMETERS

**onerr=**_fail_|_succeed_
> Result to return if an error occurs, such as an unreadable counter file.

**file=**_PATH_
> Counter file. Default: /var/log/faillog.

**audit**
> Log the user name to syslog if the user is not found.

**silent**
> Suppress informative messages.

**no_log_info**
> Do not log informative messages to syslog.

**deny=**_N_
> Deny access when the user's tally exceeds N.

**lock_time=**_SECONDS_
> Deny access for this long after each failed attempt.

**unlock_time=**_SECONDS_
> Allow access again this long after the limit was exceeded. Without it, the lock stays until an administrator clears it.

**magic_root**
> Do not increment the counter when the caller is uid 0.

**no_lock_time**
> Ignore the .fail_locktime field in the faillog file for this user.

**no_reset**
> Decrement the counter on successful login instead of resetting it.

**even_deny_root_account**
> Allow the root account to be locked out. Root is not blocked by default.

**per_user**
> Use non-zero .fail_max and .fail_locktime values from the faillog file instead of deny= and lock_time=.

**--file** _PATH_
> Counter file used by the pam_tally program.

**--user** _NAME_
> User to display or change.

**--reset**[=_N_]
> Clear the counter, or set it to N.

**--quiet**
> Do not print the counter.

# DESCRIPTION

**pam_tally** is a Linux-PAM module that maintains a count of attempted accesses, resets the count on success, and can deny access after too many failures. The companion **pam_tally** program displays and changes the counters stored in the faillog file.

# CAVEATS

Removed from Linux-PAM in version **1.5.0**, so current distributions no longer ship it. A PAM stack that still references **pam_tally.so** after upgrading can block logins. Migrate to **pam_faillock**, and use the **faillock** command to view or reset failures. Set **deny=** explicitly when migrating, since defaults differ between modules.

# HISTORY

**pam_tally** was superseded by **pam_tally2**, which solved several of its limitations. Both were deprecated in Linux-PAM **1.4.0** in favor of **pam_faillock** and removed in **1.5.0** (2020).

# SEE ALSO

[pam](/man/pam)(8), [pam_tally2](/man/pam_tally2)(8), [pam_faillock](/man/pam_faillock)(8), [faillock](/man/faillock)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

<!-- verified: 2026-11-08 -->
