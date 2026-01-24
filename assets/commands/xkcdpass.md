# TLDR

**Generate passphrase**

```xkcdpass```

**Generate with specific word count**

```xkcdpass -n [6]```

**Generate with delimiter**

```xkcdpass -d "-"```

**Generate multiple passphrases**

```xkcdpass -c [5]```

**Use custom wordlist**

```xkcdpass -w [/path/to/wordlist]```

**Filter by word length**

```xkcdpass --min [4] --max [8]```

**Generate with numbers**

```xkcdpass --valid-chars "[a-z0-9]"```

# SYNOPSIS

**xkcdpass** [_-n count_] [_-d delimiter_] [_-w wordlist_] [_options_]

# PARAMETERS

**-n** _COUNT_
> Number of words.

**-d** _DELIM_
> Delimiter between words.

**-w** _FILE_
> Wordlist file.

**-c** _N_
> Number of passphrases.

**--min** _N_
> Minimum word length.

**--max** _N_
> Maximum word length.

**--valid-chars** _CHARS_
> Valid characters regex.

**-v**, **--verbose**
> Show entropy info.

**-a** _ACROSTIC_
> Acrostic pattern.

**-i**, **--interactive**
> Interactive mode.

**--help**
> Show help.

# DESCRIPTION

**xkcdpass** generates memorable passphrases using random words. It's inspired by XKCD comic 936 about password strength.

Random words from a dictionary create passphrases. Four or more random words provide strong security while remaining memorable.

The default wordlist contains common English words. Custom wordlists can be used for different languages or specialized vocabularies.

Entropy information shows passphrase strength. Longer passphrases and larger wordlists increase entropy.

Acrostic mode generates passphrases where first letters spell a word. This aids memorization while maintaining randomness.

Word length filters exclude very short or long words. This can improve pronounceability and typing speed.

# CAVEATS

Security depends on wordlist size. Short wordlists reduce entropy. Random selection must be truly random. Not for high-security needs without verification.

# HISTORY

**xkcdpass** was created inspired by **XKCD comic 936** by **Randall Munroe**. The comic demonstrated that random word passphrases are more secure and memorable than complex but short passwords.

# SEE ALSO

[pwgen](/man/pwgen)(1), [makepasswd](/man/makepasswd)(1), [apg](/man/apg)(1), [openssl](/man/openssl)(1)
