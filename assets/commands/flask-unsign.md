# TLDR

**Decode a Flask session cookie**

```flask-unsign --decode --cookie "[cookie_value]"```

**Brute force secret key**

```flask-unsign --unsign --cookie "[cookie]" --wordlist [wordlist.txt]```

**Sign a cookie with known key**

```flask-unsign --sign --cookie "{'user':'admin'}" --secret "[key]"```

**Show cookie without verification**

```flask-unsign --decode --cookie "[cookie]" --no-verify```

# SYNOPSIS

**flask-unsign** [_options_]

# PARAMETERS

**--decode**
> Decode session cookie.

**--unsign**
> Brute force secret key.

**--sign**
> Sign a cookie.

**--cookie** _cookie_
> Cookie value.

**--secret** _key_
> Secret key.

**--wordlist** _file_
> Wordlist for brute forcing.

**--no-verify**
> Skip signature verification.

**--threads** _num_
> Number of threads.

# DESCRIPTION

**flask-unsign** is a tool for decoding, brute-forcing, and crafting Flask session cookies. Used in security testing to analyze Flask application sessions.

# SEE ALSO

[flask](/man/flask)(1)

