# TAGLINE

configuration file for the shadow password suite

# TLDR

**Set password aging defaults**

```PASS_MAX_DAYS 90```

**Set minimum password length**

```PASS_MIN_LEN 8```

**Set UID range for regular users**

```UID_MIN 1000```

**Enable encrypted home directories**

```ENCRYPT_METHOD SHA512```

**Set umask for new users**

```UMASK 027```

# SYNOPSIS

**/etc/login.defs**

# PARAMETERS

**PASS_MAX_DAYS**
> Maximum days password valid.

**PASS_MIN_DAYS**
> Minimum days between changes.

**PASS_MIN_LEN**
> Minimum password length.

**PASS_WARN_AGE**
> Warning days before expiry.

**UID_MIN**, **UID_MAX**
> UID range for users.

**GID_MIN**, **GID_MAX**
> GID range for groups.

**UMASK**
> Default umask.

**ENCRYPT_METHOD**
> Password hash algorithm.

# DESCRIPTION

**login.defs** is the configuration file for the shadow password suite. It defines default values for user account creation, password aging, and login behavior.

Settings affect useradd, usermod, passwd, and other shadow utilities.

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

[shadow](/man/shadow)(5), [passwd](/man/passwd)(5), [useradd](/man/useradd)(8), [pam](/man/pam)(8)
