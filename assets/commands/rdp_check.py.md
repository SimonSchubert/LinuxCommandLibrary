# TAGLINE

Test RDP authentication credentials

# TLDR

**Test RDP credentials** against a target

```rdp_check.py [domain]/[username]:[password]@[target_ip]```

**Test credentials using NTLM hashes**

```rdp_check.py [domain]/[username]@[target_ip] -hashes [LMHASH]:[NTHASH]```

**Test with debug output**

```rdp_check.py [domain]/[username]:[password]@[target_ip] -debug```

**Test over IPv6**

```rdp_check.py [domain]/[username]:[password]@[target_ip] -6```

# SYNOPSIS

**rdp_check.py** [**-h**] [**-hashes** _LMHASH:NTHASH_] [**-6**] [**-debug**] _target_

# PARAMETERS

_target_
> Target specification: [[domain/]username[:password]@]<hostname or IP>

**-hashes** _LMHASH:NTHASH_
> Authenticate using NTLM hashes instead of password

**-6**, **--ipv6**
> Connect using IPv6

**-debug**
> Enable debug output

**-ts**
> Add timestamps to log output

**-h**, **--help**
> Show help message

# DESCRIPTION

**rdp_check.py** is an Impacket tool that tests whether credentials are valid against a Windows host via RDP (Remote Desktop Protocol). It implements portions of MS-RDPBCGR and MS-CREDSSP to perform CredSSP authentication.

The tool is useful for validating credentials during authorized security assessments, verifying RDP access, and testing pass-the-hash attacks against RDP-enabled systems.

It performs authentication only and does not establish a full RDP session. Successful authentication indicates the credentials are valid, but does not guarantee interactive desktop access (which may be restricted by group policy or user rights).

# CAVEATS

**Authorization required**: Only use this tool against systems you have explicit permission to test. Unauthorized access attempts are illegal.

The tool does not complete a full RDP handshake, so successful authentication does not guarantee GUI access. Network Level Authentication (NLA) settings and user rights assignments may still prevent actual login.

Pass-the-hash attacks (**-hashes**) require the target to accept NTLM authentication. Modern configurations may restrict NTLM in favor of Kerberos.

Impacket tools require Python and the impacket library. Install via **pip install impacket** or use Kali Linux which includes impacket-scripts.

# SEE ALSO

[xfreerdp](/man/xfreerdp)(1), [rdesktop](/man/rdesktop)(1), [nmap](/man/nmap)(1), [crackmapexec](/man/crackmapexec)(1)
