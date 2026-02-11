# TAGLINE

Verify password file integrity and consistency

# TLDR

**Check password file integrity**

```pwck```

**Check specific files**

```pwck [/etc/passwd] [/etc/shadow]```

**Read-only check**

```pwck -r```

**Quiet mode**

```pwck -q```

# SYNOPSIS

**pwck** [_options_] [_passwd_] [_shadow_]

# PARAMETERS

_PASSWD_
> Password file path.

_SHADOW_
> Shadow file path.

**-r**
> Read-only mode.

**-q**
> Quiet output.

**-s**
> Sort by UID.

# DESCRIPTION

**pwck** verifies the integrity of **/etc/passwd** and **/etc/shadow** files by checking for proper formatting, valid field values, and internal consistency. It detects problems like duplicate usernames, invalid UIDs/GIDs, missing home directories, and entries that don't match between the password and shadow files.

By default pwck prompts to delete invalid entries, but the **-r** flag runs in read-only mode for auditing without making changes. The command is part of **shadow-utils** and is typically run by administrators after manual edits to password files or as part of system health checks.

# CAVEATS

Requires root for shadow file. System administration tool.

# HISTORY

pwck is a **shadow-utils** utility for password file verification.

# SEE ALSO

[grpck](/man/grpck)(8), [passwd](/man/passwd)(1), [shadow](/man/shadow)(5)

