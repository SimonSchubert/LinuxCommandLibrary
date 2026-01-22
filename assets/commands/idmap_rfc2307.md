# TLDR

**Configure in smb.conf**

```idmap config DOMAIN : backend = rfc2307```

**Set range**

```idmap config DOMAIN : range = 10000-99999```

# SYNOPSIS

**idmap_rfc2307** is a Samba configuration module

# PARAMETERS

**backend**
> Set to rfc2307.

**range**
> UID/GID range.

**ldap_server**
> LDAP server mode.

**bind_path_user**
> User search base.

**bind_path_group**
> Group search base.

# DESCRIPTION

**idmap_rfc2307** is a Samba ID mapping backend using RFC 2307 LDAP schema. It maps Windows SIDs to Unix UIDs/GIDs stored in LDAP.

The backend reads uidNumber and gidNumber attributes from Active Directory or LDAP. It provides consistent ID mapping across systems.

idmap_rfc2307 maps IDs via LDAP.

# CAVEATS

Samba configuration module. Requires LDAP with RFC 2307 schema. AD integration needed.

# HISTORY

idmap_rfc2307 is part of **Samba** for enterprise Unix/Windows ID mapping.

# SEE ALSO

[smb.conf](/man/smb.conf)(5), [idmap_ad](/man/idmap_ad)(8), [winbindd](/man/winbindd)(8)
