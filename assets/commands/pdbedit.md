# TLDR

**List** all Samba users with their settings

```sudo pdbedit --list --verbose```

**Add** an existing Unix user to Samba

```sudo pdbedit --user [username] --create```

**Remove** a Samba user

```sudo pdbedit --user [username] --delete```

**Reset** a Samba user's failed password counter

```sudo pdbedit --user [username] --bad-password-count-reset```

# SYNOPSIS

**pdbedit** [_options_]

# PARAMETERS

**-L**, **--list**
> List all Samba user accounts

**-v**, **--verbose**
> Enable verbose listing mode

**-u**, **--user** _username_
> Specify the user to operate on

**-a**, **--create**
> Add a new user account (prompts for password)

**-x**, **--delete**
> Delete specified user account

**-z**, **--bad-password-count-reset**
> Reset bad password count for user

**-t**, **--password-from-stdin**
> Read password from stdin

**-w**, **--smbpasswd-style**
> Use smbpasswd-style output

**-e**, **--export**
> Export user database to stdout

**-i**, **--import**
> Import user database from stdin

**-b**, **--backend** _name_
> Use specified passdb backend

**-P**, **--account-policy**
> Display or change account policy

**--policies-reset**
> Reset account policies to default

# DESCRIPTION

**pdbedit** manages the Samba user database (SAM database), allowing administrators to add, modify, and delete Samba user accounts. It provides more detailed control than smbpasswd, including access to user flags, password policies, and database import/export.

Users must exist in the Unix system before being added to Samba. The tool can operate on different passdb backends including tdbsam (default) and ldapsam for LDAP integration.

# CAVEATS

Requires root privileges. User must exist in Unix passwd database before adding to Samba. For simple user management, smbpasswd may be easier. Backend configuration depends on smb.conf settings.

# HISTORY

Part of the **Samba** suite since Samba 3.0, replacing older password database tools. Provides a unified interface for managing various Samba passdb backends as Samba moved away from the legacy smbpasswd file format.

# SEE ALSO

[smbpasswd](/man/smbpasswd)(8), [smb.conf](/man/smb.conf)(5), [samba](/man/samba)(7)
