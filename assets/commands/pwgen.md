# TAGLINE

Generate memorable or random passwords

# TLDR

**Generate a password**

```pwgen```

**Generate password** of specific length

```pwgen [16]```

**Generate multiple passwords**

```pwgen [16] [5]```

**Generate secure password** (harder to memorize)

```pwgen -s [16]```

**Generate with at least one symbol**

```pwgen -y [16]```

**Generate without ambiguous characters**

```pwgen -B [16]```

**Generate single password** (no columns)

```pwgen -1 [16]```

**Generate completely random**

```pwgen -sy [20] [1]```

# SYNOPSIS

**pwgen** [_options_] [_length_] [_count_]

# DESCRIPTION

**pwgen** generates random, pronounceable passwords. By default, it creates passwords designed to be easily memorized by humans while still being reasonably secure.

The tool can generate different styles of passwords: pronounceable (default), completely random, with or without special characters, and with various constraints. It outputs multiple passwords allowing users to choose one they find memorable.

pwgen is commonly used for creating initial passwords, generating secrets for scripts, and batch password creation.

# PARAMETERS

**-s**, **--secure**
> Generate completely random passwords.

**-y**, **--symbols**
> Include at least one special character.

**-n**, **--numerals**
> Include at least one number.

**-c**, **--capitalize**
> Include at least one capital letter.

**-A**, **--no-capitalize**
> No capital letters.

**-0**, **--no-numerals**
> No numbers.

**-B**, **--ambiguous**
> Avoid ambiguous characters (0O1lI).

**-1**
> Print one password per line.

**-v**, **--no-vowels**
> No vowels (avoid offensive words).

**-H** _file_, **--sha1=** _file_
> Use SHA1 hash of file as seed.

**-r** _chars_
> Remove specified characters.

# CAVEATS

Default pronounceable passwords are less secure than random ones. Generated passwords should still meet your security requirements. Use -s for high-security applications. Entropy depends on password length and character set.

# HISTORY

**pwgen** was originally written by **Theodore Ts'o** in **2001**. It was designed to create passwords that users could actually remember, reducing the tendency to write them down. The tool has remained popular for both personal and administrative password generation.

# SEE ALSO

[openssl](/man/openssl)(1), [mkpasswd](/man/mkpasswd)(1), [apg](/man/apg)(1), [pass](/man/pass)(1)
