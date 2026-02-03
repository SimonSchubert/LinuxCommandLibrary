# TLDR

**Dump secrets from domain controller**

```impacket-secretsdump [domain]/[user]:[password]@[target]```

**Dump using NTLM hash**

```impacket-secretsdump -hashes :[hash] [domain]/[user]@[target]```

**Dump from local SAM file**

```impacket-secretsdump -sam [SAM] -system [SYSTEM] LOCAL```

**Dump NTDS.dit**

```impacket-secretsdump -ntds [ntds.dit] -system [SYSTEM] LOCAL```

**Just DCSync (no registry)**

```impacket-secretsdump -just-dc [domain]/[user]:[password]@[dc]```

# SYNOPSIS

**impacket-secretsdump** [_options_] _target_

# PARAMETERS

**-hashes** _lm:nt_
> Use NTLM hashes.

**-sam** _file_
> Local SAM file.

**-system** _file_
> Local SYSTEM hive.

**-ntds** _file_
> NTDS.dit file.

**-just-dc**
> Extract only NTDS.dit data via DCSync.

**-just-dc-ntlm**
> Extract only NTLM hashes.

**-k**
> Use Kerberos authentication.

# DESCRIPTION

**impacket-secretsdump** extracts credentials from Windows systems via SAM, LSA secrets, cached credentials, and NTDS.dit. Part of the Impacket toolkit. Supports DCSync for domain controllers. For authorized penetration testing and security assessments only.

# CAVEATS

Highly sensitive operation. Requires administrator/domain admin access. For authorized security testing only.

# SEE ALSO

[impacket-psexec](/man/impacket-psexec)(1)

