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

# SYNOPSIS

**/etc/login.defs**

# PARAMETERS

**PASS_MAX_DAYS**
> Maximum days password valid.

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

**UMASK**
> Default umask.

**ENCRYPT_METHOD**
> Password hash algorithm (DES, MD5, SHA256, SHA512, YESCRYPT).

**CREATE_HOME**
> Create home directory by default (yes/no).

**USERGROUPS_ENAB**
> Enable user private groups (yes/no).

**LOGIN_RETRIES**
> Maximum number of login retries on password failure.

**LOGIN_TIMEOUT**
> Maximum time in seconds for login.

# DESCRIPTION

**login.defs** is the configuration file for the shadow password suite, located at **/etc/login.defs**. It defines default values for user account creation, password aging, and login behavior.

Settings affect useradd, usermod, passwd, groupadd, and other shadow utilities. On systems using PAM, some settings (notably PASS_MIN_LEN) may be overridden by PAM modules.

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

PAM may override some settings. Changes don't affect existing users. Some values system-specific. Requires shadow utilities.

# SEE ALSO

[passwd](/man/passwd)(1), [useradd](/man/useradd)(8), [usermod](/man/usermod)(8), [groupadd](/man/groupadd)(8), [chage](/man/chage)(1), [login](/man/login)(1), [pam](/man/pam)(8)
