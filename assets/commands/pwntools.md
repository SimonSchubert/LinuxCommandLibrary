# TLDR

**Start Python with pwntools**

```python -c "from pwn import *"```

**Create pwntools script**

```pwn template [binary] --host [host] --port [port]```

**Check binary security**

```checksec [binary]```

**Disassemble shellcode**

```disasm [hexstring]```

# SYNOPSIS

**pwntools** Python library for exploit development

# DESCRIPTION

**pwntools** is a CTF framework and exploit development library for Python. It provides utilities for binary exploitation, shellcode generation, and remote connections.

# EXAMPLES

```python
from pwn import *

# Connect to remote
r = remote('host', 1337)

# Start local binary
p = process('./binary')

# Read/write
r.recvline()
r.sendline(b'payload')

# Pack integers
payload = p32(0xdeadbeef)  # 32-bit
payload = p64(0x41414141)  # 64-bit

# Create shellcode
shellcode = asm(shellcraft.sh())

# ROP chain
rop = ROP('./binary')
rop.call('system', ['/bin/sh'])
```

# CLI TOOLS

```bash
# Check binary protections
checksec ./binary

# Create exploit template
pwn template ./binary > exploit.py

# Assemble shellcode
pwn asm 'mov eax, 1; int 0x80'

# Disassemble
pwn disasm '6a68682f2f2f73'

# Cyclic pattern
pwn cyclic 100
pwn cyclic -l 0x61616164
```

# CAVEATS

Python library (pip install pwntools). Requires understanding of exploitation. For CTF and authorized testing only.

# HISTORY

pwntools was created by **Gallopsled** CTF team, becoming the standard Python library for CTF exploit development.

# SEE ALSO

[gdb](/man/gdb)(1), [radare2](/man/radare2)(1), [ropper](/man/ropper)(1), [ROPgadget](/man/ROPgadget)(1)
