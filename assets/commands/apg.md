# TLDR

**Generate** random passwords

```apg```

Generate with **specific length**

```apg -m [16] -x [20]```

Generate **pronounceable** passwords

```apg -a 0```

Generate **random character** passwords

```apg -a 1```

Generate with **specific character set**

```apg -M SNCL```

Generate without **ambiguous characters**

```apg -E "0O1lI"```

# SYNOPSIS

**apg** [_-a algorithm_] [_-m min_] [_-x max_] [_-M mode_] [_-E chars_] [_options_]

# DESCRIPTION

**apg** (Automated Password Generator) creates random passwords using either a pronounceable password algorithm (based on phoneme sequences) or completely random characters.

Pronounceable passwords are easier to remember but potentially less secure. Random passwords offer maximum entropy but are harder to memorize.

# PARAMETERS

**-a** _algorithm_
> Algorithm: 0=pronounceable, 1=random

**-m** _length_
> Minimum password length

**-x** _length_
> Maximum password length

**-n** _count_
> Number of passwords to generate

**-M** _mode_
> Character classes: S=special, N=numeric, C=capital, L=lowercase

**-E** _chars_
> Exclude specific characters

**-c** _file_
> Check against dictionary file

**-q**
> Quiet mode (passwords only)

**-s**
> Prompt for random seed

**-l**
> Spell pronounceable passwords

# CAVEATS

Pronounceable passwords may have patterns that reduce entropy. For high-security applications, use random mode with sufficient length. Output goes to terminal; pipe to clip for clipboard.

# HISTORY

**apg** was created by Adel I. Mirzazhanov, implementing both random and pronounceable password generation algorithms for Unix systems.

# SEE ALSO

[pwgen](/man/pwgen)(1), [openssl](/man/openssl)(1), [mkpasswd](/man/mkpasswd)(1)
