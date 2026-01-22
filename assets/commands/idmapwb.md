# TLDR

**Configure in smb.conf**

```idmap config * : backend = tdb```

**Set range**

```idmap config * : range = 10000-999999```

# SYNOPSIS

**idmapwb** is a Winbind ID mapping component

# PARAMETERS

**backend**
> ID mapping backend type.

**range**
> UID/GID range allocation.

**read only**
> Read-only mode.

# DESCRIPTION

**idmapwb** refers to Winbind's ID mapping functionality in Samba. It translates Windows SIDs to Unix UIDs and GIDs.

The component uses configurable backends like tdb, ad, or rfc2307. It enables Unix systems to work with Windows domain users.

idmapwb handles Winbind ID mapping.

# CAVEATS

Part of Samba/Winbind. Configuration via smb.conf. Domain membership needed.

# HISTORY

idmapwb is part of **Samba Winbind** for Windows-Unix identity integration.

# SEE ALSO

[winbindd](/man/winbindd)(8), [wbinfo](/man/wbinfo)(1), [smb.conf](/man/smb.conf)(5)
