# TLDR

**Decode JWT**

```jwt decode [token]```

**Encode JWT**

```jwt encode --secret [secret] --payload '[{"sub":"user"}]'```

**Decode without verification**

```jwt decode --no-verify [token]```

**Show header**

```jwt decode --header [token]```

**Encode with algorithm**

```jwt encode --alg [HS256] --secret [key] --payload '[{}]'```

# SYNOPSIS

**jwt** _command_ [_options_]

# PARAMETERS

**decode** _TOKEN_
> Decode JWT token.

**encode**
> Create JWT token.

**--secret** _SECRET_
> Signing secret/key.

**--payload** _JSON_
> Token payload.

**--alg** _ALG_
> Signing algorithm.

**--no-verify**
> Skip signature verification.

**--help**
> Display help information.

# DESCRIPTION

**jwt** encodes and decodes JSON Web Tokens. It creates and verifies JWTs for authentication systems.

The tool supports various signing algorithms. It displays token contents for debugging.

jwt manages JSON Web Tokens.

# CAVEATS

Multiple implementations exist. Security sensitive. Verify algorithms carefully.

# HISTORY

jwt CLI tools provide command-line access to **JSON Web Token** encoding and decoding for testing and debugging.

# SEE ALSO

[openssl](/man/openssl)(1), [jq](/man/jq)(1), [jose](/man/jose)(1)
