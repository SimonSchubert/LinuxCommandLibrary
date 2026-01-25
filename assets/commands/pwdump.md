# TLDR

**Dump Windows password hashes**

```pwdump [system] [sam]```

**Dump from local SAM**

```pwdump localhost```

**Output to file**

```pwdump [target] > [hashes.txt]```

**With specific user**

```pwdump [target] -u [administrator] -p [password]```

# SYNOPSIS

**pwdump** [_options_] _target_

# DESCRIPTION

**pwdump** extracts Windows password hashes from the SAM database. These hashes can then be cracked offline. Used for security auditing and penetration testing.

Several versions exist (pwdump7, fgdump, etc.) with varying capabilities.

# EXAMPLES

```bash
# Dump local hashes
pwdump localhost

# Remote system (admin required)
pwdump \\\\192.168.1.100

# Save for cracking
pwdump localhost > hashes.txt

# Then crack with John
john --format=NT hashes.txt
```

# OUTPUT FORMAT

```
Username:RID:LM_Hash:NT_Hash:::
```

# HASH TYPES

```
LM Hash   - Legacy, weak (pre-Vista)
NT Hash   - NTLM hash (current)
```

# CAVEATS

Requires administrator privileges. Windows-specific. Use only on systems you own or have authorization to test. May be detected by antivirus.

# HISTORY

pwdump was developed for Windows password auditing. Multiple versions (pwdump2-7, fgdump) have been created by various security researchers.

# SEE ALSO

[john](/man/john)(1), [hashcat](/man/hashcat)(1), [mimikatz](/man/mimikatz)(1), [secretsdump.py](/man/secretsdump.py)(1)
