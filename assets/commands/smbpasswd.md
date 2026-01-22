# TLDR

**Change** current user's SMB password

```smbpasswd```

**Add** a user to Samba and set password

```sudo smbpasswd -a [username]```

**Modify** an existing Samba user's password

```sudo smbpasswd [username]```

**Delete** a Samba user

```sudo smbpasswd -x [username]```

**Enable** a Samba user

```sudo smbpasswd -e [username]```

**Disable** a Samba user

```sudo smbpasswd -d [username]```

# SYNOPSIS

**smbpasswd** [_options_] [_username_]

# PARAMETERS

**-a**
> Add a new Samba user

**-x**
> Delete a Samba user

**-d**
> Disable a Samba user account

**-e**
> Enable a previously disabled account

**-n**
> Set null password (requires null passwords enabled)

**-r _machine_**
> Change password on remote machine

**-U _username_**
> Use specified username on remote machine

**-s**
> Read password from stdin (silent mode)

# DESCRIPTION

**smbpasswd** manages Samba user passwords. It allows users to change their own SMB password, and administrators to add, remove, or modify Samba user accounts.

Samba users must have an existing local Unix account before being added. The Samba password database is separate from the system password.

# CAVEATS

Users must exist in the Unix system before being added to Samba. If a Unix account is deleted before the Samba account, use **pdbedit** instead to remove the Samba entry.

# SEE ALSO

[pdbedit](/man/pdbedit)(8), [samba](/man/samba)(7), [smb.conf](/man/smb.conf)(5)
