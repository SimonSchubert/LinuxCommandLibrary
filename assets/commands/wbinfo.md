# TLDR

**List domain users**

```wbinfo -u```

**List domain groups**

```wbinfo -g```

**Check winbind connection**

```wbinfo -p```

**Ping domain controller**

```wbinfo -P```

**Show domain info**

```wbinfo -D [DOMAIN]```

**List trusted domains**

```wbinfo -m```

**Convert username to SID**

```wbinfo -n [DOMAIN/username]```

**Convert SID to name**

```wbinfo -s [S-1-5-21-...]```

**Get user info by UID**

```wbinfo --uid-info [1000]```

**Check trust account**

```wbinfo -t```

# SYNOPSIS

**wbinfo** [_options_]

# PARAMETERS

**-u**, **--domain-users**
> List all domain users.

**-g**, **--domain-groups**
> List all domain groups.

**-p**, **--ping**
> Check if winbindd is running.

**-P**, **--ping-dc**
> Ping the domain controller.

**-t**, **--check-secret**
> Verify trust account.

**-m**, **--trusted-domains**
> List trusted domains.

**-D**, **--domain-info** _domain_
> Show domain information.

**--all-domains**
> List all domains.

**--own-domain**
> Show own domain.

**-n**, **--name-to-sid** _name_
> Convert name to SID.

**-s**, **--sid-to-name** _SID_
> Convert SID to name.

**-U**, **--uid-to-sid** _UID_
> Convert UNIX UID to SID.

**-G**, **--gid-to-sid** _GID_
> Convert UNIX GID to SID.

**-r**, **--user-groups** _user_
> Get user's group memberships.

**--uid-info** _UID_
> Get user info for UID.

**--domain** _name_
> Specify domain for operations.

**-a** _user%pass_
> Authenticate user (testing only).

# DESCRIPTION

**wbinfo** queries information from the winbindd daemon, which provides Windows domain integration for Samba and Linux systems. It retrieves user, group, and domain information from Active Directory or NT domains.

The tool is essential for troubleshooting Winbind configurations and verifying domain connectivity. It can resolve between Windows SIDs and UNIX UIDs/GIDs using the configured ID mapping.

winbindd must be running and properly configured for wbinfo to function. The tool is commonly used to verify Samba domain membership.

# CAVEATS

Requires running winbindd daemon. Authentication via -a is for testing only; use ntlm_auth for applications. Some operations may take time on large domains. Exit status 0 indicates success, 1 indicates failure.

# HISTORY

**wbinfo** is part of the Samba suite, which provides Windows interoperability for Unix systems. Winbind enables Unix systems to appear as members of Windows domains, allowing domain users to authenticate on Unix systems.

# SEE ALSO

[winbindd](/man/winbindd)(8), [samba](/man/samba)(7), [net](/man/net)(8), [ntlm_auth](/man/ntlm_auth)(1)
