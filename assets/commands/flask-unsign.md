# TAGLINE

Flask session cookie manipulation and cracking

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

**Flask-unsign** is a security testing tool for analyzing and manipulating Flask session cookies. Flask stores session data in cryptographically signed cookies, and this tool can decode the contents, attempt to recover the secret key through brute-force attacks, and craft custom signed cookies.

The tool is primarily used in web application security assessments to test Flask applications for weak secret keys. If the secret key can be recovered, attackers could forge arbitrary session data, potentially leading to privilege escalation or authentication bypass vulnerabilities.

Flask-unsign supports multithreaded brute-forcing, custom wordlists, and both encoding and decoding operations. It can work with sessions even when the signature verification fails, allowing inspection of tampered or expired cookies.

# SEE ALSO

[flask](/man/flask)(1)

