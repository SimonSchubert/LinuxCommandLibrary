# TAGLINE

Generate rainbow tables for password cracking

# TLDR

**Generate rainbow table**

```rtgen [hash_algorithm] [charset] [min_len] [max_len] [table_index] [chain_len] [chain_num] [part_index]```

**Generate MD5 table**

```rtgen md5 loweralpha 1 7 0 2400 67108864 0```

**Generate NTLM table**

```rtgen ntlm numeric 1 8 0 2400 67108864 0```

**Sort table**

```rtsort [table.rt]```

# SYNOPSIS

**rtgen** _algorithm_ _charset_ _min_ _max_ _index_ _chain_len_ _chain_num_ _part_

# PARAMETERS

**algorithm**
> Hash type (md5, sha1, ntlm, lm).

**charset**
> Character set (loweralpha, numeric, etc.).

**min_len**
> Minimum password length.

**max_len**
> Maximum password length.

**table_index**
> Table index for multiple tables.

**chain_len**
> Reduction chain length.

**chain_num**
> Number of chains.

**part_index**
> Part index.

# DESCRIPTION

**rtgen** generates rainbow tables for password cracking. Rainbow tables are precomputed tables for reversing cryptographic hash functions. Part of RainbowCrack.

# EXAMPLES

```bash
# Generate MD5 lowercase table
rtgen md5 loweralpha 1 7 0 2400 67108864 0

# NTLM numeric
rtgen ntlm numeric 1 8 0 2400 33554432 0

# Sort generated table
rtsort md5_loweralpha#1-7_0_2400x67108864_0.rt

# Use with rcrack
rcrack . -h 5d41402abc4b2a76b9719d911017c592
```

# CHARSETS

```
numeric           - 0-9
loweralpha        - a-z
alpha             - a-zA-Z
loweralpha-numeric - a-z0-9
mixalpha-numeric  - a-zA-Z0-9
```

# CAVEATS

Very storage intensive. Generation takes time. For authorized testing only. Part of RainbowCrack project.

# HISTORY

rtgen is part of **RainbowCrack** by **Zhu Shuanglei**, implementing Philippe Oechslin's faster time-memory trade-off.

# SEE ALSO

[rcrack](/man/rcrack)(1), [john](/man/john)(1), [hashcat](/man/hashcat)(1)
