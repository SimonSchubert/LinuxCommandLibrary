# TAGLINE

validates whether provided credentials allow RDP access to a Windows system

# TLDR

**Check if RDP credentials are valid**

```impacket-rdp_check '[domain]/[user]:[password]@[192.168.1.100]'```

**Check RDP access using NTLM hash**

```impacket-rdp_check -hashes ':[nthash]' '[domain]/[user]@[192.168.1.100]'```

**Check RDP on a non-standard port**

```impacket-rdp_check '[domain]/[user]:[password]@[192.168.1.100]:3390```

# SYNOPSIS

**impacket-rdp_check** [_-h_] [_-hashes LMHASH:NTHASH_] _target_

# PARAMETERS

**-hashes** _LMHASH:NTHASH_
> Use NTLM hashes for authentication instead of password

# DESCRIPTION

**impacket-rdp_check** validates whether provided credentials allow RDP (Remote Desktop Protocol) access to a Windows system. It attempts to authenticate via RDP without establishing a full session, making it useful for credential validation during penetration tests.

The tool performs the initial RDP handshake and authentication exchange, reporting whether the credentials are accepted by the target system.

# CAVEATS

Only validates credentials; does not establish a full RDP session. Network Level Authentication (NLA) settings on the target affect behavior. RDP must be enabled and accessible on the target. May trigger account lockout policies if used repeatedly with incorrect credentials.

# HISTORY

Part of the **Impacket** library by SecureAuth. Useful for validating credentials against RDP services without the overhead of full graphical session establishment.

# SEE ALSO

[xfreerdp](/man/xfreerdp)(1), [rdesktop](/man/rdesktop)(1), [nmap](/man/nmap)(1)
