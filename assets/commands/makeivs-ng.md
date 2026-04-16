# TAGLINE

generates IVs files for testing WEP cracking

# TLDR

**Generate IVs file**

```makeivs-ng -b [00:11:22:33:44:55] -w [key] -o [output.ivs]```

**Generate with specific count**

```makeivs-ng -b [BSSID] -k [128] -n [100000] -w [key] -o [output.ivs]```

**Create IVs for testing**

```makeivs-ng -b [00:11:22:33:44:55] -w [0102030405] -o [test.ivs]```

# SYNOPSIS

**makeivs-ng** [_options_]

# PARAMETERS

**-b** _BSSID_
> Access point BSSID.

**-w** _KEY_
> WEP key.

**-k** _BITS_
> Key length (64/128).

**-n** _COUNT_
> Number of IVs to generate.

**-f** _IV_
> First IV value.

**-s** _SEED_
> Seed used to setup the random generator.

**-o** _FILE_
> Output file.

**--help**
> Display help information.

# DESCRIPTION

**makeivs-ng** generates IVs files for testing WEP cracking. It creates sample data for aircrack-ng.

The tool is part of the aircrack-ng suite. Used for testing and educational purposes.

# CAVEATS

Security research tool. Legal use only. Part of aircrack-ng suite.

# HISTORY

makeivs-ng is part of **aircrack-ng** suite for wireless security auditing and testing.

# SEE ALSO

[aircrack-ng](/man/aircrack-ng)(1), [airodump-ng](/man/airodump-ng)(1), [aireplay-ng](/man/aireplay-ng)(1)

