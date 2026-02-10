# TAGLINE

changes user passwords

# TLDR

**Change your password**

```passwd```

**Change another user's password** (root)

```passwd [username]```

**Lock a user account**

```passwd -l [username]```

**Unlock a user account**

```passwd -u [username]```

**Force password change** on next login

```passwd -e [username]```

**Set password to expire** in days

```passwd -x [90] [username]```

**Show password status**

```passwd -S [username]```

**Delete user's password** (passwordless)

```passwd -d [username]```

# SYNOPSIS

**passwd** [_options_] [_username_]

# DESCRIPTION

**passwd** changes user passwords. When run without arguments by a regular user, it prompts for the current password and then allows setting a new one. Root can change any user's password without knowing the old one.

The tool enforces password policies including minimum length, complexity requirements, and history restrictions. These policies are configured in /etc/login.defs and PAM configuration.

passwd also manages password aging, allowing administrators to force periodic password changes, expire passwords, and lock/unlock accounts.

# PARAMETERS

**-l**, **--lock**
> Lock the account password.

**-u**, **--unlock**
> Unlock the account password.

**-d**, **--delete**
> Delete password (make passwordless).

**-e**, **--expire**
> Force password change on next login.

**-n** _days_, **--mindays** _days_
> Minimum days between changes.

**-x** _days_, **--maxdays** _days_
> Maximum days before change required.

**-w** _days_, **--warndays** _days_
> Days before expiry to warn user.

**-i** _days_, **--inactive** _days_
> Days after expiry before account disabled.

**-S**, **--status**
> Show password status information.

**-a**, **--all**
> With -S, show status for all users.

**--stdin**
> Read password from stdin (non-interactive).

# CAVEATS

Requires root to change other users' passwords. PAM modules may enforce additional password requirements. Locked accounts can still be accessed via SSH keys. Password policies vary by system configuration.

# HISTORY

**passwd** has been part of Unix since the earliest versions, dating back to **Version 1 Unix** at **Bell Labs** in **1971**. The password file originally contained hashed passwords directly, but modern systems use shadow passwords (/etc/shadow) for security, introduced in **SunOS** in the **1980s**.

# SEE ALSO

[chage](/man/chage)(1), [usermod](/man/usermod)(8), [shadow](/man/shadow)(5), [login.defs](/man/login.defs)(5)
