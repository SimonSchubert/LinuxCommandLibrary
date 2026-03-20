# TAGLINE

Request a Kerberos Service Ticket and save as ccache

# TLDR

**Request a service ticket** for a specific SPN

```impacket-getst -spn '[cifs/target.domain.com]' '[domain]/[user]:[password]'```

**Request a service ticket** using an NTLM hash

```impacket-getst -spn '[cifs/target.domain.com]' -hashes ':[nthash]' '[domain]/[user]'```

**Impersonate a user** via S4U2Self and S4U2Proxy (delegation attack)

```impacket-getst -spn '[cifs/target.domain.com]' -impersonate '[administrator]' '[domain]/[user]:[password]'```

**Request a service ticket** using Kerberos authentication from ccache

```impacket-getst -spn '[cifs/target.domain.com]' -k -no-pass '[domain]/[user]'```

**Request a service ticket** using an AES key

```impacket-getst -spn '[cifs/target.domain.com]' -aesKey '[aes256key]' '[domain]/[user]'```

**Request a User-to-User ticket**

```impacket-getst -u2u -spn '[cifs/target.domain.com]' '[domain]/[user]:[password]'```

# SYNOPSIS

**impacket-getst** [_-spn SPN_] [_-impersonate USER_] [_-altservice SPN_] [_-additional-ticket FILE_] [_-hashes LMHASH:NTHASH_] [_-aesKey KEY_] [_-k_] [_-no-pass_] [_-dc-ip IP_] _identity_

# PARAMETERS

**-spn** _SPN_
> Service Principal Name (service/server) of the target service.

**-altservice** _SPN_
> Set a new sname/SPN in the resulting ticket.

**-impersonate** _USER_
> Target username to impersonate via S4U2Self. Requires delegation privileges.

**-additional-ticket** _FILE_
> Include a forwardable service ticket in an S4U2Proxy request for RBCD + KCD.

**-dmsa**
> Use Delegated Managed Service Accounts.

**-u2u**
> Request a User-to-User ticket.

**-self**
> Only perform S4U2Self, skip S4U2Proxy.

**-force-forwardable**
> Force the S4U2Self service ticket to be forwardable.

**-renew**
> Renew the TGT used for authentication.

**-ts**
> Add timestamp to every logging output.

**-debug**
> Turn DEBUG output on.

**-hashes** _LMHASH:NTHASH_
> Use NTLM hashes for authentication instead of password.

**-no-pass**
> Do not prompt for password (useful with -k).

**-k**
> Use Kerberos authentication from ccache file (KRB5CCNAME).

**-aesKey** _KEY_
> AES key for Kerberos authentication (128 or 256 bit).

**-dc-ip** _IP_
> IP address of the domain controller.

# DESCRIPTION

**impacket-getst** requests a Kerberos Service Ticket (ST) from an Active Directory domain controller and saves it as a ccache file. It supports standard ticket requests, S4U2Self/S4U2Proxy delegation attacks for user impersonation, and User-to-User authentication.

This tool is commonly used in penetration testing for Kerberos delegation abuse (constrained delegation, resource-based constrained delegation) where an attacker with delegation privileges can impersonate any user to a target service. The resulting ccache file can be used with other tools via the **KRB5CCNAME** environment variable.

# CAVEATS

Requires a valid TGT or credentials. Impersonation via S4U2Self/S4U2Proxy requires the identity account to have delegation privileges configured in Active Directory. Time synchronization between client and KDC must be within 5 minutes. The **-force-forwardable** flag exploits CVE-2020-17049 (Bronze Bit) and may not work on patched domain controllers.

# HISTORY

Part of the **Impacket** library by **SecureAuth** (now **Fortra**). The S4U extensions (S4U2Self and S4U2Proxy) were originally designed by Microsoft for constrained delegation scenarios. Security researchers discovered that these mechanisms could be abused for privilege escalation, making getST a key tool in Kerberos-based attack chains.

# SEE ALSO

[impacket-gettgt](/man/impacket-gettgt)(1), [impacket-getuserspns](/man/impacket-getuserspns)(1), [impacket-secretsdump](/man/impacket-secretsdump)(1), [klist](/man/klist)(1)
