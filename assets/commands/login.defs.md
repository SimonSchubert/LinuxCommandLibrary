# TAGLINE

Configuration file for the shadow password suite

# TLDR

**Set maximum password age** (days)

```PASS_MAX_DAYS 90```

**Set minimum days between password changes**

```PASS_MIN_DAYS 7```

**Set warning days before password expiry**

```PASS_WARN_AGE 14```

**Set UID range for regular users**

```UID_MIN 1000```

**Set password hashing algorithm**

```ENCRYPT_METHOD SHA512```

**Set default umask for new users**

```UMASK 077```

**Show active settings** without comments

```grep -Ev '^\s*(#|$)' /etc/login.defs```

# SYNOPSIS

**/etc/login.defs**

# PARAMETERS

**PASS_MAX_DAYS**
> Maximum days a password may be used. If not specified, -1 is assumed, which disables the restriction.

**PASS_MIN_DAYS**
> Minimum days between changes.

**PASS_MIN_LEN**
> Minimum password length (ignored if PAM is used; see pam_pwquality instead).

**PASS_WARN_AGE**
> Warning days before expiry.

**UID_MIN**, **UID_MAX**
> UID range for users.

**GID_MIN**, **GID_MAX**
> GID range for groups.

**SYS_UID_MIN**, **SYS_UID_MAX**
> UID range for system accounts.

**SYS_GID_MIN**, **SYS_GID_MAX**
> GID range for system groups.

**UMASK**
> Initial file mode creation mask (022 if not specified). Also used for new home directories unless **HOME_MODE** is set.

**HOME_MODE**
> Mode for new home directories.

**ENCRYPT_METHOD**
> Default hash algorithm: BCRYPT, SHA256, SHA512 (default) or YESCRYPT. Older releases also accept DES and MD5. With PAM this only affects group passwords.

**CREATE_HOME**
> Create a home directory by default for new non-system users (yes/no).

**USERGROUPS_ENAB**
> Create a group named after each new user, remove it with the user if empty, and set the umask group bits to match the owner bits (yes/no).

**LOGIN_RETRIES**
> Maximum number of login retries on password failure.

**LOGIN_TIMEOUT**
> Maximum time in seconds for login.

# DESCRIPTION

**login.defs** is the configuration file for the shadow password suite, located at **/etc/login.defs**. It defines default values for user account creation, password aging, and login behavior.

Settings affect useradd, usermod, passwd, groupadd, and other shadow utilities. On systems using PAM, some settings (notably PASS_MIN_LEN) may be overridden by PAM modules, and user passwords are hashed according to the PAM configuration, so **ENCRYPT_METHOD** should be kept consistent with it.

# EXAMPLE CONFIG

```
# /etc/login.defs
PASS_MAX_DAYS   90
PASS_MIN_DAYS   7
PASS_WARN_AGE   14
UID_MIN         1000
UID_MAX         60000
ENCRYPT_METHOD  SHA512
UMASK           077
```

# CAVEATS

PAM may override some settings. Password aging values apply only when an account is created; use **chage** for existing users. Some values system-specific. Requires shadow utilities.

# SEE ALSO

[passwd](/man/passwd)(1), [useradd](/man/useradd)(8), [usermod](/man/usermod)(8), [groupadd](/man/groupadd)(8), [chage](/man/chage)(1), [login](/man/login)(1), [pam](/man/pam)(8)

# RESOURCES

```[Source code](https://github.com/shadow-maint/shadow)```

```[Documentation](https://man7.org/linux/man-pages/man5/login.defs.5.html)```

<!-- verified: 2026-11-09 -->
