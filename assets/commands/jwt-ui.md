# TAGLINE

Terminal UI for decoding and encoding JSON Web Tokens

# TLDR

**Decode a JWT interactively**

```jwt-ui [token]```

**Decode from stdin**

```echo "[token]" | jwt-ui```

**Decode with a secret**

```jwt-ui -S [secret] [token]```

**Decode with a secret from file**

```jwt-ui -S @[path/to/key.pem] [token]```

# SYNOPSIS

**jwt-ui** [**-S** _secret_] [_token_]

# DESCRIPTION

**jwt-ui** is a terminal UI for decoding and encoding JSON Web Tokens, inspired by **jwt.io** and **jwt-cli**. It provides an interactive interface showing the header, payload, and signature verification status of a JWT.

Supported algorithms include **HMAC** (HS256/384/512), **RSA** (RS256/384/512, PS256/384/512), **ECDSA** (ES256/384), and **EdDSA**. Secrets can be provided as plain text, file paths (prefixed with **@**), or base64-encoded strings (prefixed with **b64:**).

# CAVEATS

Only supports standard JWT formats. Encrypted JWTs (JWE) are not supported. Secret handling in command-line arguments may expose secrets in shell history.

# HISTORY

**jwt-ui** was created by the **jwt-rs** organization and is written in **Rust**. It was designed to bring the convenience of web-based JWT tools like jwt.io to the terminal.

# SEE ALSO

[openssl](/man/openssl)(1)
