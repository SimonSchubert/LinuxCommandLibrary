# TLDR

**Create timestamp request**

```openssl ts -query -data [file] -out [request.tsq]```

**Create timestamp response**

```openssl ts -reply -queryfile [request.tsq] -signer [cert.pem] -out [response.tsr]```

**Verify timestamp**

```openssl ts -verify -data [file] -in [response.tsr] -CAfile [ca.pem]```

**Print timestamp request**

```openssl ts -query -in [request.tsq] -text```

# SYNOPSIS

**openssl** **ts** _command_ [_options_]

# PARAMETERS

**-query**
> Create timestamp request.

**-reply**
> Create timestamp response.

**-verify**
> Verify timestamp response.

**-data** _file_
> Data file to timestamp.

**-in** _file_
> Input file.

**-out** _file_
> Output file.

**-text**
> Print in human-readable form.

# DESCRIPTION

**openssl ts** handles RFC 3161 Time Stamping Authority (TSA) operations. Creates timestamp requests, generates responses, and verifies timestamps. Used for proving data existed at a specific time.

# SEE ALSO

[openssl](/man/openssl)(1)

