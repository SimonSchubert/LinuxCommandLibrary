# TAGLINE

change user password expiry information

# TLDR

List **password information** for user

```chage -l username```

Set password to **expire in 10 days**

```sudo chage -M 10 username```

**Disable** password expiration

```sudo chage -M -1 username```

Set **account expiration** date

```sudo chage -E 2025-12-31 username```

Force user to **change password** on next login

```sudo chage -d 0 username```

**Re-enable** an expired account

```sudo chage -E -1 username```

# SYNOPSIS

**chage** [_options_] _LOGIN_

# DESCRIPTION

**chage** changes user password expiry information stored in /etc/shadow. It controls the number of days between required password changes, the date of the last password change, and account expiration dates.

System administrators use chage to enforce password policies, such as requiring users to change passwords at regular intervals, setting grace periods after expiration, and disabling accounts on a specific date. The -l option allows any user to view their own aging information without root privileges.

Setting the last password change date to 0 with -d forces an immediate password change on the user's next login, which is commonly used when creating new accounts or after a security incident.

# PARAMETERS

**-d, --lastday LAST_DAY**
> Set the date of last password change (YYYY-MM-DD or days since epoch)

**-E, --expiredate EXPIRE_DATE**
> Set account expiration date; use -1 to remove expiration

**-i, --iso8601**
> Output dates in ISO 8601 format

**-I, --inactive DAYS**
> Days of inactivity after password expiration before account lockout

**-l, --list**
> Display account aging information

**-m, --mindays MIN_DAYS**
> Minimum days between password changes

**-M, --maxdays MAX_DAYS**
> Maximum days before password change required

**-W, --warndays WARN_DAYS**
> Days before expiration to warn user

# CONFIGURATION

**/etc/shadow**
> Password aging data for each user account.

**/etc/login.defs**
> System-wide defaults for password aging policies.

# CAVEATS

Root privileges are required except when using **-l** to list your own information. Setting **-d 0** forces an immediate password change on next login.

# HISTORY

**chage** is part of the **shadow-utils** package. It manages password aging as defined in the /etc/shadow file.

# SEE ALSO

[passwd](/man/passwd)(1), [shadow](/man/shadow)(5), [usermod](/man/usermod)(8)
