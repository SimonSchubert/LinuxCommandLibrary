# TAGLINE

Manage CIFS mount credentials in the kernel keyring

# TLDR

**Add credentials for a CIFS server**

```cifscreds add [server_hostname]```

**Add credentials with a specific username**

```cifscreds add -u [username] [server_hostname]```

**Add credentials for a domain**

```cifscreds add -d [domain_name]```

**Update existing credentials**

```cifscreds update [server_hostname]```

**Clear credentials for a specific host**

```cifscreds clear [server_hostname]```

**Clear all CIFS credentials from the kernel**

```cifscreds clearall```

# SYNOPSIS

**cifscreds** _command_ [**-u** _username_] [**-d**] _host_|_domain_

# DESCRIPTION

**cifscreds** manages NTLM credentials in the kernel keyring for CIFS multiuser mounts. When a CIFS filesystem is mounted with the **multiuser** option without Kerberos authentication, this utility provides per-user credentials to the kernel.

Credentials are stored securely in the session keyring rather than in plain-text files, providing better security for sensitive authentication information.

# PARAMETERS

**Commands:**

**add**
> Add credentials for connecting to a server or domain

**clear**
> Remove credentials for a specific host or domain

**clearall**
> Remove all CIFS credentials from the kernel

**update**
> Update stored credentials with new username/password

**Options:**

**-d, --domain**
> Treat the argument as an NT domain name instead of hostname

**-u, --username** _user_
> Use specified username instead of current Unix username

# CAVEATS

Requires a kernel with **login** key type support (Linux 3.3+). Use **pam_keyinit** to ensure a session keyring is established at login time.

The utility prompts for the password interactively; it cannot be provided on the command line for security reasons.

# HISTORY

**cifscreds** is part of the **cifs-utils** package, which provides tools for interacting with CIFS/SMB network shares on Linux. The utility was developed to support the multiuser mount feature that allows different users to access the same mount with individual credentials.

# SEE ALSO

[mount.cifs](/man/mount.cifs)(8), [cifs.idmap](/man/cifs.idmap)(8), [keyctl](/man/keyctl)(1)
