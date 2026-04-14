# TAGLINE

Flask session cookie manipulation and cracking

# TLDR

**Decode a Flask session cookie**

```flask-unsign --decode --cookie "[cookie_value]"```

**Brute force secret key**

```flask-unsign --unsign --cookie "[cookie]" --wordlist [wordlist.txt]```

**Sign a cookie with known key**

```flask-unsign --sign --cookie "{'user':'admin'}" --secret "[key]"```

**Fetch and decode** a cookie directly from a URL

```flask-unsign --decode --server https://[example.com]/```

**Show cookie without verification**

```flask-unsign --decode --cookie "[cookie]" --no-verify```

# SYNOPSIS

**flask-unsign** [_options_]

# PARAMETERS

**--decode**
> Decode a session cookie and print its contents.

**--unsign**
> Brute-force the secret key from a signed session cookie.

**--sign**
> Sign a cookie value with a known secret key.

**--cookie** _value_
> Session cookie value to operate on.

**--server** _url_
> Automatically fetch the session cookie from the given URL.

**--secret**, **-S** _key_
> Secret key used to sign or verify a cookie.

**--wordlist** _file_
> Wordlist file to use for brute-forcing the secret key.

**--threads** _num_
> Number of threads to use during brute-forcing.

**--no-verify**
> Skip signature verification when decoding.

**--salt** _salt_
> Custom salt string (default: `cookie-session`).

**--legacy**
> Use the older itsdangerous signing algorithm for compatibility with older Flask apps.

**--no-literal-eval**
> Disable Python literal evaluation of wordlist entries.

# DESCRIPTION

**Flask-unsign** is a security testing tool for analyzing and manipulating Flask session cookies. Flask stores session data in cryptographically signed cookies, and this tool can decode the contents, attempt to recover the secret key through brute-force attacks, and craft custom signed cookies.

The tool is primarily used in web application security assessments to test Flask applications for weak secret keys. If the secret key can be recovered, attackers could forge arbitrary session data, potentially leading to privilege escalation or authentication bypass vulnerabilities.

Flask-unsign supports multithreaded brute-forcing, custom wordlists, and both encoding and decoding operations. It can work with sessions even when the signature verification fails, allowing inspection of tampered or expired cookies.

# SEE ALSO

[flask](/man/flask)(1), [hashcat](/man/hashcat)(1), [john](/man/john)(1)

