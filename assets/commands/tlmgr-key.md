# TAGLINE

Manage TeX Live GPG verification keys

# TLDR

**List GPG keys**

```tlmgr key list```

**Add key**

```tlmgr key add [keyfile]```

**Remove key**

```tlmgr key remove [keyid]```

# SYNOPSIS

**tlmgr key** _action_ [_args_]

# PARAMETERS

**list**
> List installed keys.

**add** _file_
> Add GPG key from file.

**remove** _keyid_
> Remove key by ID.

# DESCRIPTION

**tlmgr key** manages GPG keys for TeX Live package verification. Ensures packages are from trusted sources. Part of TeX Live Manager security features.

# SEE ALSO

[tlmgr-repository](/man/tlmgr-repository)(1), [tlmgr](/man/tlmgr)(1)

