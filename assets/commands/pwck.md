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

**pwck** verifies password file integrity. Checks for consistency.

The tool finds duplicate entries. Validates user database.

pwck checks passwd files.

# CAVEATS

Requires root for shadow file. System administration tool.

# HISTORY

pwck is a **shadow-utils** utility for password file verification.

# SEE ALSO

[grpck](/man/grpck)(8), [passwd](/man/passwd)(1), [shadow](/man/shadow)(5)

