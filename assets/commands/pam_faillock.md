# TAGLINE

PAM module that denies access after multiple failed authentication attempts

# TLDR

**Show failed login attempts**

```sudo faillock --user [username]```

**Reset failed count** to unlock a user

```sudo faillock --user [username] --reset```

**Show all users' status**

```sudo faillock```

**Configure lockout** (in /etc/security/faillock.conf)

```deny = 5\nunlock_time = 900```

**Check for a lock before prompting** (in a PAM file)

```auth requisite pam_faillock.so preauth```

# SYNOPSIS

**auth** ... **pam_faillock.so** {**preauth**|**authfail**|**authsucc**} [_options_]

**account** ... **pam_faillock.so** [**dir=**_path_] [**no_log_info**]

**faillock** [**--conf** _file_] [**--dir** _path_] [**--user** _name_] [**--reset**]

# PARAMETERS

**preauth**
> Run before the credential prompt and check whether the user is locked.

**authfail**
> Run after a failed authentication and record the failure.

**authsucc**
> Run after a successful authentication and clear the user's failure records.

**deny=**_n_
> Deny access once consecutive failures exceed n (default: 3).

**fail_interval=**_n_
> Interval in seconds in which the failures must occur (default: 900).

**unlock_time=**_n_
> Re-enable access after n seconds (default: 600). 0 or **never** requires a manual reset.

**even_deny_root**
> Also lock the root account.

**root_unlock_time=**_n_
> Unlock time for root. Implies even_deny_root.

**admin_group=**_name_
> Treat members of this group like root.

**dir=**_path_
> Tally directory (default: /var/run/faillock).

**conf=**_file_
> Alternate configuration file (default: /etc/security/faillock.conf).

**silent**
> Do not print informative messages to the user.

**audit**
> Log the user name if the user is not found.

**no_log_info**
> Do not log informative messages via syslog.

**local_users_only**
> Only track local users from /etc/passwd (faillock.conf only).

**nodelay**
> Do not enforce a delay after failures (faillock.conf only).

# DESCRIPTION

**pam_faillock** is a PAM module that denies access after multiple failed authentication attempts. It provides brute-force protection by temporarily locking accounts. Failures are stored in one file per user in the tally directory.

Settings belong in **/etc/security/faillock.conf**, which upstream prefers over module arguments. Arguments given in a PAM file override it. The **faillock** command queries and resets the failure records.

# PAM CONFIGURATION

```
# /etc/pam.d/login
auth     required       pam_faillock.so preauth
auth     sufficient     pam_unix.so
auth     [default=die]  pam_faillock.so authfail
auth     required       pam_deny.so

account  required       pam_faillock.so
account  required       pam_unix.so
```

# CAVEATS

Can lock out legitimate users. Root lockout dangerous. Test configuration carefully, and keep a root shell open while doing so. Using **preauth** without **silent**, or with **requisite**, reveals whether an account exists. Tally files in /var/run/faillock are lost on reboot when that directory is on tmpfs, which also lifts any locks; set **dir** for persistent records.

# HISTORY

pam_faillock replaced pam_tally2, which was removed in Linux-PAM 1.5.0, for tracking and enforcing login failure policies.

# SEE ALSO

[pam](/man/pam)(8), [faillock](/man/faillock)(8), [pam.d](/man/pam.d)(5), [pam_unix](/man/pam_unix)(8), [pam_tally2](/man/pam_tally2)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man.archlinux.org/man/pam_faillock.8)```

<!-- verified: 2026-11-08 -->
